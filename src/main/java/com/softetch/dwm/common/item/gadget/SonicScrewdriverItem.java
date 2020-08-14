package com.softetch.dwm.common.item.gadget;

import com.google.common.collect.Maps;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.common.sound.DWMSoundEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.*;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

import java.util.List;
import java.util.Map;

/**
 * A class containing all the properties and methods required for a sonic screwdriver
 */
public class SonicScrewdriverItem extends Item {
    private final Map<Block, Item> smeltingResults = Maps.newHashMap();

    /**
     * Creates a new sonic screwdriver
     */
    public SonicScrewdriverItem() {
        super(new Item.Properties().group(ItemGroup.TOOLS).maxStackSize(1));
    }

    /**
     * Handles all interactions with blocks
     * @param world - the world that the item is used in
     * @param playerEntity - the player entity using the item
     * @param blockState - the block state of the block that has been interacted with
     * @param blockPos - the block pos of the block that has been interacted with
     */
    private void handleBlockInteraction(World world, PlayerEntity playerEntity, BlockState blockState, BlockPos blockPos) {
        if (blockState.getBlock() instanceof OreBlock) {
            Item item = getSmeltingResult(world, blockState.getBlock());
            if (item != null) {
                InventoryHelper.spawnItemStack(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), new ItemStack(item));
                world.destroyBlock(blockPos, false);
            }
        } else {
            DWMMain.SONIC_ACTIONS.tryPerformAction(world, blockPos, blockState, playerEntity);
        }

    }

    /**
     * Get the resulting 'ingot' from smelting the block
     * @param world world the smelting in performed in
     * @param block block being smelted
     * @return the resulting smelted ingot (can be null if there is no result)
     */
    private Item getSmeltingResult(World world, Block block) {
        if (smeltingResults.containsKey(block)) {
            return smeltingResults.get(block);
        }
        ItemStack stack = new ItemStack(block.asItem());
        IRecipe<?> recipe = world.getRecipeManager().getRecipe(IRecipeType.SMELTING, new Inventory(stack), world).orElse(null);
        if (recipe != null) {
            Item item = recipe.getRecipeOutput().getItem();
            smeltingResults.put(block, item);
            return item;
        }
        return null;
    }

    /**
     * Handle item interaction with an entity
     * @param stack the stack of items that the item being used is part of
     * @param playerEntity the player entity using the item
     * @param target the entity being interacted with
     * @param hand the hand that the item is being held in
     * @return if the item can be used to interact with the target entity
     */
    @SuppressWarnings("deprecation")
    @Override
    public boolean itemInteractionForEntity(ItemStack stack, PlayerEntity playerEntity, LivingEntity target, Hand hand) {
        target.world.playSound(target.getPosX(), target.getPosY(), target.getPosZ(), DWMSoundEvents.SONIC_SCREWDRIVER, SoundCategory.AMBIENT, 1.0f, 1.0f,false);
        if (playerEntity.world.isRemote)
            return false;
        // Allow for abilities such as shearing sheep
        if (target instanceof IShearable) {
            IShearable shearableEntity = (IShearable) target;
            BlockPos pos = new BlockPos(target.getPosX(), target.getPosY(), target.getPosZ());
            if (shearableEntity.isShearable(stack, target.world, pos)) {
                List<ItemStack> drops = shearableEntity.onSheared(stack, target.world, pos, EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack));
                drops.forEach(d -> {
                    ItemEntity ent = target.entityDropItem(d, 1.0F);
                    if (ent != null)
                        ent.setMotion(ent.getMotion().add((random.nextFloat() - random.nextFloat()) * 0.1F, random.nextFloat() * 0.05F, (random.nextFloat() - random.nextFloat()) * 0.1F));
                });
                stack.damageItem(1, target, e -> e.sendBreakAnimation(hand));
            }
            return true;
        }
        // Allow for attacking slimes
        if (target instanceof SlimeEntity) {
            target.attackEntityFrom(DamageSource.GENERIC, 4.0f);
            target.performHurtAnimation();
            return true;
        }
        // Get the chicken to drop an egg
        if (target instanceof ChickenEntity) {
            target.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
            target.entityDropItem(Items.EGG);
        }
        return false;
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
        world.playSound(context.getPlayer(), blockPos, DWMSoundEvents.SONIC_SCREWDRIVER, SoundCategory.AMBIENT, 1.0f, 1.0f);
        if (world.isRemote)
            return super.onItemUse(context);
        if (!world.isAirBlock(blockPos)) {
            BlockState blockState = world.getBlockState(blockPos);
            PlayerEntity playerEntity = context.getPlayer();
            handleBlockInteraction(world, playerEntity, blockState, blockPos);
            return ActionResultType.SUCCESS;
        }
        return super.onItemUse(context);
    }


}
