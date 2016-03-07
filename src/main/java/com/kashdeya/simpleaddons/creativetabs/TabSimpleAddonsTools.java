package com.kashdeya.simpleaddons.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.kashdeya.simpleaddons.init.SimpleAddonsItems;
import com.kashdeya.simpleaddons.init.SimpleAddonsTools;

public class TabSimpleAddonsTools extends CreativeTabs {

	public TabSimpleAddonsTools(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return SimpleAddonsTools.andesite_sword;
	}

}
