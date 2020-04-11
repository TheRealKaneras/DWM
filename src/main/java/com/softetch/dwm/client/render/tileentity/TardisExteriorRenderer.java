package com.softetch.dwm.client.render.tileentity;

import com.mojang.blaze3d.platform.GlStateManager;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.tileentity.tardis.BrachackiBoxModel;
import com.softetch.dwm.common.tileentity.TardisTileEntity;
import net.minecraft.util.ResourceLocation;

public class TardisExteriorRenderer extends DWMTileEntityRenderer<TardisTileEntity> {

    public TardisExteriorRenderer() {
        super(new BrachackiBoxModel(), new ResourceLocation(DWMMain.MOD_ID, "textures/tileentity/tardis/brachacki_box.png"));
    }

    @Override
    public void render(TardisTileEntity tileEntity, double x, double y, double z, float partialTicks, int destroyStage) {
        GlStateManager.pushMatrix();
        ((BrachackiBoxModel) getModel()).doorRotation(tileEntity.getDoorProgression(), tileEntity.getDoorState());
        super.render(tileEntity, x, y, z, partialTicks, destroyStage);
        GlStateManager.popMatrix();
    }
}
