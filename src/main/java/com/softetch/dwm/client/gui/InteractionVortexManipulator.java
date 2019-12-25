package com.softetch.dwm.client.gui;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class InteractionVortexManipulator implements INamedContainerProvider {
    @Override
    public ITextComponent getDisplayName() {
        return new TranslationTextComponent("container.vortexManipulator");
    }

    @Nullable
    @Override
    public Container createMenu(int par1, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return null;
    }
}
