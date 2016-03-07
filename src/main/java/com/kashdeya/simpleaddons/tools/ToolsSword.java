package com.kashdeya.simpleaddons.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.kashdeya.simpleaddons.SimpleAddons;

public class ToolsSword extends ItemSword {
	
	private final Item.ToolMaterial material;
	
	public ToolsSword(Item.ToolMaterial material, ItemStack repairItem)
  {
    super(material);
    this.material = material;
    this.setCreativeTab(SimpleAddons.tabTools);
  }
}
