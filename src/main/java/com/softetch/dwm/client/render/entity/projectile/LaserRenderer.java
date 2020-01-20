package com.softetch.dwm.client.render.entity.projectile;

import com.mojang.blaze3d.platform.GlStateManager;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.projectile.LaserModel;
import com.softetch.dwm.common.entity.projectile.LaserEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;

public class LaserRenderer extends EntityRenderer<LaserEntity> implements IEntityRenderer<LaserEntity, LaserModel> {

    private LaserModel laserModel;
    public LaserRenderer(EntityRendererManager renderManager) {
        super(renderManager);
        this.laserModel = new LaserModel();
    }


    @Override
    public void doRender(LaserEntity entity, double x, double y, double z, float entityYaw, float partialTicks) {
        System.out.println("rendering");
        GlStateManager.pushMatrix();
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.disableLighting();
        GlStateManager.translatef((float)x, (float)y, (float)z);
        GlStateManager.rotatef(MathHelper.lerp(partialTicks, entity.prevRotationYaw, entity.rotationYaw) - 90.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotatef(MathHelper.lerp(partialTicks, entity.prevRotationPitch, entity.rotationPitch), 0.0F, 0.0F, 1.0F);
        GlStateManager.enableRescaleNormal();
        bindEntityTexture(entity);
        GlStateManager.pushMatrix();

        laserModel.render(0.0625f);

        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(LaserEntity entity) {
        return new ResourceLocation(DWMMain.MOD_ID, "textures/entity/laser.png");
    }

    @Override
    public LaserModel getEntityModel() {
        return new LaserModel();
    }
}
