package com.prismmods.dwdimensions.core.events;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.common.entities.RegeneratableEntity;
import com.prismmods.dwdimensions.core.init.SoundInit;

import net.minecraft.util.SoundCategory;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = DWDimensions.MOD_ID, bus = Bus.FORGE)
public class RegenerateEvent {

	@SubscribeEvent
	public static void stopDeath(LivingHurtEvent event) {

		if (event.getEntity() instanceof RegeneratableEntity) {
			RegeneratableEntity p = (RegeneratableEntity) event.getEntityLiving();
			if (p.getHealth() - event.getAmount() <= 0 && p.getRegensLeft() > 0) {
				event.setCanceled(true);
				event.setAmount(0);

				p.setHealth(0.5f);
				p.getEntityWorld().playSound(null, p.getPosition(), SoundInit.REGEN_START.get(), SoundCategory.MASTER,
						1.0F, 1.0F);
				p.setRegenerating(true);
			}
		}

	}

}
