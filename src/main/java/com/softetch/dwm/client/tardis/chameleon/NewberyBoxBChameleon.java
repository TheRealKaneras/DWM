package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.AbstractTardisExteriorModel;
import com.softetch.dwm.client.model.tileentity.tardis.NewberyBoxBModel;

public class NewberyBoxBChameleon extends AbstractChameleonData {
    private static final NewberyBoxBModel MODEL = new NewberyBoxBModel();

    @Override
    public String getName() {
        return "newbery_box_b";
    }

    @Override
    public AbstractTardisExteriorModel getModel() {
        return MODEL;
    }


    @Override
    public ChameleonType getType() {
        return ChameleonType.NEWBERY_BOX;
    }

}
