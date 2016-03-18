package com.kashdeya.simpleaddons.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.simpleaddons.Reference;
import com.kashdeya.simpleaddons.SimpleAddons;

public class SimpleAddonsDrinks extends ItemFood{


	public SimpleAddonsDrinks(int healAmount, boolean isWolfFood) {
		super(healAmount, false);
		// TODO Auto-generated constructor stub
	}

	public static Item apple_juice;
	public static Item carrot_juice;
	public static Item cactus_juice;
	public static Item slim_juice;
	public static Item watermelon_juice;
	
	public static void init(){
		apple_juice = new SimpleAddonsDrinks(6, false).setUnlocalizedName("apple_juice").setCreativeTab(SimpleAddons.tabFood);
		carrot_juice = new SimpleAddonsDrinks(4, false).setUnlocalizedName("carrot_juice").setCreativeTab(SimpleAddons.tabFood);
		cactus_juice = new SimpleAddonsDrinks(4, false).setUnlocalizedName("cactus_juice").setCreativeTab(SimpleAddons.tabFood);
		slim_juice = new SimpleAddonsDrinks(2, false).setUnlocalizedName("slim_juice").setCreativeTab(SimpleAddons.tabFood);
		watermelon_juice = new SimpleAddonsDrinks(4, false).setUnlocalizedName("watermelon_juice").setCreativeTab(SimpleAddons.tabFood);
	}
	
	public static void register(){
		GameRegistry.registerItem(apple_juice, apple_juice.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carrot_juice, carrot_juice.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cactus_juice, cactus_juice.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(slim_juice, slim_juice.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(watermelon_juice, watermelon_juice.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(apple_juice);
		registerRender(carrot_juice);
		registerRender(cactus_juice);
		registerRender(slim_juice);
		registerRender(watermelon_juice);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
