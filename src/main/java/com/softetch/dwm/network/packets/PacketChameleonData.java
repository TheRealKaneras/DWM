package com.softetch.dwm.network.packets;

import com.softetch.dwm.common.tardis.TardisLoader;
import com.softetch.dwm.common.tileentity.TardisTileEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class PacketChameleonData {
    private BlockPos pos;
    private int chameleonId;

    public PacketChameleonData() {
    }

    public PacketChameleonData(BlockPos pos, int chameleonId) {
        this.pos = pos;
        this.chameleonId = chameleonId;
    }

    public static void encode(PacketChameleonData message, PacketBuffer buffer) {
        buffer.writeBlockPos(message.pos);
        buffer.writeInt(message.chameleonId);
    }

    public static PacketChameleonData decode(PacketBuffer buffer) {
        return new PacketChameleonData(buffer.readBlockPos(), buffer.readInt());
    }

    public static void handle(final PacketChameleonData message, Supplier<NetworkEvent.Context> context) {
        context.get().enqueueWork(() -> {
            TileEntity tileEntity = context.get().getSender().world.getTileEntity(message.pos);
            if (tileEntity instanceof TardisTileEntity) {
                TardisTileEntity tardisTile = ((TardisTileEntity) tileEntity);
                TardisLoader.updateTardis(tardisTile.getData());
            }
        });
        context.get().setPacketHandled(true);
    }

}
