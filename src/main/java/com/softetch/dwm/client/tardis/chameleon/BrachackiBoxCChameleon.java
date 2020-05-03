package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.BrachackiBoxCModel;

public class BrachackiBoxCChameleon extends AbstractChameleonData {

    public BrachackiBoxCChameleon() {
        super(new BrachackiBoxCModel());
    }

    @Override
    public String getName() {
        return "brachacki_box_c";
    }

    @Override
    public ChameleonType getType() {
        return ChameleonType.BRACHACKI_BOX;
    }

}
