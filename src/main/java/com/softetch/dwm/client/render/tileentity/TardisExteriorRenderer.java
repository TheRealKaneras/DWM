package com.softetch.dwm.client.render.tileentity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.tardis.chameleon.AbstractChameleonData;
import com.softetch.dwm.common.tileentity.TardisTileEntity;

public class TardisExteriorRenderer extends DWMTileEntityRenderer<TardisTileEntity> {
    private AbstractChameleonData chameleonData = DWMMain.chameleonRegistry.getDefaultSkin();

    public TardisExteriorRenderer() {
        super(DWMMain.chameleonRegistry.getDefaultSkin().getModel(), DWMMain.chameleonRegistry.getDefaultSkin().getTexture());
    }

    @Override
    public void render(TardisTileEntity tileEntity, double x, double y, double z, float partialTicks, int destroyStage) {
        if (!chameleonData.getName().equals(tileEntity.getChameleon())) {
            chameleonData = tileEntity.getChameleonData();
            setModel(chameleonData.getModel());
            setTexture(chameleonData.getTexture());
        }
        chameleonData.getModel().doorRotation(tileEntity.getDoorState(), tileEntity.getDoorProgression());
        super.render(tileEntity, x, y, z, partialTicks, destroyStage);
    }
}
