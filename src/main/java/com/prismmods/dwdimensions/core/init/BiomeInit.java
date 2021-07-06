package com.prismmods.dwdimensions.core.init;

import java.util.function.Supplier;

import com.prismmods.dwdimensions.DWDimensions;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
	
	public static RegistryKey<Biome> GALLIFREY_BIOME_KEY;
	public static RegistryKey<Biome> SKARO_BIOME_KEY;
	
	public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, DWDimensions.MOD_ID);
	
	//Register a void biome so that the ID is safely taken up and can be replaced by jsons
	
	//GALLIFREY BIOMES
	public static final RegistryObject<Biome> GALLIFREY_DESERT = BIOMES.register("gallifrey_desert", () -> BiomeMaker.makeVoidBiome());
	
	//SKARO BIOMES
	public static final RegistryObject<Biome> SKARO_DESERT = BIOMES.register("skaro_desert", () -> BiomeMaker.makeVoidBiome());
	public static final RegistryObject<Biome> SKARO_PETRIFIED_FOREST = BIOMES.register("skaro_petrified_forest", () -> BiomeMaker.makeVoidBiome());
	public static final RegistryObject<Biome> SKARO_ROCKY_PLAINS = BIOMES.register("skaro_rocky_plains", () -> BiomeMaker.makeVoidBiome());
	//public static final RegistryObject<Biome> SKARO_MOUNTAINS = BIOMES.register("skaro_mountains", () -> BiomeMaker.makeVoidBiome());
	//public static final RegistryObject<Biome> SKARO_GEYSER_SWAMP = BIOMES.register("skaro_geyser_swamp", () -> BiomeMaker.makeVoidBiome());
	//public static final RegistryObject<Biome> SKARO_TUNDRA = BIOMES.register("skaro_tundra", () -> BiomeMaker.makeVoidBiome());

	
	public static void registerBiomeKeys() {
		GALLIFREY_BIOME_KEY = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, new ResourceLocation(DWDimensions.MOD_ID, "gallifrey_desert"));
		SKARO_BIOME_KEY = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, new ResourceLocation(DWDimensions.MOD_ID, "skaro_desert"));
		
	}
	
	public static RegistryObject<Biome> createBiome(String name, Supplier<Biome> biome) {
		return BIOMES.register(name, biome);
	}
	
}
