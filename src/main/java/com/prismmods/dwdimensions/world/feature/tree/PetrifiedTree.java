package com.prismmods.dwdimensions.world.feature.tree;

import java.util.Random;

import javax.annotation.Nullable;

import com.prismmods.dwdimensions.core.init.BlockInit;

import net.minecraft.block.trees.Tree;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.SpruceFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class PetrifiedTree extends Tree {

	@Nullable
	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive) {
		return PETRIFIED;
	}

	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PETRIFIED = register("petrified_tree",
			Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(
					new SimpleBlockStateProvider(BlockInit.PETRIFIED_LOG.get().getDefaultState()),
					new SimpleBlockStateProvider(BlockInit.PETRIFIED_LEAVES.get().getDefaultState()),
					new SpruceFoliagePlacer(FeatureSpread.func_242253_a(2,1),FeatureSpread.func_242253_a(0,2),FeatureSpread.func_242253_a(1,1)),
					new StraightTrunkPlacer(5,2,1),new TwoLayerFeature(2,0,2))).setIgnoreVines().build()));

	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key,
			ConfiguredFeature<FC, ?> configuredFeature) {
		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
	}
}