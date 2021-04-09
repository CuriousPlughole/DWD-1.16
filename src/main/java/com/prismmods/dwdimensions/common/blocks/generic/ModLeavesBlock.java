package com.prismmods.dwdimensions.common.blocks.generic;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class ModLeavesBlock extends LeavesBlock {

    public ModLeavesBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return true;
    }

    //Random chance between 0% and 50%
    @Override
    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        Random rand = new Random();
        int flammability = rand.nextInt(150) + 1;
        return flammability;
    }

}
