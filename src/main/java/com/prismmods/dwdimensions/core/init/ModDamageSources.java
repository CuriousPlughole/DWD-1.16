package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;

import net.minecraft.util.DamageSource;

public class ModDamageSources {
	
	public static final DamageSource RADIATION_SICKNESS = new DamageSource(DWDimensions.MOD_ID + ".radiation.sickness").setDamageBypassesArmor().setDamageIsAbsolute();
	public static final DamageSource IRRADIATED = new DamageSource(DWDimensions.MOD_ID + ".radiation").setDamageBypassesArmor().setDamageIsAbsolute();
	
	

}
