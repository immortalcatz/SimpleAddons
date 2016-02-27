package com.kashdeya.simpleaddons.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipes {

	public static void registerFurnaceRecipies() {
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 0.5F);
		
	}	
	

}
