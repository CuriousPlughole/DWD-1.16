package com.prismmods.dwdimensions.common.blocks.generic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class QuicksandBlock extends Block{

	public QuicksandBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
		entityIn.setMotionMultiplier(state, new Vector3d(0.25D, (double)0.05F, 0.25D));
	}

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.SHOVEL;
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return 1;
    }

}
