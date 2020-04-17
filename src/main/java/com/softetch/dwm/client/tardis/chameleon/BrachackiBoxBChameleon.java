package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.AbstractTardisExteriorModel;
import com.softetch.dwm.client.model.tileentity.tardis.BrachackiBoxBModel;

public class BrachackiBoxBChameleon extends AbstractChameleonData {
    private static final BrachackiBoxBModel MODEL = new BrachackiBoxBModel();

    @Override
    public String getName() {
        return "brachacki_box_b";
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
