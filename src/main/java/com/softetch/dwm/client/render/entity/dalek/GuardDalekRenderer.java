package com.softetch.dwm.client.render.entity.dalek;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.dalek.GuardDalekModel;
import com.softetch.dwm.common.entity.dalek.GuardDalekEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class GuardDalekRenderer extends LivingRenderer<GuardDalekEntity, GuardDalekModel> {
    /**
     * Set up the properties required to render the entity
     * @param entityRendererManager - the manager class for entity rendering
     */
    public GuardDalekRenderer(EntityRendererManager entityRendererManager) {
        super(entityRendererManager, new GuardDalekModel(), 1.0f);
    }

    /**
     * Getter for the entity's texture
     * @param dalekEntity - the dalek entity being rendered
     * @return the texture of the entity
     */
    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(GuardDalekEntity dalekEntity) {
        return new ResourceLocation(DWMMain.MOD_ID, "textures/entity/dalek/guard_dalek.png");
    }

}
