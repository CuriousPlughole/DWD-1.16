package com.prismmods.dwdimensions.world;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Lifecycle;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Dimension;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.border.IBorderListener;
import net.minecraft.world.chunk.listener.IChunkStatusListener;
import net.minecraft.world.gen.settings.DimensionGeneratorSettings;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.DerivedWorldInfo;
import net.minecraft.world.storage.IServerConfiguration;
import net.minecraft.world.storage.SaveFormat.LevelSave;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;

/*
 * Credits: 50ap5ud5
 * https://gitlab.com/Spectre0987/TardisMod-1-14/-/blob/1.16.x/src/main/java/net/tardis/mod/helper/DimensionHelper.java
 */

public class DimensionHelper {

	public static ServerWorld getOrCreateWorldStatic(MinecraftServer server, RegistryKey<World> worldKey, 
			BiFunction<MinecraftServer, RegistryKey<Dimension>, Dimension> dimensionFactory) {

		Map<RegistryKey<World>, ServerWorld> map = server.forgeGetWorldMap();
		if (map.containsKey(worldKey)) {
			return map.get(worldKey);
		} else {
			ServerWorld newWorld = createAndRegisterWorldAndDimension(server, map, worldKey, dimensionFactory);
			return newWorld;
		}
	}

	private static ServerWorld createAndRegisterWorldAndDimension(MinecraftServer server,
			Map<RegistryKey<World>, ServerWorld> map, RegistryKey<World> worldKey,
			BiFunction<MinecraftServer, RegistryKey<Dimension>, Dimension> dimensionFactory) {

		ServerWorld overworld = server.getWorld(World.OVERWORLD);
		RegistryKey<Dimension> dimensionKey = RegistryKey.getOrCreateKey(Registry.DIMENSION_KEY,
				worldKey.getLocation());
		Dimension dimension = dimensionFactory.apply(server, dimensionKey);

		// AT needed here
		IChunkStatusListener chunkListener = server.chunkStatusListenerFactory.create(11);
		Executor executor = server.backgroundExecutor;
		LevelSave levelSave = server.anvilConverterForAnvilFile;

		IServerConfiguration serverConfig = server.getServerConfiguration();
		DimensionGeneratorSettings dimensionGenSettings = serverConfig.getDimensionGeneratorSettings();
		dimensionGenSettings.func_236224_e_().register(dimensionKey, dimension, Lifecycle.stable());
		DerivedWorldInfo worldInfo = new DerivedWorldInfo(serverConfig, serverConfig.getServerWorldInfo());

		ServerWorld newWorld = new ServerWorld(server, executor, levelSave, worldInfo, worldKey,
				dimension.getDimensionType(), chunkListener, dimension.getChunkGenerator(), 
				dimensionGenSettings.hasDebugChunkGenerator(), //this boolean is is-debug-world ??????
				BiomeManager.getHashedSeed(dimensionGenSettings.getSeed()), 
				ImmutableList.of(), //Special spawn list
				false); //"tick time" true for overworld only
		
		overworld.getWorldBorder().addListener(new IBorderListener.Impl(newWorld.getWorldBorder()));
		map.put(worldKey, newWorld);
		server.markWorldsDirty();
		MinecraftForge.EVENT_BUS.post(new WorldEvent.Load(newWorld));
		System.out.println("Registered new dimension: " + dimensionKey.getLocation().toString());
		return newWorld;

	}

}
