package com.softetch.dwm.client.tardis;

import com.softetch.dwm.client.model.tileentity.tardis.AbstractTardisExteriorModel;
import com.softetch.dwm.client.model.tileentity.tardis.box.*;
import com.softetch.dwm.client.tardis.chameleon.BaseChameleonData;
import com.softetch.dwm.client.tardis.chameleon.ChameleonType;
import com.softetch.dwm.client.tardis.chameleon.ChestChameleon;
import com.softetch.dwm.client.tardis.chameleon.EnderChestChameleon;

import java.util.HashMap;
import java.util.Map;

public class ChameleonRegistry {
    public final Map<String, BaseChameleonData> TARDIS_SKINS = new HashMap<>();

    public ChameleonRegistry() {
        registerSkin(new ChestChameleon());
        registerSkin(new EnderChestChameleon());
        registerSkin("jalm_box", ChameleonType.POLICE_BOX, new JalmBoxModel());
        registerSkin("first_doctor_box", ChameleonType.POLICE_BOX, new FirstDoctorBoxModel());
        registerSkin("first_doctor_box_pilot", ChameleonType.POLICE_BOX, new FirstDoctorBoxModel());
        registerSkin("first_doctor_box_damaged", ChameleonType.POLICE_BOX, new FirstDoctorBoxDamageModel());
        registerSkin("second_doctor_box", ChameleonType.POLICE_BOX, new SecondDoctorBoxModel());
        registerSkin("second_doctor_box_clean", ChameleonType.POLICE_BOX, new SecondDoctorBoxCleanModel());
        registerSkin("third_doctor_box_a", ChameleonType.POLICE_BOX, new ThirdDoctorBoxModel());
        registerSkin("third_doctor_box_b", ChameleonType.POLICE_BOX, new ThirdDoctorBoxModel());
        registerSkin("third_doctor_box_c", ChameleonType.POLICE_BOX, new ThirdDoctorBoxModel());
        registerSkin("fourth_doctor_box_a", ChameleonType.POLICE_BOX, new FourthDoctorBoxAModel());
        registerSkin("fourth_doctor_box_b", ChameleonType.POLICE_BOX, new FourthDoctorBoxBModel());
        registerSkin("fourth_doctor_box_c", ChameleonType.POLICE_BOX, new FourthDoctorBoxCModel());
        registerSkin("fifth_doctor_box", ChameleonType.POLICE_BOX, new FifthDoctorBoxModel());
        registerSkin("sixth_doctor_box_a", ChameleonType.POLICE_BOX, new SixthDoctorBoxModel());
        registerSkin("sixth_doctor_box_b", ChameleonType.POLICE_BOX, new SixthDoctorBoxModel());
        registerSkin("seventh_doctor_box_a", ChameleonType.POLICE_BOX, new SeventhDoctorBoxModel());
        registerSkin("seventh_doctor_box_b", ChameleonType.POLICE_BOX, new SeventhDoctorBoxModel());
        registerSkin("seventh_doctor_box_hp_a", ChameleonType.POLICE_BOX, new SeventhDoctorBoxHPModel());
        registerSkin("seventh_doctor_box_hp_b", ChameleonType.POLICE_BOX, new SeventhDoctorBoxHPModel());
        registerSkin("seventh_doctor_box_hp_c", ChameleonType.POLICE_BOX, new SeventhDoctorBoxHPModel());
        registerSkin("seventh_doctor_box_hp_d", ChameleonType.POLICE_BOX, new SeventhDoctorBoxHPModel());
//        registerSkin("thirteenth_doctor_box", ChameleonType.POLICE_BOX, new ThirteenthDoctorBoxModel());
    }

    /**
     * SHOULD ONLY BE USED FOR DEBUGGING!!!!
     * @return a default tardis skin
     */
    @Deprecated
    public BaseChameleonData getDefaultSkin() {
        return TARDIS_SKINS.get("fifth_doctor_box");
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
