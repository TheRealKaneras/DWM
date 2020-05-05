// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public class custom_model extends EntityModel {
	private final RendererModel gunstick;
	private final RendererModel plunger;
	private final RendererModel weaponsBelt;
	private final RendererModel neck;
	private final RendererModel eyestalk;
	private final RendererModel head;
	private final RendererModel skirt;
	private final RendererModel frontslope;
	private final RendererModel ears;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		gunstick = new RendererModel(this);
		gunstick.setRotationPoint(3.5F, 11.0F, -5.5F);
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.25F, -0.5F, -5.0F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.75F, -0.5F, -5.0F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.5F, -0.75F, -5.0F, 1, 1, 4, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.5F, -0.5F, -5.75F, 1, 1, 6, 0.0F, false));
		gunstick.cubeList.add(new ModelBox(gunstick, 0, 0, -0.5F, -0.25F, -5.0F, 1, 1, 4, 0.0F, false));

		plunger = new RendererModel(this);
		plunger.setRotationPoint(-3.5F, 11.0F, -5.5F);
		plunger.cubeList.add(new ModelBox(plunger, 38, 65, -1.0F, -1.0F, -6.5F, 2, 2, 1, 0.0F, false));
		plunger.cubeList.add(new ModelBox(plunger, 0, 0, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

		weaponsBelt = new RendererModel(this);
		weaponsBelt.setRotationPoint(0.0F, 24.0F, 0.0F);
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.5F, -15.0F, -4.5F, 11, 1, 11, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 64, 33, -5.0F, -14.0F, -4.0F, 10, 2, 10, 0.0F, false));
		weaponsBelt.cubeList.add(new ModelBox(weaponsBelt, 0, 0, -5.5F, -12.0F, -4.5F, 11, 1, 11, 0.0F, false));

		neck = new RendererModel(this);
		neck.setRotationPoint(0.0F, 24.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 0, 0, 0.75F, -19.5F, -3.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -1.75F, -19.5F, -3.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.25F, -19.5F, 2.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.25F, -19.5F, -0.5F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.25F, -19.0F, -3.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -1.75F, -19.5F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 0.75F, -19.5F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, 3.25F, -19.0F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -4.25F, -19.0F, -3.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -4.25F, -19.5F, 2.0F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -4.25F, -19.5F, -0.5F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 38, 65, -3.5F, -18.5F, -2.5F, 7, 3, 7, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 92, 8, -4.5F, -19.5F, -3.5F, 9, 1, 9, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 92, 8, -4.5F, -17.5F, -3.5F, 9, 1, 9, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 0, 0, -4.25F, -19.0F, 4.25F, 1, 4, 1, 0.0F, false));
		neck.cubeList.add(new ModelBox(neck, 92, 8, -4.5F, -15.5F, -3.5F, 9, 1, 9, 0.0F, false));

		eyestalk = new RendererModel(this);
		eyestalk.setRotationPoint(0.0F, 1.0F, -2.5F);
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, -1.0F, -3.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, -1.0F, -3.0F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, -1.0F, -3.25F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, -1.0F, -2.75F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, -1.0F, -2.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 102, 8, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, 0.0F, -0.5F, -3.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, 0.0F, -0.5F, -3.25F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, 0.0F, -0.5F, -3.0F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, 0.0F, -0.5F, -2.75F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, 0.0F, -0.5F, -2.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 60, 71, 0.0F, -0.5F, -5.5F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 60, 71, -0.5F, -1.0F, -5.5F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 60, 71, -1.0F, -0.5F, -5.5F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 34, 98, -0.5F, -0.5F, -5.55F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 60, 71, -0.5F, 0.0F, -5.5F, 1, 1, 1, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -1.0F, -0.5F, -2.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -1.0F, -0.5F, -2.75F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -1.0F, -0.5F, -3.0F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -1.0F, -0.5F, -3.25F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -1.0F, -0.5F, -3.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, 0.0F, -2.5F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, 0.0F, -2.75F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, 0.0F, -3.0F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, 0.0F, -3.25F, 1, 1, 0, 0.0F, false));
		eyestalk.cubeList.add(new ModelBox(eyestalk, 92, 107, -0.5F, 0.0F, -3.5F, 1, 1, 0, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, 4.0F, 1.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -2.5F, -4.5F, 8, 3, 9, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -4.5F, -2.5F, -4.0F, 9, 3, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -3.0F, -4.0F, 7, 2, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -3.0F, -3.5F, 8, 2, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -3.5F, -3.5F, 6, 2, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -3.5F, -3.0F, 7, 2, 6, 0.0F, false));

		skirt = new RendererModel(this);
		skirt.setRotationPoint(0.0F, 24.0F, 0.0F);
		skirt.cubeList.add(new ModelBox(skirt, 102, 8, 2.5F, -14.0F, -5.5F, 2, 2, 2, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 38, 65, -5.5F, -2.0F, -7.5F, 11, 2, 14, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 38, 65, -5.0F, -2.0F, -8.0F, 10, 2, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -5.0F, -11.0F, -2.0F, 10, 9, 8, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -3.0F, -5.0F, -6.0F, 6, 3, 9, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -4.5F, -4.0F, -6.0F, 9, 2, 9, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -4.5F, -8.0F, -4.0F, 9, 6, 9, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 0, 0, -4.5F, -11.0F, -3.0F, 9, 6, 4, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -10.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -10.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -10.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -10.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -10.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -4.5F, -10.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -2.0F, -10.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 0.5F, -10.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 3.0F, -10.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -10.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -8.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -8.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -8.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -6.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -8.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 3.0F, -8.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 0.5F, -8.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -2.0F, -8.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -4.5F, -8.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -8.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -8.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -6.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -6.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -6.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -6.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -4.5F, -6.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -2.0F, -6.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -4.5F, -4.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -4.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -4.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -4.0F, 1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -4.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -5.5F, -4.0F, -1.25F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -6.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 3.0F, -6.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 0.5F, -6.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 102, 8, -4.5F, -14.0F, -5.5F, 2, 2, 2, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 4.5F, -4.0F, 3.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 3.0F, -4.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, 0.5F, -4.0F, 5.75F, 1, 1, 1, 0.0F, false));
		skirt.cubeList.add(new ModelBox(skirt, 92, 107, -2.0F, -4.0F, 5.75F, 1, 1, 1, 0.0F, false));

		frontslope = new RendererModel(this);
		frontslope.setRotationPoint(0.0F, -2.0F, -7.0F);
		setRotationAngle(frontslope, -0.3927F, 0.0F, 0.0F);
		skirt.addChild(frontslope);
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 0, -3.0F, -9.9239F, -0.3827F, 6, 10, 2, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 0, 0, -4.5F, -9.9239F, 0.1173F, 9, 10, 2, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -4.25F, -2.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -5.0F, -2.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 4.0F, -2.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 4.0F, -4.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 4.0F, -6.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 4.0F, -8.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 3.25F, -2.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 3.25F, -4.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 3.25F, -6.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 3.25F, -8.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 1.0F, -8.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 1.0F, -6.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 1.0F, -4.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, 1.0F, -2.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -1.75F, -2.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -1.75F, -4.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -1.75F, -6.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -1.75F, -8.4239F, -0.8827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -4.25F, -4.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -4.25F, -6.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -4.25F, -8.4239F, -0.3827F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -5.0F, -8.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -5.0F, -6.9239F, 0.6173F, 1, 1, 1, 0.0F, false));
		frontslope.cubeList.add(new ModelBox(frontslope, 92, 107, -5.0F, -4.9239F, 0.6173F, 1, 1, 1, 0.0F, false));

		ears = new RendererModel(this);
		ears.setRotationPoint(0.0F, 4.0F, 1.0F);
		ears.cubeList.add(new ModelBox(ears, 9, 30, 3.5F, -3.5F, -0.5F, 1, 1, 1, 0.0F, false));
		ears.cubeList.add(new ModelBox(ears, 9, 30, -4.5F, -3.5F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gunstick.render(f5);
		plunger.render(f5);
		weaponsBelt.render(f5);
		neck.render(f5);
		eyestalk.render(f5);
		head.render(f5);
		skirt.render(f5);
		ears.render(f5);
	}
	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}