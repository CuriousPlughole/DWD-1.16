package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.world.ModCaveCarver;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class CarverInit {
	
	public static final DeferredRegister<WorldCarver<?>> CARVERS = DeferredRegister.create(ForgeRegistries.WORLD_CARVERS,
			DWDimensions.MOD_ID);

	
	public static final RegistryObject<WorldCarver<?>> MOD_CAVE_CARVER = CARVERS.register("mod_cave_carver", () -> new ModCaveCarver(ProbabilityConfig.CODEC, 120));
	
	
	
	public static class ConfiguredCarvers {
		public static final ConfiguredCarver<?> CONFIGURED_MOD_CAVE_CARVER = new ConfiguredCarver(MOD_CAVE_CARVER.get(), new ProbabilityConfig(0.14f));
		
	}
	
	public static void registerConfiguredCarvers() {
		registerConfiguredCarver("mod_cave_carver", ConfiguredCarvers.CONFIGURED_MOD_CAVE_CARVER);
	}

	private static void registerConfiguredCarver(String regName, ConfiguredCarver<?> configuredCarver) {
		
		Registry<ConfiguredCarver<?>> registry = WorldGenRegistries.CONFIGURED_CARVER;
		Registry.register(registry, new ResourceLocation(DWDimensions.MOD_ID, regName), configuredCarver);
		
	}

}
