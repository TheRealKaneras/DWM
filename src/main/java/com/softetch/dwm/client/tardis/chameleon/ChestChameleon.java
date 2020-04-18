package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.ChestModel;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class ChestChameleon extends AbstractChameleonData {

    public ChestChameleon() {
        super(new ChestModel());
    }

    @Override
    public String getName() {
        return "chest";
    }

    @Override
    public SoundEvent getOpenDoorSound() {
        return SoundEvents.BLOCK_CHEST_OPEN;
    }

    @Override
    public SoundEvent getCloseDoorSound() {
        return SoundEvents.BLOCK_CHEST_CLOSE;
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
