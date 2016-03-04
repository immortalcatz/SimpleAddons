package com.kashdeya.simpleaddons.handlers;

import net.minecraftforge.common.config.Configuration;

import com.kashdeya.simpleaddons.recipes.CraftingRecipes;
import com.kashdeya.simpleaddons.recipes.FurnaceRecipes;

public class ConfigHandler
{
	public static Configuration config;
	public static int CharcoalBlockBurnTime = 1600;
	public static int PaperBurnTime = 50;
	public static int BowlBurnTime = 0;
	public static int LadderBurnTime = 0;
	public static int WoodenPressurePlateBurnTime = 0;
	public static int SignBurnTime = 0;

	public static void initConfigs()
	{
		if(config == null)
		
		config.load();
		
		String category;
		
		category = "Simple Addons";
		config.addCustomCategoryComment(category, "TRUE = Disabled and FALSE = Active");
		
		CraftingRecipes.lampOff = config.getBoolean("Lamps", category, false, "Disable Lamp Block?");
        CraftingRecipes.clampOff = config.getBoolean("Color Lamps",  category, false, "Disable Color Lamp Blocks?");
        CraftingRecipes.juicesOff = config.getBoolean("Juices",  category, false, "Disable juicer Recipes?");
        CraftingRecipes.baconOff = config.getBoolean("Bacon",  category, false, "Disable bacon?");
        CraftingRecipes.bneOff = config.getBoolean("Bacon & Eggs",  category, false, "Disable bacon and eggs?");
        CraftingRecipes.hammerOff = config.getBoolean("Hammer",  category, false, "Disable Hammer Recipes?");
        CraftingRecipes.chainOff = config.getBoolean("Chain Armour",  category, false, "Disable Chain Armour?");
        CraftingRecipes.chestOff = config.getBoolean("Chest",  category, false, "Disable Chest Recipe?");
        CraftingRecipes.reedOff = config.getBoolean("Old Reeds",  category, false, "Disable Sugarcane Recipe?");
        CraftingRecipes.scrap1Off = config.getBoolean("Scrap Metals",  category, false, "Disable uncrafting of horse armour?");
        CraftingRecipes.charcoalOff = config.getBoolean("Charcoal Block", category, false, "Disable Charcoal Block?");
        CraftingRecipes.leatherOff = config.getBoolean("Leather",  category, false, "Disable rotten flesh to leather?");

		//Crafting Recipes
        config.addCustomCategoryComment(category + " Vanilla Recipes", "TRUE = Disabled and FALSE = Active");
        CraftingRecipes.nametagOff = config.getBoolean("Name Tag",  category+ " Vanilla Recipes", false, "Disable name tag recipe?");
        CraftingRecipes.saddleOff = config.getBoolean("Saddle",  category+ " Vanilla Recipes", false, "Disable Saddle?");
        CraftingRecipes.horseOff = config.getBoolean("Horse Armour",  category+ " Vanilla Recipes", false, "Disable Horse Armour?");
        CraftingRecipes.spongeOff = config.getBoolean("Sponge",  category+ " Vanilla Recipes", false, "Disable Sponge?");
        CraftingRecipes.cobwebOff = config.getBoolean("Cobweb",  category+ " Vanilla Recipes", false, "Disable Cobweb?");
        CraftingRecipes.iceOff = config.getBoolean("Ice",  category+ " Vanilla Recipes", false, "Disable Ice?");
        CraftingRecipes.packedOff = config.getBoolean("Packed Ice",  category+ " Vanilla Recipes", false, "Disable Packed Ice?");
        CraftingRecipes.slabOff = config.getBoolean("Slab",  category+ " Vanilla Recipes", true, "Disable Cobble Slabs to Blocks?");        
        
        //Furnace Recipes
        config.addCustomCategoryComment(category + " Furnace Recipes", "TRUE = Disabled and FALSE = Active");
        FurnaceRecipes.cookedbaconOff = config.getBoolean("Cooked Bacon", category+ " Furnace Recipes", false, "Disable cooked bacon?");
        FurnaceRecipes.toastOff = config.getBoolean("Toast", category+ " Furnace Recipes", false, "Disable toast?");
        FurnaceRecipes.fleshOff = config.getBoolean("Monster Jerky", category+ " Furnace Recipes", false, "Disable monster jerky?");
        FurnaceRecipes.eggOff = config.getBoolean("Fried Egg", category+ " Furnace Recipes", false, "Disable fried egg?");
        FurnaceRecipes.brownOff = config.getBoolean("Cooked Brown Mushroom", category+ " Furnace Recipes", false, "Disable cooked brown mushroom?");
        FurnaceRecipes.redOff = config.getBoolean("Cooked Red Mushroom", category+ " Furnace Recipes", false, "Disable cooked red mushroom?");
        FurnaceRecipes.scrapOff = config.getBoolean("Scrap Metal", category+ " Furnace Recipes", false, "Disable furnace recipe for scrap metal to ingots?");
        
        //Fuel
        config.addCustomCategoryComment(category + " Furnace Fuels", "Furnace Fuels use 0 to DISABLE and anything above to activate");
        CharcoalBlockBurnTime = config.getInt("Charcoal Burn Time", category+ " Furnace Fuels", 16000, 0, 16000, "The burn time for Charcoal Blocks");
        PaperBurnTime = config.getInt("Paper Burn Time", category+ " Furnace Fuels", 0, 0, 50, "The burn time for Paper");
        BowlBurnTime = config.getInt("Bowl Burn Time", category+ " Furnace Fuels", 0, 0, 100, "The burn time for Bowls");
        LadderBurnTime = config.getInt("Ladder Burn Time", category+ " Furnace Fuels", 0, 0, 100, "The burn time for Ladders");
        WoodenPressurePlateBurnTime = config.getInt("Pressure Plate Burn Time", category+ " Furnace Fuels", 0, 0, 100, "The burn time for Wooden Pressure Plates");
        SignBurnTime = config.getInt("Sign Burn Time", category+ " Furnace Fuels", 0, 0, 100, "The burn time for Signs");

        config.save();

    }
}
