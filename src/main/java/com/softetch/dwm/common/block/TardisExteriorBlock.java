package com.softetch.dwm.common.block;

import com.softetch.dwm.common.tileentity.TardisExteriorTile;
import com.softetch.dwm.common.world.dimension.DWMDimensions;
import com.softetch.dwm.common.world.schematic.SchematicLoader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.DimensionManager;

import javax.annotation.Nullable;

public class TardisExteriorBlock extends DWMTileEntityBlock {
    private final String exteriorName;

    public TardisExteriorBlock(String exteriorName) {
        super(Block.Properties.create(Material.WOOD).lightValue(12).doesNotBlockMovement());
        this.exteriorName = exteriorName;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        if (world.getTileEntity(pos) instanceof TardisExteriorTile) {
            TardisExteriorTile tardis = (TardisExteriorTile) world.getTileEntity(pos);
            if (tardis.getChameleonData() != null) {
                return tardis.getChameleonData().getShape();
            }
        }
        return super.getShape(state, world, pos, context);
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    /**
     * Called by ItemBlocks after a block is set in the world, to allow post-place logic
     */
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
        if (!worldIn.isRemote) {
            TardisExteriorTile tileEntity = (TardisExteriorTile) worldIn.getTileEntity(pos);
            if (tileEntity != null) {
                tileEntity.setOwnerUuid(placer.getUniqueID().toString());
                tileEntity.setChameleon(exteriorName);
                tileEntity.setInteriorPos(new BlockPos(0,20,0));
                World interiorWorld = DimensionManager.getWorld(Minecraft.getInstance().getIntegratedServer(), DWMDimensions.TARDIS.getDimensionType(), false, true);
                SchematicLoader.generateSchematic(SchematicLoader.testInterior, interiorWorld, new BlockPos(0, 20, 0), 0L, false);
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
        return new TardisExteriorTile();
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isRemote() && world.getTileEntity(pos) instanceof TardisExteriorTile) {
            TardisExteriorTile tardis = (TardisExteriorTile) world.getTileEntity(pos);
            if (tardis.getInteriorPos() != null) {
                if (entity instanceof ServerPlayerEntity) {
                    ServerPlayerEntity player = (ServerPlayerEntity) entity;
                    ServerWorld nextWorld = player.getServer().getWorld(DWMDimensions.TARDIS.getDimensionType());
                    nextWorld.getChunk(tardis.getInteriorPos());    // make sure the chunk is loaded
                    BlockPos dest = tardis.getInteriorPos();
                    player.teleport(nextWorld, dest.getX(), dest.getY(), dest.getZ(), player.getPitchYaw().y, player.getPitchYaw().x);
                }
            }
        }
    }

    @Override
    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return true;
    }
}
