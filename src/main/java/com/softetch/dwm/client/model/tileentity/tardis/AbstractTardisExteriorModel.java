package com.softetch.dwm.client.model.tileentity.tardis;

import com.softetch.dwm.client.model.tileentity.TileEntityModel;
import com.softetch.dwm.common.tileentity.TardisTileEntity;

public abstract class AbstractTardisExteriorModel extends TileEntityModel {
    public abstract void doorRotation(TardisTileEntity.DoorState doorState, float progression);
}
