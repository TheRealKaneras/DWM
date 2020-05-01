package com.softetch.dwm.common.world.schematic;

import com.google.gson.reflect.TypeToken;
import com.softetch.dwm.DWMMain;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SchematicFile {
    private final short width;
    private final short height;
    private final short length;
    private final HashMap<String, Integer> palette;
    private final byte[] blockData;
    private final ListNBT tileEntities;

    public SchematicFile(CompoundNBT tag) {
        this.width = tag.getShort("Width");
        this.height = tag.getShort("Height");
        this.length = tag.getShort("Length");

        Type type = new TypeToken<HashMap<String, Integer>>(){}.getType();
        this.palette = DWMMain.GSON.fromJson(tag.get("Palette").toString(), type);

        this.blockData = tag.getByteArray("BlockData");

        this.tileEntities = tag.getList("BlockEntities", 10);
    }

    public void generate(World world, BlockPos startPos, boolean immediate) {
        new Thread(() -> {
            int x;
            int y;
            int z;
            for (int i = 0; i < blockData.length; i++) {
                x = (i % (width * length)) % width;
                y = i / (width * length);
                z = (i % (width * length)) / width;
                BlockState blockState = getBlockState(Objects.requireNonNull(getBlockFromPalette(blockData[i])));
                BlockPos finalPos = startPos.add(x, y, z);
                world.setBlockState(finalPos, blockState);
                if (!immediate) {
                    try {
                        Thread.sleep(15);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            for (INBT tileEntityNBT : tileEntities) {
                CompoundNBT tileEntityData = (CompoundNBT) tileEntityNBT;
                int[] pos = tileEntityData.getIntArray("Pos");
                BlockPos blockPos = startPos.add(pos[0], pos[1], pos[2]);
                BlockState blockState = world.getBlockState(blockPos);
                if (blockState.hasTileEntity()) {
                    int[] newPos = new int[] {blockPos.getX(), blockPos.getY(), blockPos.getZ()};
                    tileEntityData.putIntArray("Pos", newPos);
                    TileEntity tileEntity = world.getBlockState(blockPos).createTileEntity(world);
                    tileEntity.read(tileEntityData);
                    world.setTileEntity(blockPos, tileEntity);
                }
            }
        }).start();
    }

    private BlockState getBlockState(String blockInput) {
        CompoundNBT blockNBT = new CompoundNBT();
        String blockId;
        if (blockInput.contains("[")) {
            blockId = blockInput.substring(0, blockInput.indexOf('['));

            String properties = blockInput.substring(blockInput.indexOf('['));
            blockNBT.put("Properties", getBlockProperties(properties));
        } else {
            blockId = blockInput;
        }
        blockNBT.putString("Name", blockId);
        return NBTUtil.readBlockState(blockNBT);
    }

    private CompoundNBT getBlockProperties(String properties) {
        CompoundNBT blockProperties = new CompoundNBT();
        if (properties.contains(",")) {
            for (String property : properties.split(",")) {
                String[] entry = property.replaceAll("[\\[\\]]", "").split("=");
                blockProperties.putString(entry[0], entry[1]);
            }
        } else {
            String[] entry = properties.replaceAll("[\\[\\]]", "").split("=");
            blockProperties.putString(entry[0], entry[1]);
        }
        return blockProperties;
    }

    private String getBlockFromPalette(int id) {
        for (Map.Entry<String, Integer> entries : palette.entrySet()) {
            if (entries.getValue() == id)
                return entries.getKey();
        }
        return null;
    }

}
