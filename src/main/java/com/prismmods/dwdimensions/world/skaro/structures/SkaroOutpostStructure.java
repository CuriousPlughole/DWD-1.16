package com.prismmods.dwdimensions.world.skaro.structures;

import com.mojang.serialization.Codec;

import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.registry.DynamicRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class SkaroOutpostStructure extends Structure<ProbabilityConfig> {

	public SkaroOutpostStructure(Codec<ProbabilityConfig> codec) {
		super(codec);
	}

	@Override
	public IStartFactory<ProbabilityConfig> getStartFactory() {
		return SkaroOutpostStructure.Start::new;
	}

	@Override
	public Decoration getDecorationStage() {
		return Decoration.SURFACE_STRUCTURES;
	}

	public static class Start extends StructureStart<ProbabilityConfig> {

		public Start(Structure<ProbabilityConfig> structure, int chunkX, int chunkZ, MutableBoundingBox boundingBox,
				int reference, long seed) {
			super(structure, chunkX, chunkZ, boundingBox, reference, seed);
		}

		@Override
		public void func_230364_a_(DynamicRegistries reg, ChunkGenerator chunkGen, TemplateManager template, int chunkX,
				int chunkZ, Biome biome, ProbabilityConfig probability) {

			Rotation rotation = Rotation.values()[this.rand.nextInt(Rotation.values().length)];

			int x = (chunkX << 4) + 7;
			int z = (chunkZ << 4) + 7;
			int y = chunkGen.getHeight(x, z, Heightmap.Type.WORLD_SURFACE_WG);
			BlockPos pos = new BlockPos(x, y, z);
			
			if(rand.nextFloat() < probability.probability) {
				SkaroOutpostStructurePieces.start(template, pos, rotation, this.components, this.rand);
				  this.recalculateStructureSize();
				  System.out.println("Structure located at:" + pos);
			}

		}

	}

}
