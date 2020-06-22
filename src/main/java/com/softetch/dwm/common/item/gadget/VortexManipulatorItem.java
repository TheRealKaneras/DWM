package com.softetch.dwm.common.item.gadget;

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
//            Minecraft.getInstance().displayGuiScreen(new GuiVortexManipulator());
        }
        return super.onItemUse(context);
    }
}
