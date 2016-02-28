package com.kashdeya.simpleaddons.items;

import com.kashdeya.simpleaddons.init.SimpleAddonsItems;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class Itemknife extends Item{

	public Itemknife(ToolMaterial knifematerial) {
		super();
		this.setMaxDamage(100);
		this.setFull3D();
		this.setNoRepair();
		this.setMaxStackSize(1);
		this.setContainerItem(SimpleAddonsItems.knife);
		this.setCreativeTab(CreativeTabs.tabFood);
	}

}
