package com.kashdeya.simpleaddons.creativetabs;

import com.kashdeya.simpleaddons.init.SimpleAddonsItems;
import com.kashdeya.simpleaddons.items.Itemknife;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabSimpleAddons extends CreativeTabs {

	public TabSimpleAddons(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return SimpleAddonsItems.knife;
	}

}
