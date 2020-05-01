package com.softetch.dwm.client.render.entity.projectile;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.projectile.LaserModel;
import com.softetch.dwm.common.entity.projectile.LaserEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;

public class LaserRenderer extends EntityRenderer<LaserEntity> {
    private final LaserModel laserModel;

    public LaserRenderer(EntityRendererManager renderManager) {
        super(renderManager);
        this.laserModel = new LaserModel();
    }

    @Override
    public void render(LaserEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        RenderSystem.pushMatrix();
        RenderSystem.translated(0.0D, -1.5D, 0.0D);
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        RenderSystem.rotatef(entity.rotationYaw, 0.0F, 1.0F, 0.0F);
        IVertexBuilder vertexBuilder = bufferIn.getBuffer(RenderType.getEntityCutoutNoCull(getEntityTexture(entity)));
        this.laserModel.render(matrixStackIn, vertexBuilder, packedLightIn, 0, 1.0f, 1.0f, 1.0f,1.0f);
        RenderSystem.disableBlend();
        RenderSystem.popMatrix();
    }


    @Nullable
    @Override
    public ResourceLocation getEntityTexture(LaserEntity entity) {
        return new ResourceLocation(DWMMain.MOD_ID, "textures/entity/projectile/laser.png");
    }
}
