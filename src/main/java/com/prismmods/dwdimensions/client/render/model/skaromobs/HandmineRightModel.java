package com.prismmods.dwdimensions.client.render.model.skaromobs;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.prismmods.dwdimensions.common.entities.HandmineEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class HandmineRightModel<T extends HandmineEntity> extends EntityModel<T> {

    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;

    public HandmineRightModel() {
        textureWidth = 200;
        textureHeight = 200;

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 24.0F, -1.0F);


        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.2167F, -4.6667F, 3.0F);
        bone2.addChild(bone);
        setRotationAngle(bone, -0.6981F, 0.0F, 0.0F);
        bone.setTextureOffset(12, 17).addBox(-2.2167F, 0.1667F, -1.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
        bone.setTextureOffset(24, 13).addBox(-0.3167F, 1.8716F, -1.3012F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        bone.setTextureOffset(23, 13).addBox(-1.1167F, 1.8716F, -1.3012F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        bone.setTextureOffset(31, 13).addBox(-0.7167F, 1.9003F, -1.3422F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.2833F, 4.7824F, 0.5337F);
        bone.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(13, 20).addBox(-2.0F, -0.501F, -1.4564F, 3.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-0.2167F, 2.4413F, -0.2422F);
        bone.addChild(cube_r2);
        setRotationAngle(cube_r2, -1.0036F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(15, 14).addBox(-1.0F, 0.2159F, -0.2244F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-0.2167F, 2.4413F, -0.2422F);
        bone.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(14, 13).addBox(-1.0F, -0.5742F, -1.1808F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(1.2996F, 3.8377F, 0.0F);
        bone.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, 0.4363F);
        cube_r4.setTextureOffset(14, 17).addBox(-0.9654F, -0.9258F, -0.9426F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-1.9167F, 0.4167F, 0.0F);
        bone.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.5236F, -0.0665F, -0.1615F);
        cube_r5.setTextureOffset(25, 18).addBox(-0.314F, -3.7248F, -0.5751F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(2.7833F, 4.6667F, -1.5F);
        bone.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.2618F, 0.0F, 0.4363F);
        cube_r6.setTextureOffset(30, 18).addBox(-2.0F, -4.0F, 1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(1.3833F, 0.4167F, 0.0F);
        bone.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.6109F, 0.0F, 0.1309F);
        cube_r7.setTextureOffset(40, 18).addBox(-0.6444F, -3.7869F, -0.4893F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(0.2833F, 0.4167F, 0.0F);
        bone.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.6981F, 0.0113F, 0.0421F);
        cube_r8.setTextureOffset(35, 18).addBox(-0.5161F, -4.7996F, -0.5001F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-0.8167F, 0.4167F, 0.0F);
        bone.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.6109F, -0.0113F, -0.0421F);
        cube_r9.setTextureOffset(30, 18).addBox(-0.4212F, -4.4976F, -0.5031F, 1.0F, 5.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bone2.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

