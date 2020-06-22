package com.softetch.dwm.common.tardis;

import java.util.HashMap;
import java.util.UUID;

public class DWMTardis {
    private static final int INTERIOR_CHUNKS = 16; // the number of chunks each TARDIS is given for the interior
    private final int[] nextInteriorSpot = new int[] {0, 0};
    private final HashMap<UUID, TardisData> tardises = new HashMap<>();

//    private int[] newInterior(SchematicFile interior) {
//        World world = DimensionManager.getWorld(Minecraft.getInstance().getIntegratedServer(), DWMDimensions.TARDIS.getDimensionType(), false, true);
//        SchematicLoader.generateSchematic(interior, world, new BlockPos(nextInteriorSpot[0] * INTERIOR_CHUNKS * 16, 60, nextInteriorSpot[1] * INTERIOR_CHUNKS * 16), 20, true);
//        int[] interiorPos = nextInteriorSpot;
//        nextInteriorSpot[0]++;
//        nextInteriorSpot[1]++;
//        return interiorPos;
//    }
//
//    public void createTardis(TardisExteriorTile tile, SchematicFile interior) {
//        int[] interiorPos = newInterior(interior);
//        int[] exteriorPos = new int[] { tile.getPos().getX(), tile.getPos().getY(), tile.getPos().getZ() };
//        String dim = tile.getWorld().getDimension().getType().getRegistryName().toString();
//        tardises.put(tile.getUUID(), new TardisData(dim, exteriorPos, interiorPos));
//    }

    public void loadTardises() {

    }

    public void saveTardises() {

    }
}
