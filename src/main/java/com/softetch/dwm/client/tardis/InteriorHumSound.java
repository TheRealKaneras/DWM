package com.softetch.dwm.client.tardis;

import com.softetch.dwm.DWMSounds;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum InteriorHumSound {
    MINECRAFT(SoundEvents.BLOCK_BEACON_AMBIENT, 80, 0.4f),
    TOYOTA(DWMSounds.TOYOTA_HUM, 60, 0.06f);

    private final SoundEvent sound;
    private final int length;
    private final float defaultVolume;

    /**
     * @param sound - SoundEvent to play
     * @param length - length of the sound in ticks. Should ideally be less than 100.
     */
    InteriorHumSound(SoundEvent sound, int length, float defaultVolume) {
        this.sound = sound;
        this.length = length;
        this.defaultVolume = defaultVolume;
    }

    public SoundEvent getSound() {
        return sound;
    }

    /**
     * Getter method for the length of the sound
     * @return the length of the sound
     */
    public int getLength() {
        return length;
    }

    /**
     * Get the default volume that the sound should be played at
     * @return default volume
     */
    public float getDefaultVolume() {
        return defaultVolume;
    }
}
