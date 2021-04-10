package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.world.feature.ModVegetalDuoFeature;
import com.prismmods.dwdimensions.world.feature.ModVegetalPatchFeature;
import com.prismmods.dwdimensions.world.feature.ModVegetalSingleFeature;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.SpruceFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FeatureInit {

	public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES,
			DWDimensions.MOD_ID);

	// SKARO VEGETATION
	public static final RegistryObject<Feature<ProbabilityConfig>> SKARO_TALL_GRASS = FEATURES.register(
			"skaro_tall_grass",
			() -> new ModVegetalPatchFeature(ProbabilityConfig.CODEC, BlockInit.SKARO_TALL_GRASS.get(), 20));
	public static final RegistryObject<Feature<ProbabilityConfig>> PETRIFIED_FUNGUS = FEATURES.register(
			"petrified_fungus",
			() -> new ModVegetalSingleFeature(ProbabilityConfig.CODEC, BlockInit.PETRIFIED_FUNGUS.get()));
	public static final RegistryObject<Feature<ProbabilityConfig>> SKARO_SHRUB_PATCH = FEATURES
			.register("skaro_shrub_patch", () -> new ModVegetalDuoFeature(ProbabilityConfig.CODEC,
					BlockInit.SKARO_SHRUB.get(), BlockInit.SKARO_SHRUB_2.get(), 7));
	public static final RegistryObject<Feature<ProbabilityConfig>> SKARO_PETRIFIED_FLOWER_PATCH = FEATURES
			.register("skaro_petrified_flower_patch", () -> new ModVegetalDuoFeature(ProbabilityConfig.CODEC,
					BlockInit.PETRIFIED_FLOWER_1.get(), BlockInit.PETRIFIED_FLOWER_2.get(), 5));
	public static final RegistryObject<Feature<ProbabilityConfig>> VARGA_PLANT = FEATURES.register(
			"varga_plant",
			() -> new ModVegetalSingleFeature(ProbabilityConfig.CODEC, BlockInit.VARGA_PLANT.get()));
	
	// TREES
	public static final RegistryObject<Feature<BaseTreeFeatureConfig>> PETRIFIED_TREE = FEATURES
			.register("petrified_tree", () -> new TreeFeature(BaseTreeFeatureConfig.CODEC));

	public static class ConfiguredFeatures {

		// For ChanceConfig a lower integer means more probable
		public static final ConfiguredFeature<?, ?> CONFIGURED_SKARO_TALL_GRASS = SKARO_TALL_GRASS.get()
				.withConfiguration(new ProbabilityConfig(0.9F))
				.withPlacement(Placement.CHANCE.configure(new ChanceConfig(2))).square();
		
		public static final ConfiguredFeature<?, ?> CONFIGURED_VARGA_PLANT= VARGA_PLANT.get()
				.withConfiguration(new ProbabilityConfig(0.8F))
				.withPlacement(Placement.CHANCE.configure(new ChanceConfig(3))).square();

		public static final ConfiguredFeature<?, ?> CONFIGURED_PETRIFIED_FUNGUS = PETRIFIED_FUNGUS.get()
				.withConfiguration(new ProbabilityConfig(0.5F))
				.withPlacement(Placement.CHANCE.configure(new ChanceConfig(4))).square();
		
		public static final ConfiguredFeature<?, ?> CONFIGURED_SKARO_SHRUB_PATCH = SKARO_SHRUB_PATCH.get()
				.withConfiguration(new ProbabilityConfig(0.7F))
				.withPlacement(Placement.CHANCE.configure(new ChanceConfig(4))).square();
		
		public static final ConfiguredFeature<?, ?> CONFIGURED_SKARO_PETRIFIED_FLOWER_PATCH = SKARO_PETRIFIED_FLOWER_PATCH.get()
				.withConfiguration(new ProbabilityConfig(0.5F))
				.withPlacement(Placement.CHANCE.configure(new ChanceConfig(4))).square();

		public static final ConfiguredFeature<?, ?> CONFIGURED_PETRIFIED_TREE = PETRIFIED_TREE.get()
				.withConfiguration((new BaseTreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(BlockInit.PETRIFIED_LOG.get().getDefaultState()),
						new SimpleBlockStateProvider(BlockInit.PETRIFIED_LEAVES.get().getDefaultState()),
						new SpruceFoliagePlacer(FeatureSpread.func_242253_a(2, 1), FeatureSpread.func_242253_a(0, 2),
								FeatureSpread.func_242253_a(1, 1)),
						new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build())
				.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
				.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1)));
	}

	public static void registerConfiguredFeatures() {
		registerConfiguredFeature("petrified_tree", ConfiguredFeatures.CONFIGURED_PETRIFIED_TREE);

		registerConfiguredFeature("skaro_tall_grass", ConfiguredFeatures.CONFIGURED_SKARO_TALL_GRASS);
		registerConfiguredFeature("petrified_fungus", ConfiguredFeatures.CONFIGURED_PETRIFIED_FUNGUS);
		registerConfiguredFeature("varga_plant", ConfiguredFeatures.CONFIGURED_VARGA_PLANT);
		registerConfiguredFeature("skaro_shrub_patch", ConfiguredFeatures.CONFIGURED_SKARO_SHRUB_PATCH);
		registerConfiguredFeature("skaro_petrified_flower_patch", ConfiguredFeatures.CONFIGURED_SKARO_PETRIFIED_FLOWER_PATCH);
	}

	private static <T extends Feature<?>> void registerConfiguredFeature(String regName,
			ConfiguredFeature<?, ?> configuredFeature) {
		Registry<ConfiguredFeature<?, ?>> registry = WorldGenRegistries.CONFIGURED_FEATURE;
		Registry.register(registry, new ResourceLocation(DWDimensions.MOD_ID, regName), configuredFeature);

	}

}
