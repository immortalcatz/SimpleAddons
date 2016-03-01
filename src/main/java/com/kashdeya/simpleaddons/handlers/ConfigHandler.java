package com.kashdeya.simpleaddons.handlers;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.kashdeya.simpleaddons.Reference;
import com.kashdeya.simpleaddons.recipes.CraftingRecipes;
import com.kashdeya.simpleaddons.recipes.FurnaceRecipes;

public class ConfigHandler
{
	public static Configuration config;
	

	public static void initConfigs()
	{
		if(config == null)
		
		config.load();

        CraftingRecipes.lampOff = config.getBoolean("Lamps", Configuration.CATEGORY_GENERAL, false, "Turns off Lamp Block");
        CraftingRecipes.clampOff = config.getBoolean("Color Lamps", Configuration.CATEGORY_GENERAL, false, "Turns off Color Lamp Blocks");
        CraftingRecipes.leatherOff = config.getBoolean("Leather", Configuration.CATEGORY_GENERAL, false, "Turns off roten flesh to leather");
        CraftingRecipes.juicesOff = config.getBoolean("Juices", Configuration.CATEGORY_GENERAL, false, "Turns off juicer and juices");
        CraftingRecipes.baconOff = config.getBoolean("Bacon", Configuration.CATEGORY_GENERAL, false, "Turns off bacon");
        CraftingRecipes.nametagOff = config.getBoolean("Name Tag", Configuration.CATEGORY_GENERAL, false, "Turns off name tag recipe");
        CraftingRecipes.bneOff = config.getBoolean("Bacon & Eggs", Configuration.CATEGORY_GENERAL, false, "Turns off bacon and eggs");
        FurnaceRecipes.cookedbaconOff = config.getBoolean("Cooked Bacon", Configuration.CATEGORY_GENERAL, false, "Turns off cooked bacon");
        FurnaceRecipes.toastOff = config.getBoolean("Toast", Configuration.CATEGORY_GENERAL, false, "Turns off toast");
        FurnaceRecipes.fleshOff = config.getBoolean("Monster Jerky", Configuration.CATEGORY_GENERAL, false, "Turns off monster jerky");
        FurnaceRecipes.eggOff = config.getBoolean("Fried Egg", Configuration.CATEGORY_GENERAL, false, "Turns off fried egg");
        FurnaceRecipes.brownOff = config.getBoolean("Cooked Brown Mushroom", Configuration.CATEGORY_GENERAL, false, "Turns off cooked brown mushroom");
        FurnaceRecipes.redOff = config.getBoolean("Cooked Red Mushroom", Configuration.CATEGORY_GENERAL, false, "Turns off cooked red mushroom");

        config.save();

    }
}
