package com.softetch.dwm.client.render.entity;

import com.softetch.dwm.client.model.entity.ModelDalekBase;
import com.softetch.dwm.common.entity.BaseDalekEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

/**
 * Render class for the base dalek entity.
 */
public class RenderBaseDalek extends LivingRenderer<BaseDalekEntity, ModelDalekBase> {
    private ResourceLocation entityTexture;

    /**
     * Set up the properties required to render the entity
     * @param entityRendererManager
     */
    public RenderBaseDalek(EntityRendererManager entityRendererManager, ResourceLocation entityTexture) {
        super(entityRendererManager, new ModelDalekBase(), 1.0f);
        this.entityTexture = entityTexture;
    }

    /**
     * Getter for the entity's texture
     * @param baseDalekEntity - the dalek entity being rendered
     * @return the texture of the entity
     */
    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(BaseDalekEntity baseDalekEntity) {
        return entityTexture;
    }


}
