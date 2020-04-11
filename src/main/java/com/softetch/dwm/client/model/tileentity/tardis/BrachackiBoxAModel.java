package com.softetch.dwm.client.model.tileentity.tardis;

import com.softetch.dwm.common.tileentity.TardisTileEntity;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class BrachackiBoxAModel extends AbstractTardisExteriorModel {
	private final RendererModel box;
	private final RendererModel lamp;
	private final RendererModel bone2;
	private final RendererModel bone4;
	private final RendererModel bone7;
	private final RendererModel bone5;
	private final RendererModel bone8;
	private final RendererModel bone6;
	private final RendererModel bone9;
	private final RendererModel bone10;
	private final RendererModel bone16;
	private final RendererModel bone11;
	private final RendererModel bone13;
	private final RendererModel bone12;
	private final RendererModel bone37;
	private final RendererModel bone14;
	private final RendererModel bone15;
	private final RendererModel bone19;
	private final RendererModel bone17;
	private final RendererModel bone18;
	private final RendererModel bone21;
	private final RendererModel bone20;
	private final RendererModel bone23;
	private final RendererModel bone24;
	private final RendererModel bone22;
	private final RendererModel bone25;
	private final RendererModel bone27;
	private final RendererModel bone26;
	private final RendererModel bone28;
	private final RendererModel bone29;
	private final RendererModel bone30;
	private final RendererModel bone31;
	private final RendererModel bone32;
	private final RendererModel bone33;
	private final RendererModel bone34;
	private final RendererModel rightDoor;
	private final RendererModel bone41;
	private final RendererModel bone3;
	private final RendererModel bone39;
	private final RendererModel bone36;
	private final RendererModel bone42;
	private final RendererModel bone40;
	private final RendererModel bone38;
	private final RendererModel leftDoor;
	private final RendererModel bone35;
	private final RendererModel bone43;
	private final RendererModel bone44;
	private final RendererModel bone45;
	private final RendererModel bone46;
	private final RendererModel bone47;
	private final RendererModel bone48;

	public BrachackiBoxAModel() {
		textureWidth = 512;
		textureHeight = 512;

		box = new RendererModel(this);
		box.setRotationPoint(0.0F, 24.0F, 0.0F);
		box.cubeList.add(new ModelBox(box, 332, 257, -10.0F, -1.0F, -10.0F, 20, 1, 20, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -39.0F, -8.0F, 16, 3, 16, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 99, 438, -7.5F, -39.8F, -7.5F, 15, 3, 15, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -7.0F, -39.9F, -7.0F, 14, 3, 14, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 99, 438, -6.5F, -40.0F, -6.5F, 13, 3, 13, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -6.0F, -40.1F, -6.0F, 12, 3, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 99, 438, -5.5F, -40.2F, -5.5F, 11, 3, 11, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -5.0F, -40.3F, -5.0F, 10, 3, 10, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 99, 438, -4.5F, -40.4F, -4.5F, 9, 3, 9, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -4.0F, -40.5F, -4.0F, 8, 3, 8, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 99, 438, -3.5F, -40.6F, -3.5F, 7, 3, 7, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 99, 438, -2.5F, -40.8F, -2.5F, 5, 3, 5, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -3.0F, -40.7F, -3.0F, 6, 3, 6, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 99, 438, -1.5F, -41.2F, -1.5F, 3, 3, 3, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 276, 59, 0.25F, -44.0F, -1.25F, 1, 3, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 276, 59, 0.25F, -44.0F, 0.25F, 1, 3, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 276, 59, -1.25F, -44.0F, -1.25F, 1, 3, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 276, 59, -1.25F, -44.0F, 0.25F, 1, 3, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 99, 438, -1.5F, -44.2F, -1.5F, 3, 1, 3, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -2.0F, -40.9F, -2.0F, 4, 3, 4, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 1, 1, 8.0F, -38.0F, -9.5F, 1, 37, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 1, 1, 8.0F, -38.0F, 7.0F, 1, 37, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 1, 1, -8.5F, -38.0F, -9.5F, 1, 37, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 1, 1, 8.0F, -38.0F, -9.0F, 1, 37, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 1, 1, 8.0F, -38.0F, 7.5F, 1, 37, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 8.0F, -39.0F, 8.0F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 8.0F, -39.0F, -8.5F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.5F, -39.0F, 8.0F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.5F, -39.0F, -8.5F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.5F, -39.0F, 8.0F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.5F, -39.0F, -8.5F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -9.0F, -39.0F, 8.0F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -9.0F, -39.0F, -8.5F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 8.0F, -39.0F, 7.5F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 8.0F, -39.0F, -9.0F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.5F, -39.0F, 7.5F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.5F, -39.0F, -9.0F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.5F, -39.0F, 7.5F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.5F, -39.0F, -9.0F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -9.0F, -39.0F, 7.5F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -9.0F, -39.0F, -9.0F, 1, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 1, 1, -8.5F, -38.0F, 7.5F, 1, 37, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.5F, -38.0F, -9.0F, 2, 37, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.5F, -38.0F, 7.5F, 2, 37, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -9.0F, -38.0F, -9.0F, 2, 37, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -38.0F, -9.0F, 2, 37, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -9.5F, -38.0F, -9.0F, 2, 37, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -9.5F, -38.0F, 7.5F, 2, 37, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.5F, -38.0F, -8.5F, 2, 37, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.5F, -38.0F, 8.0F, 2, 37, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -9.0F, -38.0F, 8.0F, 2, 37, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -38.0F, 8.0F, 2, 37, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -9.5F, -38.0F, -8.5F, 2, 37, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -9.5F, -38.0F, 8.0F, 2, 37, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 1, 1, 7.5F, -38.0F, -9.5F, 1, 37, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 1, 1, -9.0F, -38.0F, -9.5F, 1, 37, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 1, 1, -9.0F, -38.0F, 7.0F, 1, 37, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 1, 1, 7.5F, -38.0F, 7.5F, 1, 37, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 1, 1, -9.0F, -38.0F, -9.0F, 1, 37, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 1, 1, -9.0F, -38.0F, 7.5F, 1, 37, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 6.0F, -33.0F, 7.0F, 1, 32, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -33.0F, -7.0F, 1, 32, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -33.0F, -7.0F, 1, 32, 1, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -6.0F, -4.0F, 7.0F, 12, 3, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -4.0F, -6.0F, 1, 3, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -4.0F, -6.0F, 1, 3, 12, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -6.0F, -11.0F, 7.0F, 12, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -6.0F, -11.5F, 7.0F, 12, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -11.5F, -6.0F, 1, 1, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -11.5F, -6.0F, 1, 1, 12, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -6.0F, -18.0F, 7.0F, 12, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -18.0F, -6.0F, 1, 1, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -18.0F, -6.0F, 1, 1, 12, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -6.0F, -18.5F, 7.0F, 12, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -18.5F, -6.0F, 1, 1, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -18.5F, -6.0F, 1, 1, 12, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -6.0F, -25.0F, 7.0F, 12, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -25.0F, -6.0F, 1, 1, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -25.0F, -6.0F, 1, 1, 12, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -6.0F, -25.5F, 7.0F, 12, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -25.5F, -6.0F, 1, 1, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -25.5F, -6.0F, 1, 1, 12, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -6.0F, -33.0F, 7.0F, 12, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -33.0F, -6.0F, 1, 1, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -33.0F, -6.0F, 1, 1, 12, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 345, 233, -7.0F, -34.0F, 7.2F, 14, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 345, 233, -7.0F, -34.0F, -8.2F, 14, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 345, 233, 7.2F, -34.0F, -7.0F, 1, 1, 14, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 345, 233, -8.2F, -34.0F, -7.0F, 1, 1, 14, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -7.0F, -34.3F, 7.4F, 14, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -7.0F, -34.3F, -8.4F, 14, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.4F, -34.3F, -7.0F, 1, 1, 14, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.4F, -34.3F, -7.0F, 1, 1, 14, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 345, 233, -7.0F, -34.6F, 7.6F, 14, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 345, 233, -7.0F, -34.6F, -8.6F, 14, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 345, 233, 7.6F, -34.6F, -7.0F, 1, 1, 14, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 345, 233, -8.6F, -34.6F, -7.0F, 1, 1, 14, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 321, 334, -8.0F, -34.0F, 8.0F, 16, 0, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -8.0F, -34.0F, -10.0F, 16, 0, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, 8.0F, -34.0F, -8.0F, 2, 0, 16, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -10.0F, -34.0F, -8.0F, 2, 0, 16, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 321, 334, 6.0F, -36.0F, 8.0F, 2, 2, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, 6.0F, -36.0F, -10.0F, 2, 2, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, 8.0F, -36.0F, -8.0F, 2, 2, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -10.0F, -36.0F, -8.0F, 2, 2, 2, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 44, 376, -6.0F, -36.0F, 9.2F, 12, 2, 0, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 44, 376, -6.0F, -36.0F, -9.2F, 12, 2, 0, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 44, 376, 9.2F, -36.0F, -6.0F, 0, 2, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 44, 376, -9.2F, -36.0F, -6.0F, 0, 2, 12, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 321, 334, -8.0F, -36.0F, 8.0F, 2, 2, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -8.0F, -36.0F, -10.0F, 2, 2, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, 8.0F, -36.0F, 6.0F, 2, 2, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -10.0F, -36.0F, 6.0F, 2, 2, 2, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 321, 334, -8.0F, -36.0F, 8.0F, 16, 0, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -8.0F, -36.0F, -10.0F, 16, 0, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, 8.0F, -36.0F, -8.0F, 2, 0, 16, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 321, 334, -10.0F, -36.0F, -8.0F, 2, 0, 16, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 345, 233, -7.0F, -24.0F, 6.6F, 14, 20, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 347, 223, 6.6F, -24.0F, -6.0F, 1, 20, 13, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 345, 222, -7.6F, -24.0F, -6.0F, 1, 20, 13, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -6.0F, -32.5F, 7.0F, 12, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -32.5F, -6.0F, 1, 1, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -32.5F, -6.0F, 1, 1, 12, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 428, 260, -6.0F, -31.5F, 6.7F, 12, 6, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 428, 260, 6.7F, -31.5F, -6.0F, 1, 6, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 428, 260, -7.7F, -31.5F, -6.0F, 1, 6, 12, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -0.75F, -31.5F, 7.0F, 2, 28, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -31.5F, -1.25F, 1, 28, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -31.5F, -1.25F, 1, 28, 2, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 345, 233, -0.5F, -33.0F, 7.2F, 1, 32, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 345, 233, 7.2F, -33.0F, -0.5F, 1, 32, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 345, 233, -8.2F, -33.0F, -0.5F, 1, 32, 1, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -1.25F, -31.5F, 7.0F, 2, 28, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -31.5F, -0.75F, 1, 28, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -31.5F, -0.75F, 1, 28, 2, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 1, -7.0F, -33.0F, 7.0F, 1, 32, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, 7.0F, -33.0F, 6.0F, 1, 32, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 1, -8.0F, -33.0F, 6.0F, 1, 32, 1, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 374, 54, -7.0F, -33.0F, 5.0F, 14, 32, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 374, 54, 6.0F, -33.0F, -2.0F, 1, 32, 7, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 374, 54, -7.0F, -33.0F, -2.0F, 1, 32, 7, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 374, 54, -7.0F, -34.0F, -8.0F, 14, 1, 14, 0.0F, false));

		lamp = new RendererModel(this);
		lamp.setRotationPoint(-8.0F, -8.0F, 8.0F);
		box.addChild(lamp);
		lamp.cubeList.add(new ModelBox(lamp, 428, 260, 7.0F, -36.0F, -9.0F, 2, 4, 2, 0.0F, false));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(0.0F, -31.5F, 8.0F);
		setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
		box.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 24, 312, -6.0F, 0.0F, -1.0F, 12, 1, 1, 0.0F, false));

		bone4 = new RendererModel(this);
		bone4.setRotationPoint(0.0F, -28.5F, 8.0F);
		setRotationAngle(bone4, -0.7854F, 0.0F, 0.0F);
		box.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 24, 312, -6.0F, 0.0F, -1.0F, 12, 1, 1, 0.0F, false));

		bone7 = new RendererModel(this);
		bone7.setRotationPoint(2.83F, -28.5F, 8.0F);
		setRotationAngle(bone7, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 24, 312, 0.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone5 = new RendererModel(this);
		bone5.setRotationPoint(6.0F, -25.5F, 8.0F);
		setRotationAngle(bone5, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 24, 312, 0.0F, -6.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone8 = new RendererModel(this);
		bone8.setRotationPoint(4.41F, -28.5F, 8.0F);
		setRotationAngle(bone8, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 24, 312, 0.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone6 = new RendererModel(this);
		bone6.setRotationPoint(1.25F, -28.5F, 8.0F);
		setRotationAngle(bone6, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 24, 312, 0.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone9 = new RendererModel(this);
		bone9.setRotationPoint(-4.41F, -28.5F, 8.0F);
		setRotationAngle(bone9, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 24, 312, 0.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone10 = new RendererModel(this);
		bone10.setRotationPoint(-2.83F, -28.5F, 8.0F);
		setRotationAngle(bone10, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 24, 312, 0.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone16 = new RendererModel(this);
		bone16.setRotationPoint(-8.0F, -31.5F, 0.0F);
		setRotationAngle(bone16, 0.0F, 0.0F, -0.7854F);
		box.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 24, 312, 0.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, false));

		bone11 = new RendererModel(this);
		bone11.setRotationPoint(-1.25F, -28.5F, 8.0F);
		setRotationAngle(bone11, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 24, 312, 0.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone13 = new RendererModel(this);
		bone13.setRotationPoint(-8.0F, -25.5F, 6.0F);
		setRotationAngle(bone13, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 24, 312, 0.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, false));

		bone12 = new RendererModel(this);
		bone12.setRotationPoint(-6.0F, -25.5F, 8.0F);
		setRotationAngle(bone12, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 24, 312, 0.0F, -6.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone37 = new RendererModel(this);
		bone37.setRotationPoint(0.0F, -25.5F, 8.0F);
		setRotationAngle(bone37, -0.7854F, 0.0F, 0.0F);
		box.addChild(bone37);
		bone37.cubeList.add(new ModelBox(bone37, 24, 312, -6.0F, 0.0F, -1.0F, 12, 1, 1, 0.0F, false));

		bone14 = new RendererModel(this);
		bone14.setRotationPoint(-8.0F, -28.5F, 1.25F);
		setRotationAngle(bone14, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 24, 312, 0.0F, -3.0F, 0.0F, 1, 6, 1, 0.0F, false));

		bone15 = new RendererModel(this);
		bone15.setRotationPoint(-8.0F, -25.5F, 0.0F);
		setRotationAngle(bone15, 0.0F, 0.0F, -0.7854F);
		box.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 24, 312, 0.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, false));

		bone19 = new RendererModel(this);
		bone19.setRotationPoint(-8.0F, -28.5F, -6.0F);
		setRotationAngle(bone19, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 24, 312, 0.0F, -3.0F, 0.0F, 1, 6, 1, 0.0F, false));

		bone17 = new RendererModel(this);
		bone17.setRotationPoint(-8.0F, -28.5F, 0.0F);
		setRotationAngle(bone17, 0.0F, 0.0F, -0.7854F);
		box.addChild(bone17);
		bone17.cubeList.add(new ModelBox(bone17, 24, 312, 0.0F, 0.0F, -6.0F, 1, 1, 12, 0.0F, false));

		bone18 = new RendererModel(this);
		bone18.setRotationPoint(-8.0F, -28.5F, -1.25F);
		setRotationAngle(bone18, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 24, 312, 0.0F, -3.0F, 0.0F, 1, 6, 1, 0.0F, false));

		bone21 = new RendererModel(this);
		bone21.setRotationPoint(-8.0F, -25.5F, -2.83F);
		setRotationAngle(bone21, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 24, 312, 0.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, false));

		bone20 = new RendererModel(this);
		bone20.setRotationPoint(-8.0F, -25.5F, 2.83F);
		setRotationAngle(bone20, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 24, 312, 0.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, false));

		bone23 = new RendererModel(this);
		bone23.setRotationPoint(8.0F, -25.5F, 6.0F);
		setRotationAngle(bone23, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone23);
		bone23.cubeList.add(new ModelBox(bone23, 24, 312, -1.0F, -6.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone24 = new RendererModel(this);
		bone24.setRotationPoint(8.0F, -28.5F, 1.25F);
		setRotationAngle(bone24, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone24);
		bone24.cubeList.add(new ModelBox(bone24, 24, 312, -1.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone22 = new RendererModel(this);
		bone22.setRotationPoint(-8.0F, -25.5F, -4.41F);
		setRotationAngle(bone22, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 24, 312, 0.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, false));

		bone25 = new RendererModel(this);
		bone25.setRotationPoint(8.0F, -28.5F, -1.25F);
		setRotationAngle(bone25, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone25);
		bone25.cubeList.add(new ModelBox(bone25, 24, 312, -1.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone27 = new RendererModel(this);
		bone27.setRotationPoint(8.0F, -28.5F, 2.83F);
		setRotationAngle(bone27, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone27);
		bone27.cubeList.add(new ModelBox(bone27, 24, 312, -1.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone26 = new RendererModel(this);
		bone26.setRotationPoint(8.0F, -28.5F, -6.0F);
		setRotationAngle(bone26, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone26);
		bone26.cubeList.add(new ModelBox(bone26, 24, 312, -1.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone28 = new RendererModel(this);
		bone28.setRotationPoint(8.0F, -28.5F, -2.83F);
		setRotationAngle(bone28, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone28);
		bone28.cubeList.add(new ModelBox(bone28, 24, 312, -1.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone29 = new RendererModel(this);
		bone29.setRotationPoint(8.0F, -28.5F, -4.41F);
		setRotationAngle(bone29, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone29);
		bone29.cubeList.add(new ModelBox(bone29, 24, 312, -1.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone30 = new RendererModel(this);
		bone30.setRotationPoint(8.0F, -28.5F, 4.41F);
		setRotationAngle(bone30, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone30);
		bone30.cubeList.add(new ModelBox(bone30, 24, 312, -1.0F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		bone31 = new RendererModel(this);
		bone31.setRotationPoint(-8.0F, -25.5F, 4.41F);
		setRotationAngle(bone31, 0.0F, 0.7854F, 0.0F);
		box.addChild(bone31);
		bone31.cubeList.add(new ModelBox(bone31, 24, 312, 0.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, false));

		bone32 = new RendererModel(this);
		bone32.setRotationPoint(8.0F, -25.5F, 0.0F);
		setRotationAngle(bone32, 0.0F, 0.0F, -0.7854F);
		box.addChild(bone32);
		bone32.cubeList.add(new ModelBox(bone32, 24, 312, -1.0F, -1.0F, -6.0F, 1, 1, 12, 0.0F, false));

		bone33 = new RendererModel(this);
		bone33.setRotationPoint(8.0F, -28.5F, 0.0F);
		setRotationAngle(bone33, 0.0F, 0.0F, -0.7854F);
		box.addChild(bone33);
		bone33.cubeList.add(new ModelBox(bone33, 24, 312, -1.0F, -1.0F, -6.0F, 1, 1, 12, 0.0F, false));

		bone34 = new RendererModel(this);
		bone34.setRotationPoint(8.0F, -31.5F, 0.0F);
		setRotationAngle(bone34, 0.0F, 0.0F, -0.7854F);
		box.addChild(bone34);
		bone34.cubeList.add(new ModelBox(bone34, 24, 312, -1.0F, -1.0F, -6.0F, 1, 1, 12, 0.0F, false));

		rightDoor = new RendererModel(this);
		rightDoor.setRotationPoint(-7.0F, 23.0F, -7.0F);
		rightDoor.cubeList.add(new ModelBox(rightDoor, 0, 1, 0.0F, -32.0F, -1.0F, 1, 32, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 0, 1, 1.0F, -3.0F, -1.0F, 6, 3, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 0, 1, 1.0F, -10.0F, -1.0F, 6, 1, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 0, 1, 1.0F, -17.0F, -1.0F, 6, 1, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 0, 1, 1.0F, -24.0F, -1.0F, 6, 1, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 0, 1, 1.0F, -32.0F, -1.0F, 6, 1, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 0, 1, 1.0F, -31.5F, -1.0F, 6, 1, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 0, 1, 1.0F, -24.5F, -1.0F, 6, 1, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 0, 1, 1.0F, -17.5F, -1.0F, 6, 1, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 345, 233, 1.0F, -17.9F, -0.8F, 6, 1, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 345, 233, 1.0F, -23.6F, -0.8F, 6, 1, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 345, 233, 5.35F, -23.0F, -0.8F, 1, 6, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 345, 233, 0.4F, -23.0F, -0.8F, 1, 6, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 0, 1, 1.0F, -10.5F, -1.0F, 6, 1, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 0, 1, 5.75F, -30.5F, -1.0F, 1, 28, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 428, 260, 1.0F, -30.5F, -0.7F, 6, 6, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 345, 233, 6.5F, -32.0F, -1.2F, 1, 32, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 345, 233, 1.0F, -17.0F, -0.6F, 6, 14, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 24, 312, 1.0F, -23.0F, -0.6F, 6, 6, 1, 0.0F, false));
		rightDoor.cubeList.add(new ModelBox(rightDoor, 100, 357, 5.25F, -17.25F, -1.25F, 1, 1, 1, 0.0F, false));

		bone41 = new RendererModel(this);
		bone41.setRotationPoint(2.59F, -27.5F, -1.0F);
		setRotationAngle(bone41, 0.0F, -0.7854F, 0.0F);
		rightDoor.addChild(bone41);
		bone41.cubeList.add(new ModelBox(bone41, 24, 312, 0.0F, -3.0F, 0.0F, 1, 6, 1, 0.0F, false));

		bone3 = new RendererModel(this);
		bone3.setRotationPoint(7.0F, -24.5F, -1.0F);
		setRotationAngle(bone3, 0.7854F, 0.0F, 0.0F);
		rightDoor.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 24, 312, -6.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));

		bone39 = new RendererModel(this);
		bone39.setRotationPoint(5.75F, -27.5F, -1.0F);
		setRotationAngle(bone39, 0.0F, -0.7854F, 0.0F);
		rightDoor.addChild(bone39);
		bone39.cubeList.add(new ModelBox(bone39, 24, 312, 0.0F, -3.0F, 0.0F, 1, 6, 1, 0.0F, false));

		bone36 = new RendererModel(this);
		bone36.setRotationPoint(7.0F, -27.5F, -1.0F);
		setRotationAngle(bone36, 0.7854F, 0.0F, 0.0F);
		rightDoor.addChild(bone36);
		bone36.cubeList.add(new ModelBox(bone36, 24, 312, -6.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, false));

		bone42 = new RendererModel(this);
		bone42.setRotationPoint(1.0F, -24.5F, -1.0F);
		setRotationAngle(bone42, 0.0F, -0.7854F, 0.0F);
		rightDoor.addChild(bone42);
		bone42.cubeList.add(new ModelBox(bone42, 24, 312, 0.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, false));

		bone40 = new RendererModel(this);
		bone40.setRotationPoint(4.17F, -27.5F, -1.0F);
		setRotationAngle(bone40, 0.0F, -0.7854F, 0.0F);
		rightDoor.addChild(bone40);
		bone40.cubeList.add(new ModelBox(bone40, 24, 312, 0.0F, -3.0F, 0.0F, 1, 6, 1, 0.0F, false));

		bone38 = new RendererModel(this);
		bone38.setRotationPoint(7.0F, -30.5F, -1.0F);
		setRotationAngle(bone38, 0.7854F, 0.0F, 0.0F);
		rightDoor.addChild(bone38);
		bone38.cubeList.add(new ModelBox(bone38, 24, 312, -6.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, false));

		leftDoor = new RendererModel(this);
		leftDoor.setRotationPoint(7.0F, 23.0F, -7.0F);
		leftDoor.cubeList.add(new ModelBox(leftDoor, 0, 1, -1.0F, -32.0F, -1.0F, 1, 32, 1, 0.0F, true));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 24, 312, -4.25F, -20.75F, -0.65F, 1, 1, 1, 0.0F, false));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 24, 312, -3.75F, -20.75F, -0.65F, 1, 1, 1, 0.0F, false));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 24, 312, -4.0F, -21.0F, -0.65F, 1, 1, 1, 0.0F, false));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 24, 312, -4.0F, -20.5F, -0.65F, 1, 1, 1, 0.0F, false));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 44, 376, -4.0F, -20.75F, -0.7F, 1, 1, 1, 0.0F, false));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 0, 1, -6.75F, -3.0F, -1.0F, 6, 3, 1, 0.0F, true));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 0, 1, -6.75F, -10.0F, -1.0F, 6, 1, 1, 0.0F, true));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 0, 1, -6.75F, -17.0F, -1.0F, 6, 1, 1, 0.0F, true));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 0, 1, -6.75F, -24.0F, -1.0F, 6, 1, 1, 0.0F, true));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 0, 1, -6.75F, -32.0F, -1.0F, 6, 1, 1, 0.0F, true));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 0, 1, -6.75F, -31.5F, -1.0F, 6, 1, 1, 0.0F, true));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 0, 1, -6.75F, -24.5F, -1.0F, 6, 1, 1, 0.0F, true));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 0, 1, -6.75F, -17.5F, -1.0F, 6, 1, 1, 0.0F, true));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 0, 1, -6.75F, -10.5F, -1.0F, 6, 1, 1, 0.0F, true));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 0, 1, -6.75F, -30.5F, -1.0F, 1, 28, 1, 0.0F, true));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 428, 260, -6.5F, -30.5F, -0.7F, 6, 6, 1, 0.0F, true));
		leftDoor.cubeList.add(new ModelBox(leftDoor, 345, 233, -6.5F, -23.0F, -0.6F, 6, 20, 1, 0.0F, true));

		bone35 = new RendererModel(this);
		bone35.setRotationPoint(-2.59F, -27.5F, -1.0F);
		setRotationAngle(bone35, 0.0F, 0.7854F, 0.0F);
		leftDoor.addChild(bone35);
		bone35.cubeList.add(new ModelBox(bone35, 24, 312, -1.0F, -3.0F, 0.0F, 1, 6, 1, 0.0F, true));

		bone43 = new RendererModel(this);
		bone43.setRotationPoint(-7.0F, -24.5F, -1.0F);
		setRotationAngle(bone43, 0.7854F, 0.0F, 0.0F);
		leftDoor.addChild(bone43);
		bone43.cubeList.add(new ModelBox(bone43, 24, 312, 1.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, true));

		bone44 = new RendererModel(this);
		bone44.setRotationPoint(-5.75F, -27.5F, -1.0F);
		setRotationAngle(bone44, 0.0F, 0.7854F, 0.0F);
		leftDoor.addChild(bone44);
		bone44.cubeList.add(new ModelBox(bone44, 24, 312, -1.0F, -3.0F, 0.0F, 1, 6, 1, 0.0F, true));

		bone45 = new RendererModel(this);
		bone45.setRotationPoint(-7.0F, -27.5F, -1.0F);
		setRotationAngle(bone45, 0.7854F, 0.0F, 0.0F);
		leftDoor.addChild(bone45);
		bone45.cubeList.add(new ModelBox(bone45, 24, 312, 0.5F, 0.0F, 0.0F, 6, 1, 1, 0.0F, true));

		bone46 = new RendererModel(this);
		bone46.setRotationPoint(-1.0F, -24.5F, -1.0F);
		setRotationAngle(bone46, 0.0F, 0.7854F, 0.0F);
		leftDoor.addChild(bone46);
		bone46.cubeList.add(new ModelBox(bone46, 24, 312, -1.0F, -6.0F, 0.0F, 1, 6, 1, 0.0F, true));

		bone47 = new RendererModel(this);
		bone47.setRotationPoint(-4.17F, -27.5F, -1.0F);
		setRotationAngle(bone47, 0.0F, 0.7854F, 0.0F);
		leftDoor.addChild(bone47);
		bone47.cubeList.add(new ModelBox(bone47, 24, 312, -1.0F, -3.0F, 0.0F, 1, 6, 1, 0.0F, true));

		bone48 = new RendererModel(this);
		bone48.setRotationPoint(-7.0F, -30.5F, -1.0F);
		setRotationAngle(bone48, 0.7854F, 0.0F, 0.0F);
		leftDoor.addChild(bone48);
		bone48.cubeList.add(new ModelBox(bone48, 24, 312, 0.5F, 0.0F, 0.0F, 6, 1, 1, 0.0F, true));
	}

	public void render(float scale) {
		box.render(scale);
		rightDoor.render(scale);
		leftDoor.render(scale);
	}

	@Override
	public void doorRotation(TardisTileEntity.DoorState doorState, float progression) {
		float angle = progression * 1.35f;
		if (doorState == TardisTileEntity.DoorState.SINGLE) {
			this.leftDoor.rotateAngleY = angle;
		} else if (doorState == TardisTileEntity.DoorState.BOTH) {
			this.leftDoor.rotateAngleY = angle;
			this.rightDoor.rotateAngleY = -angle;
		} else {
			if (this.leftDoor.rotateAngleY != 0.0f) {
				this.leftDoor.rotateAngleY = angle;
			}
			if (this.rightDoor.rotateAngleY != 0.0f) {
				this.rightDoor.rotateAngleY = -angle;
			}
		}
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}