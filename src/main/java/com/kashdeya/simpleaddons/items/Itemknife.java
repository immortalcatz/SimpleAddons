package com.kashdeya.simpleaddons.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class Itemknife extends ItemSword{

	public Itemknife(ToolMaterial material) {
		super(ToolMaterial.WOOD);
		this.setMaxDamage(100);
		this.setCreativeTab(CreativeTabs.tabFood);
	}

}
