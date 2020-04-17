package com.softetch.dwm.common.block;

import com.softetch.dwm.common.tileentity.TardisTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class TardisBlock extends DWMTileEntityBlock {
    private final String exteriorName;
    public TardisBlock(String exteriorName) {
        super(Block.Properties.create(Material.WOOD));
        this.exteriorName = exteriorName;
    }

    /**
     * Called by ItemBlocks after a block is set in the world, to allow post-place logic
     */
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
        if (!worldIn.isRemote) {
            TardisTileEntity tileEntity = (TardisTileEntity) worldIn.getTileEntity(pos);
            if (tileEntity != null) {
                tileEntity.setOwnerUuid(placer.getUniqueID().toString());
                tileEntity.setChameleon(exteriorName);
            }
        }
    }

    /**
     * Called throughout the code as a replacement for ITileEntityProvider.createNewTileEntity
     * Return the same thing you would from that function.
     * This will fall back to ITileEntityProvider.createNewTileEntity(World) if this block is a ITileEntityProvider
     *
     * @param state The state of the current block
     * @param world The world to create the TE in
     * @return A instance of a class extending TileEntity
     */
    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new TardisTileEntity();
    }

}
