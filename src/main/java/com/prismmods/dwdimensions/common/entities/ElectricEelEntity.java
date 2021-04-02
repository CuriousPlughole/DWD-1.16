package com.prismmods.dwdimensions.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap.MutableAttribute;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.world.World;

public class ElectricEelEntity extends MonsterEntity {

	private static final DataParameter<Float> ELECTRIC_CHARGE = EntityDataManager.createKey(ElectricEelEntity.class,
			DataSerializers.FLOAT);

	public ElectricEelEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
		super(type, worldIn);
		this.setAIMoveSpeed(50.0f);
		this.setPathPriority(PathNodeType.WATER, 0.0F);
	}

	// change this attributes
	public static MutableAttribute createAttributes() {
		return MonsterEntity.func_234295_eP_().createMutableAttribute(Attributes.FOLLOW_RANGE, 30D)
				.createMutableAttribute(Attributes.MAX_HEALTH, 40D)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.18D);
	}
	
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new SwimGoal(this));
	}
	
	
	@Override
	public void tick() {
		super.tick();
	}

	float getElectricCharge() {
		return getDataManager().get(ELECTRIC_CHARGE);
	}
	
	private void setElectricCharge(float charge) {
		getDataManager().set(ELECTRIC_CHARGE, charge);
	}

	protected void registerData() {
		super.registerData();
		this.dataManager.register(ELECTRIC_CHARGE, 50.0f);
	}

	public void writeAdditional(CompoundNBT compound) {
		compound.putFloat("electric_charge", getElectricCharge());
		super.writeAdditional(compound);
	}

	public void readAdditional(CompoundNBT compound) {
		if (compound.contains("electric_charge")) {
			setElectricCharge(compound.getFloat("electric_charge"));
		}
		super.readAdditional(compound);
	}
	
	@Override
	public boolean isPushedByWater() {
		return false;
	}
	@Override
	public boolean canBeLeashedTo(PlayerEntity player) {
		return false;
	}

}
