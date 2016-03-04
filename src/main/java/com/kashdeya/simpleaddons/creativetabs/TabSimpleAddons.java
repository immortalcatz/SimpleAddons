package com.kashdeya.simpleaddons.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.kashdeya.simpleaddons.init.SimpleAddonsItems;

public class TabSimpleAddons extends CreativeTabs {

	public TabSimpleAddons(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return SimpleAddonsItems.knife;
	}

}
