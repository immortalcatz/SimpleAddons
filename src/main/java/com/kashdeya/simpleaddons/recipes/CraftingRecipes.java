package com.kashdeya.simpleaddons.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;
import com.kashdeya.simpleaddons.init.SimpleAddonsFood;
import com.kashdeya.simpleaddons.init.SimpleAddonsItems;

public class CraftingRecipes {
	
	public static boolean lampOff = false;
	public static boolean clampOff = false;
	public static boolean leatherOff = false;
	public static boolean juicesOff = false;
	public static boolean baconOff = false;
	public static boolean nametagOff = false;
	public static boolean bneOff = false;
	public static boolean horseOff = false;
	public static boolean saddleOff = false;
	public static boolean spongeOff = false;
	public static boolean cobwebOff = false;
	public static boolean iceOff = false;
	public static boolean packedOff = false;
	public static boolean slabOff = false;
	public static boolean hammerOff = false;
	public static boolean chainOff = false;
	public static boolean charcoalOff = false;
	public static boolean chestOff = false;
	public static boolean reedOff = false;
	public static boolean scrap1Off = false;

	public static void registerCraftingRecipies() {
		
		if (lampOff == true){
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block), new Object[] {Blocks.glass, Blocks.torch});
		}
		
		if (clampOff == true){
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
		
		if (leatherOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(Items.leather), new Object[] {"##", "##", '#', Items.rotten_flesh});
		}
		
		if (juicesOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsItems.item_juicer), new Object[] {" S ", "S S", "SSS", 'S', Blocks.stone});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsFood.apple_juice), new Object[] {Items.apple, new ItemStack(SimpleAddonsItems.item_juicer, 1, OreDictionary.WILDCARD_VALUE)});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsFood.carrot_juice), new Object[] {Items.carrot, new ItemStack(SimpleAddonsItems.item_juicer, 1, OreDictionary.WILDCARD_VALUE)});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsFood.cactus_juice), new Object[] {Blocks.cactus, new ItemStack(SimpleAddonsItems.item_juicer, 1, OreDictionary.WILDCARD_VALUE)});
		}
		
		if (baconOff == true){
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsFood.bacon,4), new Object[] {Items.porkchop, new ItemStack(SimpleAddonsItems.knife, 1, OreDictionary.WILDCARD_VALUE)});
		}
		
		if (bneOff == true){
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsFood.bacon_eggs), new Object[] {SimpleAddonsItems.item_plate, SimpleAddonsFood.cooked_bacon, SimpleAddonsFood.fried_egg});
		}
		
		if (nametagOff == true){
			GameRegistry.addShapelessRecipe(new ItemStack(Items.name_tag), new Object[] {Items.paper, Items.paper, Items.string});
		}
		
		if (horseOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(Items.iron_horse_armor), new Object[] {"   ", " SI", "III", 'S', Items.saddle, 'I', Items.iron_ingot});
			GameRegistry.addShapedRecipe(new ItemStack(Items.golden_horse_armor), new Object[] {"   ", " SG", "GGG", 'S', Items.saddle, 'G', Items.gold_ingot});
			GameRegistry.addShapedRecipe(new ItemStack(Items.diamond_horse_armor), new Object[] {"   ", " SD", "DDD", 'S', Items.saddle, 'D', Items.diamond});
		}
		
		if (saddleOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(Items.saddle), new Object[] {"LLL", "S S", "I I", 'L', Items.leather, 'S', Items.string, 'I', Items.iron_ingot});
		}
		
		if (spongeOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.sponge), new Object[] {"WWW", "WBW", "WWW", 'W', Blocks.wool, 'B', Items.water_bucket});
		}
		
		if (cobwebOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.web), new Object[] {"SSS", "SSS", "SSS", 'S', Items.string});
		}
		
		if (iceOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.ice), new Object[] {"SSS", "SBS", "SSS", 'S', Items.snowball, 'B', Items.water_bucket});
		}
		
		if (packedOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.packed_ice), new Object[] {"II", "II", 'I', Blocks.ice});
		}
		
		if (slabOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.cobblestone), new Object[] {"S", "S", 'S', new ItemStack(Blocks.stone_slab, 1, 3)});
		}
		
		if (hammerOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsItems.item_hammer), new Object[] {"III", "ITI", " S ", 'I', Items.iron_ingot, 'S', Items.stick, 'T', Items.string});
		}
		
		if (chainOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_helmet), new Object[] {"CCC", "C C", 'C', new ItemStack(SimpleAddonsItems.item_chain)});
			GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_chestplate), new Object[] {"C C", "CCC", "CCC", 'C', new ItemStack(SimpleAddonsItems.item_chain)});
			GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_leggings), new Object[] {"CCC", "C C", "C C", 'C', new ItemStack(SimpleAddonsItems.item_chain)});
			GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_boots), new Object[] {"C C", "C C", 'C', new ItemStack(SimpleAddonsItems.item_chain)});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.item_chain, 2), new Object[] {new ItemStack(SimpleAddonsItems.item_hammer, 1, OreDictionary.WILDCARD_VALUE), Items.iron_ingot});
		}
		
		if (charcoalOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsBlocks.charcoal_block), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.coal, 1, 1)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.coal,9,1), new ItemStack(SimpleAddonsBlocks.charcoal_block));
		}
		
		if (chestOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.chest, 4), new Object[] {"LLL", "L L", "LLL", 'L', new ItemStack(Blocks.log, 1, OreDictionary.WILDCARD_VALUE)});
		}
		
		if (reedOff == true){
			GameRegistry.addShapedRecipe(new ItemStack(Items.reeds), new Object[] {"B", "B", 'B', SimpleAddonsItems.item_broken_reed});
		}
		
		if (scrap1Off == true){
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.gold_scrap, 4), new Object[] {new ItemStack(SimpleAddonsItems.item_hammer, 1, OreDictionary.WILDCARD_VALUE), Items.golden_horse_armor});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.iron_scrap, 4), new Object[] {new ItemStack(SimpleAddonsItems.item_hammer, 1, OreDictionary.WILDCARD_VALUE), Items.iron_horse_armor});
		}
		
		GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsItems.knife), new Object[] {"  I", " I ", "S ", 'I', Items.iron_ingot, 'S', Items.stick});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.item_plate), new Object[] {Blocks.stone_pressure_plate, Blocks.glass_pane});
		
	}
}
