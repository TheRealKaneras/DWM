package com.softetch.dwm.common.block;

import com.softetch.dwm.common.tileentity.DoorTypeTile;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public abstract class SmartDoorBlock extends DWMTileEntityBlock {
    protected SmartDoorBlock(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult p_225533_6_) {
        if (!toggleOnInteract())
            return super.onBlockActivated(state, world, pos, player, hand, p_225533_6_);
        if (!world.isRemote() && world.getTileEntity(pos) instanceof DoorTypeTile && hand == Hand.MAIN_HAND) {
            ((DoorTypeTile) world.getTileEntity(pos)).toggleDoor();
            return ActionResultType.SUCCESS;
        }
        return super.onBlockActivated(state, world, pos, player, hand, p_225533_6_);
    }

    protected boolean toggleOnInteract() {
        return true;
    }
}
