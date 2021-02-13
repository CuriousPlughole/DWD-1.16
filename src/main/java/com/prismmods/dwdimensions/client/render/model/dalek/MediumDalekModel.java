package com.prismmods.dwdimensions.client.render.model.dalek;

import java.util.Random;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.prismmods.dwdimensions.common.entities.DalekEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.vector.Vector3d;

public class MediumDalekModel<T extends DalekEntity> extends EntityModel<DalekEntity> {
    private final ModelRenderer plunger;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer gun;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer head;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer EyeStalk;
    private final ModelRenderer body;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer collar;
    private final ModelRenderer collar1;
    private final ModelRenderer collar2;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer collar3;
    private final ModelRenderer collar4;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;

    public MediumDalekModel() {
        textureWidth = 200;
        textureHeight = 200;

        plunger = new ModelRenderer(this);
        plunger.setRotationPoint(-4.75F, 5.0F, -7.75F);
        plunger.setTextureOffset(151, 24).addBox(-0.5F, -0.5F, -11.5F, 1.0F, 1.0F, 12.0F, 0.0F, false);
        plunger.setTextureOffset(93, 111).addBox(-2.0F, -0.5F, -9.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        plunger.setTextureOffset(93, 111).addBox(-0.5F, -2.0F, -9.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        plunger.setTextureOffset(97, 118).addBox(-1.5F, -1.5F, -12.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        plunger.setTextureOffset(104, 9).addBox(-1.0F, -1.0F, -11.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        plunger.setTextureOffset(104, 9).addBox(-0.5F, -1.6F, -11.95F, 0.0F, 1.0F, 3.0F, 0.0F, false);
        plunger.setTextureOffset(104, 9).addBox(-0.5F, 0.6F, -11.95F, 0.0F, 1.0F, 3.0F, 0.0F, false);
        plunger.setTextureOffset(104, 9).addBox(0.5F, -1.6F, -11.95F, 0.0F, 1.0F, 3.0F, 0.0F, false);
        plunger.setTextureOffset(104, 9).addBox(0.5F, 0.6F, -11.95F, 0.0F, 1.0F, 3.0F, 0.0F, false);
        plunger.setTextureOffset(99, 120).addBox(-1.5F, -1.5F, -6.25F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        plunger.setTextureOffset(93, 111).addBox(-0.5F, 1.0F, -9.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        plunger.setTextureOffset(93, 112).addBox(1.0F, -0.5F, -9.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        plunger.setTextureOffset(132, 36).addBox(-1.0F, -1.0F, -11.25F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        plunger.setTextureOffset(132, 36).addBox(-1.5F, -1.5F, -11.75F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        plunger.setTextureOffset(159, 37).addBox(0.0F, -2.0F, -13.25F, 0.0F, 4.0F, 4.0F, 0.0F, false);
        plunger.setTextureOffset(159, 37).addBox(-0.1F, -2.0F, -13.25F, 0.0F, 4.0F, 4.0F, 0.0F, false);
        plunger.setTextureOffset(159, 37).addBox(0.1F, -2.0F, -13.25F, 0.0F, 4.0F, 4.0F, 0.0F, false);
        plunger.setTextureOffset(132, 36).addBox(-1.5F, -2.0F, -12.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        plunger.setTextureOffset(132, 36).addBox(-2.0F, -1.5F, -12.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        plunger.setTextureOffset(132, 36).addBox(-1.5F, 1.0F, -12.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        plunger.setTextureOffset(132, 36).addBox(1.0F, -1.5F, -12.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        plunger.setTextureOffset(169, 12).addBox(-1.0F, -1.0F, -11.75F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-0.5F, 2.0F, -12.2071F);
        plunger.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(17, 21).addBox(0.0F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-1.6253F, -1.65F, -12.2071F);
        plunger.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.7854F, 0.0F, -1.0472F);
        cube_r2.setTextureOffset(18, 20).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(1.65F, 1.666F, -12.2071F);
        plunger.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.7854F, 0.0F, 2.0944F);
        cube_r3.setTextureOffset(18, 20).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(1.4956F, 1.3852F, -12.3043F);
        plunger.addChild(cube_r4);
        setRotationAngle(cube_r4, 2.0944F, 0.0F, 2.0944F);
        cube_r4.setTextureOffset(169, 28).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.25F, 0.666F, -10.7071F);
        plunger.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.7854F, 0.0F, 2.0944F);
        cube_r5.setTextureOffset(169, 28).addBox(-1.0F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-2.1253F, 0.8F, -12.2071F);
        plunger.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.7854F, 0.0F, -2.0944F);
        cube_r6.setTextureOffset(18, 20).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-0.8F, -0.2F, -10.7071F);
        plunger.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.7854F, 0.0F, -2.0944F);
        cube_r7.setTextureOffset(169, 28).addBox(-1.0F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-1.3626F, 0.7022F, -13.1704F);
        plunger.addChild(cube_r8);
        setRotationAngle(cube_r8, 2.0944F, 0.0F, -2.0944F);
        cube_r8.setTextureOffset(169, 28).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(2.15F, -0.784F, -12.2071F);
        plunger.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.7854F, 0.0F, 1.0472F);
        cube_r9.setTextureOffset(18, 20).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(0.5F, -2.0F, -12.2071F);
        plunger.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.7854F, 0.0F, 0.0F);
        cube_r10.setTextureOffset(18, 20).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(0.5F, -1.8883F, -12.3043F);
        plunger.addChild(cube_r11);
        setRotationAngle(cube_r11, 2.0944F, 0.0F, 0.0F);
        cube_r11.setTextureOffset(169, 28).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(0.5F, -0.45F, -10.7071F);
        plunger.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.7854F, 0.0F, 0.0F);
        cube_r12.setTextureOffset(169, 28).addBox(-1.0F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(-0.9393F, 0.0F, -9.8536F);
        plunger.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, -0.7854F, 0.0F);
        cube_r13.setTextureOffset(108, 113).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(0.9393F, 0.0F, -2.1464F);
        plunger.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, -0.7854F, 0.0F);
        cube_r14.setTextureOffset(108, 113).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(0.0F, -0.9393F, -9.8536F);
        plunger.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.7854F, 0.0F, 0.0F);
        cube_r15.setTextureOffset(108, 113).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(0.0F, 0.9393F, -2.1464F);
        plunger.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.7854F, 0.0F, 0.0F);
        cube_r16.setTextureOffset(108, 113).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(0.0F, 0.5858F, -10.2071F);
        plunger.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.7854F, 0.0F, 0.0F);
        cube_r17.setTextureOffset(108, 113).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(0.0F, -1.2929F, -2.5F);
        plunger.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.7854F, 0.0F, 0.0F);
        cube_r18.setTextureOffset(108, 113).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(-1.1F, 0.501F, -10.45F);
        plunger.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.0F, 0.0F, 1.5708F);
        cube_r19.setTextureOffset(104, 9).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(1.1F, 0.501F, -10.45F);
        plunger.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, 0.0F, 1.5708F);
        cube_r20.setTextureOffset(104, 9).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(-1.1F, -0.499F, -10.45F);
        plunger.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.0F, 0.0F, 1.5708F);
        cube_r21.setTextureOffset(104, 9).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(1.1F, -0.499F, -10.45F);
        plunger.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.0F, 0.0F, 1.5708F);
        cube_r22.setTextureOffset(104, 9).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(0.9393F, 0.0F, -9.8536F);
        plunger.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.7854F, 0.0F);
        cube_r23.setTextureOffset(108, 113).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(-0.9393F, 0.0F, -2.1464F);
        plunger.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, 0.7854F, 0.0F);
        cube_r24.setTextureOffset(108, 113).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        gun = new ModelRenderer(this);
        gun.setRotationPoint(4.75F, 5.0F, -7.75F);
        gun.setTextureOffset(143, 49).addBox(-0.5F, -0.5F, -6.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        gun.setTextureOffset(154, 46).addBox(0.0F, -1.0F, -6.25F, 0.0F, 2.0F, 6.0F, 0.0F, false);
        gun.setTextureOffset(148, 45).addBox(-1.0F, 0.0F, -6.25F, 2.0F, 0.0F, 6.0F, 0.0F, false);
        gun.setTextureOffset(126, 170).addBox(-0.5F, -0.5F, -6.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        gun.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
        cube_r25.setTextureOffset(154, 46).addBox(0.0F, -1.0F, -6.25F, 0.0F, 2.0F, 6.0F, 0.0F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        gun.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
        cube_r26.setTextureOffset(154, 46).addBox(0.0F, -1.0F, -6.25F, 0.0F, 2.0F, 6.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -6.5F, 0.75F);
        head.setTextureOffset(110, 50).addBox(-5.0F, -3.5F, -5.0F, 10.0F, 3.0F, 10.0F, 0.0F, false);
        head.setTextureOffset(69, 68).addBox(-6.0F, -1.5F, -6.0F, 12.0F, 3.0F, 12.0F, 0.0F, false);
        head.setTextureOffset(125, 20).addBox(-0.5F, -3.4882F, -5.4847F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(0.0F, -0.8F, -4.95F);
        head.addChild(cube_r27);
        setRotationAngle(cube_r27, -0.2618F, 0.0F, 0.0F);
        cube_r27.setTextureOffset(153, 64).addBox(-1.5F, 0.375F, -0.875F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(0.0F, -1.3659F, -5.1912F);
        head.addChild(cube_r28);
        setRotationAngle(cube_r28, -0.2618F, 0.0F, 0.0F);
        cube_r28.setTextureOffset(153, 64).addBox(-1.5F, 0.375F, -0.875F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(0.0F, 0.1F, -5.45F);
        head.addChild(cube_r29);
        setRotationAngle(cube_r29, -0.2618F, 0.0F, 0.0F);
        cube_r29.setTextureOffset(153, 64).addBox(-1.5F, 0.375F, -0.875F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(0.0F, -1.5F, -5.125F);
        head.addChild(cube_r30);
        setRotationAngle(cube_r30, -0.2618F, 0.0F, 0.0F);
        cube_r30.setTextureOffset(123, 17).addBox(-0.5F, -1.8273F, -0.8621F, 1.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(0.0F, -0.4F, -5.45F);
        head.addChild(cube_r31);
        setRotationAngle(cube_r31, -0.2618F, 0.0F, 0.0F);
        cube_r31.setTextureOffset(29, 165).addBox(-1.5F, -0.625F, -0.875F, 3.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r31.setTextureOffset(157, 71).addBox(-3.5F, -0.142F, -0.7456F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r31.setTextureOffset(152, 60).addBox(0.5F, -3.625F, -0.875F, 1.0F, 3.0F, 3.0F, 0.0F, false);
        cube_r31.setTextureOffset(157, 75).addBox(1.5F, -0.142F, -0.7456F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r31.setTextureOffset(152, 60).addBox(-1.5F, -3.625F, -0.875F, 1.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(0.0F, 0.35F, -5.45F);
        head.addChild(cube_r32);
        setRotationAngle(cube_r32, -0.2618F, 0.0F, 0.0F);
        cube_r32.setTextureOffset(124, 101).addBox(-1.5F, -0.625F, -0.875F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(-9.8F, -0.25F, -0.75F);
        head.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.0F, 0.0F, -0.3927F);
        cube_r33.setTextureOffset(145, 17).addBox(4.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r33.setTextureOffset(136, 17).addBox(4.0F, -2.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(0.567F, -4.0768F, -0.75F);
        head.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.0F, 0.0F, 0.3927F);
        cube_r34.setTextureOffset(145, 17).addBox(4.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r34.setTextureOffset(136, 17).addBox(4.0F, -2.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        EyeStalk = new ModelRenderer(this);
        EyeStalk.setRotationPoint(0.0F, -2.0F, -4.4167F);
        head.addChild(EyeStalk);
        EyeStalk.setTextureOffset(139, 26).addBox(-1.0F, -1.0F, -3.4833F, 2.0F, 2.0F, 0.0F, 0.0F, false);
        EyeStalk.setTextureOffset(139, 26).addBox(-1.0F, -1.0F, -3.8833F, 2.0F, 2.0F, 0.0F, 0.0F, false);
        EyeStalk.setTextureOffset(139, 26).addBox(-1.0F, -1.0F, -4.2833F, 2.0F, 2.0F, 0.0F, 0.0F, false);
        EyeStalk.setTextureOffset(118, 37).addBox(-0.5F, -0.5F, -7.3333F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        EyeStalk.setTextureOffset(139, 26).addBox(-1.0F, -1.0F, -4.6833F, 2.0F, 2.0F, 0.0F, 0.0F, false);
        EyeStalk.setTextureOffset(139, 26).addBox(-1.0F, -1.0F, -5.0833F, 2.0F, 2.0F, 0.0F, 0.0F, false);
        EyeStalk.setTextureOffset(141, 41).addBox(-1.0F, -1.0F, -7.3333F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        EyeStalk.setTextureOffset(141, 42).addBox(-1.0F, -1.5F, -8.3333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        EyeStalk.setTextureOffset(143, 41).addBox(0.5F, -1.0F, -8.3333F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        EyeStalk.setTextureOffset(136, 29).addBox(-0.25F, -0.75F, -8.3833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        EyeStalk.setTextureOffset(136, 29).addBox(-0.25F, -0.25F, -8.3833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        EyeStalk.setTextureOffset(136, 29).addBox(-0.75F, -0.75F, -8.3833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        EyeStalk.setTextureOffset(141, 29).addBox(-0.5F, -0.5F, -8.4833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        EyeStalk.setTextureOffset(136, 29).addBox(-0.75F, -0.25F, -8.3833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        EyeStalk.setTextureOffset(136, 28).addBox(-0.5F, -0.5F, -8.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        EyeStalk.setTextureOffset(143, 41).addBox(-1.5F, -1.0F, -8.3333F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        EyeStalk.setTextureOffset(141, 42).addBox(-1.0F, 0.5F, -8.3333F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(9.0F, 6.5F, 0.0F);
        body.setTextureOffset(100, 69).addBox(-17.0F, 14.5F, -10.0F, 16.0F, 3.0F, 19.0F, 0.0F, false);
        body.setTextureOffset(26, 42).addBox(-15.5F, 2.5F, -7.0F, 13.0F, 6.0F, 15.0F, 0.0F, false);
        body.setTextureOffset(30, 17).addBox(-16.0F, 0.5F, -7.5F, 14.0F, 2.0F, 16.0F, 0.0F, false);
        body.setTextureOffset(46, 7).addBox(-6.25F, -3.5F, -7.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(59, 44).addBox(-5.25F, -2.5F, -7.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(81, 94).addBox(-15.5F, -1.5F, -5.75F, 13.0F, 2.0F, 13.0F, 0.0F, false);
        body.setTextureOffset(81, 17).addBox(-15.5F, -4.5F, -5.75F, 13.0F, 2.0F, 13.0F, 0.0F, false);
        body.setTextureOffset(80, 34).addBox(-15.0F, -3.5F, -5.25F, 12.0F, 2.0F, 12.0F, 0.0F, false);
        body.setTextureOffset(124, 116).addBox(-15.0F, -6.5F, -5.25F, 12.0F, 2.0F, 12.0F, 0.0F, false);
        body.setTextureOffset(85, 59).addBox(-14.5F, -11.5F, -2.25F, 11.0F, 5.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(124, 100).addBox(-15.0F, -8.45F, -5.25F, 12.0F, 1.0F, 12.0F, 0.0F, false);
        body.setTextureOffset(124, 100).addBox(-15.0F, -10.5F, -5.25F, 12.0F, 1.0F, 12.0F, 0.0F, false);
        body.setTextureOffset(45, 39).addBox(-14.0F, -11.5F, -4.25F, 10.0F, 5.0F, 10.0F, 0.0F, false);
        body.setTextureOffset(85, 59).addBox(-14.5F, -11.5F, 2.75F, 11.0F, 5.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(85, 49).addBox(-7.0F, -11.5F, -4.75F, 1.0F, 5.0F, 11.0F, 0.0F, false);
        body.setTextureOffset(85, 49).addBox(-12.0F, -11.5F, -4.75F, 1.0F, 5.0F, 11.0F, 0.0F, false);
        body.setTextureOffset(46, 7).addBox(-15.75F, -3.5F, -7.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(59, 44).addBox(-14.75F, -2.5F, -7.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-15.0F, 3.25F, -7.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-11.65F, 3.25F, -7.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-8.35F, 3.25F, -7.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-5.0F, 3.25F, -7.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-8.35F, 6.0F, -7.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-11.65F, 6.0F, -7.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-15.0F, 6.0F, -7.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-15.0F, 9.0F, -8.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-11.65F, 9.0F, -8.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-8.35F, 9.0F, -8.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-5.0F, 9.0F, -8.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-8.35F, 11.75F, -8.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-5.0F, 11.75F, -8.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-11.65F, 11.75F, -8.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-15.0F, 11.75F, -8.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(22, 81).addBox(-16.0F, 8.5F, -8.0F, 14.0F, 6.0F, 16.0F, 0.0F, false);
        body.setTextureOffset(75, 23).addBox(-5.0F, 6.0F, -7.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(-16.25F, 8.5F, 0.25F);
        body.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, 1.5708F, 0.0F);
        cube_r35.setTextureOffset(75, 23).addBox(4.0F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(-1.75F, 8.5F, 0.25F);
        body.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.0F, -1.5708F, 0.0F);
        cube_r36.setTextureOffset(75, 23).addBox(4.0F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r36.setTextureOffset(75, 23).addBox(4.0F, -5.25F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r36.setTextureOffset(75, 23).addBox(-2.65F, -5.25F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(-9.0F, 8.5F, 8.75F);
        body.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.0F, 3.1416F, 0.0F);
        cube_r37.setTextureOffset(75, 23).addBox(4.0F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(-15.75F, 8.5F, -2.85F);
        body.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0F, 1.5708F, 0.0F);
        cube_r38.setTextureOffset(75, 23).addBox(-6.0F, 3.25F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(-15.75F, 8.5F, 1.25F);
        body.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, 1.5708F, 0.0F);
        cube_r39.setTextureOffset(75, 23).addBox(-6.0F, 3.25F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r39.setTextureOffset(75, 23).addBox(-6.0F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(-2.25F, 8.5F, -1.0F);
        body.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.0F, -1.5708F, 0.0F);
        cube_r40.setTextureOffset(75, 23).addBox(-6.0F, 3.25F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r40.setTextureOffset(75, 23).addBox(-6.0F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(-9.0F, 8.5F, 7.75F);
        body.addChild(cube_r41);
        setRotationAngle(cube_r41, 0.0F, 3.1416F, 0.0F);
        cube_r41.setTextureOffset(75, 23).addBox(-6.0F, 3.25F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r41.setTextureOffset(75, 23).addBox(0.65F, 3.25F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r41.setTextureOffset(75, 23).addBox(0.65F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(-2.25F, 8.5F, -0.25F);
        body.addChild(cube_r42);
        setRotationAngle(cube_r42, 0.0F, -1.5708F, 0.0F);
        cube_r42.setTextureOffset(75, 23).addBox(-2.65F, 3.25F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r42.setTextureOffset(75, 23).addBox(-2.65F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setRotationPoint(-9.0F, 8.5F, 7.751F);
        body.addChild(cube_r43);
        setRotationAngle(cube_r43, 0.0F, 3.1416F, 0.0F);
        cube_r43.setTextureOffset(75, 23).addBox(-2.65F, 3.25F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r43.setTextureOffset(75, 23).addBox(4.0F, 3.25F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r43.setTextureOffset(75, 23).addBox(4.0F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r43.setTextureOffset(75, 23).addBox(-2.65F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r43.setTextureOffset(75, 23).addBox(-6.0F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setRotationPoint(-15.751F, 8.5F, -0.25F);
        body.addChild(cube_r44);
        setRotationAngle(cube_r44, 0.0F, 1.5708F, 0.0F);
        cube_r44.setTextureOffset(75, 23).addBox(0.65F, 3.25F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setRotationPoint(-2.25F, 8.5F, 0.5F);
        body.addChild(cube_r45);
        setRotationAngle(cube_r45, 0.0F, -1.5708F, 0.0F);
        cube_r45.setTextureOffset(75, 23).addBox(0.65F, 3.25F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r45.setTextureOffset(75, 23).addBox(0.65F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setRotationPoint(-15.751F, 8.5F, -1.0F);
        body.addChild(cube_r46);
        setRotationAngle(cube_r46, 0.0F, 1.5708F, 0.0F);
        cube_r46.setTextureOffset(75, 23).addBox(4.0F, 3.25F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setRotationPoint(-2.25F, 8.5F, 1.25F);
        body.addChild(cube_r47);
        setRotationAngle(cube_r47, 0.0F, -1.5708F, 0.0F);
        cube_r47.setTextureOffset(75, 23).addBox(4.0F, 3.25F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r47.setTextureOffset(75, 23).addBox(4.0F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setRotationPoint(-15.75F, 8.5F, -1.0F);
        body.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.0F, 1.5708F, 0.0F);
        cube_r48.setTextureOffset(75, 23).addBox(4.0F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setRotationPoint(-15.75F, 8.5F, -0.25F);
        body.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.0F, 1.5708F, 0.0F);
        cube_r49.setTextureOffset(75, 23).addBox(0.65F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setRotationPoint(-15.75F, 8.5F, 0.5F);
        body.addChild(cube_r50);
        setRotationAngle(cube_r50, 0.0F, 1.5708F, 0.0F);
        cube_r50.setTextureOffset(75, 23).addBox(-2.65F, 0.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setRotationPoint(-16.25F, 8.5F, 0.25F);
        body.addChild(cube_r51);
        setRotationAngle(cube_r51, 0.0F, 1.5708F, 0.0F);
        cube_r51.setTextureOffset(75, 23).addBox(-6.0F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(-1.75F, 8.5F, 0.25F);
        body.addChild(cube_r52);
        setRotationAngle(cube_r52, 0.0F, -1.5708F, 0.0F);
        cube_r52.setTextureOffset(75, 23).addBox(-6.0F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r52.setTextureOffset(75, 23).addBox(-6.0F, -5.25F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(-9.0F, 8.5F, 8.751F);
        body.addChild(cube_r53);
        setRotationAngle(cube_r53, 0.0F, 3.1416F, 0.0F);
        cube_r53.setTextureOffset(75, 23).addBox(-6.0F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r53.setTextureOffset(75, 23).addBox(0.65F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(-16.251F, 8.5F, 0.25F);
        body.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.0F, 1.5708F, 0.0F);
        cube_r54.setTextureOffset(75, 23).addBox(-2.65F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r54.setTextureOffset(75, 23).addBox(-2.65F, -5.25F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(-1.75F, 8.5F, 0.25F);
        body.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.0F, -1.5708F, 0.0F);
        cube_r55.setTextureOffset(75, 23).addBox(-2.65F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setRotationPoint(-9.0F, 8.5F, 8.751F);
        body.addChild(cube_r56);
        setRotationAngle(cube_r56, 0.0F, 3.1416F, 0.0F);
        cube_r56.setTextureOffset(75, 23).addBox(-2.65F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r57 = new ModelRenderer(this);
        cube_r57.setRotationPoint(-16.25F, 8.5F, 0.25F);
        body.addChild(cube_r57);
        setRotationAngle(cube_r57, 0.0F, 1.5708F, 0.0F);
        cube_r57.setTextureOffset(75, 23).addBox(0.65F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r58 = new ModelRenderer(this);
        cube_r58.setRotationPoint(-1.75F, 8.5F, 0.25F);
        body.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.0F, -1.5708F, 0.0F);
        cube_r58.setTextureOffset(75, 23).addBox(0.65F, -2.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r58.setTextureOffset(75, 23).addBox(0.65F, -5.25F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(-16.251F, 8.5F, 0.25F);
        body.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.0F, 1.5708F, 0.0F);
        cube_r59.setTextureOffset(75, 23).addBox(4.0F, -5.25F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r59.setTextureOffset(75, 23).addBox(0.65F, -5.25F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r60 = new ModelRenderer(this);
        cube_r60.setRotationPoint(-9.0F, 8.5F, 8.751F);
        body.addChild(cube_r60);
        setRotationAngle(cube_r60, 0.0F, 3.1416F, 0.0F);
        cube_r60.setTextureOffset(75, 23).addBox(4.0F, -5.25F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r60.setTextureOffset(75, 23).addBox(-6.0F, -5.25F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r61 = new ModelRenderer(this);
        cube_r61.setRotationPoint(-9.0F, 8.5F, 8.751F);
        body.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0F, 3.1416F, 0.0F);
        cube_r61.setTextureOffset(75, 23).addBox(0.65F, -5.25F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r62 = new ModelRenderer(this);
        cube_r62.setRotationPoint(-9.0F, 8.5F, 8.751F);
        body.addChild(cube_r62);
        setRotationAngle(cube_r62, 0.0F, 3.1416F, 0.0F);
        cube_r62.setTextureOffset(75, 23).addBox(-2.65F, -5.25F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r63 = new ModelRenderer(this);
        cube_r63.setRotationPoint(-16.251F, 8.5F, 0.25F);
        body.addChild(cube_r63);
        setRotationAngle(cube_r63, 0.0F, 1.5708F, 0.0F);
        cube_r63.setTextureOffset(75, 23).addBox(-6.0F, -5.25F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        collar = new ModelRenderer(this);
        collar.setRotationPoint(0.0F, 24.0F, 0.0F);


        collar1 = new ModelRenderer(this);
        collar1.setRotationPoint(0.0F, -20.2F, 1.75F);
        collar.addChild(collar1);
        setRotationAngle(collar1, 0.0F, 0.0F, -0.1309F);
        collar1.setTextureOffset(89, 17).addBox(6.0F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        collar1.setTextureOffset(27, 71).addBox(6.0F, -1.5F, -1.25F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        collar1.setTextureOffset(27, 71).addBox(6.0653F, -1.9957F, 2.75F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        collar1.setTextureOffset(27, 71).addBox(6.0326F, -1.7479F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        collar1.setTextureOffset(89, 17).addBox(6.0F, -2.5F, 1.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        collar1.setTextureOffset(89, 17).addBox(6.0F, -2.5F, -2.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        collar1.setTextureOffset(89, 17).addBox(6.0F, -2.5F, -4.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        collar1.setTextureOffset(89, 17).addBox(6.0F, -2.5F, -6.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        collar1.setTextureOffset(89, 17).addBox(6.0F, -2.5F, 3.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        collar2 = new ModelRenderer(this);
        collar2.setRotationPoint(1.25F, -20.95F, 4.0F);
        collar.addChild(collar2);
        setRotationAngle(collar2, 0.1309F, 0.0F, 0.0F);


        cube_r64 = new ModelRenderer(this);
        cube_r64.setRotationPoint(-4.5F, -2.5F, -1.75F);
        collar2.addChild(cube_r64);
        setRotationAngle(cube_r64, 0.0F, -1.5708F, 0.0F);
        cube_r64.setTextureOffset(89, 17).addBox(4.4543F, 0.347F, 1.25F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        cube_r65 = new ModelRenderer(this);
        cube_r65.setRotationPoint(-2.5F, -2.5F, -1.75F);
        collar2.addChild(cube_r65);
        setRotationAngle(cube_r65, 0.0F, -1.5708F, 0.0F);
        cube_r65.setTextureOffset(89, 17).addBox(4.4543F, 0.347F, 1.25F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        cube_r66 = new ModelRenderer(this);
        cube_r66.setRotationPoint(-0.5F, -2.5F, -1.75F);
        collar2.addChild(cube_r66);
        setRotationAngle(cube_r66, 0.0F, -1.5708F, 0.0F);
        cube_r66.setTextureOffset(27, 71).addBox(4.4458F, 1.4775F, -4.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        cube_r66.setTextureOffset(27, 71).addBox(4.511F, 0.9818F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        cube_r66.setTextureOffset(27, 71).addBox(4.3479F, 2.2211F, 3.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        cube_r66.setTextureOffset(89, 17).addBox(4.4543F, 0.347F, 1.25F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        cube_r67 = new ModelRenderer(this);
        cube_r67.setRotationPoint(1.5F, -2.5F, -1.75F);
        collar2.addChild(cube_r67);
        setRotationAngle(cube_r67, 0.0F, -1.5708F, 0.0F);
        cube_r67.setTextureOffset(89, 17).addBox(4.4543F, 0.347F, 1.25F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        cube_r68 = new ModelRenderer(this);
        cube_r68.setRotationPoint(3.5F, -2.5F, -1.75F);
        collar2.addChild(cube_r68);
        setRotationAngle(cube_r68, 0.0F, -1.5708F, 0.0F);
        cube_r68.setTextureOffset(89, 17).addBox(4.4543F, 0.347F, 1.25F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        cube_r69 = new ModelRenderer(this);
        cube_r69.setRotationPoint(5.5F, -2.5F, -1.75F);
        collar2.addChild(cube_r69);
        setRotationAngle(cube_r69, 0.0F, -1.5708F, 0.0F);
        cube_r69.setTextureOffset(89, 17).addBox(4.4543F, 0.347F, 1.25F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        collar3 = new ModelRenderer(this);
        collar3.setRotationPoint(-1.5F, -20.5167F, 0.75F);
        collar.addChild(collar3);
        setRotationAngle(collar3, 0.0F, 0.0F, 0.1309F);
        collar3.setTextureOffset(89, 17).addBox(-5.5F, -2.3333F, 4.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        collar3.setTextureOffset(89, 17).addBox(-5.5F, -2.3333F, 2.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        collar3.setTextureOffset(89, 17).addBox(-5.5F, -2.3333F, 0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        collar3.setTextureOffset(27, 71).addBox(-6.5F, -1.3333F, 2.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        collar3.setTextureOffset(27, 71).addBox(-6.5979F, -2.0769F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        collar3.setTextureOffset(27, 71).addBox(-6.4674F, -1.0855F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        collar3.setTextureOffset(89, 17).addBox(-5.5F, -2.3333F, -1.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        collar3.setTextureOffset(89, 17).addBox(-5.5F, -2.3333F, -3.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        collar3.setTextureOffset(89, 17).addBox(-5.5F, -2.3333F, -5.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        collar4 = new ModelRenderer(this);
        collar4.setRotationPoint(-0.55F, -21.0F, 2.9F);
        collar.addChild(collar4);
        setRotationAngle(collar4, -0.1309F, 0.0F, 0.0F);


        cube_r70 = new ModelRenderer(this);
        cube_r70.setRotationPoint(-2.65F, -1.5F, -0.9F);
        collar4.addChild(cube_r70);
        setRotationAngle(cube_r70, 0.0F, -1.5708F, 0.0F);
        cube_r70.setTextureOffset(84, 17).addBox(-8.2456F, 0.0169F, 1.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r71 = new ModelRenderer(this);
        cube_r71.setRotationPoint(-0.65F, -1.5F, -0.9F);
        collar4.addChild(cube_r71);
        setRotationAngle(cube_r71, 0.0F, -1.5708F, 0.0F);
        cube_r71.setTextureOffset(84, 17).addBox(-8.1465F, 0.0039F, -0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r71.setTextureOffset(27, 71).addBox(-9.213F, 0.2648F, -6.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        cube_r71.setTextureOffset(27, 71).addBox(-9.213F, 0.2648F, 2.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        cube_r71.setTextureOffset(27, 71).addBox(-9.1151F, 1.0084F, -2.25F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        cube_r71.setTextureOffset(84, 17).addBox(-8.2456F, 0.0169F, 1.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r72 = new ModelRenderer(this);
        cube_r72.setRotationPoint(0.6F, 0.0F, -3.4F);
        collar4.addChild(cube_r72);
        setRotationAngle(cube_r72, 0.0F, -1.5708F, 0.0F);
        cube_r72.setTextureOffset(75, 6).addBox(-5.2431F, 2.334F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
        cube_r72.setTextureOffset(75, 15).addBox(-5.7456F, -1.4831F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r73 = new ModelRenderer(this);
        cube_r73.setRotationPoint(5.35F, -1.5F, -0.9F);
        collar4.addChild(cube_r73);
        setRotationAngle(cube_r73, 0.0F, -1.5708F, 0.0F);
        cube_r73.setTextureOffset(84, 17).addBox(-8.1465F, 0.0039F, 3.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r73.setTextureOffset(84, 17).addBox(-8.2456F, 0.0169F, 1.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r74 = new ModelRenderer(this);
        cube_r74.setRotationPoint(7.35F, -1.5F, -0.9F);
        collar4.addChild(cube_r74);
        setRotationAngle(cube_r74, 0.0F, -1.5708F, 0.0F);
        cube_r74.setTextureOffset(84, 17).addBox(-8.2456F, 0.0169F, 1.25F, 1.0F, 3.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(DalekEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //EYESTALK ROTATIONS
        Vector3d lookingAt = entity.getLookVec();
        this.EyeStalk.rotateAngleX = -(float) lookingAt.y;

        //HEAD ROTATIONS
        this.head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);

        Random rand = entity.world.rand;
        //GUN ROTATIONS
        if (entity.isAggressive()) {
            this.gun.rotateAngleX = -(float) lookingAt.y / 3;
        } else {
            this.gun.rotateAngleX = 0.0f;
            this.plunger.rotateAngleX = 0.0f;

            if (rand.nextInt(500) == 1) {
                this.gun.rotateAngleZ = rand.nextFloat() * 4;
               // entity.getEntityWorld().playSound(entity.getPosX(), entity.getPosY(), entity.getPosZ(), SoundInit.DALEK_ARM_ROTATE.get(), SoundCategory.HOSTILE, 0.3f, (float) (1.0 + rand.nextFloat() * (1.2 - 0.8)), true);
            }
            if (rand.nextInt(750) == 3) {
                this.plunger.rotateAngleZ = rand.nextFloat() * 4;
               // entity.getEntityWorld().playSound(entity.getPosX(), entity.getPosY(), entity.getPosZ(), SoundInit.DALEK_ARM_ROTATE.get(), SoundCategory.HOSTILE, 0.3f, (float) (1.0 + rand.nextFloat() * (1.2 - 0.8)), true);
            }
            switch (rand.nextInt(250)) {
                case (2):
                    this.gun.rotateAngleZ = 0.0f;
                case (1):
                    this.plunger.rotateAngleZ = 0.0f;
            }
        }
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        matrixStack.push();
        matrixStack.scale(0.82f, 0.82f, 0.82f);
        matrixStack.translate(0, 0.32, 0);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        gun.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        plunger.render(matrixStack, buffer, packedLight, packedOverlay);
        collar.render(matrixStack, buffer, packedLight, packedOverlay);
        matrixStack.pop();
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

