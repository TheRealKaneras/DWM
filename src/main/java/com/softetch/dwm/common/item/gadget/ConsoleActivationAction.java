package com.softetch.dwm.common.item.gadget;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public interface ConsoleActivationAction {
    void onAction(World world, PlayerEntity playerEntity);
}
