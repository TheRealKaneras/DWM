package com.softetch.dwm.common.world.schematic;

import com.softetch.dwm.DWMMain;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.resources.IResource;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SchematicLoader {
    public static SchematicFile testInterior;

    public static void register() {
        try {
            testInterior = load(new ResourceLocation(DWMMain.MOD_ID, "schematics/test_interior.schem"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static SchematicFile load(ResourceLocation location) throws IOException {
        IResource resource = Minecraft.getInstance().getResourceManager().getResource(location);
        CompoundNBT nbt = CompressedStreamTools.readCompressed(resource.getInputStream());
        return new SchematicFile(nbt);
    }

    /**
     * Generate a structure from a schematic file in the world
     * @param schematic the schematic file to generate the structure from
     * @param world the world to generate the structure in
     * @param startPos the position to start the structure generation from
     * @param interval how often a block should be placed in millis (0 for blocks to be placed all at once. Recommended: >15)
     * @param skipAir whether air be set as a block
     */
    public static void generateSchematic(SchematicFile schematic, World world, BlockPos startPos, long interval, boolean skipAir) {
        new Thread(() -> {
            int x;
            int y;
            int z;
            for (int i = 0; i < schematic.getBlockData().length; i++) {
                if (skipAir && schematic.getAirValue() >= 0 && schematic.getBlockData()[i] == schematic.getAirValue()) {
                    continue;
                }
                BlockState blockState = getBlockState(getBlockFromPalette(schematic.getPalette(), schematic.getBlockData()[i]));
                x = (i % (schematic.getWidth() * schematic.getLength())) % schematic.getWidth();
                y = i / (schematic.getWidth() * schematic.getLength());
                z = (i % (schematic.getWidth() * schematic.getLength())) / schematic.getWidth();
                int[] offset = schematic.getOffset();
                BlockPos finalPos = startPos.add(x, y, z).add(new Vec3i(offset[0], offset[1], offset[2]));
                world.setBlockState(finalPos, blockState);
                if (interval > 0) {
                    try {
                        Thread.sleep(interval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            for (INBT tileEntityNBT : schematic.getTileEntities()) {
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

    /**
     * Get the BlockState from a given string input
     * @param blockInput the string input containing the block and its properties
     * @return the BlockState found
     */
    private static BlockState getBlockState(String blockInput) {
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

    private static CompoundNBT getBlockProperties(String properties) {
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

    private static String getBlockFromPalette(HashMap<String, Integer> palette, int id) {
        for (Map.Entry<String, Integer> entries : palette.entrySet()) {
            if (entries.getValue() == id)
                return entries.getKey();
        }
        return null;
    }
}
