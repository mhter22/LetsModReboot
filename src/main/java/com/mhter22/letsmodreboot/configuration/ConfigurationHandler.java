package com.mhter22.letsmodreboot.configuration;


import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler
{
    public static void init(File ConfigFile)
    {
        Configuration configuration = new Configuration(ConfigFile);
        boolean configValue = false;
        try
        {
            configuration.load();

            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e)
        {

        }
        finally
        {
            configuration.save();
        }

        System.out.print("Configuration Test: " + configValue);
    }
}
