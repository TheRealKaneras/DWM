package com.softetch.dwm.client.render.entity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.common.entity.BroakirEntity;
import com.softetch.dwm.common.entity.layers.LeatherBroakirArmorLayer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.HorseModel;
import net.minecraft.util.ResourceLocation;

public class BroakirRenderer extends MobRenderer<BroakirEntity, HorseModel<BroakirEntity>> {
    private static final ResourceLocation[] BROAKIR_TEXTURES = new ResourceLocation[] {
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/broakir/broakir_0.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/broakir/broakir_1.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/broakir/broakir_2.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/broakir/broakir_3.png")
    };

    public BroakirRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new HorseModel<>(0.0F), 1.1F);
        this.addLayer(new LeatherBroakirArmorLayer(this));
    }

    /**
     * Returns the location of an entity's texture.
     *
     * @param entity
     */
    @Override
    public ResourceLocation getEntityTexture(BroakirEntity entity) {
        return BROAKIR_TEXTURES[entity.getVariant()];
    }
}
