package com.harry314.testMod;

import com.harry314.testMod.proxy.iProxy;
import com.harry314.testMod.reference.reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.MOD_ID, name = reference.MOD_NAME, version = reference.VERSION)
public class testMod
{
    @Mod.Instance(reference.MOD_ID)
    public static testMod instance;

    @SidedProxy(clientSide = "com.harry314.testMod.proxy.clientProxy",serverSide = "com.harry314.testMod.proxy.serverProxy")
    public static iProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

    }

}
