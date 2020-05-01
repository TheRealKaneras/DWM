package com.softetch.dwm.common.world.schematic;

import com.softetch.dwm.DWMMain;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.resources.IResource;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class SchematicLoader {
    public static SchematicFile test;

    public static void register() {
        try {
            test = load(new ResourceLocation(DWMMain.MOD_ID, "schematics/test.schem"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static SchematicFile load(ResourceLocation location) throws IOException {
        IResource resource = Minecraft.getInstance().getResourceManager().getResource(location);
        CompoundNBT nbt = CompressedStreamTools.readCompressed(resource.getInputStream());
        return new SchematicFile(nbt);
    }
}
