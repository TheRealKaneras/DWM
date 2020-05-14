package com.softetch.dwm.client.tardis;

import com.softetch.dwm.client.tardis.chameleon.*;

import java.util.HashMap;
import java.util.Map;

public class ChameleonRegistry {
    public static final Map<String, AbstractChameleonData> TARDIS_SKINS = new HashMap<>();

    public ChameleonRegistry() {
        registerSkin(new BrachackiBoxAChameleon());
        registerSkin(new BrachackiBoxBChameleon());
        registerSkin(new BrachackiBoxCChameleon());
        registerSkin(new BrachackiBoxDChameleon());
        registerSkin(new NewberyBoxAChameleon());
        registerSkin(new NewberyBoxBChameleon());
        registerSkin(new NewberyBoxCChameleon());
        registerSkin(new ChestChameleon());
        registerSkin(new EnderChestChameleon());
    }

    public AbstractChameleonData getDefaultSkin() {
        return new NewberyBoxCChameleon();
    }

    /**
     * Register a skin to add to available chameleon choices
     * @param data the data for the chameleon skin
     */
    private static void registerSkin(AbstractChameleonData data) {
        TARDIS_SKINS.put(data.getName(), data);
    }

}
