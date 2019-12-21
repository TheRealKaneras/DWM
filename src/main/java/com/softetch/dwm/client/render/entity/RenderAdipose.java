package com.softetch.dwm.client.render.entity;

import com.softetch.dwm.client.model.entity.ModelAdipose;
import com.softetch.dwm.common.entity.AdiposeEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

/**
 * Holds all the render properties for adipose
 */
public class RenderAdipose extends LivingRenderer<AdiposeEntity, ModelAdipose> {
    private ResourceLocation entityTexture;

    /**
     * Set up the properties required to render the entity
     * @param entityRendererManager - the manager class for entity rendering
     * @param entityTexture - the main texture of the entity to be rendered
     */
    public RenderAdipose(EntityRendererManager entityRendererManager, ResourceLocation entityTexture) {
        super(entityRendererManager, new ModelAdipose(), 1.0f);
        this.entityTexture = entityTexture;
    }
    /**
     * Getter for the entity's texture
     * @param entity - the entity being rendered
     * @return the texture of the entity
     */
    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(AdiposeEntity entity) {
        return entityTexture;
    }

}

