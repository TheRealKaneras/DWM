package com.softetch.dwm.client.tardis;

import com.softetch.dwm.DWMSounds;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum InteriorHumSound {
    MINECRAFT(SoundEvents.BLOCK_BEACON_AMBIENT, 80), TOYOTA(DWMSounds.TOYOTA_HUM, 420);

    private final SoundEvent sound;
    private final int length;

    /**
     * @param sound - SoundEvent to play
     * @param length - length of the sound in ticks. Should ideally be less than 100.
     */
    InteriorHumSound(SoundEvent sound, int length) {
        this.sound = sound;
        this.length = length;
    }

    public SoundEvent getSound() {
        return sound;
    }

    public int getLength() {
        return length;
    }
}
