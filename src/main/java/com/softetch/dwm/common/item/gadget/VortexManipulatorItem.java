package com.softetch.dwm.common.item.gadget;

import com.softetch.dwm.client.gui.GuiVortexManipulator;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;

public class VortexManipulatorItem extends Item {
    public VortexManipulatorItem() {
        super(new Item.Properties().group(ItemGroup.TOOLS));
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        if (context.getWorld().isRemote) {
//            NetworkHooks.openGui((ServerPlayerEntity) context.getPlayer(), new InteractionVortexManipulator());
            Minecraft.getInstance().displayGuiScreen(new GuiVortexManipulator());
        }
        return super.onItemUse(context);
    }
}
