package com.softetch.dwm.common.sound;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class DWMSoundEvent extends SoundEvent {
    private float recommendedVolume = 1.0f;
    private long duration = 0l;

    public DWMSoundEvent(ResourceLocation name) {
        super(name);
    }

    public void setRecommendedVolume(float recommendedVolume) {
        this.recommendedVolume = recommendedVolume;
    }

    public float getRecommendedVolume() {
        return recommendedVolume;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getDuration() {
        return duration;
    }
}
