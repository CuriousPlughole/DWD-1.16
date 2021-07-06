package com.prismmods.dwdimensions.core.events;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.core.init.CarverInit;

import net.minecraft.world.gen.GenerationStage.Carving;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@Mod.EventBusSubscriber(modid = DWDimensions.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SetupEvents {
	
	@SubscribeEvent
	public static void onServerStarting(FMLServerStartingEvent event) {
		//DimensionInit.registerDimensionTypes(event.getServer());
		//DimensionInit.registerStaticDimensions(event.getServer());
	}
	
	@SubscribeEvent
	public static void onBiomeLoad(BiomeLoadingEvent event) {
		//System.out.println(event.getName().getNamespace());
		
		if(event.getName().getNamespace().equals(DWDimensions.MOD_ID)) {
			
			event.getGeneration().withCarver(Carving.AIR, CarverInit.ConfiguredCarvers.CONFIGURED_MOD_CAVE_CARVER);
			
		}

	}

}
