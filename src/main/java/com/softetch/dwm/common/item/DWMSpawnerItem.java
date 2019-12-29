package com.softetch.dwm.common.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * An item to spawn entities into the world
 */
public class DWMSpawnerItem extends Item {
    private EntityType<?> type;

    /**
     * Create a new spawner item
     * @param type the type of entity to spawn, e.g. an Adipose
     */
    public DWMSpawnerItem(EntityType<?> type) {
        super(new Item.Properties().group(ItemGroup.MISC));
        this.type = type;
    }

    /**
     * Spawn the entity type when an item is used on a block
     * @param context the context in which the item is used.
     * @return A successful action result.
     */
    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        ItemStack itemstack = context.getItem();
        World world = context.getWorld();
        BlockPos pos = context.getPos();
        if (type.spawn(world, itemstack, context.getPlayer(), pos, SpawnReason.SPAWN_EGG, true, false) != null) {
            itemstack.shrink(1);
        }
        return ActionResultType.SUCCESS;
    }
}
