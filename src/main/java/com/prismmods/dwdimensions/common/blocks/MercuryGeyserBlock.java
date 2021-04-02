package com.prismmods.dwdimensions.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class MercuryGeyserBlock extends Block {

	public MercuryGeyserBlock(Properties properties) {
		super(properties);
	}

	/**
	 * Called when the given entity walks on this Block
	 */
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if (!entityIn.isImmuneToFire() && entityIn instanceof LivingEntity
				&& !EnchantmentHelper.hasFrostWalker((LivingEntity) entityIn)) {
			entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
		}

		super.onEntityWalk(worldIn, pos, entityIn);
	}

	public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
		MercuryVapourBlock.placeVapourColumn(worldIn, pos.up());
	}

	@SuppressWarnings("deprecation")
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn,
			BlockPos currentPos, BlockPos facingPos) {
		if (facing == Direction.UP && (facingState.getBlock() == Blocks.WATER) || facingState.getBlock() == Blocks.AIR) {
			worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, this.tickRate(worldIn));
		}

		return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}

	/**
	 * How many world ticks before ticking
	 */
	public int tickRate(IWorldReader worldIn) {
		return 20;
	}

	public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
		worldIn.getPendingBlockTicks().scheduleTick(pos, this, this.tickRate(worldIn));
	}

}
