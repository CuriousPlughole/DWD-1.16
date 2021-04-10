package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.common.ModEffect;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EffectsInit {

	public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS,
			DWDimensions.MOD_ID);

	public static final RegistryObject<Effect> IRRADIATED = EFFECTS.register("irradiated",
			() -> new ModEffect(EffectType.HARMFUL, 13209599).addAttributesModifier(Attributes.MAX_HEALTH, "87138eb6-64ab-11eb-ae93-0242ac130002", 0.0D,
					AttributeModifier.Operation.ADDITION));
	
	public static final RegistryObject<Effect> RADIATION_IMMUNITY = EFFECTS.register("radiation_immunity",
			() -> new ModEffect(EffectType.HARMFUL, 13409543).addAttributesModifier(Attributes.MAX_HEALTH, "b2284b14-99ee-11eb-a8b3-0242ac130003", 0.0D,
					AttributeModifier.Operation.ADDITION));

}
