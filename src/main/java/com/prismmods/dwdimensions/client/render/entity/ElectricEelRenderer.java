package com.prismmods.dwdimensions.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.client.render.model.skaromobs.ElectricEelModel;
import com.prismmods.dwdimensions.common.entities.ElectricEelEntity;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ElectricEelRenderer extends MobRenderer<ElectricEelEntity, ElectricEelModel<ElectricEelEntity>>{

	public ElectricEelRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new ElectricEelModel<ElectricEelEntity>(), 0.1f);
	}
	
	@Override
	public void render(ElectricEelEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getEntityTexture(ElectricEelEntity entity) {
		return new ResourceLocation(DWDimensions.MOD_ID, "textures/entity/eel/test.png");
	}

}
