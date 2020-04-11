package com.softetch.dwm.client.render.tileentity;

import com.mojang.blaze3d.platform.GlStateManager;
import com.softetch.dwm.client.model.tileentity.TileEntityModel;
import com.softetch.dwm.common.block.DWMTileEntityBlock;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class DWMTileEntityRenderer<T extends TileEntity> extends TileEntityRenderer<T> {
    private final TileEntityModel model;
    private final ResourceLocation texture;

    public DWMTileEntityRenderer(TileEntityModel model, ResourceLocation texture) {
        this.model = model;
        this.texture = texture;
    }

    @Override
    public void render(T tileEntity, double x, double y, double z, float partialTicks, int destroyStage) {
        GlStateManager.pushMatrix();
        GlStateManager.translated(x + 0.5d, y + 1.5d, z + 0.5d);
        GlStateManager.rotated(180.0d, 0.0d, 0.0d, 1.0d);
        GlStateManager.rotated(22.5D * tileEntity.getBlockState().get(DWMTileEntityBlock.ROTATION), 0.0D, 1.0D, 0.0D);
        bindTexture(texture);
        model.render(0.0625f);
        GlStateManager.popMatrix();
    }

    public TileEntityModel getModel() {
        return model;
    }

    public ResourceLocation getTexture() {
        return texture;
    }
}
