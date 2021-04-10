package com.prismmods.dwdimensions.common.blocks;

import java.util.Random;
import java.util.function.Supplier;

import com.prismmods.dwdimensions.common.entities.DalekEntity;
import com.prismmods.dwdimensions.core.init.EffectsInit;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class FlowingRadioactiveWaterBlock extends FlowingFluidBlock {

	public FlowingRadioactiveWaterBlock(Supplier<? extends FlowingFluid> supplier, Properties prop) {
		super(supplier, prop);
	}

	@Override
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
		if (entityIn instanceof LivingEntity) {
			LivingEntity e = (LivingEntity) entityIn;

			//Some entities, eg daleks could be immune to this (due to their casing)
			//Make a list if needed or just add entities as desired
			if (e.getActivePotionEffect(EffectsInit.RADIATION_IMMUNITY.get()) != null || (e instanceof DalekEntity)) {
				// entity is immune to radiation so don't do anything

			} else {
				// time in ticks (20 ticks = 1 second)
				e.addPotionEffect(new EffectInstance(EffectsInit.IRRADIATED.get(), 60, 1, true, true));
			}
		}

	}

	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		super.animateTick(stateIn, worldIn, pos, rand);
		switch (rand.nextInt(35)) {

		case (0):
			double a = (1.1 + rand.nextFloat() * (1.4 - 1.1));
			worldIn.addParticle(ParticleTypes.COMPOSTER, (double) pos.getX() + (double) rand.nextFloat(),
					(double) pos.getY() + a, (double) pos.getZ() + (double) rand.nextFloat(), 0.0D, 0.0D, 0.0D);

		case (1):
			double b = (1.2 + rand.nextFloat() * (1.6 - 1.2));
			worldIn.addParticle(ParticleTypes.BUBBLE, (double) pos.getX() + (double) rand.nextFloat(),
					(double) pos.getY() + b, (double) pos.getZ() + (double) rand.nextFloat(), 0.0D, 0.0D, 0.0D);

		case (2):
			double c = (1.0 + rand.nextFloat() * (1.4 - 1.0));
			worldIn.addParticle(ParticleTypes.BUBBLE_POP, (double) pos.getX() + (double) rand.nextFloat(),
					(double) pos.getY() + c, (double) pos.getZ() + (double) rand.nextFloat(), 0.0D, 0.0D, 0.0D);
		}

		//for ambient sounds - but got quite annoying. Maybe something for future.
		/*
		if (rand.nextInt(500) == 0) {
			worldIn.playSound((double) pos.getX() + (double) rand.nextFloat(), (double) pos.getY(),
					(double) pos.getZ(), SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS,
					0.6F + rand.nextFloat() * 0.2F, 0.8F + rand.nextFloat() * 0.4F, false);
		}*/

	}

}
