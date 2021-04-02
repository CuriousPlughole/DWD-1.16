package com.prismmods.dwdimensions.client.render.model.skaromobs;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.prismmods.dwdimensions.common.entities.ElectricEelEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ElectricEelModel<T extends ElectricEelEntity> extends EntityModel<ElectricEelEntity> {
	private final ModelRenderer SecondBody;
	private final ModelRenderer Tail;
	private final ModelRenderer MainBody;
	private final ModelRenderer Head;

	public ElectricEelModel() {
		textureWidth = 32;
		textureHeight = 32;

		SecondBody = new ModelRenderer(this);
		SecondBody.setRotationPoint(0.0F, 24.0F, 0.0F);
		SecondBody.setTextureOffset(11, 12).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 0.0F, 7.0F);
		SecondBody.addChild(Tail);
		Tail.setTextureOffset(0, 10).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		MainBody = new ModelRenderer(this);
		MainBody.setRotationPoint(0.0F, 24.0F, 0.0F);
		MainBody.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -8.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, -8.0F);
		MainBody.addChild(Head);
		Head.setTextureOffset(12, 0).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		SecondBody.render(matrixStack, buffer, packedLight, packedOverlay);
		MainBody.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(ElectricEelEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		this.Head.rotateAngleY = (float) Math.sin(ageInTicks);
		this.MainBody.rotateAngleY= (float) Math.sin(ageInTicks);
		this.SecondBody.rotateAngleY = (float) Math.cos(ageInTicks);
		this.Tail.rotateAngleY = (float) Math.sin(ageInTicks);
		
	}
}