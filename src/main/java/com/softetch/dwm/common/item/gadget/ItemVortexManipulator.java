package com.softetch.dwm.common.item.gadget;

import com.softetch.dwm.client.gui.InteractionVortexManipulator;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraftforge.fml.network.NetworkHooks;

public class ItemVortexManipulator extends Item {
    public ItemVortexManipulator(Properties properties) {
        super(new Item.Properties().group(ItemGroup.TOOLS));
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        if (context.getWorld().isRemote) {
            NetworkHooks.openGui((ServerPlayerEntity) context.getPlayer(), new InteractionVortexManipulator());
        }
        return super.onItemUse(context);
    }
}
