package com.softetch.dwm.client.model.entity;

import com.mojang.blaze3d.platform.GlStateManager;
import com.softetch.dwm.common.entity.DalekEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public abstract class BaseDalekModel<T extends DalekEntity> extends EntityModel<T> {
    protected final RendererModel body;
    protected final RendererModel base;
    protected final RendererModel balls;
    protected final RendererModel weaponsBelt;
    protected final RendererModel plunger;
    protected final RendererModel gun;
    protected final RendererModel neck;
    protected final RendererModel eye;
    protected final RendererModel head;

    protected BaseDalekModel(int textureWidth, int textureHeight) {
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;

        body = new RendererModel(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        base = new RendererModel(this);
        base.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(base);
        base.cubeList.add(new ModelBox(base, 0, 0, -6.5F, -1.0F, -4.5F, 13, 1, 11, 0.0F, false));
        base.cubeList.add(new ModelBox(base, 0, 0, -6.0F, -1.0F, -6.5F, 12, 1, 2, 0.0F, false));
        base.cubeList.add(new ModelBox(base, 0, 17, -5.5F, -7.0F, -5.5F, 11, 6, 11, 0.0F, false));
        base.cubeList.add(new ModelBox(base, 0, 16, -5.0F, -13.0F, -4.5F, 10, 6, 10, 0.0F, false));

        balls = new RendererModel(this);
        balls.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(balls);
        balls.cubeList.add(new ModelBox(balls, 48, 0, -2.25F, -3.5F, -6.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -4.75F, -3.5F, -6.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -4.75F, -6.5F, -6.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -2.25F, -6.5F, -6.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 0.25F, -6.5F, -6.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 2.75F, -6.5F, -6.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 2.0F, -12.5F, -5.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -1.0F, -12.5F, -5.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -4.0F, -12.5F, -5.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -4.0F, -9.5F, -5.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -1.0F, -9.5F, -5.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 2.0F, -9.5F, -5.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 0.25F, -3.5F, -6.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 2.75F, -3.5F, -6.0F, 2, 2, 1, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 5.0F, -3.5F, -4.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 5.0F, -6.5F, -4.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -6.0F, -6.5F, -4.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -6.0F, -6.5F, -2.0F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -6.0F, -6.5F, 0.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -6.0F, -6.5F, 3.0F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -6.0F, -3.5F, 3.0F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -6.0F, -3.5F, 0.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -6.0F, -3.5F, -2.0F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -6.0F, -3.5F, -4.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 4.5F, -9.5F, -3.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 4.5F, -9.5F, -0.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 4.5F, -9.5F, 2.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 4.5F, -12.5F, 2.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 4.5F, -12.5F, -0.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 4.5F, -12.5F, -3.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -5.5F, -12.5F, -3.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -5.5F, -12.5F, -0.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -5.5F, -12.5F, 2.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -5.5F, -9.5F, 2.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -5.5F, -9.5F, -0.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, -5.5F, -9.5F, -3.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 5.0F, -3.5F, -2.0F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 5.0F, -6.5F, -2.0F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 5.0F, -3.5F, 0.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 5.0F, -6.5F, 0.5F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 5.0F, -3.5F, 3.0F, 1, 2, 2, 0.0F, false));
        balls.cubeList.add(new ModelBox(balls, 48, 0, 5.0F, -6.5F, 3.0F, 1, 2, 2, 0.0F, false));

        weaponsBelt = new RendererModel(this);
        weaponsBelt.setRotationPoint(0.0F, 24.0F, 0.0F);

        plunger = new RendererModel(this);
        plunger.setRotationPoint(-3.0F, 9.25F, -5.0F);
        plunger.cubeList.add(new ModelBox(plunger, 64, 0, -0.5F, -0.5F, -4.75F, 1, 1, 5, 0.0F, false));
        plunger.cubeList.add(new ModelBox(plunger, 66, 20, -1.0F, -1.0F, -5.75F, 2, 2, 1, 0.0F, false));

        gun = new RendererModel(this);
        gun.setRotationPoint(3.0F, 9.25F, -5.25F);
        gun.cubeList.add(new ModelBox(gun, 88, 0, -0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F, false));

        neck = new RendererModel(this);
        neck.setRotationPoint(0.0F, 24.0F, 0.0F);
        neck.cubeList.add(new ModelBox(neck, 84, 83, -4.0F, -22.75F, -3.5F, 8, 4, 8, 0.0F, false));
        neck.cubeList.add(new ModelBox(neck, 0, 98, -4.5F, -19.75F, -4.0F, 9, 1, 9, 0.0F, false));
        neck.cubeList.add(new ModelBox(neck, 40, 98, -4.5F, -21.5F, -4.0F, 9, 1, 9, 0.0F, false));
        neck.cubeList.add(new ModelBox(neck, 74, 83, 1.5F, -22.75F, -3.75F, 1, 4, 1, 0.0F, false));
        neck.cubeList.add(new ModelBox(neck, 74, 83, 1.5F, -22.75F, 3.75F, 1, 4, 1, 0.0F, false));
        neck.cubeList.add(new ModelBox(neck, 74, 83, -2.5F, -22.75F, 3.75F, 1, 4, 1, 0.0F, false));
        neck.cubeList.add(new ModelBox(neck, 74, 83, -4.25F, -22.75F, 1.75F, 1, 4, 1, 0.0F, false));
        neck.cubeList.add(new ModelBox(neck, 74, 83, -4.25F, -22.75F, -1.75F, 1, 4, 1, 0.0F, false));
        neck.cubeList.add(new ModelBox(neck, 74, 83, 3.25F, -22.75F, -1.75F, 1, 4, 1, 0.0F, false));
        neck.cubeList.add(new ModelBox(neck, 74, 83, 3.25F, -22.75F, 1.75F, 1, 4, 1, 0.0F, false));
        neck.cubeList.add(new ModelBox(neck, 74, 83, -2.5F, -22.75F, -3.75F, 1, 4, 1, 0.0F, false));

        eye = new RendererModel(this);
        eye.setRotationPoint(0.0F, -1.75F, 0.5F);
        eye.cubeList.add(new ModelBox(eye, 124, 0, -0.5F, -0.5F, -10.5F, 1, 1, 6, 0.0F, false));
        eye.cubeList.add(new ModelBox(eye, 191, 0, -1.5F, -1.5F, -10.25F, 3, 3, 1, 0.0F, false));
        eye.cubeList.add(new ModelBox(eye, 164, 0, -1.0F, -1.0F, -8.75F, 2, 2, 0, 0.0F, false));
        eye.cubeList.add(new ModelBox(eye, 164, 0, -1.0F, -1.0F, -8.25F, 2, 2, 0, 0.0F, false));
        eye.cubeList.add(new ModelBox(eye, 164, 0, -1.0F, -1.0F, -7.75F, 2, 2, 0, 0.0F, false));
        eye.cubeList.add(new ModelBox(eye, 164, 0, -1.0F, -1.0F, -7.25F, 2, 2, 0, 0.0F, false));

        head = new RendererModel(this);
        head.setRotationPoint(0.0F, -1.625F, 0.5F);
        head.cubeList.add(new ModelBox(head, 63, 144, -4.5F, -1.625F, -4.5F, 9, 2, 9, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 48, 116, 4.25F, -2.125F, -0.5F, 1, 2, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 48, 116, -5.25F, -2.125F, -0.5F, 1, 2, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 4, 145, -5.0F, 0.375F, -5.0F, 10, 3, 10, 0.0F, false));
    }


    /**
     * Render each part of the model
     * @param entityIn Entity being rendered by this model
     * @param limbSwing A value to determine the limb swing
     * @param limbSwingAmount the amount limbs should be swung
     * @param ageInTicks how old the entity is in ticks (20 ticks per second)
     * @param netHeadYaw horizontal rotation of the head
     * @param headPitch vertical rotation of the head
     * @param scale The relative scale of the entity
     */
    public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        GlStateManager.pushMatrix();
        body.render(scale);
        weaponsBelt.render(scale);
        plunger.render(scale);
        gun.render(scale);
        neck.render(scale);
        eye.render(scale);
        head.render(scale);
        GlStateManager.popMatrix();
    }

    /**
     * update rotation values on the model.
     * @param entityIn Entity being rendered by this model
     * @param limbSwing A value to determine the limb swing
     * @param limbSwingAmount the amount limbs should be swung
     * @param ageInTicks how old the entity is in ticks (20 ticks per second)
     * @param netHeadYaw horizontal rotation of the head
     * @param headPitch vertical rotation of the head
     * @param scaleFactor The relative scale of the entity
     */
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.eye.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.eye.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.gun.rotateAngleX = headPitch * ((float)Math.PI / 180F);
    }
}
