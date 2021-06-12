package com.prismmods.dwdimensions.world.skaro.structures;

import java.util.List;
import java.util.Map;
import java.util.Random;

import com.google.common.collect.ImmutableMap;
import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.world.skaro.SkaroStructures;

import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.gen.feature.structure.StructurePiece;
import net.minecraft.world.gen.feature.structure.TemplateStructurePiece;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class SkaroOutpostStructurePieces {

	private static final ResourceLocation PART_1 = new ResourceLocation(DWDimensions.MOD_ID, "skaro/outpost/test");
	private static final Map<ResourceLocation, BlockPos> OFFSET = ImmutableMap.of(PART_1, new BlockPos(0, 0, 0));

	public static void start(TemplateManager manager, BlockPos pos, Rotation rotation, List<StructurePiece> pieces,
			Random rand) {
		int x = pos.getX();
		int z = pos.getZ();

		BlockPos rotationOffset = new BlockPos(0, 0, 0).rotate(rotation);
		BlockPos blockpos = rotationOffset.add(x, pos.getY(), z);
		pieces.add(new SkaroOutpostStructurePieces.Piece(manager, PART_1, blockpos, rotation));
	}
	
	public static class Piece extends TemplateStructurePiece {
		private final ResourceLocation resourceLocation;
        private final Rotation rotation;

		public Piece(TemplateManager manager, ResourceLocation rl, BlockPos pos, Rotation rotation) {
			super(SkaroStructures.ABANDONED_OUTPOST_PIECE, 0);
			this.resourceLocation = rl;
			BlockPos blockpos = SkaroOutpostStructurePieces.OFFSET.get(rl);
			this.templatePosition = pos.add(blockpos.getX(), blockpos.getY(), blockpos.getZ());
			this.rotation = rotation;
			this.setupPiece(manager);
		}
		
		public Piece(TemplateManager manager, CompoundNBT nbt) {
			super(SkaroStructures.ABANDONED_OUTPOST_PIECE, nbt);
			this.resourceLocation = new ResourceLocation(nbt.getString("Template"));
            this.rotation = Rotation.valueOf(nbt.getString("Rot"));
            this.setupPiece(manager);
		}
		
		private void setupPiece(TemplateManager manager) {
			Template template = manager.getTemplateDefaulted(this.resourceLocation);
            PlacementSettings placementsettings = (new PlacementSettings()).setRotation(this.rotation)
                    .setMirror(Mirror.NONE);
            this.setup(template, this.templatePosition, placementsettings);
		}
		
		@Override
        protected void readAdditional(CompoundNBT tagCompound) {
            super.readAdditional(tagCompound);
            tagCompound.putString("Template", this.resourceLocation.toString());
            tagCompound.putString("Rot", this.rotation.name());
        }

		@Override
		protected void handleDataMarker(String function, BlockPos pos, IServerWorld worldIn, Random rand,
				MutableBoundingBox sbb) {
			if ("chest".equals(function)) {
                worldIn.setBlockState(pos, Blocks.CHEST.getDefaultState(), 2);
                TileEntity tileentity = worldIn.getTileEntity(pos);
                if (tileentity instanceof ChestTileEntity) {
                    ((ChestTileEntity) tileentity).setLootTable(new ResourceLocation("minecraft:chests/desert_pyramid"), 0);
                }
            }
			
		}
		
	}

}
