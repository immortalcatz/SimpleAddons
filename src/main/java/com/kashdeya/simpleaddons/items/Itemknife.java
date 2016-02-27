package com.kashdeya.simpleaddons.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class Itemknife extends ItemSword{
	
	protected Item.ToolMaterial theToolMaterial;

	public Itemknife() {
		super(ToolMaterial.WOOD);
		this.setCreativeTab(CreativeTabs.tabFood);
	}

}
