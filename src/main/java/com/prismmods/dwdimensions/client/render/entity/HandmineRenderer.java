package com.prismmods.dwdimensions.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.client.render.model.skaromobs.HandmineLeftModel;
import com.prismmods.dwdimensions.client.render.model.skaromobs.HandmineRightModel;
import com.prismmods.dwdimensions.common.entities.HandmineEntity;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;

public class HandmineRenderer extends MobRenderer<HandmineEntity, EntityModel<HandmineEntity>>{

	public HandmineRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new HandmineRightModel<HandmineEntity>(), 0.2f);
	}
	
	@Override
	public void render(HandmineEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		
		String side = entityIn.getSide();
		if(side == "left") {
			entityModel = new HandmineLeftModel();
		} else {
			entityModel = new HandmineRightModel();
		}
		
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getEntityTexture(HandmineEntity entity) {
		ResourceLocation TEXTURE = new ResourceLocation(DWDimensions.MOD_ID, "textures/entity/handmine.png");
		return TEXTURE;
	}

}
