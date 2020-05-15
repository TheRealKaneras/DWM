package com.softetch.dwm.client.render.tileentity;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.smdl.SMDLModelLoader;
import com.softetch.dwm.client.tardis.chameleon.BaseChameleonData;
import com.softetch.dwm.common.tileentity.TardisExteriorTile;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;

import java.io.IOException;

public class TardisExteriorRenderer extends SMDLTileEntityRenderer<TardisExteriorTile> {
    private BaseChameleonData chameleonData;

    public TardisExteriorRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher, SMDLModelLoader.loadModelEnvironment(DWMMain.MOD_ID, "newbery_box_c"));
    }

//    @Override
//    public void render(TardisExteriorTile tileEntity, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int combinedLight, int combinedOverlay) {
//        if (tileEntity.getChameleonData() != null && (chameleonData == null || !chameleonData.getName().equals(tileEntity.getChameleon()))) {
//            chameleonData = tileEntity.getChameleonData();
//            setModel(chameleonData.getModel());
//            setTexture(chameleonData.getTexture());
//        } else if (tileEntity.getChameleonData() == null) {
//            return;
//        }
//        chameleonData.getModel().doorRotation(tileEntity.getDoorState(), tileEntity.getDoorProgression());
//        super.render(tileEntity, partialTicks, matrixStack, buffer, combinedLight, combinedOverlay);
//    }
}
