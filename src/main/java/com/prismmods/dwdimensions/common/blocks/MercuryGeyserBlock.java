package com.prismmods.dwdimensions.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
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
			entityIn.setMotion(entityIn.getMotion().add(0.0D, 1.0D, 0.0d));
			
			double d0 = (double) pos.getX();
			double d1 = (double) pos.getY();
			double d2 = (double) pos.getZ();
			Random rand = new Random();
			worldIn.addOptionalParticle(ParticleTypes.EXPLOSION, d0 + (double) rand.nextFloat(),
					d1 + (double) rand.nextFloat(), d2 + (double) rand.nextFloat(), 0.0D, 0.04D, 0.0D);
			worldIn.addOptionalParticle(ParticleTypes.DRIPPING_WATER, d0 + (double) rand.nextFloat(),
					d1 + (double) rand.nextFloat(), d2 + (double) rand.nextFloat(), 0.0D, 0.04D, 0.0D);
			worldIn.playSound(d0, d1, d2, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.BLOCKS,
					0.05F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
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
