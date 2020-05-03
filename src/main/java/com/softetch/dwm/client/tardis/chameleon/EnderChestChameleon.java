package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.ChestModel;
import com.softetch.dwm.client.tardis.InteriorHumSound;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class EnderChestChameleon extends AbstractChameleonData {

    public EnderChestChameleon() {
        super(new ChestModel());
    }

    @Override
    public String getName() {
        return "ender_chest";
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
    public float getDoorSoundVolume() {
        return 0.5f;
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
    public float getCloseSpeed() {
        return 0.10f;
    }

    @Override
    public InteriorHumSound getAmbientSound() {
        return InteriorHumSound.MINECRAFT;
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
