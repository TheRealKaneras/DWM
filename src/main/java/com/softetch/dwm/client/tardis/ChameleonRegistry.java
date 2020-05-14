package com.softetch.dwm.client.tardis;

import com.softetch.dwm.client.model.tileentity.tardis.*;
import com.softetch.dwm.client.tardis.chameleon.BaseChameleonData;
import com.softetch.dwm.client.tardis.chameleon.ChameleonType;
import com.softetch.dwm.client.tardis.chameleon.ChestChameleon;
import com.softetch.dwm.client.tardis.chameleon.EnderChestChameleon;

import java.util.HashMap;
import java.util.Map;

public class ChameleonRegistry {
    public final Map<String, BaseChameleonData> TARDIS_SKINS = new HashMap<>();

    public ChameleonRegistry() {
        registerSkin("brachacki_box_a", ChameleonType.BRACHACKI_BOX, new BrachackiBoxAModel());
        registerSkin("brachacki_box_b", ChameleonType.BRACHACKI_BOX, new BrachackiBoxBModel());
        registerSkin("brachacki_box_c", ChameleonType.BRACHACKI_BOX, new BrachackiBoxCModel());
        registerSkin("brachacki_box_d", ChameleonType.BRACHACKI_BOX, new BrachackiBoxDModel());
        registerSkin("newbery_box_a", ChameleonType.NEWBERY_BOX, new NewberyBoxAModel());
        registerSkin("newbery_box_b", ChameleonType.NEWBERY_BOX, new NewberyBoxBModel());
        registerSkin("newbery_box_c", ChameleonType.NEWBERY_BOX, new NewberyBoxCModel());
        registerSkin(new ChestChameleon());
        registerSkin(new EnderChestChameleon());
    }

    private void registerSkin(String name, ChameleonType type, AbstractTardisExteriorModel model) {
        registerSkin(new BaseChameleonData(name, type, model));
    }

    /**
     * Register a skin to add to available chameleon choices
     * @param data the data for the chameleon skin
     */
    private void registerSkin(BaseChameleonData data) {
        TARDIS_SKINS.put(data.getName(), data);
    }

}
