package com.harry314.testMod;

import com.harry314.testMod.handler.configurationHandler;
import com.harry314.testMod.init.modItems;
import com.harry314.testMod.proxy.iProxy;
import com.harry314.testMod.reference.reference;
import com.harry314.testMod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = reference.MOD_ID, name = reference.MOD_NAME, version = reference.VERSION, guiFactory = reference.GUI_FACTORY_CLASS)
public class testMod
{
    @Mod.Instance(reference.MOD_ID)
    public static testMod instance;

    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS,serverSide = reference.SERVER_PROXY_CLASS)
    public static iProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        configurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new configurationHandler());
        LogHelper.info("Pre Initialization Done!");
        modItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Done!");
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Done!");
    }

}
