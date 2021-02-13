package com.prismmods.dwdimensions.core.events;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.core.init.DimensionInit;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@Mod.EventBusSubscriber(modid = DWDimensions.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SetupEvents {
	
	@SubscribeEvent
	public static void onServerStarting(FMLServerStartingEvent event) {
		DimensionInit.registerDimensionTypes(event.getServer());
		DimensionInit.registerStaticDimensions(event.getServer());
	}

}
