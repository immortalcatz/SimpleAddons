package com.kashdeya.simpleaddons.recipes;

import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;
import com.kashdeya.simpleaddons.init.SimpleAddonsFood;
import com.kashdeya.simpleaddons.init.SimpleAddonsItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipes {

	public static void registerCraftingRecipies() {
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block), new Object[] {Blocks.glass, Blocks.torch});
		GameRegistry.addRecipe(new ItemStack(Items.leather), new Object[] {"##", "##", '#', Items.rotten_flesh});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsFood.bacon,4), new Object[] {Items.porkchop, SimpleAddonsItems.knife});
		GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsItems.knife), new Object[] {"  I", " I ", "S  ", 'I', Items.iron_ingot, 'S', Items.stick});
	}
	
}
