package com.prismmods.dwdimensions.client.render.model.timelord;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.prismmods.dwdimensions.client.render.model.BipedModelPatcher;
import com.prismmods.dwdimensions.common.entities.TimeLordEntity;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.HandSide;

public class MaleTimelordModel<T extends TimeLordEntity> extends BipedModel<TimeLordEntity> {

	private final ModelRenderer leftleg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer head2;
	private final ModelRenderer head;
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
	private final ModelRenderer body;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
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
	private final ModelRenderer rightleg;
	private final ModelRenderer cube_r60;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r61;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r62;

	public MaleTimelordModel() {
	        super(0);
	        textureWidth = 200;
	        textureHeight = 200;

	        leftleg = new ModelRenderer(this);
	        leftleg.setRotationPoint(-2.0F, 14.0F, 0.0F);


	        cube_r1 = new ModelRenderer(this);
	        cube_r1.setRotationPoint(2.0F, 10.0F, 0.0F);
	        leftleg.addChild(cube_r1);
	        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0F);
	        cube_r1.setTextureOffset(46, 82).addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

	        head2 = new ModelRenderer(this);
	        head2.setRotationPoint(0.0F, 0.0F, 0.0F);


	        head = new ModelRenderer(this);
	        head.setRotationPoint(0.0F, 0.0F, 0.0F);
	        head2.addChild(head);


	        cube_r2 = new ModelRenderer(this);
	        cube_r2.setRotationPoint(4.0F, -3.0F, -6.5F);
	        head.addChild(cube_r2);
	        setRotationAngle(cube_r2, 0.0F, 0.0F, 0.0F);
	        cube_r2.setTextureOffset(127, 89).addBox(-5.0F, -6.0F, 9.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r3 = new ModelRenderer(this);
	        cube_r3.setRotationPoint(4.05F, -0.5F, 1.75F);
	        head.addChild(cube_r3);
	        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.0F);
	        cube_r3.setTextureOffset(45, 159).addBox(-8.0F, -8.0F, 1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r4 = new ModelRenderer(this);
	        cube_r4.setRotationPoint(3.5F, 0.0F, 0.0F);
	        head.addChild(cube_r4);
	        setRotationAngle(cube_r4, 0.0F, 0.0F, 0.0F);
	        cube_r4.setTextureOffset(45, 159).addBox(0.0F, -8.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

	        cube_r5 = new ModelRenderer(this);
	        cube_r5.setRotationPoint(3.75F, 0.0F, 0.0F);
	        head.addChild(cube_r5);
	        setRotationAngle(cube_r5, 0.0F, 0.0F, 0.0F);
	        cube_r5.setTextureOffset(45, 159).addBox(0.0F, -8.0F, -3.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);

	        cube_r6 = new ModelRenderer(this);
	        cube_r6.setRotationPoint(3.95F, -0.5F, 1.75F);
	        head.addChild(cube_r6);
	        setRotationAngle(cube_r6, 0.0F, 0.0F, 0.0F);
	        cube_r6.setTextureOffset(45, 159).addBox(-8.0F, -8.0F, 1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r7 = new ModelRenderer(this);
	        cube_r7.setRotationPoint(4.0F, -1.0F, 1.25F);
	        head.addChild(cube_r7);
	        setRotationAngle(cube_r7, 0.0F, 0.0F, 0.0F);
	        cube_r7.setTextureOffset(0, 0).addBox(-8.0F, -8.0F, 0.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);

	        cube_r8 = new ModelRenderer(this);
	        cube_r8.setRotationPoint(3.75F, -1.5F, -0.25F);
	        head.addChild(cube_r8);
	        setRotationAngle(cube_r8, 0.0F, 0.0F, 0.0F);
	        cube_r8.setTextureOffset(45, 159).addBox(-8.0F, -6.0F, 3.0F, 9.0F, 5.0F, 1.0F, 0.0F, false);

	        cube_r9 = new ModelRenderer(this);
	        cube_r9.setRotationPoint(4.0F, -3.5F, -6.0F);
	        head.addChild(cube_r9);
	        setRotationAngle(cube_r9, 0.0F, 0.0F, 0.0F);
	        cube_r9.setTextureOffset(45, 159).addBox(-5.0F, -6.0F, 2.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);

	        cube_r10 = new ModelRenderer(this);
	        cube_r10.setRotationPoint(-4.5F, 0.0F, 0.0F);
	        head.addChild(cube_r10);
	        setRotationAngle(cube_r10, 0.0F, 0.0F, 0.0F);
	        cube_r10.setTextureOffset(45, 159).addBox(0.0F, -8.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

	        cube_r11 = new ModelRenderer(this);
	        cube_r11.setRotationPoint(-4.75F, 0.0F, 0.0F);
	        head.addChild(cube_r11);
	        setRotationAngle(cube_r11, 0.0F, 0.0F, 0.0F);
	        cube_r11.setTextureOffset(45, 159).addBox(0.0F, -8.0F, -3.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);

	        cube_r12 = new ModelRenderer(this);
	        cube_r12.setRotationPoint(4.0F, -1.0F, 1.0F);
	        head.addChild(cube_r12);
	        setRotationAngle(cube_r12, 0.0F, 0.0F, 0.0F);
	        cube_r12.setTextureOffset(45, 159).addBox(-8.0F, -8.0F, -5.0F, 8.0F, 2.0F, 7.0F, 0.0F, false);

	        cube_r13 = new ModelRenderer(this);
	        cube_r13.setRotationPoint(3.0F, -1.0F, -7.25F);
	        head.addChild(cube_r13);
	        setRotationAngle(cube_r13, 0.0F, 0.0F, 0.0F);
	        cube_r13.setTextureOffset(45, 159).addBox(-6.0F, -8.0F, 3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);

	        cube_r14 = new ModelRenderer(this);
	        cube_r14.setRotationPoint(3.0F, 0.0F, -7.5F);
	        head.addChild(cube_r14);
	        setRotationAngle(cube_r14, 0.0F, 0.0F, 0.0F);
	        cube_r14.setTextureOffset(45, 159).addBox(-5.0F, -8.0F, 3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);

	        cube_r15 = new ModelRenderer(this);
	        cube_r15.setRotationPoint(4.0F, -1.0F, -7.5F);
	        head.addChild(cube_r15);
	        setRotationAngle(cube_r15, 0.0F, 0.0F, 0.0F);
	        cube_r15.setTextureOffset(45, 159).addBox(-5.0F, -8.0F, 3.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

	        cube_r16 = new ModelRenderer(this);
	        cube_r16.setRotationPoint(9.0F, -5.0F, -0.8F);
	        head.addChild(cube_r16);
	        setRotationAngle(cube_r16, 0.0F, 0.0F, 0.0F);
	        cube_r16.setTextureOffset(32, 112).addBox(-8.0F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

	        cube_r17 = new ModelRenderer(this);
	        cube_r17.setRotationPoint(5.0F, -5.0F, -0.8F);
	        head.addChild(cube_r17);
	        setRotationAngle(cube_r17, 0.0F, 0.0F, 0.0F);
	        cube_r17.setTextureOffset(32, 115).addBox(-8.0F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

	        cube_r18 = new ModelRenderer(this);
	        cube_r18.setRotationPoint(0.0F, -3.5F, -2.95F);
	        head.addChild(cube_r18);
	        setRotationAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
	        cube_r18.setTextureOffset(24, 125).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

	        cube_r19 = new ModelRenderer(this);
	        cube_r19.setRotationPoint(7.0F, -1.0F, -0.8F);
	        head.addChild(cube_r19);
	        setRotationAngle(cube_r19, 0.0F, 0.0F, 0.0F);
	        cube_r19.setTextureOffset(35, 115).addBox(-8.0F, -1.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);

	        cube_r20 = new ModelRenderer(this);
	        cube_r20.setRotationPoint(4.0F, 0.0F, 0.25F);
	        head.addChild(cube_r20);
	        setRotationAngle(cube_r20, 0.0F, 0.0F, 0.0F);
	        cube_r20.setTextureOffset(11, 118).addBox(-8.0F, -8.0F, -4.0F, 8.0F, 8.0F, 7.0F, 0.0F, false);

	        body = new ModelRenderer(this);
	        body.setRotationPoint(-6.5F, 9.6214F, 3.0035F);


	        cube_r21 = new ModelRenderer(this);
	        cube_r21.setRotationPoint(2.5F, 2.25F, -2.7F);
	        body.addChild(cube_r21);
	        setRotationAngle(cube_r21, 0.0F, 0.0F, 0.0F);
	        cube_r21.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);

	        cube_r22 = new ModelRenderer(this);
	        cube_r22.setRotationPoint(9.5F, 2.25F, -2.7F);
	        body.addChild(cube_r22);
	        setRotationAngle(cube_r22, 0.0F, 0.0F, 0.0F);
	        cube_r22.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);

	        cube_r23 = new ModelRenderer(this);
	        cube_r23.setRotationPoint(2.5F, 2.25F, -3.2F);
	        body.addChild(cube_r23);
	        setRotationAngle(cube_r23, 0.0F, 0.0F, 0.0F);
	        cube_r23.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);

	        cube_r24 = new ModelRenderer(this);
	        cube_r24.setRotationPoint(9.5F, 2.25F, -3.2F);
	        body.addChild(cube_r24);
	        setRotationAngle(cube_r24, 0.0F, 0.0F, 0.0F);
	        cube_r24.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);

	        cube_r25 = new ModelRenderer(this);
	        cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
	        body.addChild(cube_r25);
	        setRotationAngle(cube_r25, 0.0F, 0.0F, 0.0F);
	        cube_r25.setTextureOffset(127, 126).addBox(3.0F, -19.0F, 1.0F, 7.0F, 9.0F, 1.0F, 0.0F, false);
	        cube_r25.setTextureOffset(127, 126).addBox(0.0F, -19.0F, 1.0F, 13.0F, 7.0F, 1.0F, 0.0F, false);
	        cube_r25.setTextureOffset(127, 126).addBox(11.0F, -12.0F, -5.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
	        cube_r25.setTextureOffset(127, 126).addBox(1.0F, -19.0F, 1.0F, 11.0F, 8.0F, 1.0F, 0.0F, false);
	        cube_r25.setTextureOffset(127, 126).addBox(11.0F, -14.0F, -4.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);

	        cube_r26 = new ModelRenderer(this);
	        cube_r26.setRotationPoint(0.0F, 3.0F, -7.0F);
	        body.addChild(cube_r26);
	        setRotationAngle(cube_r26, 0.0F, 0.0F, 0.0F);
	        cube_r26.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);

	        cube_r27 = new ModelRenderer(this);
	        cube_r27.setRotationPoint(1.0F, 5.0F, -7.0F);
	        body.addChild(cube_r27);
	        setRotationAngle(cube_r27, 0.0F, 0.0F, 0.0F);
	        cube_r27.setTextureOffset(127, 126).addBox(0.0F, -11.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r28 = new ModelRenderer(this);
	        cube_r28.setRotationPoint(1.0F, 4.0F, -7.0F);
	        body.addChild(cube_r28);
	        setRotationAngle(cube_r28, 0.0F, 0.0F, 0.0F);
	        cube_r28.setTextureOffset(127, 126).addBox(-1.0F, -11.0F, 1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r29 = new ModelRenderer(this);
	        cube_r29.setRotationPoint(-1.0F, 2.0F, -7.0F);
	        body.addChild(cube_r29);
	        setRotationAngle(cube_r29, 0.0F, 0.0F, 0.0F);
	        cube_r29.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, 1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r30 = new ModelRenderer(this);
	        cube_r30.setRotationPoint(2.0F, 3.0F, -6.25F);
	        body.addChild(cube_r30);
	        setRotationAngle(cube_r30, 0.0F, 0.0F, 0.0F);
	        cube_r30.setTextureOffset(75, 119).addBox(-1.0F, -12.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

	        cube_r31 = new ModelRenderer(this);
	        cube_r31.setRotationPoint(-8.0F, -3.0F, -1.0F);
	        body.addChild(cube_r31);
	        setRotationAngle(cube_r31, 0.0F, 0.0F, 0.0F);
	        cube_r31.setTextureOffset(127, 126).addBox(6.0F, -16.0F, 1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

	        cube_r32 = new ModelRenderer(this);
	        cube_r32.setRotationPoint(-9.0F, -3.0F, -1.25F);
	        body.addChild(cube_r32);
	        setRotationAngle(cube_r32, 0.0F, 0.0F, 0.0F);
	        cube_r32.setTextureOffset(127, 126).addBox(6.0F, -14.0F, 1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

	        cube_r33 = new ModelRenderer(this);
	        cube_r33.setRotationPoint(-6.0F, -3.0F, -0.5F);
	        body.addChild(cube_r33);
	        setRotationAngle(cube_r33, 0.0F, 0.0F, 0.0F);
	        cube_r33.setTextureOffset(127, 126).addBox(5.0F, -18.0F, 1.0F, 2.0F, 8.0F, 1.0F, 0.0F, false);

	        cube_r34 = new ModelRenderer(this);
	        cube_r34.setRotationPoint(-5.0F, -3.0F, 0.0F);
	        body.addChild(cube_r34);
	        setRotationAngle(cube_r34, 0.0F, 0.0F, 0.0F);
	        cube_r34.setTextureOffset(127, 126).addBox(7.0F, -17.0F, 1.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);
	        cube_r34.setTextureOffset(127, 126).addBox(6.0F, -19.0F, 1.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);

	        cube_r35 = new ModelRenderer(this);
	        cube_r35.setRotationPoint(4.0F, -3.0F, 0.0F);
	        body.addChild(cube_r35);
	        setRotationAngle(cube_r35, 0.0F, 0.0F, 0.0F);
	        cube_r35.setTextureOffset(127, 126).addBox(5.0F, -19.0F, 1.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);

	        cube_r36 = new ModelRenderer(this);
	        cube_r36.setRotationPoint(5.0F, -3.0F, 0.0F);
	        body.addChild(cube_r36);
	        setRotationAngle(cube_r36, 0.0F, 0.0F, 0.0F);
	        cube_r36.setTextureOffset(127, 126).addBox(3.0F, -17.0F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);

	        cube_r37 = new ModelRenderer(this);
	        cube_r37.setRotationPoint(9.0F, -3.0F, -1.25F);
	        body.addChild(cube_r37);
	        setRotationAngle(cube_r37, 0.0F, 0.0F, 0.0F);
	        cube_r37.setTextureOffset(127, 126).addBox(6.0F, -14.0F, 1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

	        cube_r38 = new ModelRenderer(this);
	        cube_r38.setRotationPoint(8.0F, -3.0F, -1.0F);
	        body.addChild(cube_r38);
	        setRotationAngle(cube_r38, 0.0F, 0.0F, 0.0F);
	        cube_r38.setTextureOffset(127, 126).addBox(6.0F, -16.0F, 1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

	        cube_r39 = new ModelRenderer(this);
	        cube_r39.setRotationPoint(7.0F, -3.0F, -0.5F);
	        body.addChild(cube_r39);
	        setRotationAngle(cube_r39, 0.0F, 0.0F, 0.0F);
	        cube_r39.setTextureOffset(127, 126).addBox(5.0F, -18.0F, 1.0F, 2.0F, 8.0F, 1.0F, 0.0F, false);

	        cube_r40 = new ModelRenderer(this);
	        cube_r40.setRotationPoint(-1.0F, 0.0F, 0.0F);
	        body.addChild(cube_r40);
	        setRotationAngle(cube_r40, 0.0F, 0.0F, 0.0F);
	        cube_r40.setTextureOffset(127, 126).addBox(11.0F, -11.0F, -5.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

	        cube_r41 = new ModelRenderer(this);
	        cube_r41.setRotationPoint(-9.0F, 0.0F, 0.0F);
	        body.addChild(cube_r41);
	        setRotationAngle(cube_r41, 0.0F, 0.0F, 0.0F);
	        cube_r41.setTextureOffset(127, 126).addBox(11.0F, -11.0F, -5.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

	        cube_r42 = new ModelRenderer(this);
	        cube_r42.setRotationPoint(-10.0F, 0.0F, 0.0F);
	        body.addChild(cube_r42);
	        setRotationAngle(cube_r42, 0.0F, 0.0F, 0.0F);
	        cube_r42.setTextureOffset(127, 126).addBox(11.0F, -12.0F, -5.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
	        cube_r42.setTextureOffset(127, 126).addBox(11.0F, -14.0F, -4.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);

	        cube_r43 = new ModelRenderer(this);
	        cube_r43.setRotationPoint(-1.0F, 1.5F, -3.0F);
	        body.addChild(cube_r43);
	        setRotationAngle(cube_r43, 0.0F, 0.0F, 0.0F);
	        cube_r43.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

	        cube_r44 = new ModelRenderer(this);
	        cube_r44.setRotationPoint(-1.0F, 2.0F, -2.0F);
	        body.addChild(cube_r44);
	        setRotationAngle(cube_r44, 0.0F, 0.0F, 0.0F);
	        cube_r44.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, 1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r45 = new ModelRenderer(this);
	        cube_r45.setRotationPoint(0.0F, 6.0F, -2.0F);
	        body.addChild(cube_r45);
	        setRotationAngle(cube_r45, 0.0F, 0.0F, 0.0F);
	        cube_r45.setTextureOffset(127, 126).addBox(4.0F, -12.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r46 = new ModelRenderer(this);
	        cube_r46.setRotationPoint(0.0F, 2.0F, -1.0F);
	        body.addChild(cube_r46);
	        setRotationAngle(cube_r46, 0.0F, 0.0F, 0.0F);
	        cube_r46.setTextureOffset(127, 126).addBox(4.0F, -10.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
	        cube_r46.setTextureOffset(127, 126).addBox(1.0F, -12.0F, 1.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);

	        cube_r47 = new ModelRenderer(this);
	        cube_r47.setRotationPoint(0.0F, 5.0F, -2.0F);
	        body.addChild(cube_r47);
	        setRotationAngle(cube_r47, 0.0F, 0.0F, 0.0F);
	        cube_r47.setTextureOffset(127, 126).addBox(1.0F, -12.0F, 1.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r48 = new ModelRenderer(this);
	        cube_r48.setRotationPoint(0.0F, 3.0F, -2.0F);
	        body.addChild(cube_r48);
	        setRotationAngle(cube_r48, 0.0F, 0.0F, 0.0F);
	        cube_r48.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, 1.0F, 15.0F, 2.0F, 1.0F, 0.0F, false);

	        cube_r49 = new ModelRenderer(this);
	        cube_r49.setRotationPoint(10.0F, 2.0F, -2.0F);
	        body.addChild(cube_r49);
	        setRotationAngle(cube_r49, 0.0F, 0.0F, 0.0F);
	        cube_r49.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, 1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r50 = new ModelRenderer(this);
	        cube_r50.setRotationPoint(10.0F, 1.5F, -3.0F);
	        body.addChild(cube_r50);
	        setRotationAngle(cube_r50, 0.0F, 0.0F, 0.0F);
	        cube_r50.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

	        cube_r51 = new ModelRenderer(this);
	        cube_r51.setRotationPoint(10.0F, 2.0F, -7.0F);
	        body.addChild(cube_r51);
	        setRotationAngle(cube_r51, 0.0F, 0.0F, 0.0F);
	        cube_r51.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, 1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r52 = new ModelRenderer(this);
	        cube_r52.setRotationPoint(10.0F, 3.0F, -7.0F);
	        body.addChild(cube_r52);
	        setRotationAngle(cube_r52, 0.0F, 0.0F, 0.0F);
	        cube_r52.setTextureOffset(127, 126).addBox(-1.0F, -12.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);

	        cube_r53 = new ModelRenderer(this);
	        cube_r53.setRotationPoint(11.0F, 3.0F, -6.25F);
	        body.addChild(cube_r53);
	        setRotationAngle(cube_r53, 0.0F, 0.0F, 0.0F);
	        cube_r53.setTextureOffset(94, 119).addBox(-1.0F, -12.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

	        cube_r54 = new ModelRenderer(this);
	        cube_r54.setRotationPoint(10.0F, 4.0F, -7.0F);
	        body.addChild(cube_r54);
	        setRotationAngle(cube_r54, 0.0F, 0.0F, 0.0F);
	        cube_r54.setTextureOffset(127, 126).addBox(-1.0F, -11.0F, 1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r55 = new ModelRenderer(this);
	        cube_r55.setRotationPoint(10.0F, 5.0F, -7.0F);
	        body.addChild(cube_r55);
	        setRotationAngle(cube_r55, 0.0F, 0.0F, 0.0F);
	        cube_r55.setTextureOffset(127, 126).addBox(0.0F, -11.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

	        cube_r56 = new ModelRenderer(this);
	        cube_r56.setRotationPoint(9.5F, 2.6286F, -4.2535F);
	        body.addChild(cube_r56);
	        setRotationAngle(cube_r56, -0.0873F, 0.0F, 0.0F);
	        cube_r56.setTextureOffset(123, 73).addBox(-8.0F, -12.0F, -1.0F, 1.0F, 22.0F, 3.0F, 0.0F, false);
	        cube_r56.setTextureOffset(83, 74).addBox(-8.0F, -12.0F, -2.0F, 3.0F, 22.0F, 1.0F, 0.0F, false);
	        cube_r56.setTextureOffset(105, 74).addBox(-1.0F, -12.0F, -2.0F, 3.0F, 22.0F, 1.0F, 0.0F, false);

	        cube_r57 = new ModelRenderer(this);
	        cube_r57.setRotationPoint(9.5F, 2.3672F, 1.3421F);
	        body.addChild(cube_r57);
	        setRotationAngle(cube_r57, 0.0873F, 0.0F, 0.0F);
	        cube_r57.setTextureOffset(123, 73).addBox(-8.0F, -9.0F, -6.0F, 1.0F, 19.0F, 4.0F, 0.0F, false);
	        cube_r57.setTextureOffset(125, 72).addBox(1.0F, -9.0F, -6.0F, 1.0F, 19.0F, 4.0F, 0.0F, false);
	        cube_r57.setTextureOffset(126, 72).addBox(-8.0F, -12.0F, -2.0F, 10.0F, 22.0F, 1.0F, 0.0F, false);

	        cube_r58 = new ModelRenderer(this);
	        cube_r58.setRotationPoint(18.5F, 2.6286F, -4.2535F);
	        body.addChild(cube_r58);
	        setRotationAngle(cube_r58, -0.0873F, 0.0F, 0.0F);
	        cube_r58.setTextureOffset(124, 73).addBox(-8.0F, -12.0F, -1.0F, 1.0F, 22.0F, 3.0F, 0.0F, false);

	        cube_r59 = new ModelRenderer(this);
	        cube_r59.setRotationPoint(10.5F, 2.3786F, -3.0035F);
	        body.addChild(cube_r59);
	        setRotationAngle(cube_r59, 0.0F, 0.0F, 0.0F);
	        cube_r59.setTextureOffset(19, 82).addBox(-8.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

	        rightleg = new ModelRenderer(this);
	        rightleg.setRotationPoint(2.0F, 14.0F, 0.0F);


	        cube_r60 = new ModelRenderer(this);
	        cube_r60.setRotationPoint(2.0F, 10.0F, 0.0F);
	        rightleg.addChild(cube_r60);
	        setRotationAngle(cube_r60, 0.0F, 0.0F, 0.0F);
	        cube_r60.setTextureOffset(63, 82).addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

	        leftarm = new ModelRenderer(this);
	        leftarm.setRotationPoint(6.0F, 2.0F, 0.0F);


	        cube_r61 = new ModelRenderer(this);
	        cube_r61.setRotationPoint(0.0F, 0.0F, 0.0F);
	        leftarm.addChild(cube_r61);
	        setRotationAngle(cube_r61, 0.0F, 0.0F, 0.0F);
	        cube_r61.setTextureOffset(46, 100).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

	        rightarm = new ModelRenderer(this);
	        rightarm.setRotationPoint(-6.0F, 2.0F, 0.0F);


	        cube_r62 = new ModelRenderer(this);
	        cube_r62.setRotationPoint(2.0F, 10.0F, 0.0F);
	        rightarm.addChild(cube_r62);
	        setRotationAngle(cube_r62, 0.0F, 0.0F, 0.0F);
	        cube_r62.setTextureOffset(29, 100).addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
	    }

	@Override
	public void setRotationAngles(TimeLordEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		BipedModelPatcher.fixAllLimbs(head, body, leftarm, rightarm, leftleg, rightleg);
		super.setRotationAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

		if (entity.getRegenerating()) {
			double armShake = entity.getRNG().nextDouble();
			float armRotY = entity.getRegenTicks() * 1.5F;
			float armRotZ = entity.getRegenTicks() * 1.5F;
			float headRot = entity.getRegenTicks() * 1.5F;

			if (armRotY > 95) {
				armRotY = 95;
			}

			if (armRotZ > 95) {
				armRotZ = 95;
			}

			if (headRot > 45) {
				headRot = 45;
			}

			// ARMS
			bipedLeftArm.rotateAngleY = 0;
			bipedRightArm.rotateAngleY = 0;

			bipedLeftArm.rotateAngleX = 0;
			bipedRightArm.rotateAngleX = 0;

			bipedLeftArm.rotateAngleZ = (float) -Math.toRadians(armRotZ + armShake);
			bipedRightArm.rotateAngleZ = (float) Math.toRadians(armRotZ + armShake);
			bipedLeftArm.rotateAngleY = (float) -Math.toRadians(armRotY);
			bipedRightArm.rotateAngleY = (float) Math.toRadians(armRotY);

			// BODY
			bipedBody.rotateAngleX = 0;
			bipedBody.rotateAngleY = 0;
			bipedBody.rotateAngleZ = 0;

			// LEGS
			bipedLeftLeg.rotateAngleY = 0;
			bipedRightLeg.rotateAngleY = 0;

			bipedLeftLeg.rotateAngleX = 0;
			bipedRightLeg.rotateAngleX = 0;

			bipedLeftLeg.rotateAngleZ = (float) -Math.toRadians(5);
			bipedRightLeg.rotateAngleZ = (float) Math.toRadians(5);

			bipedHead.rotateAngleX = (float) Math.toRadians(-headRot);
			bipedHead.rotateAngleY = (float) Math.toRadians(0);
			bipedHead.rotateAngleZ = (float) Math.toRadians(0);
		}

		bipedHeadwear.showModel = false;
		this.head.copyModelAngles(this.bipedHead);
		this.leftarm.copyModelAngles(this.bipedLeftArm);
		this.rightarm.copyModelAngles(this.bipedRightArm);
		this.leftleg.copyModelAngles(this.bipedLeftLeg);
		this.rightleg.copyModelAngles(this.bipedRightLeg);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	protected ModelRenderer getArmForSide(HandSide side) {
		return side == HandSide.LEFT ? leftarm : rightarm;
	}

	@Override
	public void translateHand(HandSide sideIn, MatrixStack matrixStackIn) {
		super.translateHand(sideIn, matrixStackIn);
	}

	public ModelRenderer getHead() {
		return head;
	}

}
