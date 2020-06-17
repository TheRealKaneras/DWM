package com.softetch.dwm.client.render.entity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.TellerModel;
import com.softetch.dwm.common.entity.TellerEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TellerRenderer extends MobRenderer<TellerEntity, TellerModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(DWMMain.MOD_ID, "textures/entity/teller.png");

    public TellerRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new TellerModel(), 0.6f);

    }

    /**
     * Returns the location of an entity's texture.
     *
     * @param entity
     */
    @Override
    public ResourceLocation getEntityTexture(TellerEntity entity) {
        return TEXTURE;
    }
}
