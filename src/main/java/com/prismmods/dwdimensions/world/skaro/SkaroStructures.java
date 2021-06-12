package com.prismmods.dwdimensions.world.skaro;

import java.util.function.Supplier;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.world.skaro.structures.SkaroOutpostStructure;
import com.prismmods.dwdimensions.world.skaro.structures.SkaroOutpostStructurePieces;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.FlatGenerationSettings;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;
import net.minecraft.world.gen.settings.StructureSeparationSettings;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//Credit to 50 for the registry side of things:
//Good comments explain what's going on
//https://gitlab.com/Spectre0987/TardisMod-1-14/-/blob/1.16/src/main/java/net/tardis/mod/world/structures/TStructures.java

public class SkaroStructures {
	
	public static final DeferredRegister<Structure<?>> SKARO_STRUCTURES = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, DWDimensions.MOD_ID);
	
	public static final RegistryObject<Structure<ProbabilityConfig>> ABANDONED_OUTPOST = setupStructure("skaro_outpost", () -> new SkaroOutpostStructure(ProbabilityConfig.CODEC));
	public static IStructurePieceType ABANDONED_OUTPOST_PIECE = registerStructurePiece(SkaroOutpostStructurePieces.Piece::new, "skaro_outpost_piece");

	
	
	public static class ConfiguredStructures {
		public static StructureFeature<?, ?> CONFIGURED_ABANDONED_OUTPOST = SkaroStructures.ABANDONED_OUTPOST.get().withConfiguration(new ProbabilityConfig(0.4f));
		
		public static void registerConfiguredStructures() {
            registerConfiguredStructure("skaro_outpost", SkaroStructures.ABANDONED_OUTPOST, CONFIGURED_ABANDONED_OUTPOST);
		}

	}
	
	 public static void setupStructures() {
	        setupStructure(SkaroStructures.ABANDONED_OUTPOST.get(), new StructureSeparationSettings(20, 2, 1234567890), true);
	    }
	 
	 
	 
	 private static <T extends Structure<?>> void registerConfiguredStructure(String registryName, Supplier<T> structure, StructureFeature<?, ?> configuredStructure) {
		 Registry<StructureFeature<?, ?>> registry = WorldGenRegistries.CONFIGURED_STRUCTURE_FEATURE;
		 Registry.register(registry, new ResourceLocation(DWDimensions.MOD_ID, registryName), configuredStructure);
		 
		
		 FlatGenerationSettings.STRUCTURES.put(structure.get(), configuredStructure);
	 }
	 
	 private static <T extends Structure<?>> RegistryObject<T> setupStructure(String name, Supplier<T> structure) {
	       return SkaroStructures.SKARO_STRUCTURES.register(name, structure);
	   }

	 public static <F extends Structure<?>> void setupStructure(F structure, StructureSeparationSettings structureSeparationSettings, boolean transformSurroundingLand){
		 Structure.NAME_STRUCTURE_BIMAP.put(structure.getRegistryName().toString(), structure);
		 if(transformSurroundingLand){ 
	           Structure.field_236384_t_ = ImmutableList.<Structure<?>>builder().addAll(Structure.field_236384_t_).add(structure).build();
	           if(transformSurroundingLand){ 
	               Structure.field_236384_t_ = ImmutableList.<Structure<?>>builder().addAll(Structure.field_236384_t_).add(structure).build();
	           }
	           DimensionStructuresSettings.field_236191_b_ =
	                   ImmutableMap.<Structure<?>, StructureSeparationSettings>builder()
	                           .putAll(DimensionStructuresSettings.field_236191_b_)
	                           .put(structure, structureSeparationSettings)
	                           .build();

	       }

	 }
	 
	 public static IStructurePieceType registerStructurePiece(IStructurePieceType type, String key) {
	       return Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(DWDimensions.MOD_ID, key), type);
	   }




	

}
