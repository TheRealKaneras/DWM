package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.BrachackiBoxDModel;

public class BrachackiBoxDChameleon extends AbstractChameleonData {

    public BrachackiBoxDChameleon() {
        super(new BrachackiBoxDModel());
    }

    @Override
    public String getName() {
        return "brachacki_box_d";
    }

    @Override
    public ChameleonType getType() {
        return ChameleonType.BRACHAKI_BOX;
    }

}
