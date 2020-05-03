package com.softetch.dwm.client.render.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.softetch.dwm.client.tardis.chameleon.AbstractChameleonData;
import com.softetch.dwm.common.tileentity.TardisTileEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;

public class TardisExteriorRenderer extends DWMTileEntityRenderer<TardisTileEntity> {
    private AbstractChameleonData chameleonData;

    public TardisExteriorRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher, null, null);
    }

    @Override
    public void render(TardisTileEntity tileEntity, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int combinedLight, int combinedOverlay) {
        if (tileEntity.getChameleonData() != null && (chameleonData == null || !chameleonData.getName().equals(tileEntity.getChameleon()))) {
            chameleonData = tileEntity.getChameleonData();
            setModel(chameleonData.getModel());
            setTexture(chameleonData.getTexture());
        } else if (tileEntity.getChameleonData() == null) {
            return;
        }
        chameleonData.getModel().doorRotation(tileEntity.getDoorState(), tileEntity.getDoorProgression());
        super.render(tileEntity, partialTicks, matrixStack, buffer, combinedLight, combinedOverlay);
    }
}
