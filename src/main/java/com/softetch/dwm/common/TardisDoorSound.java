package com.softetch.dwm.common;

import com.softetch.dwm.DWMSounds;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum TardisDoorSound {
    NORMAL(DWMSounds.TARDIS_OPEN, DWMSounds.TARDIS_CLOSE),
    FAST(DWMSounds.TARDIS_FAST_OPEN, DWMSounds.TARDIS_FAST_CLOSE),
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
