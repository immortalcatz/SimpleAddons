package com.kashdeya.simpleaddons.handlers;

import java.util.ArrayList;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.kashdeya.simpleaddons.init.SimpleAddonsFood;
import com.kashdeya.simpleaddons.init.SimpleAddonsItems;
import com.kashdeya.simpleaddons.init.SimpleAddonsTools;

public class VanillaHandler {
	
	public static boolean removeOff = false;
	public static boolean breadOff = false;
	public static boolean endstoneOff = false;
	public static boolean dsOff = false;
	public static boolean gsOff = false;

	public static void initRemove() {
		
		if (!removeOff){
			removeRecipe(new ItemStack(Items.stone_axe));
			removeRecipe(new ItemStack(Items.stone_hoe));
			removeRecipe(new ItemStack(Items.stone_sword));
			removeRecipe(new ItemStack(Items.stone_shovel));
			removeRecipe(new ItemStack(Items.stone_pickaxe));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.stone_axe), "rr", "rs", " s", 'r', new ItemStack(Blocks.stone), 's', new ItemStack(Items.stick)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.stone_axe), "rr", "sr", "s ", 'r', new ItemStack(Blocks.stone), 's', new ItemStack(Items.stick)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.stone_hoe), "rr", " s", " s", 'r', new ItemStack(Blocks.stone), 's', new ItemStack(Items.stick)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.stone_hoe), "rr", "s ", "s ", 'r', new ItemStack(Blocks.stone), 's', new ItemStack(Items.stick)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.stone_sword), "r", "r", "s", 'r', new ItemStack(Blocks.stone), 's', new ItemStack(Items.stick)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.stone_shovel), "r", "s", "s", 'r', new ItemStack(Blocks.stone), 's', new ItemStack(Items.stick)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.stone_pickaxe), "rrr", " s ", " s ", 'r', new ItemStack(Blocks.stone), 's', new ItemStack(Items.stick)));
			}
		
		if (breadOff){
			removeRecipe(new ItemStack(Items.bread));
			
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.item_flour, 2), new Object[] {Items.wheat, SimpleAddonsItems.mortar_pestle});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.item_dough, 2), new Object[] {SimpleAddonsItems.item_flour, SimpleAddonsFood.item_salt, SimpleAddonsItems.mixing_bowl});
			
			GameRegistry.addSmelting(SimpleAddonsItems.item_dough, new ItemStack(Items.bread), 0.5F);
			}
		
		if (endstoneOff){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.end_stone), new Object[] {"CCC", "EDE", "CCC", 'E', Items.ender_pearl,'D', Items.diamond, 'C', Blocks.sandstone});
		}
		
		if (dsOff){
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.diamond_shears), new Object[] {"D ", " D", 'D', Items.diamond});
		}
		
		if (gsOff){
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.golden_shears), new Object[] {"G ", " G", 'G', Items.gold_ingot});
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
