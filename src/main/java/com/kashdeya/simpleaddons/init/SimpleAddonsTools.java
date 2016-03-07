package com.kashdeya.simpleaddons.init;

import java.util.ArrayList;

import com.kashdeya.simpleaddons.Reference;
import com.kashdeya.simpleaddons.SimpleAddons;
import com.kashdeya.simpleaddons.items.Itemknife;
import com.kashdeya.simpleaddons.tools.ToolsAxe;
import com.kashdeya.simpleaddons.tools.ToolsHoe;
import com.kashdeya.simpleaddons.tools.ToolsPickaxe;
import com.kashdeya.simpleaddons.tools.ToolsSpade;
import com.kashdeya.simpleaddons.tools.ToolsSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class SimpleAddonsTools {
	public static final Item.ToolMaterial andesiteToolMaterial = EnumHelper.addToolMaterial("andesiteToolMaterial", 1, 220, 4.5F, 1.0F, 8);
	public static final Item.ToolMaterial dioriteToolMaterial = EnumHelper.addToolMaterial("dioriteToolMaterial", 1, 190, 5.0F, 1.25F, 16);
	public static final Item.ToolMaterial graniteToolMaterial = EnumHelper.addToolMaterial("graniteToolMaterial", 1, 160, 4.0F, 1.75F, 10);
	
	public static boolean removeOff = false;
	
	public static Item andesite_pickaxe;
	public static Item andesite_spade;
	public static Item andesite_axe;
	public static Item andesite_sword;
	public static Item andesite_hoe;
	public static Item diorite_pickaxe;
	public static Item diorite_spade;
	public static Item diorite_axe;
	public static Item diorite_sword;
	public static Item diorite_hoe;
	public static Item granite_pickaxe;
	public static Item granite_spade;
	public static Item granite_axe;
	public static Item granite_sword;
	public static Item granite_hoe;
	
		public static void init(){
			
			if (!removeOff){
			removeRecipe(new ItemStack(Items.stone_axe));
			removeRecipe(new ItemStack(Items.stone_hoe));
			removeRecipe(new ItemStack(Items.stone_sword));
			removeRecipe(new ItemStack(Items.stone_shovel));
			removeRecipe(new ItemStack(Items.stone_pickaxe));
			}
			
			andesite_pickaxe = new ToolsPickaxe(andesiteToolMaterial, new ItemStack(Blocks.stone, 1, 6)).setUnlocalizedName("andesite_pickaxe");
			andesite_spade = new ToolsSpade(andesiteToolMaterial, new ItemStack(Blocks.stone, 1, 6)).setUnlocalizedName("andesite_spade");
			andesite_axe = new ToolsAxe(andesiteToolMaterial, new ItemStack(Blocks.stone, 1, 6)).setUnlocalizedName("andesite_axe");
			andesite_sword = new ToolsSword(andesiteToolMaterial, new ItemStack(Blocks.stone, 1, 6)).setUnlocalizedName("andesite_sword");
			andesite_hoe = new ToolsHoe(andesiteToolMaterial).setUnlocalizedName("andesite_hoe");
			
			granite_pickaxe = new ToolsPickaxe(graniteToolMaterial, new ItemStack(Blocks.stone, 1, 2)).setUnlocalizedName("granite_pickaxe");
			granite_spade = new ToolsSpade(graniteToolMaterial, new ItemStack(Blocks.stone, 1, 2)).setUnlocalizedName("granite_spade");
			granite_axe = new ToolsAxe(graniteToolMaterial, new ItemStack(Blocks.stone, 1, 2)).setUnlocalizedName("granite_axe");
			granite_sword = new ToolsSword(graniteToolMaterial, new ItemStack(Blocks.stone, 1, 2)).setUnlocalizedName("granite_sword");
			granite_hoe = new ToolsHoe(graniteToolMaterial).setUnlocalizedName("granite_hoe");
			
			diorite_pickaxe = new ToolsPickaxe(dioriteToolMaterial, new ItemStack(Blocks.stone, 1, 4)).setUnlocalizedName("diorite_pickaxe");
			diorite_spade = new ToolsSpade(dioriteToolMaterial, new ItemStack(Blocks.stone, 1, 4)).setUnlocalizedName("diorite_spade");
			diorite_axe = new ToolsAxe(dioriteToolMaterial, new ItemStack(Blocks.stone, 1, 4)).setUnlocalizedName("diorite_axe");
			diorite_sword = new ToolsSword(dioriteToolMaterial, new ItemStack(Blocks.stone, 1, 4)).setUnlocalizedName("diorite_sword");
			diorite_hoe = new ToolsHoe(dioriteToolMaterial).setUnlocalizedName("diorite_hoe");
		}
		
		public static void register(){
			
			GameRegistry.registerItem(andesite_pickaxe, andesite_pickaxe.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(andesite_spade, andesite_spade.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(andesite_axe, andesite_axe.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(andesite_sword, andesite_sword.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(andesite_hoe, andesite_hoe.getUnlocalizedName().substring(5));
			
			GameRegistry.registerItem(diorite_pickaxe, diorite_pickaxe.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(diorite_spade, diorite_spade.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(diorite_axe, diorite_axe.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(diorite_sword, diorite_sword.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(diorite_hoe, diorite_hoe.getUnlocalizedName().substring(5));
			
			GameRegistry.registerItem(granite_pickaxe, granite_pickaxe.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(granite_spade, granite_spade.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(granite_axe, granite_axe.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(granite_sword, granite_sword.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(granite_hoe, granite_hoe.getUnlocalizedName().substring(5));
		}
		
		public static void registerRenders(){
			registerRender(andesite_pickaxe);
			registerRender(andesite_spade);
			registerRender(andesite_axe);
			registerRender(andesite_sword);
			registerRender(andesite_hoe);
			registerRender(diorite_pickaxe);
			registerRender(diorite_spade);
			registerRender(diorite_axe);
			registerRender(diorite_sword);
			registerRender(diorite_hoe);
			registerRender(granite_pickaxe);
			registerRender(granite_spade);
			registerRender(granite_axe);
			registerRender(granite_sword);
			registerRender(granite_hoe);
		}
		
		public static void registerRender(Item item){
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
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
