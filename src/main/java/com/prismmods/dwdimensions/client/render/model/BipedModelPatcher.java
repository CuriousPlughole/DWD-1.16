package com.prismmods.dwdimensions.client.render.model;

import net.minecraft.client.renderer.model.ModelRenderer;

/* Created by Craig on 30/01/2021 */
public class BipedModelPatcher {

    /* Just so you know, I hate everything this class is, everything it stands for, and I want to shoot myself so many times*/

    public static void fixLimb(ModelRenderer modelRenderer, Limb limb){
        switch (limb){
            case HEAD:
            case BODY:
                modelRenderer.rotateAngleX = 0;
                modelRenderer.rotateAngleY = 24;
                modelRenderer.rotateAngleZ = 0;
                return;
            case LEFT_ARM:
                modelRenderer.rotateAngleX = -5;
                modelRenderer.rotateAngleY = 21.5F;
                modelRenderer.rotateAngleZ = 0;
                return;
            case LEFT_LEG:
                modelRenderer.rotateAngleX = -1.9F;
                modelRenderer.rotateAngleY = 12;
                modelRenderer.rotateAngleZ = 0;
                return;
            case RIGHT_ARM:
                modelRenderer.rotateAngleX = 5;
                modelRenderer.rotateAngleY = 21.5F;
                modelRenderer.rotateAngleZ = 0;
                return;
            case RIGHT_LEG:
                modelRenderer.rotateAngleX = 1.9F;
                modelRenderer.rotateAngleY = 12;
                modelRenderer.rotateAngleZ = 0;
                return;
        }
    }

    public static void fixAllLimbs(ModelRenderer head, ModelRenderer body, ModelRenderer left_arm, ModelRenderer right_arm, ModelRenderer left_leg, ModelRenderer right_leg){
        fixLimb(head, Limb.HEAD);
        //fixStupidBipeds(body, Limb.BODY);
        fixLimb(left_arm, Limb.LEFT_ARM);
        fixLimb(right_arm, Limb.RIGHT_ARM);
        fixLimb(left_leg, Limb.LEFT_LEG);
        fixLimb(right_leg, Limb.RIGHT_LEG);
    }

    public enum Limb {
        HEAD, BODY, RIGHT_LEG, LEFT_LEG, RIGHT_ARM, LEFT_ARM
    }

}
