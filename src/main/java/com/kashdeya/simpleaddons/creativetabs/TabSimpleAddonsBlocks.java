package com.kashdeya.simpleaddons.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;

public class TabSimpleAddonsBlocks extends CreativeTabs {

	public TabSimpleAddonsBlocks(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem()
    {
        return Item.getItemFromBlock(SimpleAddonsBlocks.lamp_block);
    }

}
