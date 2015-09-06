package com.harry314.testMod.init;

import com.harry314.testMod.item.itemBase;
import com.harry314.testMod.item.itemBlackStick;
import cpw.mods.fml.common.registry.GameRegistry;

public class modItems
{
    public static final itemBase BlackStick = new itemBlackStick();

    public static void init()
    {
        GameRegistry.registerItem(BlackStick,"BlackStick");
    }
}
