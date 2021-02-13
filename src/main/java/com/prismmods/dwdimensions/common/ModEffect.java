package com.prismmods.dwdimensions.common;

import com.prismmods.dwdimensions.core.init.EffectsInit;
import com.prismmods.dwdimensions.core.init.ModDamageSources;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class ModEffect extends Effect{

	public ModEffect(EffectType typeIn, int liquidColorIn) {
		super(typeIn, liquidColorIn);
		
	}
	
	@Override
	public boolean isReady(int duration, int amplifier) {
		return true;
	}
	
	@Override
	public void affectEntity(Entity source, Entity indirectSource, LivingEntity entityLivingBaseIn, int amplifier,
			double health) {
		this.performEffect(entityLivingBaseIn, amplifier);
	}
	
	@Override
	public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
		if(this == EffectsInit.IRRADIATED.get()) {
			//if (entityLivingBaseIn.getHealth() > 5.0F) {
				entityLivingBaseIn.attackEntityFrom(ModDamageSources.RADIATION_SICKNESS, 1.0F);
				
			//}
		}
	}
	
	
	

}
