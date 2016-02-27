package com.kashdeya.simpleaddons.recipes;

import com.kashdeya.simpleaddons.init.SimpleAddonsFood;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipes {

	public static void registerFurnaceRecipies() {
		GameRegistry.addSmelting(Items.bread, new ItemStack(SimpleAddonsFood.toast), 0.5F);
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(SimpleAddonsFood.monster_jerky), 0.5F);
		GameRegistry.addSmelting(SimpleAddonsFood.bacon, new ItemStack(SimpleAddonsFood.cooked_bacon), 0.5F);
		
	}	
	

}
