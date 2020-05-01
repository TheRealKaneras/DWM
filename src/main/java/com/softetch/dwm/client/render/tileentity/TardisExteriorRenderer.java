package com.softetch.dwm.client.render.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.tardis.chameleon.AbstractChameleonData;
import com.softetch.dwm.common.tileentity.TardisTileEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;

public class TardisExteriorRenderer extends DWMTileEntityRenderer<TardisTileEntity> {
    private AbstractChameleonData chameleonData = DWMMain.CHAMELEON_REGISTRY.getDefaultSkin();

    public TardisExteriorRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher, DWMMain.CHAMELEON_REGISTRY.getDefaultSkin().getModel(), DWMMain.CHAMELEON_REGISTRY.getDefaultSkin().getTexture());
    }

    @Override
    public void render(TardisTileEntity tileEntity, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int combinedLight, int combinedOverlay) {
        if (!chameleonData.getName().equals(tileEntity.getChameleon()) && tileEntity.getChameleonData() != null) {
            chameleonData = tileEntity.getChameleonData();
            setModel(chameleonData.getModel());
            setTexture(chameleonData.getTexture());
        }
        chameleonData.getModel().doorRotation(tileEntity.getDoorState(), tileEntity.getDoorProgression());
        super.render(tileEntity, partialTicks, matrixStack, buffer, combinedLight, combinedOverlay);
    }
}
