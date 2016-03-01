package com.kashdeya.simpleaddons.recipes;

import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;
import com.kashdeya.simpleaddons.init.SimpleAddonsFood;
import com.kashdeya.simpleaddons.init.SimpleAddonsItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class CraftingRecipes {
	
	public static boolean lampOff = false;
	public static boolean clampOff = false;
	public static boolean leatherOff = false;
	public static boolean juicesOff = false;
	public static boolean baconOff = false;
	public static boolean nametagOff = false;
	public static boolean bneOff = true;

	public static void registerCraftingRecipies() {
		
		if (lampOff){
		}
		else{
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block), new Object[] {Blocks.glass, Blocks.torch});
		}
		
		if (clampOff){
		}
		else{
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_black), new Object[] {new ItemStack(Blocks.stained_glass, 1, 15) , Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_blue), new Object[] {new ItemStack(Blocks.stained_glass, 1, 11), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_brown), new Object[] {new ItemStack(Blocks.stained_glass, 1, 12), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_cyan), new Object[] {new ItemStack(Blocks.stained_glass, 1, 9), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_green), new Object[] {new ItemStack(Blocks.stained_glass, 1, 13), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_grey), new Object[] {new ItemStack(Blocks.stained_glass, 1, 7), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_light_blue), new Object[] {new ItemStack(Blocks.stained_glass, 1, 3), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_lime), new Object[] {new ItemStack(Blocks.stained_glass, 1, 5), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_magenta), new Object[] {new ItemStack(Blocks.stained_glass, 1, 2), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_orange), new Object[] {new ItemStack(Blocks.stained_glass, 1, 1), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_pink), new Object[] {new ItemStack(Blocks.stained_glass, 1, 6), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_purple), new Object[] {new ItemStack(Blocks.stained_glass, 1, 10), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_red), new Object[] {new ItemStack(Blocks.stained_glass, 1, 14), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_silver), new Object[] {new ItemStack(Blocks.stained_glass, 1, 8), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_white), new Object[] {new ItemStack(Blocks.stained_glass, 1, 0), Blocks.torch});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block_yellow), new Object[] {new ItemStack(Blocks.stained_glass, 1, 4), Blocks.torch});
		}
		
		if (leatherOff){
		}
		else{
		GameRegistry.addRecipe(new ItemStack(Items.leather), new Object[] {"##", "##", '#', Items.rotten_flesh});
		}
		
		if (juicesOff){
		}
		else{
		GameRegistry.addRecipe(new ItemStack(SimpleAddonsItems.item_juicer), new Object[] {" S ", "S S", "SSS", 'S', Blocks.stone});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsFood.apple_juice), new Object[] {Items.apple, Items.glass_bottle, SimpleAddonsItems.item_juicer});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsFood.carrot_juice), new Object[] {Items.carrot, Items.glass_bottle, SimpleAddonsItems.item_juicer});
		}
		
		if (baconOff){
		}
		else{
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsFood.bacon,4), new Object[] {Items.porkchop, new ItemStack(SimpleAddonsItems.knife, 1, OreDictionary.WILDCARD_VALUE)});
		}
		
		if (bneOff){
		}
		else{
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsFood.bacon_eggs), new Object[] {SimpleAddonsItems.item_plate, SimpleAddonsFood.cooked_bacon, SimpleAddonsFood.fried_egg});
		}
		
		if (nametagOff){
		}
		else{
		GameRegistry.addShapelessRecipe(new ItemStack(Items.name_tag), new Object[] {Items.writable_book, Items.lead});
		}
		
		GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsItems.knife), new Object[] {"  I", " I ", "S  ", 'I', Items.iron_ingot, 'S', Items.stick});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.item_plate), new Object[] {Blocks.stone_pressure_plate, Blocks.glass_pane});
		
	}
	
}
