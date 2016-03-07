package com.kashdeya.simpleaddons.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.simpleaddons.Reference;
import com.kashdeya.simpleaddons.SimpleAddons;
import com.kashdeya.simpleaddons.items.Itembucket;
import com.kashdeya.simpleaddons.items.Itemhammer;
import com.kashdeya.simpleaddons.items.Itemknife;

public class SimpleAddonsItems {
	
	public static final Item.ToolMaterial knifeMaterial = EnumHelper.addToolMaterial("knifeMaterial", 1, 100, 0.2F, 0.0F, 14);

	public static Item knife;
	public static Item item_juicer;
	public static Item item_plate;
	public static Item item_hammer;
	public static Item item_chain;
	public static Item item_broken_reed;
	public static Item iron_scrap;
	public static Item gold_scrap;
	public static Item wooden_bucket_empty;
	public static Item wooden_bucket_water;
	
	public static void init(){
		knife = new Itemknife("knife", 100, knifeMaterial).setUnlocalizedName("knife");
		item_juicer = new Item().setUnlocalizedName("item_juicer").setCreativeTab(SimpleAddons.tabItems);
		item_hammer = new Itemhammer("item_hammer", 100, knifeMaterial).setUnlocalizedName("item_hammer");
		item_plate = new Item().setUnlocalizedName("item_plate").setCreativeTab(SimpleAddons.tabItems);
		item_chain = new Item().setUnlocalizedName("item_chain").setCreativeTab(SimpleAddons.tabItems);
		item_broken_reed = new Item().setUnlocalizedName("item_broken_reed").setCreativeTab(SimpleAddons.tabItems);
		iron_scrap = new Item().setUnlocalizedName("iron_scrap").setCreativeTab(SimpleAddons.tabItems);
		gold_scrap = new Item().setUnlocalizedName("gold_scrap").setCreativeTab(SimpleAddons.tabItems);
		wooden_bucket_empty = new Itembucket(Blocks.air).setUnlocalizedName("wooden_bucket_empty");
		wooden_bucket_water = new Itembucket(Blocks.flowing_water).setUnlocalizedName("wooden_bucket_water");
		
	}
	
	public static void register(){
		GameRegistry.registerItem(knife, knife.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item_chain, item_chain.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item_juicer, item_juicer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item_hammer, item_hammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item_plate, item_plate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(item_broken_reed, item_broken_reed.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(iron_scrap, iron_scrap.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gold_scrap, gold_scrap.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wooden_bucket_empty, wooden_bucket_empty.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wooden_bucket_water, wooden_bucket_water.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(knife);
		registerRender(item_juicer);
		registerRender(item_hammer);
		registerRender(item_plate);
		registerRender(item_chain);
		registerRender(item_broken_reed);
		registerRender(iron_scrap);
		registerRender(gold_scrap);
		registerRender(wooden_bucket_empty);
		registerRender(wooden_bucket_water);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
