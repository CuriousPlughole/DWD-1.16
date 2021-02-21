package com.prismmods.dwdimensions.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.World;

public class RegeneratableEntity extends MonsterEntity {

	private static final DataParameter<Integer> ANIMATION = EntityDataManager.createKey(TimeLordEntity.class,
			DataSerializers.VARINT);
	private static final DataParameter<Boolean> IS_REGEN = EntityDataManager.createKey(TimeLordEntity.class,
			DataSerializers.BOOLEAN);
	private static final DataParameter<Integer> REGENS_LEFT = EntityDataManager.createKey(TimeLordEntity.class,
			DataSerializers.VARINT);

	public RegeneratableEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
		super(type, worldIn);
	}

	public int getMaxRegenerations() {
		return 12;
	}

	@Override
	protected void registerData() {
		super.registerData();
		getDataManager().register(IS_REGEN, false);
		getDataManager().register(ANIMATION, 0);
		getDataManager().register(REGENS_LEFT, getMaxRegenerations() > 0 ? rand.nextInt(getMaxRegenerations()) : 0);
	}

	@Override
	public void readAdditional(CompoundNBT compound) {
		if (compound.contains("ticks_animating")) {
			setRegenTicks(compound.getInt("ticks_animating"));
		}

		if (compound.contains("is_regen")) {
			setRegenerating(compound.getBoolean("is_regen"));
		}

		if (compound.contains("regens")) {
			setRegensLeft(compound.getInt("regens"));
		}
		super.readAdditional(compound);
	}

	@Override
	public void tick() {
		super.tick();
		if (getRegenerating()) {
			setRegenTicks(getRegenTicks() + 1);
			heal(1.0F);
			setMotion(0, 0, 0);

			if (world.isRemote) {
				for (int i = 0; i < 2; ++i) {
					this.world.addParticle(ParticleTypes.FLAME, this.getPosXRandom(0.5D), this.getPosYRandom(),
							this.getPosZRandom(0.5D), 0.0D, 0.0D, 0.0D);
					this.world.addParticle(ParticleTypes.SMOKE, this.getPosXRandom(0.5D), this.getPosYRandom(),
							this.getPosZRandom(0.5D), 0.0D, 0.0D, 0.0D);
				}
			}
		}

		int regenTicks = getRegenTicks();
		if (regenTicks == 150) {
			onMidRegen();
		}

		if (regenTicks >= 200) {
			setRegenTicks(0);
			setRegenerating(false);
			setRegensLeft(getRegensLeft() - 1);
		}
	}

	public void onMidRegen() {

	}

	@Override
	public void writeAdditional(CompoundNBT compound) {
		compound.putInt("ticks_animating", getRegenTicks());
		compound.putInt("regens", getRegensLeft());
		compound.putBoolean("is_regen", getRegenerating());
		super.writeAdditional(compound);
	}

	public int getRegensLeft() {
		return getDataManager().get(REGENS_LEFT);
	}

	public void setRegensLeft(int regens) {
		getDataManager().set(REGENS_LEFT, regens);
	}

	public int getRegenTicks() {
		return getDataManager().get(ANIMATION);
	}

	public void setRegenTicks(int ticks) {
		getDataManager().set(ANIMATION, ticks);
	}

	public boolean getRegenerating() {
		return getDataManager().get(IS_REGEN);
	}

	public void setRegenerating(boolean is) {
		getDataManager().set(IS_REGEN, is);
	}

}
