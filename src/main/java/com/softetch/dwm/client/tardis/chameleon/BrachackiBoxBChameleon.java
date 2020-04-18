package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.BrachackiBoxBModel;

public class BrachackiBoxBChameleon extends AbstractChameleonData {

    public BrachackiBoxBChameleon() {
        super(new BrachackiBoxBModel());
    }

    @Override
    public String getName() {
        return "brachacki_box_b";
    }

    @Override
    public ChameleonType getType() {
        return ChameleonType.BRACHAKI_BOX;
    }

}
