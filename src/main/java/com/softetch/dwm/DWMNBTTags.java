package com.softetch.dwm;

/**
 * Enum to contain all the NBT Tags used in the project
 */
public class DWMNBTTags {
    public static final String SCALE_2D = createTag("scale_2d");
    public static final String TARDIS_DATA = createTag("tardis_data");
    public static final String CHAMELEON = createTag("chameleon");
    public static final String DOOR_STATE = createTag("door_state");
    public static final String DOOR_PROGRESSION = createTag("door_progression");
    public static final String TARDIS_OWNER = createTag("tardis_owner");
    public static final String LOCKED = createTag("locked");
    public static final String INTERIOR_POS = createTag("interior_pos");
    public static final String UUID = createTag("uuid");
    public static final String SIZE = createTag("size");
    public static final String COLOR = createTag("color");

    private static String createTag(String key) {
        return DWMMain.MOD_ID + "_" + key;
    }

}
