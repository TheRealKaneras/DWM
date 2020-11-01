package com.softetch.dwm.client.render.entity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.FirstConsoleModel;
import com.softetch.dwm.common.entity.ConsoleEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;

public class ConsoleRenderer extends LivingRenderer<ConsoleEntity, FirstConsoleModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(DWMMain.MOD_ID, "textures/entity/first_base_console.png");

    public ConsoleRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new FirstConsoleModel(), 0.6f);
    }

    /**
     * Returns the location of an entity's texture.
     *
     * @param entity
     */
    @Override
    public ResourceLocation getEntityTexture(ConsoleEntity sentity) {
        return TEXTURE;
    }
}
