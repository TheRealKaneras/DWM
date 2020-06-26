package com.softetch.dwm.client.render.entity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.entity.ClassicSilurianModel;
import com.softetch.dwm.common.entity.ClassicSilurianEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ClassicSilurianRenderer extends MobRenderer<ClassicSilurianEntity, ClassicSilurianModel> {
    private static final ResourceLocation[] CLASSIC_SILURIAN_TEXTURES = new ResourceLocation[] {
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/classic_silurian/classic_silurian_a.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/classic_silurian/classic_silurian_b.png"),
            new ResourceLocation(DWMMain.MOD_ID, "textures/entity/classic_silurian/classic_silurian_c.png")
    };

    public ClassicSilurianRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ClassicSilurianModel(), 0.6f);
    }

    @Override
    public ResourceLocation getEntityTexture(ClassicSilurianEntity entity) {
        return CLASSIC_SILURIAN_TEXTURES[entity.getVariant()];
    }
}
