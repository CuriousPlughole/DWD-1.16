package com.prismmods.dwdimensions.common.tileentities;

import java.util.Optional;
import java.util.Random;

import javax.annotation.Nullable;

import com.prismmods.dwdimensions.core.init.TileEntityTypeInit;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.biome.Biome;

public class TardisTileEntity extends TileEntity implements ITickableTileEntity{
	
	private int snowCoolDown = 0;
    private boolean lightsOn = true;
    private boolean isSnowy = false;
    private int tardisID = 0;
    private float rotationInDeg = 0;
    private EnumChameleon activeChameleon = EnumChameleon.TENNANT;
    private EnumDoorState currentDoorState = EnumDoorState.CLOSED;

    public TardisTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    public TardisTileEntity() {
        this(TileEntityTypeInit.TARDIS.get());
    }
    
    @Override
    public double getMaxRenderDistanceSquared() {
        final int MAXIMUM_DISTANCE_IN_BLOCKS = 64;
        return MAXIMUM_DISTANCE_IN_BLOCKS * MAXIMUM_DISTANCE_IN_BLOCKS;
    }
    
    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        AxisAlignedBB infinite = INFINITE_EXTENT_AABB;
        return infinite;
    }
    
    @Override
    @Nullable
    public SUpdateTileEntityPacket getUpdatePacket() {
        CompoundNBT nbtTagCompound = new CompoundNBT();
        write(nbtTagCompound);
        return new SUpdateTileEntityPacket(this.pos, 42, nbtTagCompound);
    }

    //From 1.15 - not sure what to do with it
    /*
    @Override
    public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
        read(pkt.getNbtCompound());
    }*/
    
    
    
    @Override
    public CompoundNBT getUpdateTag() {

        CompoundNBT nbtTagCompound = new CompoundNBT();
        write(nbtTagCompound);
        return nbtTagCompound;
    }
    
    @Override
    public void handleUpdateTag(BlockState state, CompoundNBT tag) {
    	this.read(state, tag);
    }
    
    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound); //needed to save the tile's location
        activeChameleon.putIntoNBT(compound, "chameleon");
        currentDoorState.putIntoNBT(compound, "doorState");
        compound.putBoolean("lightsOn", lightsOn);
        compound.putBoolean("snow", isSnowy);
        compound.putInt("snow_cooldown", snowCoolDown);
        compound.putInt("tardisID", tardisID);
        compound.putFloat("rotation", rotationInDeg);
        return compound;
    }
    
    @Override
    public void read(BlockState state, CompoundNBT compound) {
    	super.read(state, compound);
    	
    	activeChameleon = EnumChameleon.fromNBT(compound, "chameleon");
        currentDoorState = EnumDoorState.fromNBT(compound, "doorState");
        lightsOn = compound.getBoolean("lightsOn");
        isSnowy = compound.getBoolean("snow");
        rotationInDeg = compound.getFloat("rotation");
    	
    }
    
    public float getRotation() {
        return rotationInDeg;
    }

    public void setRotation(float rot) {
        this.rotationInDeg = rot;
    }
    
    public int getSnowCoolDown() {
        return snowCoolDown;
    }

    public void setSnowCoolDown(int i) {
        this.snowCoolDown = i;
    }
    
    public int getTardisID() {
    	return tardisID;
    }
    
    public void setTardisID(int id) {
    	this.tardisID = id;
    }
    
    public boolean getLightsStatus() {
        return lightsOn;
    }

    public void setLightsStatus(Boolean on) {
        this.lightsOn = on;
    }

    public boolean getSnowy() {
        return isSnowy;
    }

    public void setSnowy(Boolean snowy) {
        this.isSnowy = snowy;
    }

    public EnumChameleon getActiveChameleon() {
        return activeChameleon;
    }

    public void setEnumChameleon(EnumChameleon chameleon) {
        this.activeChameleon = chameleon;
    }

    public EnumDoorState getDoorState() {
        return currentDoorState;
    }

    public void setDoorState(EnumDoorState doorState) {
        this.currentDoorState = doorState;
    }

    public int getIntForDoorState(EnumDoorState currentDoorState) {
        switch (currentDoorState) {
            case CLOSED:
                return 0;
            case ONE_OPEN_IN:
                return 1;
            case BOTH_OPEN_IN:
                return 2;
            case OPTIONAL_EXTRA:
                return 3;
            default:
                return 0;
        }
    }

    @Override
    public void tick() {
        if (snowCoolDown <= 0) {
            snowCoolDown = 0;
            if (!isSnowy) {
                boolean isRaining = world.isRaining();
                boolean canSnow = world.getBiome(pos).getPrecipitation().equals(Biome.RainType.SNOW);
                isSnowy = isRaining && canSnow;
            } else {
                snowCoolDown--;
            }
        }
    }


    //Enum classes

    public enum EnumChameleon {
        TTCAPSULE(1), WHITTAKER(2), SMITH_2010(3), SMITH_TOYOTA(4), CAPALDI(5), MCGANN(6), TENNANT(7);

        private byte nbtID;

        EnumChameleon(int i_NBT_ID) {
            this.nbtID = (byte) i_NBT_ID;
        }

        public static EnumChameleon fromNBT(CompoundNBT compoundNBT, String tagname) {
            byte chameleonID = 0;  // default in case of error
            if (compoundNBT != null && compoundNBT.contains(tagname)) {
                chameleonID = compoundNBT.getByte(tagname);
            }
            Optional<EnumChameleon> enumChameleon = getEnumChameleonFromID(chameleonID);
            return enumChameleon.orElse(TTCAPSULE);
        }

        public static EnumChameleon pickRandom() {
            int count = EnumChameleon.values().length;
            int whichIdx = new Random().nextInt(count);
            return EnumChameleon.values()[whichIdx];
        }

        private static Optional<EnumChameleon> getEnumChameleonFromID(byte ID) {
            for (EnumChameleon enumChameleon : EnumChameleon.values()) {
                if (enumChameleon.nbtID == ID) return Optional.of(enumChameleon);
            }
            return Optional.empty();
        }

        public EnumChameleon getNextChameleon() {
            int nextLargestID = nbtID + 1;
            for (EnumChameleon enumChameleon : EnumChameleon.values()) {
                if (enumChameleon.nbtID == nextLargestID) return enumChameleon;
            }
            return TTCAPSULE;
        }

        /**
         * Write this enum to NBT
         *
         * @param compoundNBT
         * @param tagname
         */
        public void putIntoNBT(CompoundNBT compoundNBT, String tagname) {
            compoundNBT.putByte(tagname, nbtID);
        }
    }


    public enum EnumDoorState {
        CLOSED(0), ONE_OPEN_IN(1), BOTH_OPEN_IN(2), OPTIONAL_EXTRA(3);

        private byte nbtID;

        EnumDoorState(int i_nbt_id) {
            this.nbtID = (byte) i_nbt_id;
        }

        public static EnumDoorState fromNBT(CompoundNBT compoundNBT, String tagname) {
            byte doorState = 0; //Default
            if (compoundNBT != null && compoundNBT.contains(tagname)) {
                doorState = compoundNBT.getByte(tagname);
            }
            Optional<EnumDoorState> enumDoorState = getEnumDoorStateFromID(doorState);
            return enumDoorState.orElse(CLOSED);
        }

        private static Optional<EnumDoorState> getEnumDoorStateFromID(byte ID) {
            for (EnumDoorState doorState : EnumDoorState.values()) {
                if (doorState.nbtID == ID) return Optional.of(doorState);
            }
            return Optional.empty();
        }

        public void putIntoNBT(CompoundNBT compoundNBT, String tagname) {
            compoundNBT.putByte(tagname, nbtID);
        }
    }
    

}
