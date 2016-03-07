package com.kashdeya.simpleaddons.tools;

import com.kashdeya.simpleaddons.SimpleAddons;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ToolsHoe extends ItemHoe {
	
	public ToolsHoe(Item.ToolMaterial material)
  {
    super(material);
    this.setCreativeTab(SimpleAddons.tabTools);
  }

}
