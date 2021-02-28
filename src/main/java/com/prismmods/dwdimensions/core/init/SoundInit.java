package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {
	
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DWDimensions.MOD_ID);
	
	public static final RegistryObject<SoundEvent> TARDIS_DOOR_OPEN_1 = SOUNDS.register("block.tardis.door_open_1", () -> new SoundEvent(new ResourceLocation(DWDimensions.MOD_ID, "block.tardis.door_open_1")));
    public static final RegistryObject<SoundEvent> TARDIS_DOOR_OPEN_2 = SOUNDS.register("block.tardis.door_open_2", () -> new SoundEvent(new ResourceLocation(DWDimensions.MOD_ID, "block.tardis.door_open_2")));
	public static final RegistryObject<SoundEvent> TARDIS_DOOR_CLOSE = SOUNDS.register("block.tardis.door_close", () -> new SoundEvent(new ResourceLocation(DWDimensions.MOD_ID, "block.tardis.door_close")));
	
	public static final RegistryObject<SoundEvent> REGEN_START = SOUNDS.register("entity.regen_start", () -> new SoundEvent(new ResourceLocation(DWDimensions.MOD_ID, "entity.regen_start")));
	public static final RegistryObject<SoundEvent> WIND = SOUNDS.register("world.wind", () -> new SoundEvent(new ResourceLocation(DWDimensions.MOD_ID, "world.wind")));

}
