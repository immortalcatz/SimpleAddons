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
	public static int CharcoalBlockBurnTime = 1600;
	

	public static void initConfigs()
	{
		if(config == null)
		
		config.load();
		
		//Crafting Recipes
        CraftingRecipes.lampOff = config.getBoolean("Lamps", Configuration.CATEGORY_GENERAL, false, "Turns off Lamp Block");
        CraftingRecipes.clampOff = config.getBoolean("Color Lamps", Configuration.CATEGORY_GENERAL, false, "Turns off Color Lamp Blocks");
        CraftingRecipes.leatherOff = config.getBoolean("Leather", Configuration.CATEGORY_GENERAL, false, "Turns off rotten flesh to leather");
        CraftingRecipes.juicesOff = config.getBoolean("Juices", Configuration.CATEGORY_GENERAL, false, "Turns off juicer Recipes");
        CraftingRecipes.baconOff = config.getBoolean("Bacon", Configuration.CATEGORY_GENERAL, false, "Turns off bacon");
        CraftingRecipes.nametagOff = config.getBoolean("Name Tag", Configuration.CATEGORY_GENERAL, false, "Turns off name tag recipe");
        CraftingRecipes.bneOff = config.getBoolean("Bacon & Eggs", Configuration.CATEGORY_GENERAL, false, "Turns off bacon and eggs");
        CraftingRecipes.saddleOff = config.getBoolean("Saddle", Configuration.CATEGORY_GENERAL, false, "Turns off Saddle");
        CraftingRecipes.horseOff = config.getBoolean("Horse Armour", Configuration.CATEGORY_GENERAL, false, "Turns off Horse Armour");
        CraftingRecipes.spongeOff = config.getBoolean("Sponge", Configuration.CATEGORY_GENERAL, false, "Turns off Sponge");
        CraftingRecipes.cobwebOff = config.getBoolean("Cobweb", Configuration.CATEGORY_GENERAL, false, "Turns off Cobweb");
        CraftingRecipes.iceOff = config.getBoolean("Ice", Configuration.CATEGORY_GENERAL, false, "Turns off Ice");
        CraftingRecipes.packedOff = config.getBoolean("Packed Ice", Configuration.CATEGORY_GENERAL, false, "Turns off Packed Ice");
        CraftingRecipes.slabOff = config.getBoolean("Slab", Configuration.CATEGORY_GENERAL, true, "Turns off Cobble Slabs to Blocks");
        CraftingRecipes.hammerOff = config.getBoolean("Hammer", Configuration.CATEGORY_GENERAL, false, "Turns off Hammer Recipes");
        CraftingRecipes.chainOff = config.getBoolean("Chain Armour", Configuration.CATEGORY_GENERAL, false, "Turns off Chain Armour");
        CraftingRecipes.chestOff = config.getBoolean("Chest", Configuration.CATEGORY_GENERAL, false, "Turns off Chest Recipe");
        CraftingRecipes.reedOff = config.getBoolean("Old Reeds", Configuration.CATEGORY_GENERAL, false, "Turns off Sugarcane Recipe");
        
        
        //Furnace Recipes
        FurnaceRecipes.cookedbaconOff = config.getBoolean("Cooked Bacon", Configuration.CATEGORY_GENERAL, false, "Turns off cooked bacon");
        FurnaceRecipes.toastOff = config.getBoolean("Toast", Configuration.CATEGORY_GENERAL, false, "Turns off toast");
        FurnaceRecipes.fleshOff = config.getBoolean("Monster Jerky", Configuration.CATEGORY_GENERAL, false, "Turns off monster jerky");
        FurnaceRecipes.eggOff = config.getBoolean("Fried Egg", Configuration.CATEGORY_GENERAL, false, "Turns off fried egg");
        FurnaceRecipes.brownOff = config.getBoolean("Cooked Brown Mushroom", Configuration.CATEGORY_GENERAL, false, "Turns off cooked brown mushroom");
        FurnaceRecipes.redOff = config.getBoolean("Cooked Red Mushroom", Configuration.CATEGORY_GENERAL, false, "Turns off cooked red mushroom");
        
        //Fuel
        CraftingRecipes.charcoalOff = config.getBoolean("Charcoal Block", Configuration.CATEGORY_GENERAL, false, "Turns off Charcoal Block");
        CharcoalBlockBurnTime = config.getInt("Burn Time", Configuration.CATEGORY_GENERAL, 16000, 1, 16000, "The burn time for Charcoal Blocks");

        config.save();

    }
}
