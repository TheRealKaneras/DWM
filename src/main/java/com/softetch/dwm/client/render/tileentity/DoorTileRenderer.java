package com.softetch.dwm.client.render.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.softetch.dwm.client.model.tileentity.DoorModel;
import com.softetch.dwm.common.tileentity.DoorTypeTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;

public class DoorTileRenderer<T extends DoorTypeTile> extends DWMTileEntityRenderer<T> {
    public DoorTileRenderer(TileEntityRendererDispatcher rendererDispatcherIn, Model model, ResourceLocation texture) {
        super(rendererDispatcherIn, model, texture);
    }

    @Override
    public void render(T tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        super.render(tileEntityIn, partialTicks, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);
        doDoorRotation(tileEntityIn.getDoorState(), tileEntityIn.getDoorProgression());
    }

    private void doDoorRotation(DoorTypeTile.DoorState doorState, float progression) {
        ((DoorModel) getModel()).doorRotation(doorState, progression);
    }
}
