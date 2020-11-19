package com.softetch.dwm.client.render.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.softetch.dwm.client.tardis.chameleon.BaseChameleonData;
import com.softetch.dwm.common.tileentity.DoorTypeTile;
import com.softetch.dwm.common.tileentity.TardisExteriorTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;

public class TardisExteriorRenderer extends DWMTileEntityRenderer<TardisExteriorTile> {
    private BaseChameleonData chameleonData;

    public TardisExteriorRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher, null, null);
    }

    @Override
    public void render(TardisExteriorTile tile, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int combinedLight, int combinedOverlay) {
        if (tile.getChameleonData() == null)
            return;

        if (chameleonData == null || !chameleonData.getName().equals(tile.getChameleon())) {
            changeModelAndTexture(tile.getChameleonData());
        }

        doDoorRotation(tile.getDoorState(), tile.getDoorProgression());
        super.render(tile, partialTicks, matrixStack, buffer, combinedLight, combinedOverlay);
    }

    private void changeModelAndTexture(BaseChameleonData chameleon) {
        chameleonData = chameleon;
        setModel(chameleon.getModel());
        setTexture(chameleon.getTexture());
    }

    private void doDoorRotation(DoorTypeTile.DoorState doorState, float progression) {
        chameleonData.getModel().doorRotation(doorState, progression);
    }
}
