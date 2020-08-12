package com.softetch.dwm.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.FlutterwingModel;
import com.softetch.dwm.common.entity.FlutterwingEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class FlutterwingRenderer extends MobRenderer<FlutterwingEntity, FlutterwingModel> {
    private static final ResourceLocation[] FLUTTERWING_TEXTURES = new ResourceLocation[] {
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/flutterwing/flutterwing_0.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/flutterwing/flutterwing_1.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/flutterwing/flutterwing_2.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/flutterwing/flutterwing_3.png")
    };

    public FlutterwingRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new FlutterwingModel(), 0.9f);
    }

    /**
     * Returns the location of an entity's texture.
     */
    public ResourceLocation getEntityTexture(FlutterwingEntity entity) {
        return FLUTTERWING_TEXTURES[entity.getVariant()];
    }

    protected void applyRotations(FlutterwingEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        if (entityLiving.isHanging()) {
            matrixStackIn.translate(0.0D, -0.1F, 0.0D);
        } else {
            matrixStackIn.translate(0.0D, MathHelper.cos(ageInTicks * 0.3F) * 0.1F, 0.0D);
        }

        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
    }
}
