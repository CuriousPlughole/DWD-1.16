package com.prismmods.dwdimensions.world.gallifrey.render;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.prismmods.dwdimensions.DWDimensions;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ISkyRenderHandler;

@OnlyIn(Dist.CLIENT)
public class GallifreySkyRenderer implements ISkyRenderHandler {

	public static GallifreySkyRenderer INSTANCE = new GallifreySkyRenderer();
	private static VertexFormat FORMAT = DefaultVertexFormats.POSITION_COLOR;
	private static VertexBuffer STAR_VBO;
	private static VertexBuffer SUN_VBO;

	//This crashes at the moment so 
	private boolean shouldRender = false;

	@SuppressWarnings("deprecation")
	@Override
	public void render(int ticks, float partialTicks, MatrixStack matrixStack, ClientWorld world, Minecraft mc) {

		if (!this.shouldRender)
			return;

		matrixStack.push();
		RenderSystem.disableFog();
		RenderSystem.disableTexture();
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA,
				GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE,
				GlStateManager.DestFactor.ZERO);
		RenderHelper.disableStandardItemLighting();
		RenderSystem.depthMask(false);

		/*
		if (STAR_VBO == null) {
			STAR_VBO = new VertexBuffer(FORMAT);
			STAR_VBO.bindBuffer();
			BufferBuilder bb = Tessellator.getInstance().getBuffer();
			this.renderSky(bb);

			bb.finishDrawing();
			bb.reset();
			STAR_VBO.upload(bb);
			VertexBuffer.unbindBuffer();
		} else {
			STAR_VBO.bindBuffer();
			this.drawData(matrixStack.getLast().getMatrix());
			VertexBuffer.unbindBuffer();
		}*/

		RenderSystem.enableTexture();
		matrixStack.push();

		float rotationDeg = (float) (world.getDimensionType().getCelestrialAngleByTime(world.func_241851_ab()) * 360.0);
		matrixStack.rotate(Vector3f.XP.rotationDegrees(rotationDeg));
		Minecraft.getInstance().getTextureManager()
				.bindTexture(new ResourceLocation(DWDimensions.MOD_ID, "textures/sky/gallifrey_sun.png"));

		if (SUN_VBO == null) {
			SUN_VBO = new VertexBuffer(DefaultVertexFormats.POSITION_TEX);
			SUN_VBO.bindBuffer();

			BufferBuilder bb = Tessellator.getInstance().getBuffer();
			bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);

			SkyObject sun = new SkyObject();
			sun.setHorizontalUVs(0, 0, 0.08f, 0.08f);
			sun.setVerticalUVs(0.1f, 0, 0.19f, 0.08f);
			
			this.renderSkyObject(bb, 45, -26, -40, 25, sun);
			
			bb.finishDrawing();
			bb.reset();
			SUN_VBO.upload(bb);
			VertexBuffer.unbindBuffer();
		} else {
			SUN_VBO.bindBuffer();
			this.drawSkyObjectData(matrixStack.getLast().getMatrix());
			VertexBuffer.unbindBuffer();
		}
		
		matrixStack.pop();
		
		RenderSystem.depthMask(true);
		RenderSystem.enableFog();
		matrixStack.pop();

	}

	@SuppressWarnings("deprecation")
	public void drawSkyObjectData(Matrix4f matrix) {
		VertexFormat format = DefaultVertexFormats.POSITION_TEX;
		GlStateManager.vertexPointer(3, GL11.GL_FLOAT, format.getSize(), 0);
		GlStateManager.texCoordPointer(2, GL11.GL_FLOAT, format.getSize(), format.getOffset(0));
		GlStateManager.enableClientState(GL11.GL_VERTEX_ARRAY);
		GlStateManager.enableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
		GlStateManager.enableClientState(GL11.GL_COLOR_ARRAY);
		SUN_VBO.draw(matrix, GL11.GL_QUADS);
        GlStateManager.disableClientState(GL11.GL_VERTEX_ARRAY);
        GlStateManager.disableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
        GlStateManager.disableClientState(GL11.GL_COLOR_ARRAY);
	}

	@SuppressWarnings("deprecation")
	public void drawData(Matrix4f matrixIn) {
		GlStateManager.vertexPointer(3, GL11.GL_FLOAT, FORMAT.getSize(), 0);
		GlStateManager.colorPointer(4, GL11.GL_UNSIGNED_BYTE, FORMAT.getSize(), FORMAT.getOffset(0));

		GlStateManager.enableClientState(GL11.GL_VERTEX_ARRAY);
		GlStateManager.enableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
		GlStateManager.enableClientState(GL11.GL_COLOR_ARRAY);
		STAR_VBO.draw(matrixIn, GL11.GL_QUADS);
		GlStateManager.disableClientState(GL11.GL_VERTEX_ARRAY);
		GlStateManager.disableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
		GlStateManager.disableClientState(GL11.GL_COLOR_ARRAY);
	}

	public void renderSky(BufferBuilder bb) {
		bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_COLOR);
		Random rand = new Random(34534L);
		int skySize = 190;
		for (int i = 0; i < 1000; ++i) {
			this.renderStarUp(bb, skySize - rand.nextFloat() * (skySize * 2), skySize,
					skySize - rand.nextFloat() * (skySize * 2));
		}

		for (int i = 0; i < 1000; ++i) {
			this.renderStarSouth(bb, skySize - rand.nextFloat() * (skySize * 2),
					skySize - rand.nextFloat() * (skySize * 2), skySize);
		}

		for (int i = 0; i < 1000; ++i) {
			this.renderStarWest(bb, -skySize, skySize - rand.nextFloat() * (skySize * 2),
					skySize - rand.nextFloat() * (skySize * 2));
		}

		for (int i = 0; i < 1000; ++i) {
			this.renderStarNorth(bb, skySize - rand.nextFloat() * (skySize * 2),
					skySize - rand.nextFloat() * (skySize * 2), -skySize);
		}

		for (int i = 0; i < 1000; ++i) {
			this.renderStarEast(bb, skySize, skySize - rand.nextFloat() * (skySize * 2),
					skySize - rand.nextFloat() * (skySize * 2));
		}

		for (int i = 0; i < 1000; ++i) {
			this.renderStarDown(bb, skySize - rand.nextFloat() * (skySize * 2), -skySize,
					skySize - rand.nextFloat() * (skySize * 2));
		}

	}

	public void renderStarUp(BufferBuilder bb, float x, float y, float z) {
		float size = 0.5F;
		bb.pos(x, y, z).color(1F, 1, 1, 1).endVertex();
		bb.pos(x + size, y, z).color(1F, 1, 1, 1).endVertex();
		bb.pos(x + size, y, z + size).color(1F, 1, 1, 1).endVertex();
		bb.pos(x, y, z + size).color(1F, 1, 1, 1).endVertex();
	}

	public void renderStarSouth(BufferBuilder bb, float x, float y, float z) {
		float size = 0.5F;
		bb.pos(x, y, z).color(1F, 1, 1, 1).endVertex();
		bb.pos(x, y + size, z).color(1F, 1, 1, 1).endVertex();
		bb.pos(x + size, y + size, z).color(1F, 1, 1, 1).endVertex();
		bb.pos(x + size, y, z).color(1F, 1, 1, 1).endVertex();
	}

	public void renderStarWest(BufferBuilder bb, float x, float y, float z) {
		float size = 0.5F;
		bb.pos(x, y, z).color(1F, 1, 1, 1).endVertex();
		bb.pos(x, y, z - size).color(1F, 1, 1, 1).endVertex();
		bb.pos(x, y + size, z - size).color(1F, 1, 1, 1).endVertex();
		bb.pos(x, y + size, z).color(1F, 1, 1, 1).endVertex();
	}

	public void renderStarNorth(BufferBuilder bb, float x, float y, float z) {
		float size = 0.5F;
		bb.pos(x, y, z).color(1F, 1, 1, 1).endVertex();
		bb.pos(x, y + size, z).color(1F, 1, 1, 1).endVertex();
		bb.pos(x - size, y + size, z).color(1F, 1, 1, 1).endVertex();
		bb.pos(x - size, y, z).color(1F, 1, 1, 1).endVertex();
	}

	public void renderStarEast(BufferBuilder bb, float x, float y, float z) {
		float size = 0.5F;
		bb.pos(x, y, z).color(1F, 1, 1, 1).endVertex();
		bb.pos(x, y + size, z).color(1F, 1, 1, 1).endVertex();
		bb.pos(x, y + size, z - size).color(1F, 1, 1, 1).endVertex();
		bb.pos(x, y, z - size).color(1F, 1, 1, 1).endVertex();
	}

	public void renderStarDown(BufferBuilder bb, float x, float y, float z) {
		float size = 0.5F;
		bb.pos(x, y, z).color(1F, 1, 1, 1).endVertex();
		bb.pos(x, y, z + size).color(1F, 1, 1, 1).endVertex();
		bb.pos(x + size, y, z + size).color(1F, 1, 1, 1).endVertex();
		bb.pos(x + size, y, z).color(1F, 1, 1, 1).endVertex();
	}

	public void renderSkyObject(BufferBuilder bb, float x, float y, float z, double size, SkyObject obj) {
		// NORTH
		bb.pos(x, y, z).tex(obj.maxHU, obj.minHV).endVertex();
		bb.pos(x, y + size, z).tex(obj.maxHU, obj.maxHV).endVertex();
		bb.pos(x - size, y + size, z).tex(obj.minHU, obj.maxHV).endVertex();
		bb.pos(x - size, y, z).tex(obj.minHU, obj.minHV).endVertex();

		// UP
		bb.pos(x - size, y + size, z - size).tex(obj.minVU, obj.minVV).endVertex();
		bb.pos(x - size, y + size, z).tex(obj.minVU, obj.maxVV).endVertex();
		bb.pos(x, y + size, z).tex(obj.maxVU, obj.maxVV).endVertex();
		bb.pos(x, y + size, z - size).tex(obj.maxVU, obj.minVV).endVertex();

		// East
		bb.pos(x, y, z - size).tex(obj.minHU, obj.minHV).endVertex();
		bb.pos(x, y + size, z - size).tex(obj.minHU, obj.maxHV).endVertex();
		bb.pos(x, y + size, z).tex(obj.maxHU, obj.maxHV).endVertex();
		bb.pos(x, y, z).tex(obj.maxHU, obj.minHV).endVertex();

		// West
		bb.pos(x - size, y, z).tex(obj.minHU, obj.minHV).endVertex();
		bb.pos(x - size, y + size, z).tex(obj.minHU, obj.maxHV).endVertex();
		bb.pos(x - size, y + size, z - size).tex(obj.maxHU, obj.maxHV).endVertex();
		bb.pos(x - size, y, z - size).tex(obj.maxHU, obj.minHV).endVertex();

		// SOUTH
		bb.pos(x - size, y, z - size).tex(obj.minHU, obj.minHV).endVertex();
		bb.pos(x - size, y + size, z - size).tex(obj.minHU, obj.maxHV).endVertex();
		bb.pos(x, y + size, z - size).tex(obj.maxHU, obj.maxHV).endVertex();
		bb.pos(x, y, z - size).tex(obj.maxHU, obj.minHV).endVertex();

		// Down
		bb.pos(x, y, z - size).tex(obj.maxVU, obj.minVV).endVertex();
		bb.pos(x, y, z).tex(obj.maxVU, obj.maxVV).endVertex();
		bb.pos(x - size, y, z).tex(obj.minVU, obj.maxVV).endVertex();
		bb.pos(x - size, y, z - size).tex(obj.minVU, obj.minVV).endVertex();

	}

}
