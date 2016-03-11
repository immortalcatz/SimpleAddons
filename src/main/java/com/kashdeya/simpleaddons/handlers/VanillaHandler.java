package com.kashdeya.simpleaddons.handlers;

import java.util.ArrayList;

import com.kashdeya.simpleaddons.init.SimpleAddonsFood;
import com.kashdeya.simpleaddons.init.SimpleAddonsItems;
import com.kashdeya.simpleaddons.init.SimpleAddonsTools;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VanillaHandler {
	
	public static boolean removeOff = false;
	public static boolean breadOff = false;
	public static boolean endstoneOff = false;

	public static void initRemove() {
		
		if (!removeOff){
			removeRecipe(new ItemStack(Items.stone_axe));
			removeRecipe(new ItemStack(Items.stone_hoe));
			removeRecipe(new ItemStack(Items.stone_sword));
			removeRecipe(new ItemStack(Items.stone_shovel));
			removeRecipe(new ItemStack(Items.stone_pickaxe));
			}
		
		if (breadOff){
			removeRecipe(new ItemStack(Items.bread));
			
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.item_flour), new Object[] {Items.wheat, SimpleAddonsItems.mortar_pestle});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.item_dough), new Object[] {SimpleAddonsItems.item_flour, SimpleAddonsItems.wooden_bucket_water, SimpleAddonsItems.mixing_bowl});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.item_dough), new Object[] {SimpleAddonsItems.item_flour, Items.water_bucket, SimpleAddonsItems.mixing_bowl});
			
			GameRegistry.addSmelting(SimpleAddonsItems.item_dough, new ItemStack(Items.bread), 0.5F);
			}
		
		if (endstoneOff){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.end_stone), new Object[] {"CCC", "EDE", "CCC", 'E', Items.ender_pearl,'D', Items.diamond, 'C', Blocks.sandstone});
		}
		
	}
	
	private static void removeRecipe(ItemStack resultItem){
		ItemStack recipeResult;
		ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();
		for(int scan = 0;scan < recipes.size();scan++){
			IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
			recipeResult = tmpRecipe.getRecipeOutput();
			if(recipeResult != null){
				if(recipeResult.getItem() == resultItem.getItem() && recipeResult.getItemDamage() == resultItem.getItemDamage()){
					recipes.remove(scan);
					scan--;
				}
			}
		}
	}
}
