package com.softetch.dwm.client.gui.element.background;

import com.softetch.dwm.DWMMain;
import com.softetch.dwm.client.gui.element.DustElement;
import com.softetch.dwm.client.gui.element.StarElement;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.ResourceLocation;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeepSpaceBackground extends AbstractGui {
    private List<StarElement> stars = new ArrayList<>();
    private List<DustElement> dustParticles = new ArrayList<>();
    private static final Random RANDOM = new Random();
    private boolean genDust;

    public DeepSpaceBackground(boolean genDust) {
        this.genDust = genDust;
        init();
    }

    private void init() {
        if (genDust) {
            try {
                InputStream inputStream = Minecraft.getInstance().getResourceManager().getResource(new ResourceLocation(DWMMain.MOD_ID, "textures/gui/noise.png")).getInputStream();
                BufferedImage image = ImageIO.read(inputStream);
                // FIXME: May cause issues on displays with dimensions greater than 2048...
                int startX = RANDOM.nextInt(image.getWidth() - Minecraft.getInstance().mainWindow.getScaledWidth());
                int startY = RANDOM.nextInt(image.getHeight() - Minecraft.getInstance().mainWindow.getScaledHeight());
                int finalX = startX + Minecraft.getInstance().mainWindow.getScaledWidth();
                int finalY = startY + Minecraft.getInstance().mainWindow.getScaledHeight();
                for (int x = startX; x < finalX; x++) {
                    for (int y = startY; y < finalY; y++) {
                        int pixel = image.getRGB(x, y);
                        int alpha = (pixel >> 24) & 0xff;
//                    int red = (pixel >> 16) & 0xff;
//                    int green = (pixel >> 8) & 0xff;
//                    int blue = (pixel) & 0xff;
                        if (alpha == 255) {
                            System.out.println("generating dust");
                            dustParticles.add(new DustElement(x - startX, y - startY, 2, 2));
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void render() {
        for (StarElement star : stars) {
            star.render();
        }
        for (DustElement dust : dustParticles) {
            dust.render();
        }
    }
}
