package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.NewberyBoxCModel;

public class NewberyBoxCChameleon extends AbstractChameleonData {

    public NewberyBoxCChameleon() {
        super(new NewberyBoxCModel());
    }

    @Override
    public String getName() {
        return "newbery_box_c";
    }

    @Override
    public ChameleonType getType() {
        return ChameleonType.NEWBERY_BOX;
    }

}
