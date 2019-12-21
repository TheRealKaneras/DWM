package com.softetch.dwm.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;

import javax.annotation.Nullable;

/**
 * Class containing properties and methods required specifically for a roundel block.
 */
public class RoundelBlock extends HorizontalBlock {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    /**
     * Set up the roundel block with a default FACING state to NORTH.
     */
    public RoundelBlock() {
        super(Block.Properties.create(Material.WOOD, MaterialColor.BLACK).hardnessAndResistance(1.5f));
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    /**
     * Getter for the block state with properties when the block is placed.
     * @param context How the block was placed
     * @return the state of the block when placed
     */
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing());
    }

    /**
     * Construct the state container, adding the properties required.
     * @param builder The builder class for state containers
     */
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
