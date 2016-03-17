package com.kashdeya.simpleaddons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kashdeya.simpleaddons.creativetabs.TabSimpleAddonsBlocks;
import com.kashdeya.simpleaddons.creativetabs.TabSimpleAddonsFood;
import com.kashdeya.simpleaddons.creativetabs.TabSimpleAddonsItems;
import com.kashdeya.simpleaddons.creativetabs.TabSimpleAddonsTools;
import com.kashdeya.simpleaddons.handlers.ConfigHandler;
import com.kashdeya.simpleaddons.handlers.VanillaHandler;
import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;
import com.kashdeya.simpleaddons.init.SimpleAddonsFood;
import com.kashdeya.simpleaddons.init.SimpleAddonsItems;
import com.kashdeya.simpleaddons.init.SimpleAddonsTools;
import com.kashdeya.simpleaddons.proxy.CommonProxy;
import com.kashdeya.simpleaddons.recipes.CraftingRecipes;
import com.kashdeya.simpleaddons.recipes.FurnaceRecipes;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class SimpleAddons {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs tabBlock = new TabSimpleAddonsBlocks("SimpleAddonsBlocks");
	public static final CreativeTabs tabItems = new TabSimpleAddonsItems("SimpleAddonsItems");
	public static final CreativeTabs tabFood = new TabSimpleAddonsFood("SimpleAddonsFood");
	public static final CreativeTabs tabTools = new TabSimpleAddonsTools("SimpleAddonsTools");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		SimpleAddonsBlocks.init();
		SimpleAddonsBlocks.register();
		SimpleAddonsItems.init();
		SimpleAddonsItems.register();
		SimpleAddonsFood.init();
		SimpleAddonsFood.register();
		SimpleAddonsTools.init();
		SimpleAddonsTools.register();
		ConfigHandler.initConfigs();
		VanillaHandler.initRemove();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenders();
		proxy.registerWorldGenerators();
		CraftingRecipes.registerCraftingRecipies();
		FurnaceRecipes.registerFurnaceRecipies();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}

}
