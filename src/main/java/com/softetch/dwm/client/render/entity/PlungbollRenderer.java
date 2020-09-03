package com.softetch.dwm.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.PlungbollModel;
import com.softetch.dwm.common.entity.PlungbollEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PlungbollRenderer extends MobRenderer<PlungbollEntity, PlungbollModel> {
    private static final ResourceLocation[] TEXTURES = new ResourceLocation[]{
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_0.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_1.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_2.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_3.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_4.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_5.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_6.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_7.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_8.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_9.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_10.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_11.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_12.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_13.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_14.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/plungboll/plungboll_15.png")
    };

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
        RenderSystem.pushMatrix();
        RenderSystem.color3f((float) red / 255.0f, (float) green / 255.0f, (float) blue / 255.0f);
    }

    @Override
    public void render(PlungbollEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        RenderSystem.popMatrix();
    }

    /**
     * Returns the location of an entity's texture.
     *
     * @param entity
     */
    @Override
    public ResourceLocation getEntityTexture(PlungbollEntity entity) {
        return TEXTURES[entity.getPlungbollColor()];
    }
}
