package com.prismmods.dwdimensions.client.render.entity;

import java.awt.Color;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.client.render.model.dalek.MediumDalekModel;
import com.prismmods.dwdimensions.client.util.DalekModelGetter;
import com.prismmods.dwdimensions.common.entities.DalekEntity;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraft.util.math.vector.Vector3d;

public class DalekRenderer extends MobRenderer<DalekEntity, EntityModel<DalekEntity>> {

	public static final ResourceLocation TEXTURE_BEACON_BEAM = new ResourceLocation("textures/entity/beacon_beam.png");

	public DalekRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new MediumDalekModel(), 0.7f);
	}

	@Override
	public ResourceLocation getEntityTexture(DalekEntity entity) {
		String dalekType = entity.getDalekType();
		ResourceLocation rl = new ResourceLocation(DWDimensions.MOD_ID,
				"textures/entity/dalek/dalek_" + dalekType + ".png");
		return rl;

	}

	@Override
	public void render(DalekEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStack,
			IRenderTypeBuffer bufferIn, int combinedLightIn) {

		//ChANGE THIS TO DRAW LINES BETWEEN TWO ENTITIEs
		
		entityModel = DalekModelGetter.getModelForType(entityIn.getDalekType());
		super.render(entityIn, entityYaw, partialTicks, matrixStack, bufferIn, combinedLightIn);

		/*
		Vector3d lookingat = entityIn.getLookVec();
		//System.out.println(entityIn.targetedEntity);
		//System.out.println(lookingat);

		if(entityIn.targetedEntity == null) {
			//lookingat = new Vector3d(2,1,2);
		} else {
			lookingat = entityIn.targetedEntity.getPositionVec();
			//System.out.println(lookingat);
		}
		
		matrixStack.push();
		matrixStack.rotate(Vector3f.XP.rotation(0));
		matrixStack.scale(1.0f, 2.0f, 1.0f);
		float red = 0.5f;
		float green = 0.5f;
		float alpha = 0.5f;
		float blue = 1.0f;
		float scale = 1.0f;
		// METHOD 3
		final Vector3d[] BASE_VERTICES = {new Vector3d(0,1,0), new Vector3d(lookingat.distanceTo(lookingat), 0, lookingat.z)};
		final Vector3d APEX_VERTEX = new Vector3d(0, 0, 0);
		IVertexBuilder vertexBuilderLines = bufferIn.getBuffer(RenderType.getLines());
		Matrix4f matrixPos = matrixStack.getLast().getMatrix();
		
		for (int i = 1; i < BASE_VERTICES.length; ++i) {
		      drawLine(matrixPos, vertexBuilderLines, Color.BLUE, BASE_VERTICES[i-1], BASE_VERTICES[i]);
		    }
		    drawLine(matrixPos, vertexBuilderLines, Color.BLUE, BASE_VERTICES[BASE_VERTICES.length - 1], BASE_VERTICES[0]);

		    // draw the sides (from the corners of the base to the apex)
		    for (Vector3d baseVertex : BASE_VERTICES) {
		      drawLine(matrixPos, vertexBuilderLines, Color.BLUE, APEX_VERTEX, baseVertex);
		    }

		matrixStack.pop();
		// }*/

	}

	private static void drawLine(Matrix4f matrixPos, IVertexBuilder renderBuffer, Color color, Vector3d startVertex,
			Vector3d endVertex) {
		renderBuffer.pos(matrixPos, (float) startVertex.getX(), (float) startVertex.getY(), (float) startVertex.getZ())
				.color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()) // there is also a version
																							// for floats (0 -> 1)
				.endVertex();
		renderBuffer.pos(matrixPos, (float) endVertex.getX(), (float) endVertex.getY(), (float) endVertex.getZ())
				.color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()) // there is also a version
																							// for floats (0 -> 1)
				.endVertex();
	}

}
