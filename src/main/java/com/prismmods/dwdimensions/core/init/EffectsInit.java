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
			() -> new ModEffect(EffectType.HARMFUL, 13209599).addAttributesModifier(Attributes.MAX_HEALTH, "87138eb6-64ab-11eb-ae93-0242ac130002", -2.0D,
					AttributeModifier.Operation.ADDITION));

}
