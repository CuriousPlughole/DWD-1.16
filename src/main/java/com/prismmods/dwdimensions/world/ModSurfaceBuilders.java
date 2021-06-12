package com.prismmods.dwdimensions.world;

import java.util.function.Supplier;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.world.gallifrey.GallifreySurfaceBuilder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSurfaceBuilders {
	
	public static final DeferredRegister<SurfaceBuilder<?>> SURFACE_BUILDERS = DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, DWDimensions.MOD_ID);
	
	public static final RegistryObject<SurfaceBuilder<SurfaceBuilderConfig>> GALLIFREY_SURFACE_BUILDER = createSurfaceBuilder("gallifrey_surface_builder", () -> new GallifreySurfaceBuilder(SurfaceBuilderConfig.CODEC));
	public static final RegistryObject<SurfaceBuilder<SurfaceBuilderConfig>> SKARO_SURFACE_BUILDER = createSurfaceBuilder("skaro_surface_builder", () -> new GallifreySurfaceBuilder(SurfaceBuilderConfig.CODEC));
	
	private static <S extends SurfaceBuilder<?>> RegistryObject<S> createSurfaceBuilder(String name, Supplier<? extends S> surfaceBuilder) {
        return SURFACE_BUILDERS.register(name, surfaceBuilder);
    }

	private static <SC extends ISurfaceBuilderConfig> ConfiguredSurfaceBuilder<SC> registerConfiguredSurfaceBuilder(String name, ConfiguredSurfaceBuilder<SC> configuredSurfaceBuilder) {
        return WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(DWDimensions.MOD_ID, name), configuredSurfaceBuilder);
    }

	
	
}
