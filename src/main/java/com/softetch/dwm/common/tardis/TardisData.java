package com.softetch.dwm.common.tardis;

public class TardisData {
    public String uuid;
    public int[] position;
    public int chameleonId;
    public String ownerUuid;

    public TardisData(String uuid) {
        this.uuid = uuid;
        this.chameleonId = 0;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public TardisPosition getPosition() {
        return new TardisPosition(position[0], position[1], position[2], position[3]);
    }

    public void setPosition(TardisPosition position) {
        this.position = new int[] {position.getDimension(), position.getX(), position.getY(), position.getZ()};
    }

    public int getChameleonId() {
        return chameleonId;
    }

    public void setChameleonId(int chameleonId) {
        this.chameleonId = chameleonId;
    }

    public String getOwnerUuid() {
        return ownerUuid;
    }

    public void setOwnerUuid(String ownerUuid) {
        this.ownerUuid = ownerUuid;
    }

    @Override
    public String toString() {
        return "TardisData[" +
                "uuid='" + uuid + '\'' +
                ", position=" + position +
                ", chameleonId=" + chameleonId +
                ", ownerUuid='" + ownerUuid + '\'' +
                ']';
    }
}
