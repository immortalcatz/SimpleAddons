package com.kashdeya.simpleaddons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

import com.kashdeya.simpleaddons.SimpleAddons;
import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;

public class Blockcharcoal extends Block{
	
	public Blockcharcoal(Material material) {
		super(material);
		this.setHardness(2.0F);
		this.setResistance(4.0F);
		this.setCreativeTab(SimpleAddons.tabBlock);
	}
	
	public static void init() {
        OreDictionary.registerOre("blockCharcoal", SimpleAddonsBlocks.charcoal_block);
    }
	
}
