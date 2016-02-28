package com.kashdeya.simpleaddons.recipes;

import com.kashdeya.simpleaddons.init.SimpleAddonsFood;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipes {

	public static void registerFurnaceRecipies() {
		GameRegistry.addSmelting(Items.bread, new ItemStack(SimpleAddonsFood.toast), 0.5F);
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(SimpleAddonsFood.monster_jerky), 0.5F);
		GameRegistry.addSmelting(SimpleAddonsFood.bacon, new ItemStack(SimpleAddonsFood.cooked_bacon), 0.5F);
		GameRegistry.addSmelting(Items.egg, new ItemStack(SimpleAddonsFood.fried_egg), 0.5F);
		GameRegistry.addSmelting(Blocks.brown_mushroom, new ItemStack(SimpleAddonsFood.cooked_mushroom_brown), 0.5F);
		GameRegistry.addSmelting(Blocks.red_mushroom, new ItemStack(SimpleAddonsFood.cooked_mushroom_red), 0.5F);
		
	}	
	

}
