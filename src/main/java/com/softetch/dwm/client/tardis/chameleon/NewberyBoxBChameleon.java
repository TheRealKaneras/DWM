package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.NewberyBoxBModel;

public class NewberyBoxBChameleon extends AbstractChameleonData {

    public NewberyBoxBChameleon() {
        super(new NewberyBoxBModel());
    }

    @Override
    public String getName() {
        return "newbery_box_b";
    }

    @Override
    public ChameleonType getType() {
        return ChameleonType.NEWBERY_BOX;
    }

}
