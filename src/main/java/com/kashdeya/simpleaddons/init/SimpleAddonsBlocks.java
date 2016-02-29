package com.kashdeya.simpleaddons.init;

import com.kashdeya.simpleaddons.Reference;
import com.kashdeya.simpleaddons.blocks.Blocklamp;
import com.kashdeya.simpleaddons.blocks.Blocklava;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SimpleAddonsBlocks {
	
	public static Block lamp_block;
	public static Block lamp_block_black;
	public static Block lamp_block_blue;
	public static Block lamp_block_brown;
	public static Block lamp_block_cyan;
	public static Block lamp_block_green;
	public static Block lamp_block_grey;
	public static Block lamp_block_light_blue;
	public static Block lamp_block_lime;
	public static Block lamp_block_magenta;
	public static Block lamp_block_orange;
	public static Block lamp_block_pink;
	public static Block lamp_block_purple;
	public static Block lamp_block_red;
	public static Block lamp_block_silver;
	public static Block lamp_block_white;
	public static Block lamp_block_yellow;
	public static Block lava_block;
	
	public static void init(){
		lamp_block = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block");
		lamp_block_black = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_black");
		lamp_block_blue = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_blue");
		lamp_block_brown = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_brown");
		lamp_block_cyan = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_cyan");
		lamp_block_green = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_green");
		lamp_block_grey = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_grey");
		lamp_block_light_blue = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_light_blue");
		lamp_block_lime = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_lime");
		lamp_block_magenta = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_magenta");
		lamp_block_orange = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_orange");
		lamp_block_pink = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_pink");
		lamp_block_purple = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_purple");
		lamp_block_red = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_red");
		lamp_block_silver = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_silver");
		lamp_block_white = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_white");
		lamp_block_yellow = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block_yellow");
		lava_block = new Blocklava(Material.redstoneLight).setUnlocalizedName("lava_block");
	}
	public static void register(){
		GameRegistry.registerBlock(lamp_block, lamp_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_black, lamp_block_black.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_blue, lamp_block_blue.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_brown, lamp_block_brown.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_cyan, lamp_block_cyan.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_green, lamp_block_green.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_grey, lamp_block_grey.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_light_blue, lamp_block_light_blue.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_lime, lamp_block_lime.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_magenta, lamp_block_magenta.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_orange, lamp_block_orange.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_pink, lamp_block_pink.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_purple, lamp_block_purple.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_red, lamp_block_red.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_silver, lamp_block_silver.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_white, lamp_block_white.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lamp_block_yellow, lamp_block_yellow.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lava_block, lava_block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(lamp_block);
		registerRender(lamp_block_black);
		registerRender(lamp_block_blue);
		registerRender(lamp_block_brown);
		registerRender(lamp_block_cyan);
		registerRender(lamp_block_green);
		registerRender(lamp_block_grey);
		registerRender(lamp_block_light_blue);
		registerRender(lamp_block_lime);
		registerRender(lamp_block_magenta);
		registerRender(lamp_block_orange);
		registerRender(lamp_block_pink);
		registerRender(lamp_block_purple);
		registerRender(lamp_block_red);
		registerRender(lamp_block_silver);
		registerRender(lamp_block_white);
		registerRender(lamp_block_yellow);
		registerRender(lava_block);
	}
	
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
