package com.kashdeya.simpleaddons.init;

import scala.collection.mutable.Stack;

import com.kashdeya.simpleaddons.Reference;
import com.kashdeya.simpleaddons.items.Itemknife;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SimpleAddonsItems {
	
	public static final Item.ToolMaterial knifeMaterial = EnumHelper.addToolMaterial("knifeMaterial", 1, 100, 0.2F, 0.1F, 1);

	public static Item knife;
	
	public static void init(){
		knife = new Itemknife(knifeMaterial).setUnlocalizedName("knife");

	}
	
	public static void register(){
		GameRegistry.registerItem(knife, knife.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(knife);

	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
