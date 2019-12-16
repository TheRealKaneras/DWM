package com.softetch.dwm.client.render.entity;

import com.softetch.dwm.client.model.entity.ModelDalekBase;
import com.softetch.dwm.common.entity.BaseDalekEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

/**
 * Render class for the base dalek entity.
 */
@OnlyIn(Dist.CLIENT)
public class RenderBaseDalek extends LivingRenderer<BaseDalekEntity, ModelDalekBase> {
    private ResourceLocation entityTexture;

    /**
     * Set up the properties required to render the entity
     * @param entityRendererManager - the manager class for entity rendering
     * @param entityTexture - the main texture of the entity to be rendered
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
