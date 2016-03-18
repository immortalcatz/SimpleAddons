package com.kashdeya.simpleaddons.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.simpleaddons.Reference;
import com.kashdeya.simpleaddons.SimpleAddons;

public class SimpleAddonsFood extends ItemFood{
	
	public static Item bacon;
	public static Item cooked_bacon;
	public static Item monster_jerky;
	public static Item toast;
	public static Item fried_egg;
	public static Item cooked_mushroom_brown;
	public static Item cooked_mushroom_red;
	public static Item bacon_eggs;

	public SimpleAddonsFood(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	}

	public static void init(){
		bacon = new SimpleAddonsFood(1, 0.1F, true).setUnlocalizedName("bacon").setCreativeTab(SimpleAddons.tabFood);
		cooked_bacon = new SimpleAddonsFood(3, 0.3F, true).setUnlocalizedName("cooked_bacon").setCreativeTab(SimpleAddons.tabFood);
		monster_jerky = new SimpleAddonsFood(4, 0.5F, true).setUnlocalizedName("monster_jerky").setCreativeTab(SimpleAddons.tabFood);
		toast = new SimpleAddonsFood(7, 1.2F, true).setUnlocalizedName("toast").setCreativeTab(SimpleAddons.tabFood);
		fried_egg = new SimpleAddonsFood(5, 06F, true).setUnlocalizedName("fried_egg").setCreativeTab(SimpleAddons.tabFood);
		cooked_mushroom_brown = new SimpleAddonsFood(2, 03F, false).setUnlocalizedName("cooked_mushroom_brown").setCreativeTab(SimpleAddons.tabFood);
		cooked_mushroom_red = new SimpleAddonsFood(2, 03F, false).setUnlocalizedName("cooked_mushroom_red").setCreativeTab(SimpleAddons.tabFood);
		bacon_eggs = new SimpleAddonsFood(6, 0.7F, false).setUnlocalizedName("bacon_eggs").setCreativeTab(SimpleAddons.tabFood);
	}
	
	public static void register(){
		GameRegistry.registerItem(bacon, bacon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_bacon, cooked_bacon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(monster_jerky, monster_jerky.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(toast, toast.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fried_egg, fried_egg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_mushroom_brown, cooked_mushroom_brown.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_mushroom_red, cooked_mushroom_red.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bacon_eggs, bacon_eggs.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(bacon);
		registerRender(cooked_bacon);
		registerRender(monster_jerky);
		registerRender(toast);
		registerRender(fried_egg);
		registerRender(cooked_mushroom_brown);
		registerRender(cooked_mushroom_red);
		registerRender(bacon_eggs);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
