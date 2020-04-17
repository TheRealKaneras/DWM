package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.DWMSounds;
import com.softetch.dwm.client.model.tileentity.tardis.AbstractTardisExteriorModel;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public abstract class AbstractChameleonData {

    public abstract String getName();
    public abstract AbstractTardisExteriorModel getModel();
    public abstract ChameleonType getType();

    public ResourceLocation getTexture() {
        return getTardisResourceLocation(getName());
    }

    public SoundEvent getOpenDoorSound() {
        return DWMSounds.TARDIS_OPEN;
    }

    public SoundEvent getCloseDoorSound() {
        return DWMSounds.TARDIS_CLOSE;
    }

    public SoundEvent getLockDoorSound() {
        return DWMSounds.TARDIS_LOCK;
    }

    public SoundEvent getUnlockDoorSound() {
        return DWMSounds.TARDIS_UNLOCK;
    }

    /**
     * Called when the door is locked when open
     * @return The SoundEvent to play.
     */
    public SoundEvent getDoorSlamSound() {
        return DWMSounds.TARDIS_FAST_CLOSE;
    }

    public SoundEvent getDeadlockDoorSound() {
        return DWMSounds.TARDIS_DEADLOCK;
    }

    public boolean shouldDoorLockFast() {
        return true;
    }

    protected ResourceLocation getTardisResourceLocation(String textureName) {
        return new ResourceLocation(DWMMain.MOD_ID, "textures/tileentity/tardis/" + textureName + ".png");
    }
}
