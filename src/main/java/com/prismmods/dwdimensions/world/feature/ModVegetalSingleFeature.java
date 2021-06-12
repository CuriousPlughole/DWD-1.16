package com.prismmods.dwdimensions.world.feature;

import java.util.Random;

import com.mojang.serialization.Codec;
import com.prismmods.dwdimensions.core.init.BlockInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ProbabilityConfig;

public class ModVegetalSingleFeature extends Feature<ProbabilityConfig> {

	private Block blockType;

	public ModVegetalSingleFeature(Codec<ProbabilityConfig> codec, Block vegetalType) {
		super(codec);
		this.blockType = vegetalType;
	}

	@Override
	public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos,
			ProbabilityConfig config) {

		boolean flag = false;
		int i = rand.nextInt(8) - rand.nextInt(8);
		int j = rand.nextInt(8) - rand.nextInt(8);
		int k = reader.getHeight(Heightmap.Type.WORLD_SURFACE, pos.getX() + i, pos.getZ() + j);
		BlockPos blockpos = new BlockPos(pos.getX() + i, k, pos.getZ() + j);
		if (reader.getBlockState(blockpos).matchesBlock(Blocks.AIR)) {	
			
			BlockState blockstate = this.blockType.getDefaultState();
			if(this.blockType == BlockInit.VARGA_PLANT.get()) {
				blockstate = BlockInit.VARGA_PLANT.get().getDefaultState().with(BlockStateProperties.AGE_0_3, 3);
			} 
			
			if (blockstate.isValidPosition(reader, blockpos)) {

				reader.setBlockState(blockpos, blockstate, 2);
			}

			flag = true;
		}

		return flag;

	}
}
