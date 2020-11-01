package com.softetch.dwm.common.item;

import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ConsoleItem extends Item {
    public ConsoleItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        Direction direction = context.getFace();
        if (direction == Direction.DOWN) {
            return ActionResultType.FAIL;
        }
        World world = context.getWorld();
        BlockItemUseContext blockItemUseContext = new BlockItemUseContext(context);
        BlockPos blockPos = blockItemUseContext.getPos();
        BlockPos topBlockPos = blockPos.up();
        return ActionResultType.SUCCESS;
    }
}
