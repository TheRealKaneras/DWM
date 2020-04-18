package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.BrachackiBoxAModel;

public class BrachackiBoxAChameleon extends AbstractChameleonData {

    public BrachackiBoxAChameleon() {
        super(new BrachackiBoxAModel());
    }

    @Override
    public String getName() {
        return "brachacki_box_a";
    }

    @Override
    public ChameleonType getType() {
        return ChameleonType.BRACHAKI_BOX;
    }
}
