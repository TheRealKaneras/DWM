package com.softetch.dwm.client.render.tileentity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.tileentity.tardis.interior.ClassicDoorsModel;
import com.softetch.dwm.common.tileentity.ClassicDoorsTile;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;

public class ClassicDoorsRenderer extends DoorTileRenderer<ClassicDoorsTile> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(DWMMain.MOD_ID, "textures/tileentity/tardis/classic_doors.png");
    public ClassicDoorsRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn, new ClassicDoorsModel(), TEXTURE);
    }
}
