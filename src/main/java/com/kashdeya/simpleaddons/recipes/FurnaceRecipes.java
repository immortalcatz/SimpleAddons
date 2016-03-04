package com.kashdeya.simpleaddons.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.simpleaddons.init.SimpleAddonsFood;
import com.kashdeya.simpleaddons.init.SimpleAddonsItems;

public class FurnaceRecipes {
	
	public static boolean cookedbaconOff = false;
	public static boolean toastOff = false;
	public static boolean fleshOff = false;
	public static boolean eggOff = false;
	public static boolean brownOff = false;
	public static boolean redOff = false;
	public static boolean scrapOff = true;

	public static void registerFurnaceRecipies() {
		if (cookedbaconOff){
		}
		else{
		GameRegistry.addSmelting(SimpleAddonsFood.bacon, new ItemStack(SimpleAddonsFood.cooked_bacon), 0.5F);
		}
		
		if (toastOff){
		}
		else{
		GameRegistry.addSmelting(Items.bread, new ItemStack(SimpleAddonsFood.toast), 0.5F);
		}
		
		if (fleshOff){
		}
		else{
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(SimpleAddonsFood.monster_jerky), 0.5F);
		}
		
		if (eggOff){
		}
		else{
		GameRegistry.addSmelting(Items.egg, new ItemStack(SimpleAddonsFood.fried_egg), 0.5F);
		}
		
		if (brownOff){
		}
		else{
		GameRegistry.addSmelting(Blocks.brown_mushroom, new ItemStack(SimpleAddonsFood.cooked_mushroom_brown), 0.5F);
		}
		
		if (redOff){
		}
		else{
		GameRegistry.addSmelting(Blocks.red_mushroom, new ItemStack(SimpleAddonsFood.cooked_mushroom_red), 0.5F);
		}
		
		if (scrapOff){
		}
		else{
		GameRegistry.addSmelting(SimpleAddonsItems.gold_scrap, new ItemStack(Items.gold_ingot), 0.5F);
		GameRegistry.addSmelting(SimpleAddonsItems.iron_scrap, new ItemStack(Items.iron_ingot), 0.5F);
		}
		
	}	
	

}
