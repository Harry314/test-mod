package com.harry314.testMod.client.gui;

import com.harry314.testMod.handler.configurationHandler;
import com.harry314.testMod.reference.reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class guiConfig extends GuiConfig
{
    public guiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(configurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(configurationHandler.configuration.toString()));
    }
}
