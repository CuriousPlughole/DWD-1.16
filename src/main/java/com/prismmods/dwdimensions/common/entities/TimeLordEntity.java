package com.prismmods.dwdimensions.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class TimeLordEntity extends RegeneratableEntity {

	private static final DataParameter<String> SKIN = EntityDataManager.createKey(TimeLordEntity.class,
			DataSerializers.STRING);

	public TimeLordEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
		super(type, worldIn);
		this.setAIMoveSpeed(100.0f);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new SwimGoal(this));
		this.goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
		this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 6.0F));
		this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
	}

	@Override
	protected void registerData() {
		super.registerData();
		getDataManager().register(SKIN, getRandomVariant());
	}

	public void setSkin(String skin) {
		getDataManager().set(SKIN, skin);
	}

	public String getSkin() {
		return getDataManager().get(SKIN);
	}

	@Override
	public void setAIMoveSpeed(float speedIn) {
		super.setAIMoveSpeed(speedIn);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		return super.attackEntityFrom(source, amount);
	}

	public static AttributeModifierMap.MutableAttribute createAttributes() {
		return MonsterEntity.func_234295_eP_()
				.createMutableAttribute(Attributes.MAX_HEALTH, 20)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.14D);
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_PLAYER_HURT;
	}

	@Override
	public void readAdditional(CompoundNBT compound) {
		if (compound.contains("skin")) {
			setSkin(compound.getString("skin"));
		}
		super.readAdditional(compound);
	}

	@Override
	public void writeAdditional(CompoundNBT compound) {
		compound.putString("skin", getSkin());
		super.writeAdditional(compound);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	public void onMidRegen() {
		super.onMidRegen();
		setSkin(getRandomVariant());
	}

	public boolean canDespawn(double distanceToClosestPlayer) {
		return false;
	}

	public static String[] textures = new String[] { "timelord_curtis", "timelord_gustavo", "timelord_hector",
			"timelord_jerry", "timelord_spencer", "timelord_steve", "timelord_tony" };

	public String getRandomVariant() {
		return textures[rand.nextInt(textures.length)];
	}

}
