package com.softetch.dwm.client.render.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.softetch.dwm.client.tardis.chameleon.BaseChameleonData;
import com.softetch.dwm.common.tileentity.TardisExteriorTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;

public class TardisExteriorRenderer extends DWMTileEntityRenderer<TardisExteriorTile> {
    private BaseChameleonData chameleonData;

    public TardisExteriorRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher, null, null);
    }

    @Override
    public void render(TardisExteriorTile tileEntity, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int combinedLight, int combinedOverlay) {
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
