package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.AbstractTardisExteriorModel;
import com.softetch.dwm.client.model.tileentity.tardis.BrachackiBoxAModel;

public class BrachackiBoxAChameleon extends AbstractChameleonData {
    private static final BrachackiBoxAModel MODEL = new BrachackiBoxAModel();

    @Override
    public String getName() {
        return "brachacki_box_a";
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
