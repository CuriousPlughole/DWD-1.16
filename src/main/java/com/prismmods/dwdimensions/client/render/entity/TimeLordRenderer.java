package com.prismmods.dwdimensions.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.client.render.model.timelord.MaleTimelordModel;
import com.prismmods.dwdimensions.common.entities.TimeLordEntity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.HandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;

public class TimeLordRenderer extends MobRenderer<TimeLordEntity, MaleTimelordModel<TimeLordEntity>> {

	public TimeLordRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new MaleTimelordModel<TimeLordEntity>(), 0.7f);
	}

	@Override
	public void render(TimeLordEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);


		 if(entityIn.getRegenerating()) {
			 matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));
			 for (HandSide handSide : HandSide.values()) {
	                matrixStackIn.push();
	                matrixStackIn.rotate(Vector3f.YP.rotation(entityYaw));
	                matrixStackIn.translate(0,-1.6,0);
	                entityModel.translateHand(handSide, matrixStackIn);
	                //matrixStackIn.translate(0,-1,0);
	                renderColorCone(matrixStackIn, bufferIn.getBuffer(RenderType.getLightning()), packedLightIn, entityIn, 1, 1.5F, new Vector3d(1, 0.5, 0.7));
	                matrixStackIn.pop();
	            }
	        }
		
	}

	public static void renderColorCone(MatrixStack matrixStack, IVertexBuilder vertexBuilder, int combinedLightIn,
			LivingEntity entityPlayer, float scale, float scale2, Vector3d color) {
		matrixStack.push();
		for (int i = 0; i < 10; i++) {
			matrixStack.rotate(Vector3f.YP.rotation(entityPlayer.ticksExisted * 4 + i * 45));
			matrixStack.scale(1.0f, 1.0f, 0.65f);
			
			float alpha = 0.2f + MathHelper.clamp(
					MathHelper.sin((entityPlayer.ticksExisted + Minecraft.getInstance().getRenderPartialTicks()) / 5)
							* 0.1F + 0.1F,
					0.11F, 1F);
			float red = (float) color.x, green = (float) color.y, blue = (float) color.z;
			vertexBuilder.pos(matrixStack.getLast().getMatrix(), 0.0F, 0.0F, 0.0F).color(red, green, blue, alpha)
					.lightmap(combinedLightIn).endVertex();
			vertexBuilder.pos(matrixStack.getLast().getMatrix(), -0.266F * scale, scale, -0.5F * scale)
					.color(red, green, blue, alpha).lightmap(combinedLightIn).endVertex();
			vertexBuilder.pos(matrixStack.getLast().getMatrix(), 0.266F * scale, scale, -0.5F * scale)
					.color(red, green, blue, alpha).lightmap(combinedLightIn).endVertex();
			vertexBuilder.pos(matrixStack.getLast().getMatrix(), 0.0F, scale2, 1.0F * scale)
					.color(red, green, blue, alpha).lightmap(combinedLightIn).endVertex();
			vertexBuilder.pos(matrixStack.getLast().getMatrix(), (float) (-0.266D * scale), scale, -0.5F * scale)
					.color(red, green, blue, alpha).lightmap(combinedLightIn).endVertex();
		}
		matrixStack.pop();
	}

	@Override
	public ResourceLocation getEntityTexture(TimeLordEntity entity) {
		return new ResourceLocation(DWDimensions.MOD_ID, "textures/entity/timelord/male/" + entity.getSkin() + ".png");
	}

}
