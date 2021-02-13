package com.prismmods.dwdimensions.client.util;

import java.util.HashMap;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.client.render.entity.DalekRenderer;
import com.prismmods.dwdimensions.client.render.tileentity.tardis.ExteriorRenderer;
import com.prismmods.dwdimensions.core.init.BlockInit;
import com.prismmods.dwdimensions.core.init.DimensionInit;
import com.prismmods.dwdimensions.core.init.EntityTypeInit;
import com.prismmods.dwdimensions.core.init.TileEntityTypeInit;
import com.prismmods.dwdimensions.world.gallifrey.render.GallifreySkyProperty;
import com.prismmods.dwdimensions.world.gallifrey.render.GallifreySkyRenderer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.world.DimensionRenderInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = DWDimensions.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientUtils {
	
	public static GallifreySkyRenderer GALLIFREY_RENDER = new GallifreySkyRenderer();
	public static HashMap<ResourceLocation, String> DIMENSION_NAMES = new HashMap<>();
	
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		
		DimensionRenderInfo.field_239208_a_.put(DimensionInit.GALLIFREY_PROPERTY_KEY, new GallifreySkyProperty());
		
		RenderTypeLookup.setRenderLayer(BlockInit.TARDIS.get(), RenderType.getCutoutMipped());
		ClientRegistry.bindTileEntityRenderer(TileEntityTypeInit.TARDIS.get(), ExteriorRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.DALEK.get(), DalekRenderer::new);
		
		RenderTypeLookup.setRenderLayer(BlockInit.GALLIFREY_BUSH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GALLIFREY_SHRUB.get(), RenderType.getCutout());
	}

}
