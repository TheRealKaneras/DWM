package com.softetch.dwm.client.tardis;

public enum EnumChameleonGroup {
    BRACHACKI_BOX("brachacki_box", EnumChameleonData.BRACHACKI_BOX_A, EnumChameleonData.BRACHACKI_BOX_B, EnumChameleonData.BRACHACKI_BOX_C, EnumChameleonData.BRACHACKI_BOX_D);

    private final String groupName;
    private final EnumChameleonData[] exteriors;
    EnumChameleonGroup(String groupName, EnumChameleonData... exteriors) {
        this.groupName = groupName;
        this.exteriors = exteriors;
    }

    public String getGroupName() {
        return groupName;
    }

    public EnumChameleonData[] getExteriors() {
        return exteriors;
    }
}
