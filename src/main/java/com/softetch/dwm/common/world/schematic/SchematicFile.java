package com.softetch.dwm.common.world.schematic;

import com.google.gson.reflect.TypeToken;
import com.softetch.dwm.DWMMain;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;

import java.lang.reflect.Type;
import java.util.HashMap;

public class SchematicFile {
    private final short width;
    private final short length;
    private final HashMap<String, Integer> palette;
    private final byte[] blockData;
    private final ListNBT tileEntities;
    private final int airValue;
    private final int[] offset;

    public SchematicFile(CompoundNBT tag) {
        this.width = tag.getShort("Width");
        this.length = tag.getShort("Length");

        Type type = new TypeToken<HashMap<String, Integer>>(){}.getType();
        this.palette = DWMMain.GSON.fromJson(tag.get("Palette").toString(), type);

        this.blockData = tag.getByteArray("BlockData");

        this.tileEntities = tag.getList("BlockEntities", 10);

        if (palette.get("minecraft:air") != null) {
            this.airValue = palette.get("minecraft:air");
        } else {
            this.airValue = -1;
        }

        this.offset = tag.getIntArray("Offset");
    }

    public short getWidth() {
        return width;
    }

    public short getLength() {
        return length;
    }

    public HashMap<String, Integer> getPalette() {
        return palette;
    }

    public byte[] getBlockData() {
        return blockData;
    }

    public ListNBT getTileEntities() {
        return tileEntities;
    }

    public int getAirValue() {
        return airValue;
    }

    public int[] getOffset() {
        return offset;
    }
}
