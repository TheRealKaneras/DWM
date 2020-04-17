package com.softetch.dwm.client.model.tileentity.tardis;

import com.softetch.dwm.common.tileentity.TardisTileEntity;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class ChestModel extends AbstractTardisExteriorModel {
	private final RendererModel base;
	private final RendererModel lid;

	public ChestModel() {
		textureWidth = 64;
		textureHeight = 64;

		base = new RendererModel(this);
		base.setRotationPoint(0.0F, 24.0F, 0.0F);
		base.cubeList.add(new ModelBox(base, 0, 19, -7.0F, -10.0F, -7.0F, 14, 10, 14, 0.0F, false));

		lid = new RendererModel(this);
		lid.setRotationPoint(0.0F, 14.0F, 7.0F);
		lid.cubeList.add(new ModelBox(lid, 0, 0, -7.0F, -4.0F, -14.0F, 14, 4, 14, 0.0F, false));
		lid.cubeList.add(new ModelBox(lid, 0, 0, -1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F, false));
	}

	@Override
	public void render(float scale) {
		base.render(scale);
		lid.render(scale);
	}

	@Override
	public void doorRotation(TardisTileEntity.DoorState doorState, float progression) {
		float angle = progression * 1.35f;
		this.lid.rotateAngleX = -angle;
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}