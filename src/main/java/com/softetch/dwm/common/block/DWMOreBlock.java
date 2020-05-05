package com.softetch.dwm.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DWMOreBlock extends Block {

    public DWMOreBlock() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F));
    }

}
