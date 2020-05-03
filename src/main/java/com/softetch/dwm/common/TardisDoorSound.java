package com.softetch.dwm.common;

import com.softetch.dwm.common.sound.DWMSoundEvents;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum TardisDoorSound {
    NORMAL(DWMSoundEvents.TARDIS_OPEN, DWMSoundEvents.TARDIS_CLOSE),
    FAST(DWMSoundEvents.TARDIS_FAST_OPEN, DWMSoundEvents.TARDIS_FAST_CLOSE),
    CHEST(SoundEvents.BLOCK_CHEST_OPEN, SoundEvents.BLOCK_CHEST_CLOSE);

    private final SoundEvent openSound;
    private final SoundEvent closeSound;
    TardisDoorSound(SoundEvent openSound, SoundEvent closeSound) {
        this.openSound = openSound;
        this.closeSound = closeSound;
    }

    public SoundEvent getOpenSound() {
        return openSound;
    }

    public SoundEvent getCloseSound() {
        return closeSound;
    }
}
