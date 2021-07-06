package com.prismmods.dwdimensions.world.gallifrey.render;

import net.minecraft.client.world.DimensionRenderInfo;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ICloudRenderHandler;
import net.minecraftforge.client.ISkyRenderHandler;
import net.minecraftforge.client.IWeatherRenderHandler;

@OnlyIn(Dist.CLIENT)
public class GallifreySkyProperty extends DimensionRenderInfo {

	public GallifreySkyProperty() {
		super(Float.NaN, true, FogType.NORMAL, true, false);
	}
	
	public GallifreySkyProperty(float cloudHeight, boolean hasTerrain, FogType fogType, boolean useAlternateSkyColour,
			boolean useDiffuseLighting) {
		super(cloudHeight, hasTerrain, fogType, useAlternateSkyColour, useDiffuseLighting);
	}

	//adjust sky colour
	@Override
	public Vector3d func_230494_a_(Vector3d color, float sunHeight) {
		return new Vector3d(1, 1, 1);
	}
	
	//usethickfog
	@Override
	public boolean func_230493_a_(int camX, int camY) {
		return false;
	}
	
	@Override
	public ICloudRenderHandler getCloudRenderHandler() {
		return super.getCloudRenderHandler();
	}
	
	@Override
	public IWeatherRenderHandler getWeatherRenderHandler() {
		return super.getWeatherRenderHandler();
	}
	
	@Override
	public ISkyRenderHandler getSkyRenderHandler() {
		return GallifreySkyRenderer.INSTANCE;
	}
	
	@Override
	public float[] func_230492_a_(float dayTime, float partialTicks) {
		float colours[] = {2.5f, 1.5f, 1.5f, 0.6f};
		return colours;
	}
	
	
	
}
