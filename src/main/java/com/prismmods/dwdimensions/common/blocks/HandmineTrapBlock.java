package com.prismmods.dwdimensions.common.blocks;

import com.prismmods.dwdimensions.common.entities.HandmineEntity;
import com.prismmods.dwdimensions.core.init.BlockInit;
import com.prismmods.dwdimensions.core.init.EntityTypeInit;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HandmineTrapBlock extends Block {

	public HandmineTrapBlock(Properties properties) {
		super(properties);
	}

	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		// if(!worldIn.isRemote) {

		int numToSpawn = 7 + RANDOM.nextInt(5); // A random number of handmines between 7 and 12
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		if (entityIn instanceof PlayerEntity) {
			for (int i = 0; i < numToSpawn; i++) {
				HandmineEntity handmine = new HandmineEntity(EntityTypeInit.HANDMINE.get(), worldIn);

				boolean positiveX = RANDOM.nextBoolean();
				int spawnX = (positiveX) ? x + 1 + RANDOM.nextInt(2) : x - 1 - RANDOM.nextInt(2);
				boolean positiveZ = RANDOM.nextBoolean();
				int spawnZ = (positiveZ) ? z + 1 + RANDOM.nextInt(2) : z - 1 - RANDOM.nextInt(2);

				if (worldIn.getBlockState(new BlockPos(spawnX, y + 1, spawnZ)) == Blocks.AIR.getDefaultState()) {
					handmine.setPosition(spawnX, y + 1, spawnZ);
					if (!worldIn.isRemote) {
						worldIn.addEntity(handmine);
					}
					worldIn.addParticle(ParticleTypes.LARGE_SMOKE, spawnX, y + 1, spawnZ, 0, 0, 0);
				}
			}

			worldIn.playSound((PlayerEntity) entityIn, pos, SoundEvents.ENTITY_SPIDER_STEP, SoundCategory.BLOCKS, 0.7f,
					1.0f);
			// trap activated so just change to dirt
			worldIn.setBlockState(pos, BlockInit.SKARO_DIRT.get().getDefaultState(), 3);

			// }

		}

		super.onEntityWalk(worldIn, pos, entityIn);
	}
}
