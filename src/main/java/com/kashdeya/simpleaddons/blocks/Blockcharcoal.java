package com.kashdeya.simpleaddons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.oredict.OreDictionary;

import com.kashdeya.simpleaddons.SimpleAddons;
import com.kashdeya.simpleaddons.handlers.ConfigHandler;
import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;

public class Blockcharcoal extends Block{
	
	public Blockcharcoal(Material material) {
		super(material);
		this.setHardness(2.0F);
		this.setResistance(4.0F);
		this.setCreativeTab(SimpleAddons.items);
	}
	
	public static void init() {
        OreDictionary.registerOre("blockCharcoal", SimpleAddonsBlocks.charcoal_block);
    }
	
}
