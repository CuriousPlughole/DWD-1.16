package com.prismmods.dwdimensions.common.entities;

import java.util.Random;
import java.util.function.Predicate;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap.MutableAttribute;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
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

public class HandmineEntity extends MonsterEntity {

	//ADD DATA TO HAVE LEfT AND RIGHT HANDS
	
	private static final DataParameter<String> SIDE = EntityDataManager.createKey(HandmineEntity.class,
			DataSerializers.STRING);
	
	private static final Predicate<LivingEntity> NOT_HANDMINE = (livingEntity) -> !(livingEntity instanceof HandmineEntity) && livingEntity.attackable();
	
	public HandmineEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
		super(type, worldIn);
		this.setAIMoveSpeed(100.0f);
	}
	
	@Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 0.1D, false));
        this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 8.0F));

        //ATTACK
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, MobEntity.class, 1, false, false, NOT_HANDMINE));
	}
	
    public static MutableAttribute createAttributes() {
		return MonsterEntity.func_234295_eP_().createMutableAttribute(Attributes.ATTACK_DAMAGE, 16.0D)
				.createMutableAttribute(Attributes.MAX_HEALTH, 8.0D)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.0D)
				.createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 10D);
	}
	
    protected boolean canTriggerWalking() {
        return false;
    }

    @Override
    public boolean canSwim() {
    	return false;
    }
    
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.BLOCK_SLIME_BLOCK_BREAK;
    }

    @Override
    public boolean isInvulnerableTo(DamageSource source) {
    	//Prevent suffocation and drowning. TEST THIS
    	if(source == DamageSource.IN_WALL || source == DamageSource.DROWN) {
    		return true;
    	}
        return false;
    }

    @Override
    public void livingTick() {

        if (this.isAggressive()) {

        }

        super.livingTick();
    }

    public boolean canDespawn(double distanceToClosestPlayer) {
        return false;
    }
    
    //Left or right data
    
	@Override
	public void readAdditional(CompoundNBT compound) {
		if (compound.contains("side")) {
			setSide(compound.getString("side"));
		}
		super.readAdditional(compound);
	}

	@Override
	public void writeAdditional(CompoundNBT compound) {
		compound.putString("side", getSide());
		super.readAdditional(compound);
	}

	@Override
	protected void registerData() {
		super.registerData();
		getDataManager().register(SIDE, getRandomSide());
	}

	public void setSide(String a) {
		getDataManager().set(SIDE, a);
	}

	public String getSide() {
		return getDataManager().get(SIDE);
	}

	public String getRandomSide() {
		Random rand = new Random();
		Boolean isRight = rand.nextBoolean();
		if(isRight) return "right";
		else return "left";
	}
    

}
