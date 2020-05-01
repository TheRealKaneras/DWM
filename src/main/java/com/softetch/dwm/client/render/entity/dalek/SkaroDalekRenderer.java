package com.softetch.dwm.client.render.entity.dalek;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.dalek.SkaroDalekModel;
import com.softetch.dwm.common.entity.dalek.SkaroDalekEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

/**
 * Render class for the time war dalek entity.
 */
@OnlyIn(Dist.CLIENT)
public class SkaroDalekRenderer extends MobRenderer<SkaroDalekEntity, SkaroDalekModel> {

    /**
     * Set up the properties required to render the entity
     * @param entityRendererManager - the manager class for entity rendering
     */
    public SkaroDalekRenderer(EntityRendererManager entityRendererManager) {
        super(entityRendererManager, new SkaroDalekModel(), 1.0f);

    }

    /**
     * Getter for the entity's texture
     * @param dalekEntity - the dalek entity being rendered
     * @return the texture of the entity
     */
    @Nullable
    @Override
    public ResourceLocation getEntityTexture(SkaroDalekEntity dalekEntity) {
        return new ResourceLocation(DWMMain.MOD_ID, "textures/entity/dalek/skaro_dalek.png");
    }

}
