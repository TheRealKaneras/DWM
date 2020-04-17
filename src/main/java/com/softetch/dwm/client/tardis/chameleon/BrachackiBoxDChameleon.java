package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.AbstractTardisExteriorModel;
import com.softetch.dwm.client.model.tileentity.tardis.BrachackiBoxDModel;

public class BrachackiBoxDChameleon extends AbstractChameleonData {
    private static final BrachackiBoxDModel MODEL = new BrachackiBoxDModel();

    @Override
    public String getName() {
        return "brachacki_box_d";
    }

    @Override
    public AbstractTardisExteriorModel getModel() {
        return MODEL;
    }

    @Override
    public ChameleonType getType() {
        return ChameleonType.BRACHAKI_BOX;
    }

}
