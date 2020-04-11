package com.softetch.dwm;

/**
 * Enum to contain all the NBT Tags used in the project
 */
public enum DWMNBTTags {
    SCALE_2D("scale_2d"), CHAMELEON("chameleon"), DOOR_STATE("door_state");

    private final String tag;

    DWMNBTTags(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }
}
