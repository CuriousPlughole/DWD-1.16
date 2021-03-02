package com.prismmods.dwdimensions.core.init;

import java.util.function.BiFunction;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.world.DimensionHelper;
import com.prismmods.dwdimensions.world.gallifrey.GallifreyChunkGenerator;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Dimension;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.gen.DimensionSettings;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

/*
 * Credits to 50 for most of this!
 * https://gitlab.com/Spectre0987/TardisMod-1-14/-/blob/1.16.x/src/main/java/net/tardis/mod/world/dimensions/TDimensions.java
 */

@Mod.EventBusSubscriber(modid = DWDimensions.MOD_ID, bus = Bus.MOD)
public class DimensionInit {
	
	//Dimension
	public static final RegistryKey<World> GALLIFREY_DIMENSION = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
			new ResourceLocation(DWDimensions.MOD_ID, "gallifrey"));
	
	//DimensionRenderInfo (SkyProperty)
	public static final ResourceLocation GALLIFREY_PROPERTY_KEY = new ResourceLocation(DWDimensions.MOD_ID, "gallifrey_sky_property");

	//NoiseSettings
	public static RegistryKey<DimensionSettings> GALLIFREY_NOISE_SETTINGS;
	
	public static final RegistryKey<DimensionType> GALLIFREY_TYPE = RegistryKey.getOrCreateKey(Registry.DIMENSION_TYPE_KEY, new ResourceLocation(DWDimensions.MOD_ID, "gallifrey"));

	
	/* ===Registry Methods Start=== */
    
	
	/*
	 * Register DimensionSettings in FMLCommonSetup Event 
	 */
	public static void registerNoiseSettings() {
		GALLIFREY_NOISE_SETTINGS = RegistryKey.getOrCreateKey(Registry.NOISE_SETTINGS_KEY, new ResourceLocation(DWDimensions.MOD_ID, "gallifrey"));
	}
	
	/*
	 * Register ChunkGen types
	 * Call in FMLCommonSetup
	 */
	public static void registerChunkGenerators() {
		Registry.register(Registry.CHUNK_GENERATOR_CODEC, new ResourceLocation(DWDimensions.MOD_ID, "gallifrey"), GallifreyChunkGenerator.codecProvider);
	}
	
	/*
	 * Register non-dynamic dimensions in FMLServerStarting event
	 */

	
	 public static ServerWorld registerOrGetDimensionStatic(String name, MinecraftServer server, BiFunction<MinecraftServer, RegistryKey<Dimension>, Dimension> dimension) {
	    	ResourceLocation loc = new ResourceLocation(DWDimensions.MOD_ID, name);
	    	RegistryKey<World> worldKey = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, loc);
	    	ServerWorld newWorld = DimensionHelper.getOrCreateWorldStatic(server, worldKey, dimension);
	    	return newWorld;
	    }

	
	public static ServerWorld registerOrGetDimensionStatic(RegistryKey<World> worldKey, MinecraftServer server, BiFunction<MinecraftServer, RegistryKey<Dimension>, Dimension> dimension) {
		ServerWorld newWorld = DimensionHelper.getOrCreateWorldStatic(server, worldKey, dimension);
		return newWorld;
	}
	
	
	

	
}
