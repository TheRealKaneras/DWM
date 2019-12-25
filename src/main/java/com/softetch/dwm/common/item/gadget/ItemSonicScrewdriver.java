package com.softetch.dwm.common.item.gadget;

import com.google.common.collect.Maps;
import com.softetch.dwm.DWMSounds;
import net.minecraft.block.*;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
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
public class ItemSonicScrewdriver extends Item {
    private final Map<Block, Item> smeltingResults = Maps.newHashMap();

    /**
     * Creates a new sonic screwdriver
     */
    public ItemSonicScrewdriver() {
        super(new Item.Properties().group(ItemGroup.TOOLS));
    }

    /**
     * Handles all interactions with blocks
     * @param world - the world that the item is used in
     * @param playerEntity - the player entity using the item
     * @param blockState - the block state of the block that has been interacted with
     * @param blockPos - the block pos of the block that has been interacted with
     */
    private void handleBlockInteraction(World world, PlayerEntity playerEntity, BlockState blockState, BlockPos blockPos) {
        // Open/close iron door
        if (blockState.getBlock() == Blocks.IRON_DOOR) {
            ((DoorBlock) blockState.getBlock()).toggleDoor(world, blockPos, !blockState.get(DoorBlock.OPEN));
        }
        // Open/close iron trapdoor
        if (blockState.getBlock() == Blocks.IRON_TRAPDOOR) {
            BlockState newBlockState = blockState.cycle(TrapDoorBlock.OPEN);
            world.setBlockState(blockPos, newBlockState, 2);
            if (newBlockState.get(TrapDoorBlock.WATERLOGGED)) {
                world.getPendingFluidTicks().scheduleTick(blockPos, Fluids.WATER, Fluids.WATER.getTickRate(world));
            }
            SoundEvent soundEvent = newBlockState.get(TrapDoorBlock.OPEN) ? SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN : SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE;
            world.playSound(blockPos.getX(), blockPos.getY(), blockPos.getZ(), soundEvent, SoundCategory.BLOCKS, 1.0f, 1.0f,false);
        }
        // Ignite TNT
        if (blockState.getBlock() == Blocks.TNT) {
            blockState.getBlock().catchFire(blockState, world, blockPos, Direction.UP, playerEntity);
            world.destroyBlock(blockPos, false);
        }
        // Toggle redstone lamp being lit
        if (blockState.getBlock() == Blocks.REDSTONE_LAMP) {
            BlockState newBlockState = blockState.cycle(RedstoneLampBlock.LIT);
            world.setBlockState(blockPos, newBlockState, 2);
        }
        // Smelt ores
        if (blockState.getBlock() instanceof OreBlock) {
            Item item = getSmeltingResult(world, blockState.getBlock());
            if (item != null) {
                InventoryHelper.spawnItemStack(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), new ItemStack(item));
                world.destroyBlock(blockPos, false);
            }
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
        target.world.playSound(target.posX, target.posY, target.posZ, DWMSounds.sonicScrewdriver, SoundCategory.AMBIENT, 1.0f, 1.0f,false);
        if (playerEntity.world.isRemote)
            return false;
        // Allow for abilities such as shearing sheep
        if (target instanceof IShearable) {
            IShearable shearableEntity = (IShearable) target;
            BlockPos pos = new BlockPos(target.posX, target.posY, target.posZ);
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
        world.playSound(context.getPlayer(), blockPos, DWMSounds.sonicScrewdriver, SoundCategory.AMBIENT, 1.0f, 1.0f);
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
