package com.softetch.dwm.client.render.entity.projectile;

import com.mojang.blaze3d.platform.GlStateManager;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.projectile.LaserModel;
import com.softetch.dwm.common.entity.projectile.LaserEntity;
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
    public void doRender(LaserEntity entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        GlStateManager.translated(x, y - 1.5D, z);
        GlStateManager.enableNormalize();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.rotatef(entity.rotationYaw, 0.0F, 1.0F, 0.0F);
        bindEntityTexture(entity);
        this.laserModel.renderLaser(0.0625F);
        GlStateManager.disableNormalize();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(LaserEntity entity) {
        return new ResourceLocation(DWMMain.MOD_ID, "textures/entity/projectile/laser.png");
    }
}
