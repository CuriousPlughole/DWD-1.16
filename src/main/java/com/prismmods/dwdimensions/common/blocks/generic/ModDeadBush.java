package com.prismmods.dwdimensions.common.blocks.generic;

import com.prismmods.dwdimensions.core.init.BlockInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DeadBushBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class ModDeadBush extends DeadBushBlock{

	public ModDeadBush(Properties builder) {
		super(builder);
	}
	
	
	//Probably not the best way to do this; tags?
	@Override
	public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
		//Block block = state.getBlock();
		System.out.println(worldIn.getBlockState(pos.down()).getBlock());
		Block block = worldIn.getBlockState(pos.down()).getBlock();
		return block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.SAND || block == Blocks.RED_SAND || block == BlockInit.GALLIFREY_SAND.get() || block == BlockInit.GALLIFREY_DIRT.get(); //|| block == BlockInit.SKARO_DIRT.get();
	}

}
