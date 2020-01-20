package com.softetch.dwm.client.render.entity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.SixtiesDalekModel;
import com.softetch.dwm.common.entity.SixtiesDalekEntity;
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
public class SixtiesDalekRenderer extends LivingRenderer<SixtiesDalekEntity, SixtiesDalekModel> {

    /**
     * Set up the properties required to render the entity
     * @param entityRendererManager - the manager class for entity rendering
     */
    public SixtiesDalekRenderer(EntityRendererManager entityRendererManager) {
        super(entityRendererManager, new SixtiesDalekModel(), 1.0f);
    }

    /**
     * Getter for the entity's texture
     * @param dalekEntity - the dalek entity being rendered
     * @return the texture of the entity
     */
    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(SixtiesDalekEntity dalekEntity) {
        return new ResourceLocation(DWMMain.MOD_ID, "textures/entity/sixties_dalek.png");
    }


}
