package com.softetch.dwm.client.render.tileentity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.model.smdl.SMDLModel;
import com.softetch.dwm.client.model.smdl.SMDLModelLoader;
import com.softetch.dwm.client.tardis.ChameleonRegistry;
import com.softetch.dwm.client.tardis.chameleon.AbstractChameleonData;
import com.softetch.dwm.common.tileentity.TardisExteriorTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class TardisExteriorRenderer extends DWMTileEntityRenderer<TardisExteriorTile> {
    private AbstractChameleonData chameleonData;

    public TardisExteriorRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher, null, DWMMain.CHAMELEON_REGISTRY.getDefaultSkin().getTexture());
        try {
            this.setModel(SMDLModelLoader.loadModel(DWMMain.MOD_ID, "newbery_box_c"));
        } catch (IOException e) {
            e.printStackTrace();
        }
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
