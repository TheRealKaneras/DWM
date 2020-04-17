package com.softetch.dwm.client.model.tileentity.tardis;

import com.mojang.blaze3d.platform.GlStateManager;
import com.softetch.dwm.common.tileentity.TardisTileEntity;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class NewberyBoxCModel extends AbstractTardisExteriorModel {
	private final RendererModel lamp;
	private final RendererModel box;
	private final RendererModel windowsBack;
	private final RendererModel bone;
	private final RendererModel bone4;
	private final RendererModel bone5;
	private final RendererModel bone9;
	private final RendererModel bone10;
	private final RendererModel bone6;
	private final RendererModel bone8;
	private final RendererModel bone7;
	private final RendererModel bone11;
	private final RendererModel bone3;
	private final RendererModel bone2;
	private final RendererModel windowsRight;
	private final RendererModel bone12;
	private final RendererModel bone13;
	private final RendererModel bone14;
	private final RendererModel bone15;
	private final RendererModel bone16;
	private final RendererModel bone17;
	private final RendererModel bone18;
	private final RendererModel bone19;
	private final RendererModel bone20;
	private final RendererModel bone21;
	private final RendererModel bone22;
	private final RendererModel windowsLeft;
	private final RendererModel bone23;
	private final RendererModel bone24;
	private final RendererModel bone25;
	private final RendererModel bone26;
	private final RendererModel bone27;
	private final RendererModel bone28;
	private final RendererModel bone29;
	private final RendererModel bone30;
	private final RendererModel bone31;
	private final RendererModel bone32;
	private final RendererModel bone33;
	private final RendererModel doorRight;
	private final RendererModel doorRightWindows;
	private final RendererModel bone34;
	private final RendererModel bone35;
	private final RendererModel bone36;
	private final RendererModel bone37;
	private final RendererModel bone38;
	private final RendererModel bone39;
	private final RendererModel bone40;
	private final RendererModel bone41;
	private final RendererModel bone42;
	private final RendererModel bone43;
	private final RendererModel bone44;
	private final RendererModel doorLeft;
	private final RendererModel doorLeftWindows;
	private final RendererModel bone45;
	private final RendererModel bone46;
	private final RendererModel bone47;
	private final RendererModel bone48;
	private final RendererModel bone49;
	private final RendererModel bone50;
	private final RendererModel bone51;
	private final RendererModel bone52;
	private final RendererModel bone53;
	private final RendererModel bone54;
	private final RendererModel bone55;

	public NewberyBoxCModel() {
		textureWidth = 512;
		textureHeight = 512;

		lamp = new RendererModel(this);
		lamp.setRotationPoint(0.0F, 24.0F, 0.0F);
		lamp.cubeList.add(new ModelBox(lamp, 221, 508, -1.0F, -43.5F, -1.0F, 2, 3, 2, 0.0F, false));
		lamp.cubeList.add(new ModelBox(lamp, 221, 508, -0.75F, -43.0F, -1.0F, 2, 1, 2, 0.0F, false));
		lamp.cubeList.add(new ModelBox(lamp, 221, 508, -1.25F, -43.0F, -1.0F, 2, 1, 2, 0.0F, false));
		lamp.cubeList.add(new ModelBox(lamp, 221, 508, -1.0F, -43.0F, -0.75F, 2, 1, 2, 0.0F, false));
		lamp.cubeList.add(new ModelBox(lamp, 221, 508, -1.0F, -43.0F, -1.25F, 2, 1, 2, 0.0F, false));

		box = new RendererModel(this);
		box.setRotationPoint(0.0F, 24.0F, 0.0F);
		box.cubeList.add(new ModelBox(box, 0, 487, -12.0F, -1.0F, -12.0F, 24, 1, 24, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 413, 331, -11.0F, -37.0F, -11.0F, 3, 36, 3, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 106, 366, -10.0F, -38.0F, -10.0F, 2, 1, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 106, 366, -10.0F, -38.0F, 8.0F, 2, 1, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 106, 366, 8.0F, -38.0F, -10.0F, 2, 1, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 106, 366, 8.0F, -38.0F, 8.0F, 2, 1, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 413, 331, 8.0F, -37.0F, -11.0F, 3, 36, 3, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 413, 331, -11.0F, -37.0F, 8.0F, 3, 36, 3, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 413, 331, 8.0F, -37.0F, 8.0F, 3, 36, 3, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, -8.0F, -2.5F, 8.0F, 16, 2, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, 8.0F, -2.5F, -8.0F, 1, 2, 16, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, -9.0F, -2.5F, -8.0F, 1, 2, 16, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 479, 489, -8.0F, -24.0F, 7.75F, 16, 23, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 479, 489, 7.75F, -24.0F, -8.0F, 1, 23, 16, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 479, 489, -8.75F, -24.0F, -8.0F, 1, 23, 16, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 205, 489, -8.0F, -32.0F, 7.65F, 16, 8, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 205, 489, 7.65F, -32.0F, -8.0F, 1, 8, 16, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 205, 489, -8.65F, -32.0F, -8.0F, 1, 8, 16, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 0, 6.5F, -32.0F, 8.0F, 2, 31, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, 8.0F, -32.0F, -8.5F, 1, 31, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, -9.0F, -32.0F, -8.5F, 1, 31, 2, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 0, -8.5F, -32.0F, 8.0F, 2, 31, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, 8.0F, -32.0F, 6.5F, 1, 31, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, -9.0F, -32.0F, 6.5F, 1, 31, 2, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 0, -0.5F, -32.0F, 8.0F, 2, 31, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, 8.0F, -32.0F, -1.5F, 1, 31, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, -9.0F, -32.0F, -1.5F, 1, 31, 2, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 0, -1.5F, -32.0F, 8.0F, 2, 31, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, 8.0F, -32.0F, -0.5F, 1, 31, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, -9.0F, -32.0F, -0.5F, 1, 31, 2, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 509, 480, -0.5F, -32.5F, 8.5F, 1, 32, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 509, 480, 8.5F, -32.5F, -0.5F, 1, 32, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 509, 480, -9.5F, -32.5F, -0.5F, 1, 32, 1, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 0, -8.0F, -10.0F, 8.0F, 16, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, 8.0F, -10.0F, -8.0F, 1, 1, 16, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, -9.0F, -10.0F, -8.0F, 1, 1, 16, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 0, -8.0F, -17.5F, 8.0F, 16, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, 8.0F, -17.5F, -8.0F, 1, 1, 16, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, -9.0F, -17.5F, -8.0F, 1, 1, 16, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 0, -8.0F, -25.0F, 8.0F, 16, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, 8.0F, -25.0F, -8.0F, 1, 1, 16, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, -9.0F, -25.0F, -8.0F, 1, 1, 16, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 0, -8.0F, -32.5F, 8.0F, 16, 1, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, 8.0F, -32.5F, -8.0F, 1, 1, 16, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 0, -9.0F, -32.5F, -8.0F, 1, 1, 16, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 0, 0, -9.5F, -37.0F, -9.5F, 19, 3, 19, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 388, 0, -9.0F, -38.5F, -9.0F, 18, 2, 18, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 441, 0, -7.0F, -39.7F, -7.0F, 14, 2, 14, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 441, 0, -5.0F, -39.9F, -5.0F, 10, 2, 10, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 441, 0, -6.0F, -39.8F, -6.0F, 12, 2, 12, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 441, 0, -4.0F, -40.0F, -4.0F, 8, 2, 8, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 441, 0, -3.0F, -40.1F, -3.0F, 6, 2, 6, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 441, 0, -2.0F, -41.5F, -2.0F, 4, 3, 4, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 441, 0, -1.5F, -44.5F, -1.5F, 3, 1, 3, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 441, 0, -0.5F, -43.5F, 0.9F, 1, 2, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 441, 0, -1.9F, -43.5F, -1.9F, 1, 2, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 441, 0, 0.9F, -43.5F, -1.9F, 1, 2, 1, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 48, 231, -6.5F, -39.75F, -6.5F, 13, 2, 13, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 48, 231, -4.5F, -39.95F, -4.5F, 9, 2, 9, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 48, 231, -7.5F, -39.65F, -7.5F, 15, 2, 15, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 48, 231, -5.5F, -39.85F, -5.5F, 11, 2, 11, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 48, 231, -3.5F, -40.05F, -3.5F, 7, 2, 7, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 48, 231, -2.5F, -40.15F, -2.5F, 5, 2, 5, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 503, 0, -9.5F, -32.5F, 9.0F, 19, 0, 3, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 503, 0, -9.5F, -32.5F, -12.5F, 19, 0, 4, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 469, 0, 9.5F, -32.5F, -9.5F, 3, 0, 19, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 469, 0, 8.5F, -32.5F, -9.5F, 3, 0, 19, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 467, 0, -12.5F, -32.5F, -9.5F, 4, 0, 19, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 45, 336, -9.5F, -34.5F, 11.0F, 19, 2, 0, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 45, 336, -9.5F, -34.5F, -11.5F, 19, 2, 0, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 45, 336, 11.5F, -34.5F, -9.5F, 0, 2, 19, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 45, 336, -11.5F, -34.5F, -9.5F, 0, 2, 19, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 503, 0, 7.5F, -34.5F, 9.0F, 2, 2, 3, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 503, 0, 7.5F, -34.5F, -12.5F, 2, 2, 4, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 503, 0, 9.5F, -34.5F, -9.5F, 3, 2, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 503, 0, -12.5F, -34.5F, -9.5F, 4, 2, 2, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 503, 0, -9.5F, -34.5F, 9.0F, 2, 2, 3, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 503, 0, -9.5F, -34.5F, -12.5F, 2, 2, 4, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 503, 0, 9.5F, -34.5F, 7.5F, 3, 2, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 503, 0, -12.5F, -34.5F, 7.5F, 4, 2, 2, 0.0F, true));
		box.cubeList.add(new ModelBox(box, 503, 0, -9.5F, -34.5F, 9.0F, 19, 0, 3, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 503, 0, -9.5F, -34.5F, -12.5F, 19, 0, 4, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 469, 1, 9.5F, -34.5F, -9.5F, 3, 0, 19, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 467, 0, -12.5F, -34.5F, -9.5F, 4, 0, 19, 0.0F, true));

		windowsBack = new RendererModel(this);
		windowsBack.setRotationPoint(0.0F, -25.0F, 9.0F);
		box.addChild(windowsBack);

		bone = new RendererModel(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone, -0.7854F, 0.0F, 0.0F);
		windowsBack.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 256, -8.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, false));

		bone4 = new RendererModel(this);
		bone4.setRotationPoint(6.5F, 0.0F, 0.0F);
		setRotationAngle(bone4, 0.0F, -0.7854F, 0.0F);
		windowsBack.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone5 = new RendererModel(this);
		bone5.setRotationPoint(1.5F, 0.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, -0.7854F, 0.0F);
		windowsBack.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone9 = new RendererModel(this);
		bone9.setRotationPoint(-1.5F, 0.0F, 0.0F);
		setRotationAngle(bone9, 0.0F, -0.7854F, 0.0F);
		windowsBack.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone10 = new RendererModel(this);
		bone10.setRotationPoint(-6.5F, 0.0F, 0.0F);
		setRotationAngle(bone10, 0.0F, -0.7854F, 0.0F);
		windowsBack.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone6 = new RendererModel(this);
		bone6.setRotationPoint(3.166F, 0.0F, 0.0F);
		setRotationAngle(bone6, 0.0F, -0.7854F, 0.0F);
		windowsBack.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone8 = new RendererModel(this);
		bone8.setRotationPoint(-3.166F, 0.0F, 0.0F);
		setRotationAngle(bone8, 0.0F, -0.7854F, 0.0F);
		windowsBack.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone7 = new RendererModel(this);
		bone7.setRotationPoint(4.833F, 0.0F, 0.0F);
		setRotationAngle(bone7, 0.0F, -0.7854F, 0.0F);
		windowsBack.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone11 = new RendererModel(this);
		bone11.setRotationPoint(-4.833F, 0.0F, 0.0F);
		setRotationAngle(bone11, 0.0F, -0.7854F, 0.0F);
		windowsBack.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone3 = new RendererModel(this);
		bone3.setRotationPoint(0.0F, -3.25F, 0.0F);
		setRotationAngle(bone3, -0.7854F, 0.0F, 0.0F);
		windowsBack.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 256, -8.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, false));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(-4.0F, -6.5F, 0.0F);
		setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
		windowsBack.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 256, -4.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, false));

		windowsRight = new RendererModel(this);
		windowsRight.setRotationPoint(-9.0F, -25.0F, 0.0F);
		setRotationAngle(windowsRight, 0.0F, -1.5708F, 0.0F);
		box.addChild(windowsRight);

		bone12 = new RendererModel(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone12, -0.7854F, 0.0F, 0.0F);
		windowsRight.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 0, 256, -8.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, false));

		bone13 = new RendererModel(this);
		bone13.setRotationPoint(6.5F, 0.0F, 0.0F);
		setRotationAngle(bone13, 0.0F, -0.7854F, 0.0F);
		windowsRight.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone14 = new RendererModel(this);
		bone14.setRotationPoint(1.5F, 0.0F, 0.0F);
		setRotationAngle(bone14, 0.0F, -0.7854F, 0.0F);
		windowsRight.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone15 = new RendererModel(this);
		bone15.setRotationPoint(-1.5F, 0.0F, 0.0F);
		setRotationAngle(bone15, 0.0F, -0.7854F, 0.0F);
		windowsRight.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone16 = new RendererModel(this);
		bone16.setRotationPoint(-6.5F, 0.0F, 0.0F);
		setRotationAngle(bone16, 0.0F, -0.7854F, 0.0F);
		windowsRight.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone17 = new RendererModel(this);
		bone17.setRotationPoint(3.166F, 0.0F, 0.0F);
		setRotationAngle(bone17, 0.0F, -0.7854F, 0.0F);
		windowsRight.addChild(bone17);
		bone17.cubeList.add(new ModelBox(bone17, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone18 = new RendererModel(this);
		bone18.setRotationPoint(-3.166F, 0.0F, 0.0F);
		setRotationAngle(bone18, 0.0F, -0.7854F, 0.0F);
		windowsRight.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone19 = new RendererModel(this);
		bone19.setRotationPoint(4.833F, 0.0F, 0.0F);
		setRotationAngle(bone19, 0.0F, -0.7854F, 0.0F);
		windowsRight.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone20 = new RendererModel(this);
		bone20.setRotationPoint(-4.833F, 0.0F, 0.0F);
		setRotationAngle(bone20, 0.0F, -0.7854F, 0.0F);
		windowsRight.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone21 = new RendererModel(this);
		bone21.setRotationPoint(0.0F, -3.25F, 0.0F);
		setRotationAngle(bone21, -0.7854F, 0.0F, 0.0F);
		windowsRight.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 0, 256, -8.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, false));

		bone22 = new RendererModel(this);
		bone22.setRotationPoint(-4.0F, -6.5F, 0.0F);
		setRotationAngle(bone22, -0.7854F, 0.0F, 0.0F);
		windowsRight.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 0, 256, -4.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, false));

		windowsLeft = new RendererModel(this);
		windowsLeft.setRotationPoint(9.0F, -25.0F, 0.0F);
		setRotationAngle(windowsLeft, 0.0F, 1.5708F, 0.0F);
		box.addChild(windowsLeft);

		bone23 = new RendererModel(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone23, -0.7854F, 0.0F, 0.0F);
		windowsLeft.addChild(bone23);
		bone23.cubeList.add(new ModelBox(bone23, 0, 256, -8.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, false));

		bone24 = new RendererModel(this);
		bone24.setRotationPoint(6.5F, 0.0F, 0.0F);
		setRotationAngle(bone24, 0.0F, -0.7854F, 0.0F);
		windowsLeft.addChild(bone24);
		bone24.cubeList.add(new ModelBox(bone24, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone25 = new RendererModel(this);
		bone25.setRotationPoint(1.5F, 0.0F, 0.0F);
		setRotationAngle(bone25, 0.0F, -0.7854F, 0.0F);
		windowsLeft.addChild(bone25);
		bone25.cubeList.add(new ModelBox(bone25, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone26 = new RendererModel(this);
		bone26.setRotationPoint(-1.5F, 0.0F, 0.0F);
		setRotationAngle(bone26, 0.0F, -0.7854F, 0.0F);
		windowsLeft.addChild(bone26);
		bone26.cubeList.add(new ModelBox(bone26, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone27 = new RendererModel(this);
		bone27.setRotationPoint(-6.5F, 0.0F, 0.0F);
		setRotationAngle(bone27, 0.0F, -0.7854F, 0.0F);
		windowsLeft.addChild(bone27);
		bone27.cubeList.add(new ModelBox(bone27, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone28 = new RendererModel(this);
		bone28.setRotationPoint(3.166F, 0.0F, 0.0F);
		setRotationAngle(bone28, 0.0F, -0.7854F, 0.0F);
		windowsLeft.addChild(bone28);
		bone28.cubeList.add(new ModelBox(bone28, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone29 = new RendererModel(this);
		bone29.setRotationPoint(-3.166F, 0.0F, 0.0F);
		setRotationAngle(bone29, 0.0F, -0.7854F, 0.0F);
		windowsLeft.addChild(bone29);
		bone29.cubeList.add(new ModelBox(bone29, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone30 = new RendererModel(this);
		bone30.setRotationPoint(4.833F, 0.0F, 0.0F);
		setRotationAngle(bone30, 0.0F, -0.7854F, 0.0F);
		windowsLeft.addChild(bone30);
		bone30.cubeList.add(new ModelBox(bone30, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone31 = new RendererModel(this);
		bone31.setRotationPoint(-4.833F, 0.0F, 0.0F);
		setRotationAngle(bone31, 0.0F, -0.7854F, 0.0F);
		windowsLeft.addChild(bone31);
		bone31.cubeList.add(new ModelBox(bone31, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone32 = new RendererModel(this);
		bone32.setRotationPoint(0.0F, -3.25F, 0.0F);
		setRotationAngle(bone32, -0.7854F, 0.0F, 0.0F);
		windowsLeft.addChild(bone32);
		bone32.cubeList.add(new ModelBox(bone32, 0, 256, -8.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, false));

		bone33 = new RendererModel(this);
		bone33.setRotationPoint(-4.0F, -6.5F, 0.0F);
		setRotationAngle(bone33, -0.7854F, 0.0F, 0.0F);
		windowsLeft.addChild(bone33);
		bone33.cubeList.add(new ModelBox(bone33, 0, 256, -4.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, false));

		doorRight = new RendererModel(this);
		doorRight.setRotationPoint(-8.0F, 23.0F, -8.0F);
		doorRight.cubeList.add(new ModelBox(doorRight, 0, 0, 0.0F, -1.5F, -1.0F, 8, 2, 1, 0.0F, false));
		doorRight.cubeList.add(new ModelBox(doorRight, 0, 0, 0.0F, -9.0F, -1.0F, 8, 1, 1, 0.0F, false));
		doorRight.cubeList.add(new ModelBox(doorRight, 0, 0, 6.5F, -31.5F, -1.0F, 2, 32, 1, 0.0F, false));
		doorRight.cubeList.add(new ModelBox(doorRight, 509, 480, 7.5F, -31.5F, -1.5F, 1, 32, 1, 0.0F, false));
		doorRight.cubeList.add(new ModelBox(doorRight, 479, 489, 0.0F, -16.0F, -0.75F, 8, 16, 1, 0.0F, false));
		doorRight.cubeList.add(new ModelBox(doorRight, 160, 505, 0.0F, -23.0F, -0.6F, 8, 7, 1, 0.0F, false));
		doorRight.cubeList.add(new ModelBox(doorRight, 0, 0, 0.0F, -24.0F, -1.0F, 8, 1, 1, 0.0F, false));
		doorRight.cubeList.add(new ModelBox(doorRight, 174, 21, 6.25F, -21.0F, -1.0F, 0, 2, 1, 0.0F, false));
		doorRight.cubeList.add(new ModelBox(doorRight, 0, 0, 0.0F, -31.5F, -1.0F, 8, 1, 1, 0.0F, false));
		doorRight.cubeList.add(new ModelBox(doorRight, 205, 489, 0.0F, -31.0F, -0.65F, 8, 8, 1, 0.0F, false));
		doorRight.cubeList.add(new ModelBox(doorRight, 0, 0, -0.5F, -31.0F, -1.0F, 2, 31, 1, 0.0F, false));
		doorRight.cubeList.add(new ModelBox(doorRight, 0, 0, 0.0F, -16.5F, -1.0F, 8, 1, 1, 0.0F, false));

		doorRightWindows = new RendererModel(this);
		doorRightWindows.setRotationPoint(8.0F, -24.0F, -1.0F);
		setRotationAngle(doorRightWindows, 0.0F, 3.1416F, 0.0F);
		doorRight.addChild(doorRightWindows);
		doorRightWindows.cubeList.add(new ModelBox(doorRightWindows, 485, 496, 1.0F, 0.5F, -1.25F, 1, 8, 1, 0.0F, false));
		doorRightWindows.cubeList.add(new ModelBox(doorRightWindows, 487, 511, 6.0F, 0.5F, -1.25F, 1, 8, 1, 0.0F, false));
		doorRightWindows.cubeList.add(new ModelBox(doorRightWindows, 482, 504, 1.0F, 7.0F, -1.25F, 6, 1, 1, 0.0F, false));
		doorRightWindows.cubeList.add(new ModelBox(doorRightWindows, 481, 501, 1.0F, 0.5F, -1.25F, 6, 1, 1, 0.0F, false));

		bone34 = new RendererModel(this);
		bone34.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone34, -0.7854F, 0.0F, 0.0F);
		doorRightWindows.addChild(bone34);
		bone34.cubeList.add(new ModelBox(bone34, 0, 256, 0.0F, 0.0F, -1.0F, 8, 1, 1, 0.0F, false));

		bone35 = new RendererModel(this);
		bone35.setRotationPoint(6.5F, 0.0F, 0.0F);
		setRotationAngle(bone35, 0.0F, -0.7854F, 0.0F);
		doorRightWindows.addChild(bone35);
		bone35.cubeList.add(new ModelBox(bone35, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone36 = new RendererModel(this);
		bone36.setRotationPoint(1.5F, 0.0F, 0.0F);
		setRotationAngle(bone36, 0.0F, -0.7854F, 0.0F);
		doorRightWindows.addChild(bone36);
		bone36.cubeList.add(new ModelBox(bone36, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone37 = new RendererModel(this);
		bone37.setRotationPoint(-1.5F, 0.0F, 0.0F);
		setRotationAngle(bone37, 0.0F, -0.7854F, 0.0F);
		doorRightWindows.addChild(bone37);

		bone38 = new RendererModel(this);
		bone38.setRotationPoint(-6.5F, 0.0F, 0.0F);
		setRotationAngle(bone38, 0.0F, -0.7854F, 0.0F);
		doorRightWindows.addChild(bone38);

		bone39 = new RendererModel(this);
		bone39.setRotationPoint(3.166F, 0.0F, 0.0F);
		setRotationAngle(bone39, 0.0F, -0.7854F, 0.0F);
		doorRightWindows.addChild(bone39);
		bone39.cubeList.add(new ModelBox(bone39, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone40 = new RendererModel(this);
		bone40.setRotationPoint(-3.166F, 0.0F, 0.0F);
		setRotationAngle(bone40, 0.0F, -0.7854F, 0.0F);
		doorRightWindows.addChild(bone40);

		bone41 = new RendererModel(this);
		bone41.setRotationPoint(4.833F, 0.0F, 0.0F);
		setRotationAngle(bone41, 0.0F, -0.7854F, 0.0F);
		doorRightWindows.addChild(bone41);
		bone41.cubeList.add(new ModelBox(bone41, 0, 256, -1.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, false));

		bone42 = new RendererModel(this);
		bone42.setRotationPoint(-4.833F, 0.0F, 0.0F);
		setRotationAngle(bone42, 0.0F, -0.7854F, 0.0F);
		doorRightWindows.addChild(bone42);

		bone43 = new RendererModel(this);
		bone43.setRotationPoint(0.0F, -3.25F, 0.0F);
		setRotationAngle(bone43, -0.7854F, 0.0F, 0.0F);
		doorRightWindows.addChild(bone43);
		bone43.cubeList.add(new ModelBox(bone43, 0, 256, 0.0F, 0.0F, -1.0F, 8, 1, 1, 0.0F, false));

		bone44 = new RendererModel(this);
		bone44.setRotationPoint(-4.0F, -6.5F, 0.0F);
		setRotationAngle(bone44, -0.7854F, 0.0F, 0.0F);
		doorRightWindows.addChild(bone44);
		bone44.cubeList.add(new ModelBox(bone44, 0, 256, 4.0F, 0.0F, -1.0F, 8, 1, 1, 0.0F, false));

		doorLeft = new RendererModel(this);
		doorLeft.setRotationPoint(8.0F, 23.0F, -8.0F);
		doorLeft.cubeList.add(new ModelBox(doorLeft, 0, 0, -8.0F, -1.5F, -1.0F, 8, 2, 1, 0.0F, true));
		doorLeft.cubeList.add(new ModelBox(doorLeft, 0, 0, -8.0F, -9.0F, -1.0F, 8, 1, 1, 0.0F, true));
		doorLeft.cubeList.add(new ModelBox(doorLeft, 0, 0, -8.5F, -31.0F, -1.0F, 2, 31, 1, 0.0F, true));
		doorLeft.cubeList.add(new ModelBox(doorLeft, 479, 489, -8.0F, -23.0F, -0.75F, 8, 23, 1, 0.0F, true));
		doorLeft.cubeList.add(new ModelBox(doorLeft, 0, 0, -8.0F, -24.0F, -1.0F, 8, 1, 1, 0.0F, true));
		doorLeft.cubeList.add(new ModelBox(doorLeft, 0, 0, -8.5F, -31.5F, -1.0F, 9, 1, 1, 0.0F, true));
		doorLeft.cubeList.add(new ModelBox(doorLeft, 205, 489, -8.0F, -31.0F, -0.65F, 8, 8, 1, 0.0F, true));
		doorLeft.cubeList.add(new ModelBox(doorLeft, 0, 0, -1.5F, -31.0F, -1.0F, 2, 31, 1, 0.0F, true));
		doorLeft.cubeList.add(new ModelBox(doorLeft, 0, 0, -8.0F, -16.5F, -1.0F, 8, 1, 1, 0.0F, true));
		doorLeft.cubeList.add(new ModelBox(doorLeft, 174, 21, -7.0F, -22.0F, -1.5F, 0, 3, 1, 0.0F, false));
		doorLeft.cubeList.add(new ModelBox(doorLeft, 174, 21, -7.5F, -16.5F, -1.5F, 1, 1, 1, 0.0F, false));

		doorLeftWindows = new RendererModel(this);
		doorLeftWindows.setRotationPoint(-8.0F, -24.0F, -1.0F);
		setRotationAngle(doorLeftWindows, 0.0F, -3.1416F, 0.0F);
		doorLeft.addChild(doorLeftWindows);

		bone45 = new RendererModel(this);
		bone45.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone45, -0.7854F, 0.0F, 0.0F);
		doorLeftWindows.addChild(bone45);
		bone45.cubeList.add(new ModelBox(bone45, 0, 256, -8.0F, 0.0F, -1.0F, 8, 1, 1, 0.0F, true));

		bone46 = new RendererModel(this);
		bone46.setRotationPoint(-6.5F, 0.0F, 0.0F);
		setRotationAngle(bone46, 0.0F, 0.7854F, 0.0F);
		doorLeftWindows.addChild(bone46);
		bone46.cubeList.add(new ModelBox(bone46, 0, 256, 0.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, true));

		bone47 = new RendererModel(this);
		bone47.setRotationPoint(-1.5F, 0.0F, 0.0F);
		setRotationAngle(bone47, 0.0F, 0.7854F, 0.0F);
		doorLeftWindows.addChild(bone47);
		bone47.cubeList.add(new ModelBox(bone47, 0, 256, 0.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, true));

		bone48 = new RendererModel(this);
		bone48.setRotationPoint(1.5F, 0.0F, 0.0F);
		setRotationAngle(bone48, 0.0F, 0.7854F, 0.0F);
		doorLeftWindows.addChild(bone48);

		bone49 = new RendererModel(this);
		bone49.setRotationPoint(6.5F, 0.0F, 0.0F);
		setRotationAngle(bone49, 0.0F, 0.7854F, 0.0F);
		doorLeftWindows.addChild(bone49);

		bone50 = new RendererModel(this);
		bone50.setRotationPoint(-3.166F, 0.0F, 0.0F);
		setRotationAngle(bone50, 0.0F, 0.7854F, 0.0F);
		doorLeftWindows.addChild(bone50);
		bone50.cubeList.add(new ModelBox(bone50, 0, 256, 0.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, true));

		bone51 = new RendererModel(this);
		bone51.setRotationPoint(3.166F, 0.0F, 0.0F);
		setRotationAngle(bone51, 0.0F, 0.7854F, 0.0F);
		doorLeftWindows.addChild(bone51);

		bone52 = new RendererModel(this);
		bone52.setRotationPoint(-4.833F, 0.0F, 0.0F);
		setRotationAngle(bone52, 0.0F, 0.7854F, 0.0F);
		doorLeftWindows.addChild(bone52);
		bone52.cubeList.add(new ModelBox(bone52, 0, 256, 0.0F, -7.0F, -1.0F, 1, 8, 1, 0.0F, true));

		bone53 = new RendererModel(this);
		bone53.setRotationPoint(4.833F, 0.0F, 0.0F);
		setRotationAngle(bone53, 0.0F, 0.7854F, 0.0F);
		doorLeftWindows.addChild(bone53);

		bone54 = new RendererModel(this);
		bone54.setRotationPoint(0.0F, -3.25F, 0.0F);
		setRotationAngle(bone54, -0.7854F, 0.0F, 0.0F);
		doorLeftWindows.addChild(bone54);
		bone54.cubeList.add(new ModelBox(bone54, 0, 256, -8.0F, 0.0F, -1.0F, 8, 1, 1, 0.0F, true));

		bone55 = new RendererModel(this);
		bone55.setRotationPoint(4.0F, -6.5F, 0.0F);
		setRotationAngle(bone55, -0.7854F, 0.0F, 0.0F);
		doorLeftWindows.addChild(bone55);
		bone55.cubeList.add(new ModelBox(bone55, 0, 256, -12.0F, 0.0F, -1.0F, 8, 1, 1, 0.0F, true));
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void doorRotation(TardisTileEntity.DoorState doorState, float progression) {
		float angle = progression * 1.35f;
		if (doorState == TardisTileEntity.DoorState.SINGLE) {
			this.doorLeft.rotateAngleY = angle;
		} else if (doorState == TardisTileEntity.DoorState.BOTH) {
			this.doorLeft.rotateAngleY = angle;
			this.doorRight.rotateAngleY = -angle;
		} else {
			if (this.doorLeft.rotateAngleY != 0.0f) {
				this.doorLeft.rotateAngleY = angle;
			}
			if (this.doorRight.rotateAngleY != 0.0f) {
				this.doorRight.rotateAngleY = -angle;
			}
		}
	}

	@Override
	public void render(float scale) {
		GlStateManager.pushMatrix();
		GlStateManager.enableBlend();
		GlStateManager.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		GlStateManager.color4f(2.0f, 2.0f, 2.0f, 0.8f);
		lamp.render(scale);
		GlStateManager.color4f(1.0f, 1.0f, 1.0f, 1.0f);
		GlStateManager.popMatrix();
		box.render(scale);
		doorRight.render(scale);
		doorLeft.render(scale);
	}
}