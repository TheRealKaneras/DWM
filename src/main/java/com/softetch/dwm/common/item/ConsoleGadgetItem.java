package com.softetch.dwm.common.item;

import com.softetch.dwm.DWMItemGroups;
import com.softetch.dwm.client.tardis.ConsolePanelGroup;
import com.softetch.dwm.common.item.gadget.ConsoleActivationAction;
import net.minecraft.item.Item;

public class ConsoleGadgetItem extends Item {
    private ConsolePanelGroup panel;
    private ConsoleActivationAction action;

    public ConsoleGadgetItem(ConsolePanelGroup panel, ConsoleActivationAction action) {
        super(new Item.Properties().group(DWMItemGroups.CONSOLE).maxStackSize(1));
    }

    public ConsolePanelGroup getPanel() {
        return panel;
    }

    public ConsoleActivationAction getAction() {
        return action;
    }
}
