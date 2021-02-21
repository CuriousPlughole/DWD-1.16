package com.prismmods.dwdimensions.client.render.tileentity.tardis;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;

public class TardisTennantModel extends Model {

    private final ModelRenderer rightdoorsnow;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer rightdoorsnow2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer bodysnow;
    private final ModelRenderer cube1_r1;
    private final ModelRenderer leftdoorsnow;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer right_door;
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
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer phonedoor;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer left_door;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
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
    private final ModelRenderer body;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer bone6;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer bone7;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer bone8;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;

    public TardisTennantModel() {
        super(RenderType::getEntitySolid);
    	//super(RenderType::getEntityTranslucent);
    	
        textureWidth = 200;
        textureHeight = 200;

        rightdoorsnow = new ModelRenderer(this);
        rightdoorsnow.setRotationPoint(-9.0F, 3.25F, -10.6F);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(5.5F, -0.5F, 0.65F);
        rightdoorsnow.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
        cube_r1.setTextureOffset(106, 178).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.5F, 0.65F);
        rightdoorsnow.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
        cube_r2.setTextureOffset(106, 178).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 6.0F, 0.0F, true);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-0.5F, 0.5F, 0.65F);
        rightdoorsnow.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
        cube_r3.setTextureOffset(106, 178).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 6.0F, 0.0F, true);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-1.0F, -0.5F, 0.65F);
        rightdoorsnow.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 1.5708F, 0.0F);
        cube_r4.setTextureOffset(106, 178).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        rightdoorsnow2 = new ModelRenderer(this);
        rightdoorsnow2.setRotationPoint(-9.0F, -6.5F, -10.6F);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-0.5F, 2.0F, 0.65F);
        rightdoorsnow2.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
        cube_r5.setTextureOffset(106, 178).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 6.0F, 0.0F, true);
        cube_r5.setTextureOffset(106, 178).addBox(-0.5F, 16.25F, 1.5F, 1.0F, 1.0F, 6.0F, 0.0F, true);
        cube_r5.setTextureOffset(106, 178).addBox(-0.5F, 24.75F, 1.5F, 1.0F, 1.0F, 6.0F, 0.0F, true);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(5.5F, 1.0F, 0.65F);
        rightdoorsnow2.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 1.5708F, 0.0F);
        cube_r6.setTextureOffset(106, 178).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r6.setTextureOffset(106, 178).addBox(-0.5F, 16.25F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r6.setTextureOffset(106, 178).addBox(-0.5F, 24.75F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(0.0F, 2.0F, 0.65F);
        rightdoorsnow2.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 1.5708F, 0.0F);
        cube_r7.setTextureOffset(106, 178).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 6.0F, 0.0F, true);
        cube_r7.setTextureOffset(106, 178).addBox(-0.5F, 16.25F, 1.5F, 1.0F, 1.0F, 6.0F, 0.0F, true);
        cube_r7.setTextureOffset(106, 178).addBox(-0.5F, 24.75F, 1.5F, 1.0F, 1.0F, 6.0F, 0.0F, true);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-1.0F, 1.0F, 0.65F);
        rightdoorsnow2.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 1.5708F, 0.0F);
        cube_r8.setTextureOffset(106, 178).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r8.setTextureOffset(106, 178).addBox(-0.5F, 16.25F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r8.setTextureOffset(106, 178).addBox(-0.5F, 24.75F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        bodysnow = new ModelRenderer(this);
        bodysnow.setRotationPoint(0.5F, 13.75F, -0.5F);
        bodysnow.setTextureOffset(96, 175).addBox(-13.0F, 8.25F, -12.0F, 25.0F, 1.0F, 2.0F, 0.0F, false);
        bodysnow.setTextureOffset(96, 175).addBox(-12.5F, 9.25F, -12.5F, 24.0F, 1.0F, 2.0F, 0.0F, false);
        bodysnow.setTextureOffset(96, 175).addBox(-13.0F, 7.25F, -12.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        bodysnow.setTextureOffset(94, 160).addBox(-13.5F, 9.25F, -12.5F, 1.0F, 1.0F, 26.0F, 0.0F, false);
        bodysnow.setTextureOffset(94, 160).addBox(11.5F, 9.25F, -12.5F, 1.0F, 1.0F, 26.0F, 0.0F, false);
        bodysnow.setTextureOffset(96, 175).addBox(10.0F, 8.25F, -10.0F, 2.0F, 1.0F, 21.0F, 0.0F, false);
        bodysnow.setTextureOffset(96, 175).addBox(8.0F, 7.25F, -12.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        bodysnow.setTextureOffset(96, 175).addBox(-13.0F, 8.25F, 11.0F, 25.0F, 1.0F, 2.0F, 0.0F, false);
        bodysnow.setTextureOffset(96, 175).addBox(8.0F, 7.25F, 9.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        bodysnow.setTextureOffset(96, 175).addBox(-12.5F, 9.25F, 11.5F, 24.0F, 1.0F, 2.0F, 0.0F, false);
        bodysnow.setTextureOffset(96, 175).addBox(-13.0F, 7.25F, 9.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        bodysnow.setTextureOffset(96, 175).addBox(-13.0F, 8.25F, -10.0F, 2.0F, 1.0F, 21.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, 6.5F, -7.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, 5.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, 5.5F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, 6.5F, 1.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, 5.5F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, 5.5F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -2.0F, 1.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -3.0F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -3.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -2.0F, -7.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -3.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -10.0F, -7.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -11.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -11.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -10.0F, 1.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -11.0F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -18.25F, -7.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -19.25F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -19.25F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -19.25F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -18.25F, 1.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(-10.95F, -19.25F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -18.25F, 2.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -19.25F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -19.25F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -18.25F, -7.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -19.25F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -19.25F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -10.0F, -7.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -11.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -11.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -10.0F, 2.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -11.0F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -2.0F, 2.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -3.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -3.0F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -2.0F, -7.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, -3.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, 5.5F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, 6.5F, -7.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, 5.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, 5.5F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, 6.5F, 2.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(130, 168).addBox(8.95F, 5.5F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -10.0F, -7.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -11.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -11.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -10.0F, 1.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -11.0F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -2.0F, 1.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -3.0F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -3.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -2.0F, -7.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -3.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, 5.5F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, 6.5F, -7.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, 5.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, 5.5F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, 6.5F, 1.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, 5.5F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -19.25F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -18.25F, -7.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -19.25F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -19.25F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -18.25F, 1.75F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bodysnow.setTextureOffset(116, 163).addBox(8.95F, -19.25F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(100, 155).addBox(9.85F, -27.5F, -9.5F, 2.0F, 1.0F, 20.0F, 0.0F, false);
        bodysnow.setTextureOffset(98, 178).addBox(-10.5F, -27.5F, -11.85F, 20.0F, 1.0F, 2.0F, 0.0F, false);
        bodysnow.setTextureOffset(100, 155).addBox(-12.85F, -27.5F, -9.5F, 2.0F, 1.0F, 20.0F, 0.0F, false);
        bodysnow.setTextureOffset(98, 178).addBox(-10.5F, -27.5F, 10.85F, 20.0F, 1.0F, 2.0F, 0.0F, false);
        bodysnow.setTextureOffset(98, 178).addBox(-11.5F, -30.75F, 11.0F, 22.0F, 1.0F, 2.0F, 0.0F, false);
        bodysnow.setTextureOffset(100, 155).addBox(-13.0F, -30.75F, -10.5F, 2.0F, 1.0F, 22.0F, 0.0F, false);
        bodysnow.setTextureOffset(100, 155).addBox(-12.0F, -32.0F, -10.5F, 2.0F, 2.0F, 22.0F, 0.0F, false);
        bodysnow.setTextureOffset(118, 160).addBox(-12.5F, -32.5F, 9.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
        bodysnow.setTextureOffset(118, 160).addBox(-12.25F, -32.85F, 10.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bodysnow.setTextureOffset(98, 178).addBox(-11.5F, -32.25F, 11.0F, 22.0F, 2.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(118, 160).addBox(8.5F, -32.5F, 9.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
        bodysnow.setTextureOffset(118, 160).addBox(9.0F, -32.85F, 10.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bodysnow.setTextureOffset(76, 156).addBox(-11.5F, -34.0F, -10.5F, 22.0F, 2.0F, 22.0F, 0.0F, false);
        bodysnow.setTextureOffset(89, 165).addBox(-10.5F, -35.25F, -9.5F, 20.0F, 2.0F, 20.0F, 0.0F, false);
        bodysnow.setTextureOffset(118, 160).addBox(-12.5F, -32.5F, -11.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
        bodysnow.setTextureOffset(118, 160).addBox(-12.25F, -32.85F, -11.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bodysnow.setTextureOffset(98, 178).addBox(-11.5F, -32.25F, -11.0F, 22.0F, 2.0F, 1.0F, 0.0F, false);
        bodysnow.setTextureOffset(98, 178).addBox(-11.5F, -30.75F, -12.0F, 22.0F, 1.0F, 2.0F, 0.0F, false);
        bodysnow.setTextureOffset(118, 160).addBox(9.25F, -32.85F, -11.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bodysnow.setTextureOffset(118, 160).addBox(8.5F, -32.5F, -11.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
        bodysnow.setTextureOffset(100, 155).addBox(9.0F, -32.0F, -10.5F, 2.0F, 2.0F, 22.0F, 0.0F, false);
        bodysnow.setTextureOffset(100, 155).addBox(10.0F, -30.75F, -10.5F, 2.0F, 1.0F, 22.0F, 0.0F, false);
        bodysnow.setTextureOffset(124, 166).addBox(-2.5F, -39.75F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
        bodysnow.setTextureOffset(124, 166).addBox(-2.0F, -39.75F, -1.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
        bodysnow.setTextureOffset(159, 156).addBox(-1.0F, -40.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube1_r1 = new ModelRenderer(this);
        cube1_r1.setRotationPoint(-0.55F, -6.1042F, 10.3833F);
        bodysnow.addChild(cube1_r1);
        setRotationAngle(cube1_r1, 0.0F, -1.5708F, 0.0F);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, -13.1458F, -8.5833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, -13.1458F, -2.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, -12.1458F, -8.0833F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, -12.1458F, 1.4167F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, -13.1458F, 0.9167F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, -13.1458F, 7.4167F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, -4.8958F, -8.5833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, -4.8958F, -2.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, -3.8958F, -8.0833F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, -3.8958F, 1.4167F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, -4.8958F, 0.9167F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, -4.8958F, 7.4167F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, 3.1042F, -8.5833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, 3.1042F, -2.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, 4.1042F, -8.0833F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, 4.1042F, 1.4167F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, 3.1042F, 0.9167F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, 3.1042F, 7.4167F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, 12.6042F, 1.4167F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, 11.6042F, 0.9167F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, 11.6042F, 7.4167F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, 11.6042F, -2.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, 11.6042F, -8.5833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube1_r1.setTextureOffset(133, 163).addBox(-0.5F, 12.6042F, -8.0833F, 1.0F, 1.0F, 7.0F, 0.0F, false);

        leftdoorsnow = new ModelRenderer(this);
        leftdoorsnow.setRotationPoint(9.0F, 17.25F, -10.6F);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-10.5F, 2.0F, 0.65F);
        leftdoorsnow.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 1.5708F, 0.0F);
        cube_r9.setTextureOffset(123, 169).addBox(-0.5F, 0.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r9.setTextureOffset(123, 169).addBox(-0.5F, -8.5F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r9.setTextureOffset(123, 169).addBox(-0.5F, -16.5F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r9.setTextureOffset(123, 169).addBox(-0.5F, -24.75F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-10.0F, 3.0F, 0.65F);
        leftdoorsnow.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 1.5708F, 0.0F);
        cube_r10.setTextureOffset(123, 169).addBox(-0.5F, 0.0F, 2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        cube_r10.setTextureOffset(123, 169).addBox(-0.5F, -8.5F, 2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        cube_r10.setTextureOffset(123, 169).addBox(-0.5F, -16.5F, 2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        cube_r10.setTextureOffset(123, 169).addBox(-0.5F, -24.75F, 2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(-9.5F, 3.0F, 0.65F);
        leftdoorsnow.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 1.5708F, 0.0F);
        cube_r11.setTextureOffset(123, 169).addBox(-0.5F, 0.0F, 2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        cube_r11.setTextureOffset(123, 169).addBox(-0.5F, -8.5F, 2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        cube_r11.setTextureOffset(123, 169).addBox(-0.5F, -16.5F, 2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        cube_r11.setTextureOffset(123, 169).addBox(-0.5F, -24.75F, 2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(-4.0F, 2.0F, 0.65F);
        leftdoorsnow.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 1.5708F, 0.0F);
        cube_r12.setTextureOffset(123, 169).addBox(-0.5F, 0.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r12.setTextureOffset(123, 169).addBox(-0.5F, -8.5F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r12.setTextureOffset(123, 169).addBox(-0.5F, -16.5F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r12.setTextureOffset(123, 169).addBox(-0.5F, -24.75F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        right_door = new ModelRenderer(this);
        right_door.setRotationPoint(-9.0F, 1.5F, -10.6F);


        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(9.5F, -13.5F, 0.6F);
        right_door.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 1.5708F, 0.0F);
        cube_r13.setTextureOffset(114, 55).addBox(-0.5F, 0.0F, -8.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r13.setTextureOffset(117, 56).addBox(-0.5F, 8.75F, -8.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r13.setTextureOffset(112, 58).addBox(-0.5F, 34.0F, -8.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r13.setTextureOffset(117, 56).addBox(-0.5F, 25.25F, -8.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r13.setTextureOffset(117, 56).addBox(-0.5F, 17.0F, -8.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r13.setTextureOffset(114, 55).addBox(-0.5F, 0.25F, -8.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r13.setTextureOffset(114, 55).addBox(-0.5F, 0.5F, -8.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(4.85F, -4.75F, 0.85F);
        right_door.addChild(cube_r14);
        setRotationAngle(cube_r14, -3.1416F, 0.7854F, -1.5708F);
        cube_r14.setTextureOffset(25, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, true);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(0.95F, -8.0F, 1.05F);
        right_door.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.7854F, 0.0F);
        cube_r15.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, true);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(4.85F, -8.5F, 1.1F);
        right_door.addChild(cube_r16);
        setRotationAngle(cube_r16, -3.1416F, 0.7854F, -1.5708F);
        cube_r16.setTextureOffset(25, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, true);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(7.55F, -8.0F, 1.05F);
        right_door.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.7854F, 0.0F);
        cube_r17.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, true);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(5.35F, -8.0F, 1.1F);
        right_door.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.7854F, 0.0F);
        cube_r18.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, true);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(4.85F, -12.25F, 0.85F);
        right_door.addChild(cube_r19);
        setRotationAngle(cube_r19, -3.1416F, 0.7854F, -1.5708F);
        cube_r19.setTextureOffset(25, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, true);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(3.15F, -8.0F, 1.1F);
        right_door.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, 0.7854F, 0.0F);
        cube_r20.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, true);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(4.75F, -9.25F, 1.1F);
        right_door.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.0F, -1.5708F, 0.0F);
        cube_r21.setTextureOffset(121, 24).addBox(-0.4956F, -2.5F, -3.4001F, 1.0F, 7.0F, 7.0F, 0.0F, true);
        cube_r21.setTextureOffset(121, 24).addBox(-0.4956F, -2.5F, -3.4001F, 1.0F, 3.0F, 7.0F, 0.0F, true);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(-0.5F, -5.0F, 0.6F);
        right_door.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.0F, 1.5708F, 0.0F);
        cube_r22.setTextureOffset(117, 56).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r22.setTextureOffset(112, 58).addBox(-0.5F, 0.5F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r22.setTextureOffset(112, 58).addBox(-0.5F, 24.75F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r22.setTextureOffset(117, 56).addBox(-0.5F, 16.25F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r22.setTextureOffset(112, 58).addBox(-0.5F, 17.0F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r22.setTextureOffset(117, 56).addBox(-0.5F, 8.25F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r22.setTextureOffset(112, 58).addBox(-0.5F, 8.75F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(6.0F, 21.0F, 10.1F);
        right_door.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 1.5708F, 0.0F);
        cube_r23.setTextureOffset(34, 4).addBox(9.0F, -35.0F, -7.0F, 1.0F, 36.0F, 2.0F, 0.0F, true);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(17.5F, 20.5F, 8.6F);
        right_door.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, 1.5708F, 0.0F);
        cube_r24.setTextureOffset(46, 4).addBox(8.0F, -34.0F, -9.0F, 1.0F, 35.0F, 1.0F, 0.0F, true);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(17.5F, 20.5F, 9.1F);
        right_door.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.0F, 1.5708F, 0.0F);
        cube_r25.setTextureOffset(34, 8).addBox(8.0F, -34.0F, -10.0F, 1.0F, 35.0F, 2.0F, 0.0F, true);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(12.75F, 45.0F, 9.35F);
        right_door.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.0F, 1.5708F, 0.0F);
        cube_r26.setTextureOffset(145, 15).addBox(8.0F, -32.0F, -12.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        cube_r26.setTextureOffset(145, 15).addBox(8.0F, -40.75F, -12.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);

        phonedoor = new ModelRenderer(this);
        phonedoor.setRotationPoint(1.1F, -4.0F, 0.95F);
        right_door.addChild(phonedoor);


        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(0.0F, 2.0F, 0.0F);
        phonedoor.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0F, 2.3562F, 0.0F);
        cube_r27.setTextureOffset(20, 51).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r27.setTextureOffset(20, 51).addBox(-0.5F, 4.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(11.65F, 32.5F, 8.4F);
        phonedoor.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0F, 1.5708F, 0.0F);
        cube_r28.setTextureOffset(116, 57).addBox(8.0F, -26.0F, -11.75F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r28.setTextureOffset(171, 28).addBox(7.0203F, -31.25F, -9.2716F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        cube_r28.setTextureOffset(15, 87).addBox(7.2703F, -29.5F, -7.0216F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        cube_r28.setTextureOffset(171, 28).addBox(7.0203F, -30.5F, -6.7716F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r28.setTextureOffset(171, 28).addBox(7.0203F, -31.25F, -7.7716F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        cube_r28.setTextureOffset(161, 15).addBox(6.7703F, -30.75F, -9.5216F, 1.0F, 4.0F, 3.0F, 0.0F, true);
        cube_r28.setTextureOffset(41, 65).addBox(7.7703F, -31.75F, -11.0216F, 1.0F, 6.0F, 6.0F, 0.0F, true);
        cube_r28.setTextureOffset(116, 57).addBox(8.0F, -26.0F, -12.0F, 1.0F, 1.0F, 7.0F, 0.0F, true);
        cube_r28.setTextureOffset(116, 57).addBox(8.0F, -32.25F, -12.0F, 1.0F, 1.0F, 7.0F, 0.0F, true);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(12.65F, 32.25F, 8.4F);
        phonedoor.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, 1.5708F, 0.0F);
        cube_r29.setTextureOffset(116, 57).addBox(8.0F, -32.0F, -6.95F, 1.0F, 7.0F, 1.0F, 0.0F, true);
        cube_r29.setTextureOffset(116, 57).addBox(8.0F, -32.0F, -6.75F, 1.0F, 7.0F, 1.0F, 0.0F, true);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(10.65F, 32.25F, 8.4F);
        phonedoor.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, 1.5708F, 0.0F);
        cube_r30.setTextureOffset(110, 63).addBox(8.0F, -32.0F, -12.0F, 1.0F, 7.0F, 2.0F, 0.0F, true);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(12.15F, 32.9F, 7.45F);
        phonedoor.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.0F, 1.5708F, 0.0F);
        cube_r31.setTextureOffset(62, 24).addBox(7.0044F, -32.0F, -11.9001F, 1.0F, 6.0F, 6.0F, 0.0F, true);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(6.15F, 4.25F, -0.25F);
        phonedoor.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.0F, 2.3562F, 0.0F);
        cube_r32.setTextureOffset(20, 51).addBox(-0.5F, -1.5F, -0.6414F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        left_door = new ModelRenderer(this);
        left_door.setRotationPoint(9.0F, 1.5F, -10.6F);


        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(-3.65F, -4.75F, 0.85F);
        left_door.addChild(cube_r33);
        setRotationAngle(cube_r33, -3.1416F, 0.7854F, -1.5708F);
        cube_r33.setTextureOffset(25, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(0.5F, -13.5F, 0.6F);
        left_door.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.0F, 1.5708F, 0.0F);
        cube_r34.setTextureOffset(114, 55).addBox(-0.5F, 0.0F, -8.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube_r34.setTextureOffset(114, 55).addBox(-0.5F, 0.5F, -8.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(-7.55F, -8.0F, 1.05F);
        left_door.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, 0.7854F, 0.0F);
        cube_r35.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(-3.65F, -8.5F, 1.1F);
        left_door.addChild(cube_r36);
        setRotationAngle(cube_r36, -3.1416F, 0.7854F, -1.5708F);
        cube_r36.setTextureOffset(25, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(4.75F, 20.25F, 9.6F);
        left_door.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.0F, 1.5708F, 0.0F);
        cube_r37.setTextureOffset(122, 24).addBox(8.0F, -32.0F, -12.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        cube_r37.setTextureOffset(122, 24).addBox(8.0F, -32.0F, -12.0F, 1.0F, 3.0F, 7.0F, 0.0F, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(-0.95F, -8.0F, 1.05F);
        left_door.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0F, 0.7854F, 0.0F);
        cube_r38.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(-3.15F, -8.0F, 1.1F);
        left_door.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, 0.7854F, 0.0F);
        cube_r39.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(-3.65F, -12.25F, 0.85F);
        left_door.addChild(cube_r40);
        setRotationAngle(cube_r40, -3.1416F, 0.7854F, -1.5708F);
        cube_r40.setTextureOffset(25, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(-5.35F, -8.0F, 1.1F);
        left_door.addChild(cube_r41);
        setRotationAngle(cube_r41, 0.0F, 0.7854F, 0.0F);
        cube_r41.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(-9.5F, -5.0F, 0.6F);
        left_door.addChild(cube_r42);
        setRotationAngle(cube_r42, 0.0F, 1.5708F, 0.0F);
        cube_r42.setTextureOffset(117, 56).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube_r42.setTextureOffset(112, 58).addBox(-0.5F, 0.5F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube_r42.setTextureOffset(117, 56).addBox(-0.5F, 0.25F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube_r42.setTextureOffset(112, 58).addBox(-0.5F, 8.75F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube_r42.setTextureOffset(117, 56).addBox(-0.5F, 8.5F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube_r42.setTextureOffset(117, 56).addBox(-0.5F, 8.25F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube_r42.setTextureOffset(117, 56).addBox(-0.5F, 16.25F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube_r42.setTextureOffset(112, 58).addBox(-0.5F, 17.0F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube_r42.setTextureOffset(112, 58).addBox(-0.5F, 24.75F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        cube_r42.setTextureOffset(112, 58).addBox(-0.5F, 25.5F, 1.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setRotationPoint(4.5F, 25.75F, 10.5F);
        left_door.addChild(cube_r43);
        setRotationAngle(cube_r43, 0.0F, 1.5708F, 0.0F);
        cube_r43.setTextureOffset(131, 32).addBox(9.0F, -26.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setRotationPoint(-8.05F, 4.0F, 0.25F);
        left_door.addChild(cube_r44);
        setRotationAngle(cube_r44, 0.0F, 1.5708F, 0.0F);
        cube_r44.setTextureOffset(20, 51).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setRotationPoint(-8.05F, 0.75F, 0.5F);
        left_door.addChild(cube_r45);
        setRotationAngle(cube_r45, 0.0F, 2.3562F, 0.0F);
        cube_r45.setTextureOffset(20, 51).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setRotationPoint(4.25F, 28.25F, 9.35F);
        left_door.addChild(cube_r46);
        setRotationAngle(cube_r46, 0.0F, 1.5708F, 0.0F);
        cube_r46.setTextureOffset(145, 15).addBox(8.0F, -32.0F, -12.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        cube_r46.setTextureOffset(145, 15).addBox(8.0F, -24.0F, -12.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        cube_r46.setTextureOffset(145, 15).addBox(8.0F, -15.25F, -12.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setRotationPoint(6.0F, 21.0F, 10.1F);
        left_door.addChild(cube_r47);
        setRotationAngle(cube_r47, 0.0F, 1.5708F, 0.0F);
        cube_r47.setTextureOffset(34, 3).addBox(9.0F, -35.0F, -7.0F, 1.0F, 36.0F, 2.0F, 0.0F, false);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setRotationPoint(-0.5F, 20.5F, 9.1F);
        left_door.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.0F, 1.5708F, 0.0F);
        cube_r48.setTextureOffset(36, 8).addBox(8.0F, -34.0F, -8.0F, 1.0F, 35.0F, 1.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(1.5F, 16.25F, -1.5F);
        body.setTextureOffset(96, 109).addBox(-14.0F, 6.75F, -11.0F, 25.0F, 1.0F, 25.0F, 0.0F, false);
        body.setTextureOffset(21, 132).addBox(-10.65F, -28.25F, 9.95F, 18.0F, 36.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(174, 50).addBox(7.5F, -33.0F, -10.5F, 3.0F, 40.0F, 3.0F, 0.0F, false);
        body.setTextureOffset(174, 50).addBox(7.5F, -33.0F, 10.5F, 3.0F, 40.0F, 3.0F, 0.0F, false);
        body.setTextureOffset(174, 50).addBox(-13.5F, -33.0F, -10.5F, 3.0F, 40.0F, 3.0F, 0.0F, false);
        body.setTextureOffset(174, 50).addBox(-13.5F, -33.0F, 10.5F, 3.0F, 40.0F, 3.0F, 0.0F, false);
        body.setTextureOffset(98, 15).addBox(-13.25F, -34.35F, 11.25F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(53, 4).addBox(-12.5F, -30.25F, -8.5F, 2.0F, 2.0F, 20.0F, 0.0F, false);
        body.setTextureOffset(98, 50).addBox(-14.0F, -29.25F, -9.5F, 2.0F, 1.0F, 22.0F, 0.0F, false);
        body.setTextureOffset(117, 54).addBox(-14.0F, -31.25F, 11.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(98, 50).addBox(-14.0F, -32.25F, -9.5F, 2.0F, 1.0F, 22.0F, 0.0F, false);
        body.setTextureOffset(51, 21).addBox(-13.75F, -31.25F, -8.5F, 1.0F, 2.0F, 20.0F, 0.0F, false);
        body.setTextureOffset(111, 59).addBox(-14.0F, -31.25F, -9.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(98, 15).addBox(-13.25F, -34.35F, -10.25F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-12.5F, -31.25F, -11.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(98, 61).addBox(-12.5F, -29.25F, -11.0F, 22.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(28, 88).addBox(-12.5F, -34.5F, -9.5F, 22.0F, 3.0F, 22.0F, 0.0F, false);
        body.setTextureOffset(28, 88).addBox(-12.5F, -33.0F, -9.5F, 22.0F, 3.0F, 22.0F, 0.0F, false);
        body.setTextureOffset(31, 89).addBox(-12.0F, -30.5F, -9.0F, 21.0F, 2.0F, 21.0F, 0.0F, false);
        body.setTextureOffset(51, 40).addBox(-11.5F, -31.25F, -10.75F, 20.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(98, 15).addBox(8.25F, -34.35F, -10.25F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(8.5F, -31.25F, -11.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(98, 61).addBox(-12.5F, -32.25F, -11.0F, 22.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(98, 50).addBox(9.0F, -29.25F, -9.5F, 2.0F, 1.0F, 22.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(9.0F, -31.25F, -9.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(98, 50).addBox(9.0F, -32.25F, -9.5F, 2.0F, 1.0F, 22.0F, 0.0F, false);
        body.setTextureOffset(39, 21).addBox(9.75F, -31.25F, -8.5F, 1.0F, 2.0F, 20.0F, 0.0F, false);
        body.setTextureOffset(101, 63).addBox(9.0F, -31.25F, 11.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(98, 15).addBox(8.0F, -34.35F, 11.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(53, 4).addBox(7.5F, -30.25F, -8.5F, 2.0F, 2.0F, 20.0F, 0.0F, false);
        body.setTextureOffset(117, 56).addBox(8.0F, -28.5F, 2.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(117, 56).addBox(8.0F, -28.5F, -6.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(117, 56).addBox(8.0F, -28.75F, 1.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        body.setTextureOffset(117, 56).addBox(8.0F, -28.75F, -6.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        body.setTextureOffset(112, 58).addBox(8.0F, -28.25F, 2.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(112, 58).addBox(8.0F, -28.25F, -6.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(39, 40).addBox(-11.5F, -31.25F, 12.75F, 20.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(8.5F, -31.25F, 12.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(92, 65).addBox(-12.5F, -32.25F, 12.0F, 22.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(92, 65).addBox(-12.5F, -29.25F, 12.0F, 22.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-12.5F, -31.25F, 12.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(73, 57).addBox(-11.5F, -36.5F, -8.5F, 20.0F, 2.0F, 20.0F, 0.0F, false);
        body.setTextureOffset(176, 68).addBox(-3.5F, -37.5F, -0.5F, 4.0F, 2.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(109, 20).addBox(-3.5F, -40.5F, 1.5F, 4.0F, 4.0F, 0.0F, 0.0F, false);
        body.setTextureOffset(109, 20).addBox(-3.5F, -40.5F, 2.5F, 4.0F, 4.0F, 0.0F, 0.0F, false);
        body.setTextureOffset(109, 20).addBox(-3.5F, -40.5F, 0.5F, 4.0F, 4.0F, 0.0F, 0.0F, false);
        body.setTextureOffset(124, 19).addBox(-3.0F, -40.25F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        body.setTextureOffset(174, 68).addBox(-3.5F, -41.25F, 0.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
        body.setTextureOffset(174, 68).addBox(-3.5F, -39.5F, 0.0F, 4.0F, 0.0F, 3.0F, 0.0F, false);
        body.setTextureOffset(174, 68).addBox(-3.5F, -38.5F, 0.0F, 4.0F, 0.0F, 3.0F, 0.0F, false);
        body.setTextureOffset(174, 68).addBox(-3.0F, -41.25F, -0.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(174, 68).addBox(-3.0F, -39.5F, -0.5F, 3.0F, 0.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(174, 68).addBox(-3.0F, -38.5F, -0.5F, 3.0F, 0.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(174, 68).addBox(-2.0F, -42.25F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(174, 68).addBox(-3.0F, -41.75F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setRotationPoint(-2.5F, -38.75F, 1.5F);
        body.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.0F, -1.5708F, 0.0F);
        cube_r49.setTextureOffset(109, 20).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setRotationPoint(-0.5F, -38.75F, 1.5F);
        body.addChild(cube_r50);
        setRotationAngle(cube_r50, 0.0F, -1.5708F, 0.0F);
        cube_r50.setTextureOffset(109, 20).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setRotationPoint(-1.5F, -38.75F, 1.5F);
        body.addChild(cube_r51);
        setRotationAngle(cube_r51, 0.0F, -1.5708F, 0.0F);
        cube_r51.setTextureOffset(109, 20).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(-3.5F, 6.75F, 0.5F);
        body.addChild(cube_r52);
        setRotationAngle(cube_r52, 0.0F, 1.5708F, 0.0F);
        cube_r52.setTextureOffset(53, 4).addBox(8.0F, -37.0F, -8.0F, 2.0F, 2.0F, 20.0F, 0.0F, false);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(-3.5F, 6.75F, 20.5F);
        body.addChild(cube_r53);
        setRotationAngle(cube_r53, 0.0F, 1.5708F, 0.0F);
        cube_r53.setTextureOffset(53, 4).addBox(8.0F, -37.0F, -8.0F, 2.0F, 2.0F, 20.0F, 0.0F, false);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(-1.5F, 7.75F, 1.95F);
        body.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.0F, 1.5708F, 0.0F);
        cube_r54.setTextureOffset(40, 132).addBox(-9.15F, -36.0F, 8.45F, 18.0F, 36.0F, 1.0F, 0.0F, false);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(-1.5F, 7.75F, 1.85F);
        body.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.0F, -1.5708F, 0.0F);
        cube_r55.setTextureOffset(4, 132).addBox(-9.15F, -36.0F, 8.45F, 18.0F, 36.0F, 1.0F, 0.0F, false);

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(8.25F, -21.5F, -2.65F);
        body.addChild(bone6);
        bone6.setTextureOffset(114, 55).addBox(-0.25F, -6.25F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(114, 55).addBox(-0.25F, -6.75F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(34, 2).addBox(-0.25F, -7.25F, -5.85F, 1.0F, 36.0F, 2.0F, 0.0F, false);
        bone6.setTextureOffset(114, 55).addBox(-0.25F, -6.5F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(114, 55).addBox(-0.25F, -6.25F, 5.15F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(31, 1).addBox(-0.25F, -6.75F, 2.65F, 1.0F, 35.0F, 3.0F, 0.0F, false);
        bone6.setTextureOffset(114, 55).addBox(-0.25F, -6.75F, 5.15F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(46, 4).addBox(0.25F, -7.25F, 3.65F, 1.0F, 36.0F, 1.0F, 0.0F, false);
        bone6.setTextureOffset(34, 3).addBox(-0.25F, -7.25F, 12.15F, 1.0F, 36.0F, 2.0F, 0.0F, false);
        bone6.setTextureOffset(145, 15).addBox(-0.6F, 3.0F, -4.1F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(117, 56).addBox(-0.25F, 2.0F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(117, 56).addBox(-0.25F, 2.0F, 5.15F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(112, 58).addBox(-0.25F, 2.25F, 5.15F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(117, 56).addBox(-0.25F, 1.75F, 5.15F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(117, 56).addBox(-0.25F, 1.75F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(112, 58).addBox(-0.25F, 2.25F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(145, 15).addBox(-0.6F, 3.0F, 5.4F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(117, 56).addBox(-0.25F, 10.25F, 5.15F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(112, 58).addBox(-0.25F, 10.5F, 5.15F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(117, 56).addBox(-0.25F, 10.0F, 5.15F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(117, 56).addBox(-0.25F, 10.25F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(117, 56).addBox(-0.25F, 10.0F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(112, 58).addBox(-0.25F, 10.5F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(145, 15).addBox(-0.6F, 11.0F, -4.1F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(112, 58).addBox(-0.25F, 18.75F, 5.15F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(117, 56).addBox(-0.25F, 18.0F, 5.15F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(117, 56).addBox(-0.25F, 18.5F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(117, 56).addBox(-0.25F, 18.0F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(112, 58).addBox(-0.25F, 18.75F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(145, 15).addBox(-0.6F, 19.75F, -4.1F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(145, 15).addBox(-0.6F, 19.75F, 5.4F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(112, 58).addBox(-0.25F, 27.25F, 5.15F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(112, 58).addBox(-0.25F, 26.5F, 5.15F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(112, 58).addBox(-0.25F, 27.25F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(112, 58).addBox(-0.25F, 26.5F, -3.85F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(145, 15).addBox(-0.6F, 11.0F, 5.4F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(122, 24).addBox(-0.75F, -5.0F, 5.9F, 1.0F, 3.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(122, 24).addBox(-0.75F, -5.0F, 5.9F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(122, 24).addBox(-0.75F, -5.0F, -3.6F, 1.0F, 3.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(122, 24).addBox(-0.75F, -5.0F, -3.6F, 1.0F, 7.0F, 7.0F, 0.0F, false);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setRotationPoint(0.0F, 2.0F, 0.0F);
        bone6.addChild(cube_r56);
        setRotationAngle(cube_r56, -1.5708F, 0.0F, -0.7854F);
        cube_r56.setTextureOffset(25, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r57 = new ModelRenderer(this);
        cube_r57.setRotationPoint(-0.2F, -1.25F, 2.7F);
        bone6.addChild(cube_r57);
        setRotationAngle(cube_r57, 0.0F, -0.7854F, 0.0F);
        cube_r57.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r58 = new ModelRenderer(this);
        cube_r58.setRotationPoint(-0.25F, -1.25F, 0.5F);
        bone6.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.0F, -0.7854F, 0.0F);
        cube_r58.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(-0.25F, -1.25F, -1.7F);
        bone6.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.0F, -0.7854F, 0.0F);
        cube_r59.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r60 = new ModelRenderer(this);
        cube_r60.setRotationPoint(-0.25F, -1.75F, 0.0F);
        bone6.addChild(cube_r60);
        setRotationAngle(cube_r60, -1.5708F, 0.0F, -0.7854F);
        cube_r60.setTextureOffset(25, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r61 = new ModelRenderer(this);
        cube_r61.setRotationPoint(-0.2F, -1.25F, -3.9F);
        bone6.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0F, -0.7854F, 0.0F);
        cube_r61.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r62 = new ModelRenderer(this);
        cube_r62.setRotationPoint(0.0F, -5.5F, 0.0F);
        bone6.addChild(cube_r62);
        setRotationAngle(cube_r62, -1.5708F, 0.0F, -0.7854F);
        cube_r62.setTextureOffset(25, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r63 = new ModelRenderer(this);
        cube_r63.setRotationPoint(0.0F, 2.0F, 9.5F);
        bone6.addChild(cube_r63);
        setRotationAngle(cube_r63, -1.5708F, 0.0F, -0.7854F);
        cube_r63.setTextureOffset(25, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r64 = new ModelRenderer(this);
        cube_r64.setRotationPoint(-0.2F, -1.25F, 12.2F);
        bone6.addChild(cube_r64);
        setRotationAngle(cube_r64, 0.0F, -0.7854F, 0.0F);
        cube_r64.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r65 = new ModelRenderer(this);
        cube_r65.setRotationPoint(0.0F, -5.5F, 9.5F);
        bone6.addChild(cube_r65);
        setRotationAngle(cube_r65, -1.5708F, 0.0F, -0.7854F);
        cube_r65.setTextureOffset(25, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r66 = new ModelRenderer(this);
        cube_r66.setRotationPoint(-0.25F, -1.25F, 10.0F);
        bone6.addChild(cube_r66);
        setRotationAngle(cube_r66, 0.0F, -0.7854F, 0.0F);
        cube_r66.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r67 = new ModelRenderer(this);
        cube_r67.setRotationPoint(-0.25F, -1.25F, 7.8F);
        bone6.addChild(cube_r67);
        setRotationAngle(cube_r67, 0.0F, -0.7854F, 0.0F);
        cube_r67.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r68 = new ModelRenderer(this);
        cube_r68.setRotationPoint(-0.2F, -1.25F, 5.6F);
        bone6.addChild(cube_r68);
        setRotationAngle(cube_r68, 0.0F, -0.7854F, 0.0F);
        cube_r68.setTextureOffset(20, 43).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r69 = new ModelRenderer(this);
        cube_r69.setRotationPoint(-0.25F, -1.75F, 9.5F);
        bone6.addChild(cube_r69);
        setRotationAngle(cube_r69, -1.5708F, 0.0F, -0.7854F);
        cube_r69.setTextureOffset(25, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(-1.5F, 7.75F, 1.5F);
        body.addChild(bone7);
        setRotationAngle(bone7, 0.0F, -1.5708F, 0.0F);
        bone7.setTextureOffset(114, 55).addBox(9.5F, -35.5F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(114, 55).addBox(9.5F, -36.0F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(34, 2).addBox(9.5F, -36.5F, -10.0F, 1.0F, 36.0F, 2.0F, 0.0F, false);
        bone7.setTextureOffset(114, 55).addBox(9.5F, -35.75F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(114, 55).addBox(9.5F, -35.5F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(31, 1).addBox(9.5F, -36.0F, -1.5F, 1.0F, 35.0F, 3.0F, 0.0F, false);
        bone7.setTextureOffset(114, 55).addBox(9.5F, -36.0F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(46, 4).addBox(10.0F, -36.5F, -0.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
        bone7.setTextureOffset(34, 3).addBox(9.5F, -36.5F, 8.0F, 1.0F, 36.0F, 2.0F, 0.0F, false);
        bone7.setTextureOffset(145, 15).addBox(9.15F, -26.25F, -8.25F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(117, 56).addBox(9.5F, -27.25F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(117, 56).addBox(9.5F, -27.25F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(112, 58).addBox(9.5F, -27.0F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(117, 56).addBox(9.5F, -27.5F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(117, 56).addBox(9.5F, -27.5F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(112, 58).addBox(9.5F, -27.0F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(145, 15).addBox(9.15F, -26.25F, 1.25F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(117, 56).addBox(9.5F, -19.0F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(112, 58).addBox(9.5F, -18.75F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(117, 56).addBox(9.5F, -19.25F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(117, 56).addBox(9.5F, -19.0F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(117, 56).addBox(9.5F, -19.25F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(112, 58).addBox(9.5F, -18.75F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(145, 15).addBox(9.15F, -18.25F, -8.25F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(112, 58).addBox(9.5F, -10.5F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(117, 56).addBox(9.5F, -11.25F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(117, 56).addBox(9.5F, -10.75F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(117, 56).addBox(9.5F, -11.25F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(112, 58).addBox(9.5F, -10.5F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(145, 15).addBox(9.15F, -9.5F, -8.25F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(145, 15).addBox(9.15F, -9.5F, 1.25F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(112, 58).addBox(9.5F, -2.0F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(112, 58).addBox(9.5F, -2.75F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(112, 58).addBox(9.5F, -2.0F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(112, 58).addBox(9.5F, -2.75F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(145, 15).addBox(9.15F, -18.25F, 1.25F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(122, 24).addBox(9.0F, -34.25F, 1.75F, 1.0F, 3.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(122, 24).addBox(9.0F, -34.25F, 1.75F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(122, 24).addBox(9.0F, -34.25F, -7.75F, 1.0F, 3.0F, 7.0F, 0.0F, false);
        bone7.setTextureOffset(122, 24).addBox(9.0F, -34.25F, -7.75F, 1.0F, 7.0F, 7.0F, 0.0F, false);

        cube_r70 = new ModelRenderer(this);
        cube_r70.setRotationPoint(9.75F, -29.25F, -4.15F);
        bone7.addChild(cube_r70);
        setRotationAngle(cube_r70, -1.5708F, 0.0F, -0.7854F);
        cube_r70.setTextureOffset(25, 0).addBox(-1.9142F, -3.0F, 0.9142F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r71 = new ModelRenderer(this);
        cube_r71.setRotationPoint(9.55F, -32.5F, -1.45F);
        bone7.addChild(cube_r71);
        setRotationAngle(cube_r71, 0.0F, -0.7854F, 0.0F);
        cube_r71.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r72 = new ModelRenderer(this);
        cube_r72.setRotationPoint(9.5F, -32.5F, -3.65F);
        bone7.addChild(cube_r72);
        setRotationAngle(cube_r72, 0.0F, -0.7854F, 0.0F);
        cube_r72.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r73 = new ModelRenderer(this);
        cube_r73.setRotationPoint(9.5F, -32.5F, -5.85F);
        bone7.addChild(cube_r73);
        setRotationAngle(cube_r73, 0.0F, -0.7854F, 0.0F);
        cube_r73.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r74 = new ModelRenderer(this);
        cube_r74.setRotationPoint(9.5F, -33.0F, -4.15F);
        bone7.addChild(cube_r74);
        setRotationAngle(cube_r74, -1.5708F, 0.0F, -0.7854F);
        cube_r74.setTextureOffset(25, 0).addBox(-1.9142F, -3.0F, 0.9142F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r75 = new ModelRenderer(this);
        cube_r75.setRotationPoint(9.55F, -32.5F, -8.05F);
        bone7.addChild(cube_r75);
        setRotationAngle(cube_r75, 0.0F, -0.7854F, 0.0F);
        cube_r75.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r76 = new ModelRenderer(this);
        cube_r76.setRotationPoint(9.75F, -36.75F, -4.15F);
        bone7.addChild(cube_r76);
        setRotationAngle(cube_r76, -1.5708F, 0.0F, -0.7854F);
        cube_r76.setTextureOffset(25, 0).addBox(-1.9142F, -3.0F, 0.9142F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r77 = new ModelRenderer(this);
        cube_r77.setRotationPoint(9.75F, -29.25F, 5.35F);
        bone7.addChild(cube_r77);
        setRotationAngle(cube_r77, -1.5708F, 0.0F, -0.7854F);
        cube_r77.setTextureOffset(25, 0).addBox(-1.9142F, -3.0F, 0.9142F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r78 = new ModelRenderer(this);
        cube_r78.setRotationPoint(9.55F, -32.5F, 8.05F);
        bone7.addChild(cube_r78);
        setRotationAngle(cube_r78, 0.0F, -0.7854F, 0.0F);
        cube_r78.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r79 = new ModelRenderer(this);
        cube_r79.setRotationPoint(9.75F, -36.75F, 5.35F);
        bone7.addChild(cube_r79);
        setRotationAngle(cube_r79, -1.5708F, 0.0F, -0.7854F);
        cube_r79.setTextureOffset(25, 0).addBox(-1.9142F, -3.0F, 0.9142F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r80 = new ModelRenderer(this);
        cube_r80.setRotationPoint(9.5F, -32.5F, 5.85F);
        bone7.addChild(cube_r80);
        setRotationAngle(cube_r80, 0.0F, -0.7854F, 0.0F);
        cube_r80.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r81 = new ModelRenderer(this);
        cube_r81.setRotationPoint(9.5F, -32.5F, 3.65F);
        bone7.addChild(cube_r81);
        setRotationAngle(cube_r81, 0.0F, -0.7854F, 0.0F);
        cube_r81.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r82 = new ModelRenderer(this);
        cube_r82.setRotationPoint(9.55F, -32.5F, 1.45F);
        bone7.addChild(cube_r82);
        setRotationAngle(cube_r82, 0.0F, -0.7854F, 0.0F);
        cube_r82.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r83 = new ModelRenderer(this);
        cube_r83.setRotationPoint(9.5F, -33.0F, 5.35F);
        bone7.addChild(cube_r83);
        setRotationAngle(cube_r83, -1.5708F, 0.0F, -0.7854F);
        cube_r83.setTextureOffset(25, 0).addBox(-1.9142F, -3.0F, 0.9142F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(-1.5F, 7.75F, 1.5F);
        body.addChild(bone8);
        setRotationAngle(bone8, 0.0F, 3.1416F, 0.0F);
        bone8.setTextureOffset(114, 55).addBox(9.5F, -35.5F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(114, 55).addBox(9.5F, -36.0F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(34, 2).addBox(9.5F, -36.5F, -10.0F, 1.0F, 36.0F, 2.0F, 0.0F, false);
        bone8.setTextureOffset(114, 55).addBox(9.5F, -35.75F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(114, 55).addBox(9.5F, -35.5F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(31, 1).addBox(9.5F, -36.0F, -1.5F, 1.0F, 35.0F, 3.0F, 0.0F, false);
        bone8.setTextureOffset(114, 55).addBox(9.5F, -36.0F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(46, 4).addBox(10.0F, -36.0F, -0.5F, 1.0F, 36.0F, 1.0F, 0.0F, false);
        bone8.setTextureOffset(34, 3).addBox(9.5F, -36.5F, 8.0F, 1.0F, 36.0F, 2.0F, 0.0F, false);
        bone8.setTextureOffset(145, 15).addBox(9.25F, -26.25F, -8.25F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(117, 56).addBox(9.5F, -27.25F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(117, 56).addBox(9.5F, -27.25F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(112, 58).addBox(9.5F, -27.0F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(117, 56).addBox(9.5F, -27.5F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(117, 56).addBox(9.5F, -27.5F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(112, 58).addBox(9.5F, -27.0F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(145, 15).addBox(9.25F, -26.25F, 1.25F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(117, 56).addBox(9.5F, -19.0F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(112, 58).addBox(9.5F, -18.75F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(117, 56).addBox(9.5F, -19.25F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(117, 56).addBox(9.5F, -19.0F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(117, 56).addBox(9.5F, -19.25F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(112, 58).addBox(9.5F, -18.75F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(145, 15).addBox(9.25F, -18.25F, -8.25F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(112, 58).addBox(9.5F, -10.5F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(117, 56).addBox(9.5F, -11.25F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(117, 56).addBox(9.5F, -10.75F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(117, 56).addBox(9.5F, -11.25F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(112, 58).addBox(9.5F, -10.5F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(145, 15).addBox(9.25F, -9.5F, -8.25F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(145, 15).addBox(9.25F, -9.5F, 1.25F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(161, 0).addBox(8.75F, -2.0F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);
        bone8.setTextureOffset(112, 58).addBox(9.5F, -2.0F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(112, 58).addBox(9.5F, -2.75F, 1.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(112, 58).addBox(9.5F, -2.0F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(112, 58).addBox(9.5F, -2.75F, -8.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(145, 15).addBox(9.25F, -18.25F, 1.25F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(122, 24).addBox(9.0F, -34.25F, 1.75F, 1.0F, 3.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(122, 24).addBox(9.0F, -34.25F, 1.75F, 1.0F, 7.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(122, 24).addBox(9.0F, -34.25F, -7.75F, 1.0F, 3.0F, 7.0F, 0.0F, false);
        bone8.setTextureOffset(122, 24).addBox(9.0F, -34.25F, -7.75F, 1.0F, 7.0F, 7.0F, 0.0F, false);

        cube_r84 = new ModelRenderer(this);
        cube_r84.setRotationPoint(9.75F, -29.25F, -4.15F);
        bone8.addChild(cube_r84);
        setRotationAngle(cube_r84, -1.5708F, 0.0F, -0.7854F);
        cube_r84.setTextureOffset(25, 0).addBox(-1.9142F, -3.0F, 0.9142F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r85 = new ModelRenderer(this);
        cube_r85.setRotationPoint(9.55F, -32.5F, -1.45F);
        bone8.addChild(cube_r85);
        setRotationAngle(cube_r85, 0.0F, -0.7854F, 0.0F);
        cube_r85.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r86 = new ModelRenderer(this);
        cube_r86.setRotationPoint(9.5F, -32.5F, -3.65F);
        bone8.addChild(cube_r86);
        setRotationAngle(cube_r86, 0.0F, -0.7854F, 0.0F);
        cube_r86.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r87 = new ModelRenderer(this);
        cube_r87.setRotationPoint(9.5F, -32.5F, -5.85F);
        bone8.addChild(cube_r87);
        setRotationAngle(cube_r87, 0.0F, -0.7854F, 0.0F);
        cube_r87.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r88 = new ModelRenderer(this);
        cube_r88.setRotationPoint(9.5F, -33.0F, -4.15F);
        bone8.addChild(cube_r88);
        setRotationAngle(cube_r88, -1.5708F, 0.0F, -0.7854F);
        cube_r88.setTextureOffset(25, 0).addBox(-1.9142F, -3.0F, 0.9142F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r89 = new ModelRenderer(this);
        cube_r89.setRotationPoint(9.55F, -32.5F, -8.05F);
        bone8.addChild(cube_r89);
        setRotationAngle(cube_r89, 0.0F, -0.7854F, 0.0F);
        cube_r89.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r90 = new ModelRenderer(this);
        cube_r90.setRotationPoint(9.75F, -36.75F, -4.15F);
        bone8.addChild(cube_r90);
        setRotationAngle(cube_r90, -1.5708F, 0.0F, -0.7854F);
        cube_r90.setTextureOffset(25, 0).addBox(-1.9142F, -3.0F, 0.9142F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r91 = new ModelRenderer(this);
        cube_r91.setRotationPoint(9.75F, -29.25F, 5.35F);
        bone8.addChild(cube_r91);
        setRotationAngle(cube_r91, -1.5708F, 0.0F, -0.7854F);
        cube_r91.setTextureOffset(25, 0).addBox(-1.9142F, -3.0F, 0.9142F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r92 = new ModelRenderer(this);
        cube_r92.setRotationPoint(9.55F, -32.5F, 8.05F);
        bone8.addChild(cube_r92);
        setRotationAngle(cube_r92, 0.0F, -0.7854F, 0.0F);
        cube_r92.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r93 = new ModelRenderer(this);
        cube_r93.setRotationPoint(9.75F, -36.75F, 5.35F);
        bone8.addChild(cube_r93);
        setRotationAngle(cube_r93, -1.5708F, 0.0F, -0.7854F);
        cube_r93.setTextureOffset(25, 0).addBox(-1.9142F, -3.0F, 0.9142F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r94 = new ModelRenderer(this);
        cube_r94.setRotationPoint(9.5F, -32.5F, 5.85F);
        bone8.addChild(cube_r94);
        setRotationAngle(cube_r94, 0.0F, -0.7854F, 0.0F);
        cube_r94.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r95 = new ModelRenderer(this);
        cube_r95.setRotationPoint(9.5F, -32.5F, 3.65F);
        bone8.addChild(cube_r95);
        setRotationAngle(cube_r95, 0.0F, -0.7854F, 0.0F);
        cube_r95.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r96 = new ModelRenderer(this);
        cube_r96.setRotationPoint(9.55F, -32.5F, 1.45F);
        bone8.addChild(cube_r96);
        setRotationAngle(cube_r96, 0.0F, -0.7854F, 0.0F);
        cube_r96.setTextureOffset(20, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        cube_r97 = new ModelRenderer(this);
        cube_r97.setRotationPoint(9.5F, -33.0F, 5.35F);
        bone8.addChild(cube_r97);
        setRotationAngle(cube_r97, -1.5708F, 0.0F, -0.7854F);
        cube_r97.setTextureOffset(25, 0).addBox(-1.9142F, -3.0F, 0.9142F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        bone = new ModelRenderer(this);
        bone.setRotationPoint(2.4F, -24.25F, 11.0F);
        body.addChild(bone);
        setRotationAngle(bone, 0.0F, -1.5708F, 0.0F);


        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-7.6F, -24.25F, 11.0F);
        body.addChild(bone2);
        setRotationAngle(bone2, 0.0F, -1.5708F, 0.0F);

    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn,
                       float red, float green, float blue, float alpha) {
        render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha, 0, false);
    }

    public void render(MatrixStack matrixStack, IVertexBuilder renderBuffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha, int doorPosition, boolean isSnowy) {

        switch (doorPosition) {
            case (0): //Closed
                left_door.rotateAngleY = 0.0f;
                right_door.rotateAngleY = 0.0f;

                leftdoorsnow.rotateAngleY = 0.0f;
                rightdoorsnow.rotateAngleY = 0.0f;
                rightdoorsnow2.rotateAngleY = 0.0f;

                break;
            case (1): //One open inwards
                left_door.rotateAngleY = 1.03f;
                right_door.rotateAngleY = 0.0f;

                leftdoorsnow.rotateAngleY = 1.03f;

                break;
            case (2): //Both open inwards
                left_door.rotateAngleY = 1.0f;
                right_door.rotateAngleY = -0.94f;

                leftdoorsnow.rotateAngleY = 1.01f;
                rightdoorsnow.rotateAngleY = -0.94f;
                rightdoorsnow2.rotateAngleY = -0.94f;

                break;
            case (3): //Both open outwards

                phonedoor.rotateAngleY = 1.5f;

                break;

            default:
                left_door.rotateAngleY = 0.0f;
                right_door.rotateAngleY = 0.0f;

                leftdoorsnow.rotateAngleY = 0.0f;
                rightdoorsnow.rotateAngleY = 0.0f;
                rightdoorsnow2.rotateAngleY = 0.0f;

                break;
        }

        body.render(matrixStack, renderBuffer, packedLight, packedOverlay, red, green, blue, alpha);
        left_door.render(matrixStack, renderBuffer, packedLight, packedOverlay, red, green, blue, alpha);
        right_door.render(matrixStack, renderBuffer, packedLight, packedOverlay, red, green, blue, alpha);

        if (isSnowy) {
            bodysnow.render(matrixStack, renderBuffer, packedLight, packedOverlay, red, green, blue, alpha);
            leftdoorsnow.render(matrixStack, renderBuffer, packedLight, packedOverlay, red, green, blue, alpha);
            rightdoorsnow.render(matrixStack, renderBuffer, packedLight, packedOverlay, red, green, blue, alpha); //phone sign
            rightdoorsnow2.render(matrixStack, renderBuffer, packedLight, packedOverlay, red, green, blue, alpha); //main door
        }
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }


}
