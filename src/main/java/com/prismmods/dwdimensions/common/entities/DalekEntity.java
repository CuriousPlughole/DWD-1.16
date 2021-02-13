package com.prismmods.dwdimensions.common.entities;

import java.util.function.Predicate;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class DalekEntity extends MonsterEntity implements IRangedAttackMob {

	private static final Predicate<LivingEntity> NOT_DALEK = (livingEntity) -> !(livingEntity instanceof DalekEntity) && livingEntity.attackable();
	private static final DataParameter<String> DALEK_TYPE = EntityDataManager.createKey(DalekEntity.class,
			DataSerializers.STRING);
	public static LivingEntity targetedEntity;
	
	public DalekEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
		super(type, worldIn);
		this.setAIMoveSpeed(100.0f);
		this.targetedEntity = null;
	}

	@Override
	public void attackEntityWithRangedAttack(LivingEntity target, float distanceFactor) {
		this.targetedEntity = target;
		target.attackEntityFrom(DamageSource.causeMobDamage(this), (float)this.getAttribute(Attributes.ATTACK_DAMAGE).getValue());
	}
	

	@Override
	public boolean canDespawn(double distanceToClosestPlayer) {
		return false;
	}

	public static AttributeModifierMap.MutableAttribute createAttributes() {
		return MonsterEntity.func_234295_eP_()
				.createMutableAttribute(Attributes.FOLLOW_RANGE, 35D)
				.createMutableAttribute(Attributes.MAX_HEALTH, 40D)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.2D);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(3, new SwimGoal(this));
		this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
		this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 6.0F));
		this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
		
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, MobEntity.class, 0, false, false, NOT_DALEK));
		this.goalSelector.addGoal(2, new RangedAttackGoal(this, 1.0D, 20, 15.0F));
	}
	
	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}
	
	/*
	 * TEXTURE STUFF
	 */
	
	@Override
	public void readAdditional(CompoundNBT compound) {
		if (compound.contains("dalek_type")) {
			setDalekType(compound.getString("dalek_type"));
		}
		super.readAdditional(compound);
	}

	@Override
	public void writeAdditional(CompoundNBT compound) {
		compound.putString("dalek_type", getDalekType());
		super.readAdditional(compound);
	}

	@Override
	protected void registerData() {
		super.registerData();
		getDataManager().register(DALEK_TYPE, getRandomType());
	}

	public void setDalekType(String typename) {
		getDataManager().set(DALEK_TYPE, typename);
	}

	public String getDalekType() {
		return getDataManager().get(DALEK_TYPE);
	}

	public String getRandomType() {
		return "time_war";
	}

}
