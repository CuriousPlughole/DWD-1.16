package com.prismmods.dwdimensions.common.blocks;

import java.util.Random;

import com.prismmods.dwdimensions.core.init.BlockInit;
import com.prismmods.dwdimensions.core.init.ModDamageSources;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IBucketPickupHandler;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MercuryVapourBlock extends Block implements IBucketPickupHandler {

	public MercuryVapourBlock(Properties properties) {
		super(properties);
	}

	public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
		BlockState blockstate = worldIn.getBlockState(pos.down());
		return blockstate.isIn(BlockInit.MERCURY_GEYSER.get()) || blockstate.isIn(BlockInit.MERCURY_VAPOUR.get());
	}

	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return VoxelShapes.empty();
	}

	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.INVISIBLE;
	}

	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
		if (!worldIn.isRemote) {
			ServerWorld serverworld = (ServerWorld) worldIn;

			entityIn.attackEntityFrom(ModDamageSources.TOXIC_MERCURY, 2.0F);
			
			for (int i = 0; i < 2; ++i) {
				serverworld.spawnParticle(ParticleTypes.ASH, (double) pos.getX() + worldIn.rand.nextDouble(),
						(double) (pos.getY() + 1), (double) pos.getZ() + worldIn.rand.nextDouble(), 1, 0.0D, 0.0D, 0.0D,
						1.0D);
				serverworld.spawnParticle(ParticleTypes.CRIT, (double) pos.getX() + worldIn.rand.nextDouble(),
						(double) (pos.getY() + 1), (double) pos.getZ() + worldIn.rand.nextDouble(), 1, 0.0D, 0.01D,
						0.0D, 0.2D);
			}
		}

	}

	// Here return liquid mercury? Water for now.
	@Override
	public Fluid pickupFluid(IWorld worldIn, BlockPos pos, BlockState state) {
		worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 11);
		return Fluids.WATER;
	}

	// will go up to build height rn
	public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
		placeVapourColumn(worldIn, pos.up());
	}

	public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
		placeVapourColumn(worldIn, pos.up());
	}

	public static void placeVapourColumn(IWorld world, BlockPos blockPos) {
		if (canHoldVapourColumn(world, blockPos)) {
			Random rand = new Random();
			int max = 3 + rand.nextInt(8);
			int min = 1;
			for (int i = min; i < max; i++) {
				//System.out.println(world.getBlockState(blockPos.down(i)));
				if (world.getBlockState(blockPos.down(i)) == BlockInit.MERCURY_GEYSER.get().getDefaultState()) {
					world.setBlockState(blockPos, BlockInit.MERCURY_VAPOUR.get().getDefaultState(), 2);
				}
			}
		}
	}

	public FluidState getFluidState(BlockState state) {
		return Fluids.EMPTY.getDefaultState();
	}

	public static boolean canHoldVapourColumn(IWorld world, BlockPos pos) {
		return world.getBlockState(pos).isIn(Blocks.AIR);
	}

	/**
	 * Called periodically clientside on blocks near the player to show effects
	 * (like furnace fire particles). Note that this method is unrelated to
	 * {@link randomTick} and {@link #needsRandomTick}, and will always be called
	 * regardless of whether the block can receive random update ticks
	 */
	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		double d0 = (double) pos.getX();
		double d1 = (double) pos.getY();
		double d2 = (double) pos.getZ();

		// Temporary particles, may make custom ones
		worldIn.addOptionalParticle(ParticleTypes.SMOKE, d0 + 0.5D, d1, d2 + 0.5D, 0.0D, 0.04D, 0.0D);
		for (int i = 0; i < 5; i++) {
			worldIn.addOptionalParticle(ParticleTypes.CLOUD, d0 + (double) rand.nextFloat(),
					d1 + (double) rand.nextFloat(), d2 + (double) rand.nextFloat(), 0.0D, 0.04D, 0.0D);
		}

		// EXPLOSION SOUND WILL PROBABLY GET ANNOYING SO MAYBE CHANGE IT?
		switch (rand.nextInt(100)) {
		case 0:
			worldIn.playSound(d0, d1, d2, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS,
					0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
		case 1:
			worldIn.addOptionalParticle(ParticleTypes.EXPLOSION, d0 + (double) rand.nextFloat(),
					d1 + (double) rand.nextFloat(), d2 + (double) rand.nextFloat(), 0.0D, 0.04D, 0.0D);
			worldIn.addOptionalParticle(ParticleTypes.DRIPPING_WATER, d0 + (double) rand.nextFloat(),
					d1 + (double) rand.nextFloat(), d2 + (double) rand.nextFloat(), 0.0D, 0.04D, 0.0D);
			worldIn.playSound(d0, d1, d2, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.BLOCKS,
					0.05F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
		}
	}

	/**
	 * Update the provided state given the provided neighbor facing and neighbor
	 * state, returning a new state. For example, fences make their connections to
	 * the passed in state if possible, and wet concrete powder immediately returns
	 * its solidified counterpart. Note that this method should ideally consider
	 * only the specific face passed in.
	 */

	// Probably need some specific checks for air and water
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn,
			BlockPos currentPos, BlockPos facingPos) {
		if (!stateIn.isValidPosition(worldIn, currentPos)) {
			return Blocks.AIR.getDefaultState();
		} else {

			if (facing == Direction.DOWN) {
				worldIn.setBlockState(currentPos, BlockInit.MERCURY_VAPOUR.get().getDefaultState(), 2);
			} else if (facing == Direction.UP && !facingState.isIn(BlockInit.MERCURY_VAPOUR.get())
					&& canHoldVapourColumn(worldIn, facingPos)) {
				worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, 5);
			}

			// may need to edit this
			worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
			return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
		}
	}
}
