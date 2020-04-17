package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.AbstractTardisExteriorModel;
import com.softetch.dwm.client.model.tileentity.tardis.NewberyBoxCModel;

public class NewberyBoxCChameleon extends AbstractChameleonData {
    private static final NewberyBoxCModel MODEL = new NewberyBoxCModel();

    @Override
    public String getName() {
        return "newbery_box_c";
    }

    @Override
    public AbstractTardisExteriorModel getModel() {
        return MODEL;
    }

    @Override
    public ChameleonType getType() {
        return ChameleonType.NEWBERY_BOX;
    }

}
