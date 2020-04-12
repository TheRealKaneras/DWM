package com.softetch.dwm.client.render.tileentity;

import com.softetch.dwm.client.tardis.EnumChameleonData;
import com.softetch.dwm.common.tileentity.TardisTileEntity;

public class TardisExteriorRenderer extends DWMTileEntityRenderer<TardisTileEntity> {
    private EnumChameleonData chameleonData = EnumChameleonData.BRACHACKI_BOX_A;

    public TardisExteriorRenderer() {
        super(EnumChameleonData.BRACHACKI_BOX_A.getModel(), EnumChameleonData.BRACHACKI_BOX_A.getTexture());
    }

    @Override
    public void render(TardisTileEntity tileEntity, double x, double y, double z, float partialTicks, int destroyStage) {
        if (tileEntity.getData() != null && chameleonData.getId() != tileEntity.getChameleon()) {
            chameleonData = EnumChameleonData.fromId(tileEntity.getChameleon());
            setModel(chameleonData.getModel());
            setTexture(chameleonData.getTexture());
        }
        chameleonData.getModel().doorRotation(tileEntity.getDoorState(), tileEntity.getDoorProgression());
        super.render(tileEntity, x, y, z, partialTicks, destroyStage);
    }
}
