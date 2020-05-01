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
    private final List<StarElement> stars = new ArrayList<>();
    private final List<DustElement> dustParticles = new ArrayList<>();
    private static final Random RANDOM = new Random();
    private final boolean genDust;
    private static BufferedImage noiseImage = null;

    public DeepSpaceBackground(boolean genDust) {
        this.genDust = genDust;

        init();
    }

    private void init() {
        if (genDust) {
            try {
                if (noiseImage == null) {
                    System.out.println("loading file");
                    InputStream inputStream = Minecraft.getInstance().getResourceManager().getResource(new ResourceLocation(DWMMain.MOD_ID, "textures/gui/noise.png")).getInputStream();
                    noiseImage = ImageIO.read(inputStream);
                }
                // FIXME: May cause issues on displays with dimensions greater than 2048...
                int startX = RANDOM.nextInt(noiseImage.getWidth() - Minecraft.getInstance().getMainWindow().getScaledWidth());
                int startY = RANDOM.nextInt(noiseImage.getHeight() - Minecraft.getInstance().getMainWindow().getScaledHeight());
                int finalX = startX + Minecraft.getInstance().getMainWindow().getScaledWidth();
                int finalY = startY + Minecraft.getInstance().getMainWindow().getScaledHeight();
                int count = 0;
                int sum = 0;
                for (int x = startX; x < finalX; x++) {
                    for (int y = startY; y < finalY; y++) {
                        int pixel = noiseImage.getRGB(x, y);
                        int alpha = (pixel >> 24) & 0xff;
                        count++;
                        sum += alpha;
//                    int red = (pixel >> 16) & 0xff;
//                    int green = (pixel >> 8) & 0xff;
//                    int blue = (pixel) & 0xff;
                        if (alpha > 180 && RANDOM.nextInt(100) > 75) {
                            dustParticles.add(new DustElement(x - startX, y - startY, 2, 2));
                        } else if (RANDOM.nextInt(100) > 99) {
                            stars.add(new StarElement(x - startX, y - startY, 2, 2));
                        }

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void render() {
        int width = Minecraft.getInstance().getMainWindow().getScaledWidth();
        int height = Minecraft.getInstance().getMainWindow().getScaledHeight();
        AbstractGui.fill(0, 0, width, height, 0xEE000000);

        for (StarElement star : stars) {
            star.render();
            star.move(1, 0);
            if (RANDOM.nextInt(100) > 99) {
                stars.add(new StarElement(RANDOM.nextInt(width), RANDOM.nextInt(height), 2, 2));
            }
        }
        for (DustElement dust : dustParticles) {
            dust.render();
        }
        AbstractGui.fill(0, 0, width, height, 0x55000000);
    }
}
