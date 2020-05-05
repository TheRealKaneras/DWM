package com.softetch.dwm;

/**
 * Enum to contain all the NBT Tags used in the project
 */
public enum DWMNBTTags {
    SCALE_2D("scale_2d"),
    TARDIS_DATA("tardis_data"),
    CHAMELEON("chameleon"),
    DOOR_STATE("door_state"),
    DOOR_PROGRESSION("door_progression"),
    TARDIS_OWNER("tardis_owner"),
    LOCKED("locked"),
    INTERIOR_POS("interior_pos");

    private final String tag;

    DWMNBTTags(String tag) {
        this.tag = DWMMain.MOD_ID + "_" + tag;
    }

    public String getTag() {
        return tag;
    }
}
