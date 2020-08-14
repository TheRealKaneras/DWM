package com.softetch.dwm.client.render.entity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.common.entity.MewingDogEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.WolfModel;
import net.minecraft.util.ResourceLocation;

public class MewingDogRenderer extends MobRenderer<MewingDogEntity, WolfModel<MewingDogEntity>> {
    private static final ResourceLocation[] MEWING_DOG_TEXTURES = new ResourceLocation[] {
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/mewing_dog/mewing_dog_0.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/mewing_dog/mewing_dog_1.png")
    };

    private static final ResourceLocation[] MEWING_DOG_TAMED_TEXTURES = new ResourceLocation[] {
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/mewing_dog/mewing_dog_0_tamed.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/mewing_dog/mewing_dog_1_tamed.png")
    };

    public MewingDogRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new WolfModel<>(), 0.5f);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(MewingDogEntity livingBase, float partialTicks) {
        return livingBase.getTailRotation();
    }

    @Override
    public ResourceLocation getEntityTexture(MewingDogEntity entity) {
        if (entity.isTamed()) {
            return MEWING_DOG_TAMED_TEXTURES[entity.getVariant()];
        }
        return MEWING_DOG_TEXTURES[entity.getVariant()];
    }
}
