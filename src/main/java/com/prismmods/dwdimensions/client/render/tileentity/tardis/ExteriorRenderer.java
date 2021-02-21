package com.prismmods.dwdimensions.client.render.tileentity.tardis;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.common.tileentities.TardisTileEntity;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class ExteriorRenderer extends TileEntityRenderer<TardisTileEntity> {

    private static final TardisTennantModel modelA = new TardisTennantModel();

    protected static ResourceLocation TEXTURE = new ResourceLocation(DWDimensions.MOD_ID, "textures/blocks/tardis/exterior/tennant_on.png");

    public ExteriorRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    public static ResourceLocation getTexture() {
        return TEXTURE;
    }

    @Override
    public void render(TardisTileEntity tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {

        TardisTileEntity.EnumChameleon objectChameleon = tileEntityIn.getActiveChameleon();
        TardisTileEntity.EnumDoorState doorState = tileEntityIn.getDoorState();
        int intDoorState = tileEntityIn.getIntForDoorState(doorState);

        boolean isSnowy = tileEntityIn.getSnowy();
        boolean lightsOn = tileEntityIn.getLightsStatus();
        float rotation = tileEntityIn.getRotation();

        matrixStackIn.push();
        matrixStackIn.translate(0.5f, 1.5f, 0.5f);
        matrixStackIn.scale(1.0f, 1.0f, 1.0f);
        
        matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));
        matrixStackIn.rotate(Vector3f.YP.rotationDegrees(rotation));

        switch (objectChameleon) {
            case TENNANT:
                if (lightsOn) {
                    TEXTURE = new ResourceLocation(DWDimensions.MOD_ID, "textures/blocks/tardis/exterior/tennant_on.png");
                } else {
                    TEXTURE = new ResourceLocation(DWDimensions.MOD_ID, "textures/blocks/tardis/exterior/tennant_off.png");
                }
                IVertexBuilder renderBufferE = bufferIn.getBuffer(modelA.getRenderType(TEXTURE));
                modelA.render(matrixStackIn, renderBufferE, combinedLightIn, combinedOverlayIn, 1.0f, 1.0f, 1.0f, 1.0f, intDoorState, isSnowy);
                break;
            default:
                System.out.println("Unexpected chameleon: " + objectChameleon);
        }
        matrixStackIn.pop();
        
        //Code for text - not gonna be used for now but here in case
        /*
        matrixStackIn.push();
        matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));
        matrixStackIn.rotate(Vector3f.YP.rotationDegrees(rotation));
        matrixStackIn.translate(0.0f, -2.43f, -1.27f);
        matrixStackIn.scale(0.015f, 0.015f, 0.015f);
        FontRenderer fontRender = this.renderDispatcher.fontRenderer;
        String content = "P'lice box innit";
        fontRender.renderString(TextFormatting.YELLOW+content, 0, 0, 0xffffff, false, matrixStackIn.getLast().getMatrix(), bufferIn, false, 0, combinedLightIn);
        matrixStackIn.pop();
        */
    }

    @Override
    public boolean isGlobalRenderer(TardisTileEntity te) {
        return true;
    }

}
