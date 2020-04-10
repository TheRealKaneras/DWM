package com.softetch.dwm.client.render.entity.dalek;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.dalek.InvasionDalekModel;
import com.softetch.dwm.common.entity.dalek.InvasionDalekEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class InvasionDalekRenderer extends LivingRenderer<InvasionDalekEntity, InvasionDalekModel> {
    /**
     * Set up the properties required to render the entity
     * @param entityRendererManager - the manager class for entity rendering
     */
    public InvasionDalekRenderer(EntityRendererManager entityRendererManager) {
        super(entityRendererManager, new InvasionDalekModel(), 1.0f);
    }

    /**
     * Getter for the entity's texture
     * @param dalekEntity - the dalek entity being rendered
     * @return the texture of the entity
     */
    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(InvasionDalekEntity dalekEntity) {
        return new ResourceLocation(DWMMain.MOD_ID, "textures/entity/dalek/invasion_dalek.png");
    }

}
