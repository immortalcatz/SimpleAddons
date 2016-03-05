package com.kashdeya.simpleaddons.creativetabs;

import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;
import com.kashdeya.simpleaddons.init.SimpleAddonsFood;
import com.kashdeya.simpleaddons.init.SimpleAddonsItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabSimpleAddonsFood extends CreativeTabs {

	public TabSimpleAddonsFood(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem()
    {
		return SimpleAddonsFood.bacon;
    }

}
