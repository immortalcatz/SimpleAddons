package com.kashdeya.simpleaddons.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.kashdeya.simpleaddons.Reference;
import com.kashdeya.simpleaddons.SimpleAddons;
import com.kashdeya.simpleaddons.items.Itembowl;
import com.kashdeya.simpleaddons.items.Itembucket;
import com.kashdeya.simpleaddons.items.Itemdthammer;
import com.kashdeya.simpleaddons.items.Itemhammer;
import com.kashdeya.simpleaddons.items.Itemjuicer;
import com.kashdeya.simpleaddons.items.Itemknife;
import com.kashdeya.simpleaddons.items.Itemmortar;

public class SimpleAddonsItems {
	
	public static final Item.ToolMaterial knifeMaterial = EnumHelper.addToolMaterial("knifeMaterial", 1, 600, 0.2F, 0.0F, 14);

	public static Item knife;
	public static Item item_juicer;
	public static Item item_hammer;
	public static Item item_chain;
	public static Item item_broken_reed;
	public static Item iron_scrap;
	public static Item gold_scrap;
	public static Item wooden_bucket_empty;
	public static Item wooden_bucket_water;
	public static Item item_dthammer;
	public static Item unfired_mortar;
	public static Item fired_mortar;
	public static Item mortar_pestle;
	public static Item item_flour;
	public static Item item_dough;
	public static Item mixing_bowl;
	public static Item crushed_obsidian;
	public static Item rotten_leather;
	
	public static void init(){
		
		knife = new Itemknife("knife", 100, knifeMaterial).setUnlocalizedName("knife");
		item_juicer = new Itemjuicer().setUnlocalizedName("item_juicer");
		item_hammer = new Itemhammer("item_hammer", 150, knifeMaterial).setUnlocalizedName("item_hammer");
		item_dthammer = new Itemdthammer("item_dthammer", 600, knifeMaterial).setUnlocalizedName("item_dthammer");
		item_chain = new Item().setUnlocalizedName("item_chain").setCreativeTab(SimpleAddons.tabItems);
		item_broken_reed = new Item().setUnlocalizedName("item_broken_reed").setCreativeTab(SimpleAddons.tabItems);
		iron_scrap = new Item().setUnlocalizedName("iron_scrap").setCreativeTab(SimpleAddons.tabItems);
		gold_scrap = new Item().setUnlocalizedName("gold_scrap").setCreativeTab(SimpleAddons.tabItems);
		wooden_bucket_empty = new Itembucket(Blocks.air).setUnlocalizedName("wooden_bucket_empty");
		wooden_bucket_water = new Itembucket(Blocks.flowing_water).setUnlocalizedName("wooden_bucket_water");
		unfired_mortar = new Item().setUnlocalizedName("unfired_mortar").setCreativeTab(SimpleAddons.tabItems);
		fired_mortar = new Item().setUnlocalizedName("fired_mortar").setCreativeTab(SimpleAddons.tabItems);
		mortar_pestle = new Itemmortar().setUnlocalizedName("mortar_pestle");
		item_flour = new Item().setUnlocalizedName("item_flour").setCreativeTab(SimpleAddons.tabItems);
		item_dough = new Item().setUnlocalizedName("item_dough").setCreativeTab(SimpleAddons.tabItems);
		mixing_bowl = new Itembowl().setUnlocalizedName("mixing_bowl");
		crushed_obsidian = new Item().setUnlocalizedName("crushed_obsidian").setCreativeTab(SimpleAddons.tabItems);
		rotten_leather = new Item().setUnlocalizedName("rotten_leather").setCreativeTab(SimpleAddons.tabItems);
		
		OreDictionary.registerOre("dustIron", SimpleAddonsItems.iron_scrap);
		OreDictionary.registerOre("dustGold", SimpleAddonsItems.gold_scrap);
		OreDictionary.registerOre("dustObsidian", SimpleAddonsItems.crushed_obsidian);
	}
	
	public static void register(){
		GameRegistry.registerItem(knife, knife.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item_chain, item_chain.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item_juicer, item_juicer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item_hammer, item_hammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item_dthammer, item_dthammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item_broken_reed, item_broken_reed.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(iron_scrap, iron_scrap.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gold_scrap, gold_scrap.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wooden_bucket_empty, wooden_bucket_empty.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wooden_bucket_water, wooden_bucket_water.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(unfired_mortar, unfired_mortar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fired_mortar, fired_mortar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mortar_pestle, mortar_pestle.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item_flour, item_flour.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item_dough, item_dough.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mixing_bowl, mixing_bowl.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(crushed_obsidian, crushed_obsidian.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rotten_leather, rotten_leather.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(knife);
		registerRender(item_juicer);
		registerRender(item_hammer);
		registerRender(item_dthammer);
		registerRender(item_chain);
		registerRender(item_broken_reed);
		registerRender(iron_scrap);
		registerRender(gold_scrap);
		registerRender(wooden_bucket_empty);
		registerRender(wooden_bucket_water);
		registerRender(unfired_mortar);
		registerRender(fired_mortar);
		registerRender(mortar_pestle);
		registerRender(item_flour);
		registerRender(item_dough);
		registerRender(mixing_bowl);
		registerRender(crushed_obsidian);
		registerRender(rotten_leather);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
