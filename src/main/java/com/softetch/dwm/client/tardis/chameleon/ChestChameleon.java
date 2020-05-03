package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.ChestModel;
import com.softetch.dwm.common.sound.DWMSoundEvent;
import com.softetch.dwm.common.sound.DWMSoundEvents;

public class ChestChameleon extends AbstractChameleonData {

    public ChestChameleon() {
        super(new ChestModel());
    }

    @Override
    public String getName() {
        return "chest";
    }

    @Override
    public DWMSoundEvent getOpenDoorSound() {
        return DWMSoundEvents.TARDIS_CHEST_OPEN;
    }

    @Override
    public DWMSoundEvent getCloseDoorSound() {
        return DWMSoundEvents.TARDIS_CHEST_CLOSE;
    }

    @Override
    public DWMSoundEvent getDoorSlamSound() {
        return null;
    }

    @Override
    public float getCloseSpeed() {
        return 0.10f;
    }

    @Override
    public DWMSoundEvent getAmbientSound() {
        return DWMSoundEvents.TARDIS_MC_HUM;
    }

    @Override
    public ChameleonShape getShape() {
        return ChameleonShape.CHEST;
    }

    @Override
    public ChameleonType getType() {
        return ChameleonType.MINECRAFT;
    }
}
