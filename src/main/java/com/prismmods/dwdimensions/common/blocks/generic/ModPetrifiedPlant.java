package com.prismmods.dwdimensions.common.blocks.generic;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModPetrifiedPlant extends ModDeadBush {

	public ModPetrifiedPlant(Properties builder) {
		super(builder);
	}

	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		VoxelShape voxelshape = this.getShape(stateIn, worldIn, pos, ISelectionContext.dummy());
		Vector3d vector3d = voxelshape.getBoundingBox().getCenter();
		double d0 = (double) pos.getX() + vector3d.x;
		double d1 = (double) pos.getZ() + vector3d.z;

		for (int i = 0; i < 3; ++i) {
			if (rand.nextBoolean()) {
				worldIn.addParticle(ParticleTypes.CRIT, d0 + rand.nextDouble() / 5.0D,
						(double) pos.getY() + (0.5D - rand.nextDouble()), d1 + rand.nextDouble() / 5.0D, 0.0D, 0.0D,
						0.0D);
			}
		}

	}

}
