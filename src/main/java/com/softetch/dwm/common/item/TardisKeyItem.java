package com.softetch.dwm.common.item;

import com.softetch.dwm.common.tileentity.TardisTileEntity;
import com.softetch.dwm.common.world.schematic.SchematicLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TardisKeyItem extends Item {

    public TardisKeyItem() {
        super(new Item.Properties().group(ItemGroup.TOOLS));
    }

    /**
     * Called when the item is used on a block
     * @param context - contains all the information about the interaction
     * @return the ActionResult of the interaction
     */
    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getPos();
        if (context.getPlayer() == null)
            return super.onItemUse(context);
        if (!world.isAirBlock(blockPos) && !world.isRemote) {
            if (world.getTileEntity(blockPos) instanceof TardisTileEntity) {
                ((TardisTileEntity) world.getTileEntity(blockPos)).cycleLock();
            } else if (SchematicLoader.test != null) {
                SchematicLoader.test.generate(world, blockPos, false);
            }
            return ActionResultType.SUCCESS;
        }
        return super.onItemUse(context);
    }
}
