package com.kashdeya.simpleaddons.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;
import com.kashdeya.simpleaddons.init.SimpleAddonsDrinks;
import com.kashdeya.simpleaddons.init.SimpleAddonsFood;
import com.kashdeya.simpleaddons.init.SimpleAddonsItems;
import com.kashdeya.simpleaddons.init.SimpleAddonsTools;

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
	public static boolean dthammerOff = false;
	public static boolean chainOff = false;
	public static boolean charcoalOff = false;
	public static boolean chestOff = false;
	public static boolean reedOff = false;
	public static boolean scrap1Off = false;
	public static boolean replaceOff = false;
	public static boolean graniteOff = false;
	public static boolean dioriteOff = false;
	public static boolean andesiteOff = false;
	public static boolean bucketOff = false;
	public static boolean growthOff = false;
	public static boolean coarseOff = false;

	public static void registerCraftingRecipies() {
		
		if (bucketOff){
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsItems.wooden_bucket_empty), new Object[] {"P P", " S ", 'P', new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE), 'S', new ItemStack(Blocks.wooden_slab, 1, OreDictionary.WILDCARD_VALUE)});			
		}
		
		if (coarseOff){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.dirt,8), new Object[] {"CCC", "CBC", "CCC", 'C', new ItemStack(Blocks.dirt, 1, 1), 'B', new ItemStack(Items.water_bucket)});
		}
		
		if (graniteOff){
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.granite_axe), new Object[] {"GG ", "GS ", " S ", 'G', new ItemStack(Blocks.stone, 1, 2), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.granite_axe), new Object[] {" GG", " SG", " S ", 'G', new ItemStack(Blocks.stone, 1, 2), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.granite_hoe), new Object[] {"GG ", " S ", " S ", 'G', new ItemStack(Blocks.stone, 1, 2), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.granite_hoe), new Object[] {" GG", " S ", " S ", 'G', new ItemStack(Blocks.stone, 1, 2), 'S',Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.granite_pickaxe), new Object[] {"GGG", " S ", " S ", 'G', new ItemStack(Blocks.stone, 1, 2), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.granite_spade), new Object[] {" G ", " S ", " S ", 'G', new ItemStack(Blocks.stone, 1, 2), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.granite_sword), new Object[] {" G ", " G ", " S ", 'G', new ItemStack(Blocks.stone, 1, 2), 'S', Items.stick});
		}
		
		if (dioriteOff){
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.diorite_axe), new Object[] {"DD ", "DS ", " S ", 'D', new ItemStack(Blocks.stone, 1, 4), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.diorite_axe), new Object[] {" DD", " SD", " S ", 'D', new ItemStack(Blocks.stone, 1, 4), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.diorite_hoe), new Object[] {"DD ", " S ", " S ", 'D', new ItemStack(Blocks.stone, 1, 4), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.diorite_hoe), new Object[] {" DD", " S ", " S ", 'D', new ItemStack(Blocks.stone, 1, 4), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.diorite_pickaxe), new Object[] {"DDD", " S ", " S ", 'D', new ItemStack(Blocks.stone, 1, 4), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.diorite_spade), new Object[] {" D ", " S ", " S ", 'D', new ItemStack(Blocks.stone, 1, 4), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.diorite_sword), new Object[] {" D ", " D ", " S ", 'D', new ItemStack(Blocks.stone, 1, 4), 'S', Items.stick});
		}
		
		if (andesiteOff){
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.andesite_axe), new Object[] {"AA ", "AS ", " S ", 'A', new ItemStack(Blocks.stone, 1, 6), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.andesite_axe), new Object[] {" AA", " SA", " S ", 'A', new ItemStack(Blocks.stone, 1, 6), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.andesite_hoe), new Object[] {"AA ", " S ", " S ", 'A', new ItemStack(Blocks.stone, 1, 6), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.andesite_hoe), new Object[] {" AA", " S ", " S ", 'A', new ItemStack(Blocks.stone, 1, 6), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.andesite_pickaxe), new Object[] {"AAA", " S ", " S ", 'A', new ItemStack(Blocks.stone, 1, 6), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.andesite_spade), new Object[] {" A ", " S ", " S ", 'A', new ItemStack(Blocks.stone, 1, 6), 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsTools.andesite_sword), new Object[] {" A ", " A ", " S ", 'A', new ItemStack(Blocks.stone, 1, 6), 'S', Items.stick});
		}
		
		if (lampOff){
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsBlocks.lamp_block), new Object[] {Blocks.glass, Blocks.torch});
		}
		
		if (clampOff){
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
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsItems.rotten_leather), new Object[] {"##", "##", '#', Items.rotten_flesh});
			GameRegistry.addSmelting(SimpleAddonsItems.rotten_leather, new ItemStack(Items.leather), 0.5F);
		}
		
		if (juicesOff){
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsItems.item_juicer), new Object[] {" S ", "S S", "SSS", 'S', Blocks.stone});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsDrinks.apple_juice), new Object[] {Items.apple, new ItemStack(SimpleAddonsItems.item_juicer)});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsDrinks.carrot_juice), new Object[] {Items.carrot, new ItemStack(SimpleAddonsItems.item_juicer)});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsDrinks.cactus_juice), new Object[] {Blocks.cactus, new ItemStack(SimpleAddonsItems.item_juicer)});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsDrinks.slim_juice), new Object[] {Items.slime_ball, new ItemStack(SimpleAddonsItems.item_juicer)});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsDrinks.watermelon_juice), new Object[] {Items.melon, new ItemStack(SimpleAddonsItems.item_juicer)});
		}
		
		if (baconOff){
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsFood.bacon,4), new Object[] {Items.porkchop, new ItemStack(SimpleAddonsItems.knife, 1, OreDictionary.WILDCARD_VALUE)});
		}
		
		if (bneOff){
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsFood.bacon_eggs), new Object[] {SimpleAddonsFood.cooked_bacon, SimpleAddonsFood.fried_egg, SimpleAddonsFood.fried_egg});
		}
		
		if (nametagOff){
			GameRegistry.addShapelessRecipe(new ItemStack(Items.name_tag), new Object[] {Items.paper, Items.paper, Items.string});
		}
		
		if (horseOff){
			GameRegistry.addShapedRecipe(new ItemStack(Items.iron_horse_armor), new Object[] {"   ", " SI", "III", 'S', Items.saddle, 'I', Items.iron_ingot});
			GameRegistry.addShapedRecipe(new ItemStack(Items.golden_horse_armor), new Object[] {"   ", " SG", "GGG", 'S', Items.saddle, 'G', Items.gold_ingot});
			GameRegistry.addShapedRecipe(new ItemStack(Items.diamond_horse_armor), new Object[] {"   ", " SD", "DDD", 'S', Items.saddle, 'D', Items.diamond});
		}
		
		if (saddleOff){
			GameRegistry.addShapedRecipe(new ItemStack(Items.saddle), new Object[] {"LLL", "S S", "I I", 'L', Items.leather, 'S', Items.string, 'I', Items.iron_ingot});
		}
		
		if (spongeOff){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.sponge), new Object[] {"WWW", "WBW", "WWW", 'W', Blocks.wool, 'B', Items.water_bucket});
		}
		
		if (cobwebOff){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.web), new Object[] {"SSS", "SSS", "SSS", 'S', Items.string});
		}
		
		if (iceOff){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.ice), new Object[] {"SSS", "SBS", "SSS", 'S', Items.snowball, 'B', Items.water_bucket});
		}
		
		if (packedOff){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.packed_ice), new Object[] {"II", "II", 'I', Blocks.ice});
		}
		
		if (slabOff){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.cobblestone), new Object[] {"S", "S", 'S', new ItemStack(Blocks.stone_slab, 1, 3)});
		}
		
		if (hammerOff){
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsItems.item_hammer), new Object[] {"ITI", " S ", 'I', Items.iron_ingot, 'S', Items.stick, 'T', Items.string});
		}
		
		if (dthammerOff){
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.item_dthammer), new Object[] {SimpleAddonsItems.item_hammer, Items.diamond});
		}
		
		if (chainOff){
			GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_helmet), new Object[] {"CCC", "C C", 'C', new ItemStack(SimpleAddonsItems.item_chain)});
			GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_chestplate), new Object[] {"C C", "CCC", "CCC", 'C', new ItemStack(SimpleAddonsItems.item_chain)});
			GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_leggings), new Object[] {"CCC", "C C", "C C", 'C', new ItemStack(SimpleAddonsItems.item_chain)});
			GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_boots), new Object[] {"C C", "C C", 'C', new ItemStack(SimpleAddonsItems.item_chain)});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.item_chain, 2), new Object[] {new ItemStack(SimpleAddonsItems.item_hammer, 1, OreDictionary.WILDCARD_VALUE), Items.iron_ingot});
		}
		
		if (charcoalOff){
			GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsBlocks.charcoal_block), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.coal, 1, 1)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.coal,9,1), new ItemStack(SimpleAddonsBlocks.charcoal_block));
		}
		
		if (chestOff){
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.chest, 4), new Object[] {"LLL", "L L", "LLL", 'L', new ItemStack(Blocks.log, 1, OreDictionary.WILDCARD_VALUE)});
		}
		
		if (reedOff){
			GameRegistry.addShapedRecipe(new ItemStack(Items.reeds), new Object[] {"B", "B", 'B', SimpleAddonsItems.item_broken_reed});
		}
		
		if (scrap1Off){
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.gold_scrap, 4), new Object[] {new ItemStack(SimpleAddonsItems.item_hammer, 1, OreDictionary.WILDCARD_VALUE), Items.golden_horse_armor});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.iron_scrap, 4), new Object[] {new ItemStack(SimpleAddonsItems.item_hammer, 1, OreDictionary.WILDCARD_VALUE), Items.iron_horse_armor});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 4), new Object[] {new ItemStack(SimpleAddonsItems.item_hammer, 1, OreDictionary.WILDCARD_VALUE), Items.diamond_horse_armor});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.gold_scrap, 4), new Object[] {new ItemStack(SimpleAddonsItems.item_dthammer, 1, OreDictionary.WILDCARD_VALUE), Items.golden_horse_armor});
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.iron_scrap, 4), new Object[] {new ItemStack(SimpleAddonsItems.item_dthammer, 1, OreDictionary.WILDCARD_VALUE), Items.iron_horse_armor});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 4), new Object[] {new ItemStack(SimpleAddonsItems.item_dthammer, 1, OreDictionary.WILDCARD_VALUE), Items.diamond_horse_armor});
		}			
		
		if (growthOff){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SimpleAddonsBlocks.growth_block), "CBC", "BEB", "CBC", 'C', new ItemStack(SimpleAddonsItems.crushed_obsidian), 'B', new ItemStack(Items.dye, 1, 15), 'E', new ItemStack(Items.emerald)));
			GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.crushed_obsidian, 2), new Object[] {new ItemStack(SimpleAddonsItems.item_dthammer, 1, OreDictionary.WILDCARD_VALUE), Blocks.obsidian});
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.obsidian, 2), new Object[] {"CC", "CC", 'C', new ItemStack(SimpleAddonsItems.crushed_obsidian)});
		}
		
		GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsItems.knife), new Object[] {"I ", "I ",'I', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsItems.unfired_mortar), new Object[] {"C C", "C C", " C ", 'C', Items.clay_ball});
		GameRegistry.addShapedRecipe(new ItemStack(SimpleAddonsItems.mixing_bowl), new Object[] {"B B", "BBB", 'B', Items.brick});
		GameRegistry.addShapelessRecipe(new ItemStack(SimpleAddonsItems.mortar_pestle), new Object[] {new ItemStack(SimpleAddonsItems.fired_mortar), new ItemStack(Items.stick)});
		
	}
}
