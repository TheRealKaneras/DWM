package com.softetch.dwm.client.model.clothing;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.player.PlayerEntity;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class FezModel extends BipedModel<PlayerEntity> {
    private final Color color;
    private final RendererModel sides;
    private final RendererModel string;

    public FezModel(Color color) {
        this.color = color;
        textureWidth = 32;
        textureHeight = 32;

        sides = new RendererModel(this);
        sides.setRotationPoint(0.0F, 0.0F, 0.0F);
        sides.cubeList.add(new ModelBox(sides, 0, 0, -4.25F, -14.0F, -3.5F, 8, 1, 8, 0.0F, false));
        sides.cubeList.add(new ModelBox(sides, 0, 0, -4.25F, -13.0F, -3.75F, 8, 5, 1, 0.0F, false));
        sides.cubeList.add(new ModelBox(sides, 8, 9, -4.25F, -13.0F, 3.75F, 8, 5, 1, 0.0F, false));
        sides.cubeList.add(new ModelBox(sides, 0, 2, 3.25F, -13.0F, -3.5F, 1, 5, 8, 0.0F, false));
        sides.cubeList.add(new ModelBox(sides, 0, 2, -4.5F, -13.0F, -3.5F, 1, 5, 8, 0.0F, false));

        string = new RendererModel(this);
        string.setRotationPoint(0.0F, 0.0F, 0.0F);
        string.cubeList.add(new ModelBox(string, 0, 30, -1.0F, -15.0F, 0.0F, 5, 1, 1, 0.0F, false));
        string.cubeList.add(new ModelBox(string, 0, 28, 3.75F, -14.0F, 0.5F, 1, 3, 1, 0.0F, false));
    }

    @Override
    public void render(PlayerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.sides.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.sides.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.string.rotateAngleY = this.sides.rotateAngleY;
        this.string.rotateAngleX = this.sides.rotateAngleX;
        GL11.glPushMatrix();
        if (entity.shouldRenderSneaking()) {
            GlStateManager.translatef(0.0F, 0.2F, 0.0F);
        }
        GL11.glPushMatrix();
        GL11.glColor3d(color.getRed() / 255.0, color.getGreen() / 255.0, color.getBlue() / 255.0);
        sides.render(scale);
        GL11.glPopMatrix();
        string.render(scale);
        GL11.glPopMatrix();
    }

    public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}