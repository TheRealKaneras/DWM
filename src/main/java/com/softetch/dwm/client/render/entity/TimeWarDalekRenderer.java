package com.softetch.dwm.client.render.entity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.TimeWarDalekModel;
import com.softetch.dwm.common.entity.TimeWarDalekEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

/**
 * Render class for the time war dalek entity.
 */
@OnlyIn(Dist.CLIENT)
public class TimeWarDalekRenderer extends LivingRenderer<TimeWarDalekEntity, TimeWarDalekModel> {

    /**
     * Set up the properties required to render the entity
     * @param entityRendererManager - the manager class for entity rendering
     */
    public TimeWarDalekRenderer(EntityRendererManager entityRendererManager) {
        super(entityRendererManager, new TimeWarDalekModel(), 1.0f);
    }

    /**
     * Getter for the entity's texture
     * @param timeWarDalekEntity - the dalek entity being rendered
     * @return the texture of the entity
     */
    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(TimeWarDalekEntity timeWarDalekEntity) {
        return new ResourceLocation(DWMMain.MOD_ID, "textures/entity/time_war_dalek.png");
    }


}
