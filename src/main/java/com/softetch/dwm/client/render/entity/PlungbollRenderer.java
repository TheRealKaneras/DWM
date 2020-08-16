package com.softetch.dwm.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.PlungbollModel;
import com.softetch.dwm.common.entity.PlungbollEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PlungbollRenderer extends MobRenderer<PlungbollEntity, PlungbollModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll.png");

    public PlungbollRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PlungbollModel(), 0.25F);
    }

    @Override
    protected void preRenderCallback(PlungbollEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scaleFactor = 1.0f + 0.255f * (float) entity.getPlungbollSize();
        matrixStack.scale(scaleFactor, scaleFactor, scaleFactor);
        int color = entity.getPlungbollColor();
        int red = (color >> 16) & 0xFF;
        int green = (color >> 8) & 0xFF;
        int blue = color & 0xFF;
        RenderSystem.color3f((float) red / 255.0f, (float) green / 255.0f, (float) blue / 255.0f);
    }



    /**
     * Returns the location of an entity's texture.
     *
     * @param entity
     */
    @Override
    public ResourceLocation getEntityTexture(PlungbollEntity entity) {
        return TEXTURE;
    }
}
