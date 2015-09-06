package com.harry314.testMod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class configurationHandler
{
    public static void Configuration configuration;
    public static void init(File configFile)
    {
        configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
           configuration.load();

            configValue = configuration.get(configuration.CATEGORY_GENERAL, "configValue", true, "example config value").getBoolean(true);
        }
        catch (Exception e)
        {

        }
        finally
        {
           configuration.save();
        }

        System.out.println(configValue);

    }
}
