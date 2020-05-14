package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.client.model.tileentity.tardis.ChestModel;
import com.softetch.dwm.common.sound.DWMSoundEvent;
import com.softetch.dwm.common.sound.DWMSoundEvents;
import net.minecraft.block.Block;
import net.minecraft.util.math.shapes.VoxelShape;

public class EnderChestChameleon extends BaseChameleonData {

    public EnderChestChameleon() {
        super("ender_chest", ChameleonType.MINECRAFT, new ChestModel());
    }

    @Override
    public DWMSoundEvent getOpenDoorSound() {
        return DWMSoundEvents.TARDIS_CHEST_OPEN;
    }

    @Override
    public DWMSoundEvent getCloseDoorSound() {
        return DWMSoundEvents.TARDIS_CHEST_CLOSE;
    }

    @Override
    public DWMSoundEvent getDoorSlamSound() {
        return null;
    }

    @Override
    public float getCloseSpeed() {
        return 0.10f;
    }

    @Override
    public DWMSoundEvent getAmbientSound() {
        return DWMSoundEvents.TARDIS_MC_HUM;
    }

    @Override
    public VoxelShape getShape() {
        return Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
    }

}
