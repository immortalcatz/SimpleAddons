package com.kashdeya.simpleaddons.handlers;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.kashdeya.simpleaddons.recipes.CraftingRecipes;
import com.kashdeya.simpleaddons.recipes.FurnaceRecipes;
import com.kashdeya.simpleaddons.handlers.VanillaHandler;

public class ConfigHandler
{
	public static Configuration config;
	public static int CharcoalBlockBurnTime = 1600;
	public static int PaperBurnTime = 50;
	public static int BowlBurnTime = 100;
	public static int LadderBurnTime = 100;
	public static int WoodenPressurePlateBurnTime = 100;
	public static int SignBurnTime = 100;
	
	public static final File configDir = new File("config/SimpleAddons");

	public static void initConfigs()
	{
		
		File f = new File(configDir, "SimpleAddons.cfg");
        config = new Configuration(f);
        
		config.load();
		
		String category;
		
		category = "Simple Addons";
		config.addCustomCategoryComment(category, "TRUE = Yes and FALSE = No");
		CraftingRecipes.lampOff = config.getBoolean("Lamps", category, true, "Enable Lamp Block?");
        CraftingRecipes.clampOff = config.getBoolean("Color Lamps",  category, true, "Enable Color Lamp Blocks?");
        CraftingRecipes.juicesOff = config.getBoolean("Juices",  category, true, "Enable juicer Recipes?");
        CraftingRecipes.baconOff = config.getBoolean("Bacon",  category, true, "Enable bacon?");
        CraftingRecipes.bneOff = config.getBoolean("Bacon & Eggs",  category, true, "Enable bacon and eggs?");
        CraftingRecipes.hammerOff = config.getBoolean("Hammer",  category, true, "Enable Hammer Recipes?");
        CraftingRecipes.dthammerOff = config.getBoolean("Diamond Tipped Hammer", category, true, "Enable Diamond Tipped Hammer?");
        CraftingRecipes.chainOff = config.getBoolean("Chain Armour",  category, true, "Enable Chain Armour?");
        CraftingRecipes.chestOff = config.getBoolean("Chest",  category, true, "Enable Chest Recipe?");
        CraftingRecipes.reedOff = config.getBoolean("Old Reeds",  category, true, "Enable Sugarcane Recipe?");
        CraftingRecipes.scrap1Off = config.getBoolean("Scrap Metals",  category, true, "Enable uncrafting of horse armour?");
        CraftingRecipes.charcoalOff = config.getBoolean("Charcoal Block", category, true, "Enable Charcoal Block?");
        CraftingRecipes.leatherOff = config.getBoolean("Leather",  category, true, "Enable rotten flesh to leather?");
        CraftingRecipes.bucketOff = config.getBoolean("Wooden Bucket",  category, true, "Enable Wooden Bucket?");
        CraftingRecipes.growthOff = config.getBoolean("Growth Crystal", category, true, "Enable Growth Crystal?");

		//Vanilla Recipes
        config.addCustomCategoryComment(category + " Vanilla Recipes", "TRUE = Yes and FALSE = No");
        CraftingRecipes.nametagOff = config.getBoolean("Name Tag",  category+ " Vanilla Recipes", true, "Enable name tag recipe?");
        CraftingRecipes.saddleOff = config.getBoolean("Saddle",  category+ " Vanilla Recipes", true, "Enable Saddle?");
        CraftingRecipes.horseOff = config.getBoolean("Horse Armour",  category+ " Vanilla Recipes", true, "Enable Horse Armour?");
        CraftingRecipes.spongeOff = config.getBoolean("Sponge",  category+ " Vanilla Recipes", true, "Enable Sponge?");
        CraftingRecipes.cobwebOff = config.getBoolean("Cobweb",  category+ " Vanilla Recipes", true, "Enable Cobweb?");
        CraftingRecipes.iceOff = config.getBoolean("Ice",  category+ " Vanilla Recipes", true, "Enable Ice?");
        CraftingRecipes.packedOff = config.getBoolean("Packed Ice",  category+ " Vanilla Recipes", true, "Enable Packed Ice?");
        CraftingRecipes.slabOff = config.getBoolean("Slab",  category+ " Vanilla Recipes", false, "Enable Cobble Slabs to Blocks?");
        CraftingRecipes.replaceOff = config.getBoolean("Stone Tools", category+ " Vanilla Recipes", true, "Enable real stone tools?");
        VanillaHandler.removeOff = config.getBoolean("Stone Tools", category+ " Vanilla Recipes", true, "Remove Vanilla stone tools?");
        VanillaHandler.breadOff = config.getBoolean("Bread Recipe", category+ " Vanilla Recipes", true, "Remove Vanilla Bread Recipe?");
        VanillaHandler.endstoneOff = config.getBoolean("EndStone Recipe", category+ " Vanilla Recipes", true, "Enable endstone Recipe?");
        CraftingRecipes.coarseOff = config.getBoolean("Coarse Recipe", category+ " Vanilla Recipes", true, "Enable Coarse dirt to dirt Recipe?");
        
        //Furnace Recipes
        config.addCustomCategoryComment(category + " Furnace Recipes", "TRUE = Yes and FALSE = No");
        FurnaceRecipes.cookedbaconOff = config.getBoolean("Cooked Bacon", category+ " Furnace Recipes", true, "Enable cooked bacon?");
        FurnaceRecipes.toastOff = config.getBoolean("Toast", category+ " Furnace Recipes", true, "Enable toast?");
        FurnaceRecipes.fleshOff = config.getBoolean("Monster Jerky", category+ " Furnace Recipes", true, "Enable monster jerky?");
        FurnaceRecipes.eggOff = config.getBoolean("Fried Egg", category+ " Furnace Recipes", true, "Enable fried egg?");
        FurnaceRecipes.brownOff = config.getBoolean("Cooked Brown Mushroom", category+ " Furnace Recipes", true, "Enable cooked brown mushroom?");
        FurnaceRecipes.redOff = config.getBoolean("Cooked Red Mushroom", category+ " Furnace Recipes", true, "Enable cooked red mushroom?");
        FurnaceRecipes.scrapOff = config.getBoolean("Scrap Metal", category+ " Furnace Recipes", true, "Enable furnace recipe for scrap metal to ingots?");
        
        //Fuel
        config.addCustomCategoryComment(category + " Furnace Fuels", "Furnace Fuels use 0 to DISABLE and anything above to activate");
        CharcoalBlockBurnTime = config.getInt("Charcoal Burn Time", category+ " Furnace Fuels", 16000, 0, 16000, "The burn time for Charcoal Blocks");
        PaperBurnTime = config.getInt("Paper Burn Time", category+ " Furnace Fuels", 0, 0, 50, "The burn time for Paper");
        BowlBurnTime = config.getInt("Bowl Burn Time", category+ " Furnace Fuels", 0, 0, 100, "The burn time for Bowls");
        LadderBurnTime = config.getInt("Ladder Burn Time", category+ " Furnace Fuels", 0, 0, 100, "The burn time for Ladders");
        WoodenPressurePlateBurnTime = config.getInt("Pressure Plate Burn Time", category+ " Furnace Fuels", 0, 0, 100, "The burn time for Wooden Pressure Plates");
        SignBurnTime = config.getInt("Sign Burn Time", category+ " Furnace Fuels", 0, 0, 100, "The burn time for Signs");
        
        //Tools & Weapons
        config.addCustomCategoryComment(category + " Tools and Weapons", "TRUE = Yes and FALSE = No");
        CraftingRecipes.graniteOff = config.getBoolean("Granite Tools and Weapons", category + " Tools and Weapons", true, "Enable Granite Tools & Weapons?");
        CraftingRecipes.andesiteOff = config.getBoolean("Andesite Tools and Weapons", category + " Tools and Weapons", true, "Enable Andesite Tools & Weapons?");
        CraftingRecipes.dioriteOff = config.getBoolean("Diorite Tools and Weapons", category + " Tools and Weapons", true, "Enable Diorite Tools & Weapons?");

        config.save();

    }
}
