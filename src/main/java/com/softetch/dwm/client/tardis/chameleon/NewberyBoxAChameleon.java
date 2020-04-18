package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.NewberyBoxAModel;

public class NewberyBoxAChameleon extends AbstractChameleonData {

    public NewberyBoxAChameleon() {
        super(new NewberyBoxAModel());
    }

    @Override
    public String getName() {
        return "newbery_box_a";
    }

    @Override
    public ChameleonType getType() {
        return ChameleonType.NEWBERY_BOX;
    }

}
