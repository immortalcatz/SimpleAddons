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
	public static Block lava_block;
	
	public static void init(){
		lamp_block = new Blocklamp(Material.glass).setUnlocalizedName("lamp_block");
		lava_block = new Blocklava(Material.tnt).setUnlocalizedName("lava_block");
	}
	public static void register(){
		GameRegistry.registerBlock(lamp_block, lamp_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lava_block, lava_block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(lamp_block);
		registerRender(lava_block);
	}
	
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
