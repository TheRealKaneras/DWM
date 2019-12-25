package com.softetch.dwm.client.gui;

import com.softetch.dwm.client.gui.element.background.DeepSpaceBackground;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.TranslationTextComponent;

public class GuiVortexManipulator extends Screen {
    private DeepSpaceBackground background;

    public GuiVortexManipulator() {
        super(new TranslationTextComponent("vortexManipulatorScreen.title"));
        this.background = new DeepSpaceBackground(true);
    }

    @Override
    protected void init() {
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.background.render();
        super.render(mouseX, mouseY, partialTicks);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
