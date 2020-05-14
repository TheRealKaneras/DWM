package com.softetch.dwm.client.tardis.chameleon;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.tileentity.tardis.AbstractTardisExteriorModel;
import com.softetch.dwm.common.sound.DWMSoundEvent;
import com.softetch.dwm.common.sound.DWMSoundEvents;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.shapes.VoxelShape;

public class BaseChameleonData {
    protected String name;
    protected ChameleonType type;
    protected AbstractTardisExteriorModel model;

    public BaseChameleonData(String name, ChameleonType type, AbstractTardisExteriorModel model) {
        this.name = name;
        this.type = type;
        this.model = model;
    }

    public String getName() {
        return name;
    }
    public ChameleonType getType() {
        return type;
    }

    public AbstractTardisExteriorModel getModel() {
        return model;
    }

    public ResourceLocation getTexture() {
        return getTextureResourceLocation(getName());
    }

    public DWMSoundEvent getOpenDoorSound() {
        return DWMSoundEvents.TARDIS_OPEN;
    }

    public DWMSoundEvent getCloseDoorSound() {
        return DWMSoundEvents.TARDIS_CLOSE;
    }

    public DWMSoundEvent getLockDoorSound() {
        return DWMSoundEvents.TARDIS_LOCK;
    }

    public DWMSoundEvent getUnlockDoorSound() {
        return DWMSoundEvents.TARDIS_UNLOCK;
    }

    /**
     * Called when the door is locked when open
     * @return The SoundEvent to play.
     */
    public DWMSoundEvent getDoorSlamSound() {
        return DWMSoundEvents.TARDIS_FAST_CLOSE;
    }

    public DWMSoundEvent getDeadlockDoorSound() {
        return DWMSoundEvents.TARDIS_DEADLOCK;
    }

    public DWMSoundEvent getAmbientSound() {
        return DWMSoundEvents.TOYOTA_HUM;
    }

    /**
     * Should the door slam shut when it is locked and open
     * @return whether the door should slam shut on lock
     */
    public boolean shouldDoorLockFast() {
        return true;
    }

    public float getOpenSpeed() {
        return 0.05f;
    }

    public float getCloseSpeed() {
        return 0.05f;
    }

    public VoxelShape getShape() {
        return Block.makeCuboidShape(-4.0D, 0.0D, -4.0D, 20.0D, 45.0D, 20.0D);
    }

    protected ResourceLocation getTextureResourceLocation(String textureName) {
        return new ResourceLocation(DWMMain.MOD_ID, "textures/tileentity/tardis/" + textureName + ".png");
    }
}
