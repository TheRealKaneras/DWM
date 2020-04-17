package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.AbstractTardisExteriorModel;
import com.softetch.dwm.client.model.tileentity.tardis.ChestModel;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class EnderChestChameleon extends AbstractChameleonData {
    private static final ChestModel MODEL = new ChestModel();

    @Override
    public String getName() {
        return "ender_chest";
    }

    @Override
    public AbstractTardisExteriorModel getModel() {
        return MODEL;
    }

    @Override
    public SoundEvent getOpenDoorSound() {
        return SoundEvents.BLOCK_ENDER_CHEST_OPEN;
    }

    @Override
    public SoundEvent getCloseDoorSound() {
        return SoundEvents.BLOCK_ENDER_CHEST_CLOSE;
    }

    @Override
    public SoundEvent getLockDoorSound() {
        return SoundEvents.BLOCK_CHEST_LOCKED;
    }

    @Override
    public SoundEvent getDoorSlamSound() {
        return null;
    }

    @Override
    public ChameleonType getType() {
        return ChameleonType.MINECRAFT;
    }

}
