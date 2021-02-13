package com.prismmods.dwdimensions.core.events;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.core.init.EffectsInit;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = DWDimensions.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT)
public class ClientRenderEvents {
	
	@SubscribeEvent
	public static void onColorFog(EntityViewRenderEvent.RenderFogEvent.FogColors e) {
		
		Entity viewer = Minecraft.getInstance().getRenderViewEntity();
		
		if(viewer != null) {
			if(viewer instanceof LivingEntity) {
				EffectInstance a = ((LivingEntity) viewer).getActivePotionEffect(EffectsInit.IRRADIATED.get()); 
					
				if(a != null) {
					e.setRed(0.25f);
					e.setBlue(0.05f);
					e.setGreen(0.0f);
				}
			}
		}
	}
	
	@SubscribeEvent
	public static void onSetupFogDensity(EntityViewRenderEvent.RenderFogEvent.FogDensity e) {
		Entity viewer = Minecraft.getInstance().getRenderViewEntity();
		if(viewer != null) {
			if(viewer instanceof LivingEntity) {
				EffectInstance a = ((LivingEntity) viewer).getActivePotionEffect(EffectsInit.IRRADIATED.get()); 
					
				if(a != null) {
					float amount = 0.07f;
					e.setCanceled(true);
					e.setDensity(amount);
				}
				
			}
	
		}
	}

}
