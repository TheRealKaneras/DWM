package com.softetch.dwm.client.render.entity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.AdiposeModel;
import com.softetch.dwm.common.entity.AdiposeEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

/**
 * Holds all the render properties for adipose
 */
public class AdiposeRenderer extends LivingRenderer<AdiposeEntity, AdiposeModel> {

    /**
     * Set up the properties required to render the entity
     * @param entityRendererManager - the manager class for entity rendering
     */
    public AdiposeRenderer(EntityRendererManager entityRendererManager) {
        super(entityRendererManager, new AdiposeModel(), 0.4f);
    }
    /**
     * Getter for the entity's texture
     * @param entity - the entity being rendered
     * @return the texture of the entity
     */
    @Nullable
    @Override
    public ResourceLocation getEntityTexture(AdiposeEntity entity) {
        return new ResourceLocation(DWMMain.MOD_ID, "textures/entity/adipose.png");
    }

}

