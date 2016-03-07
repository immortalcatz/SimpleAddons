package com.kashdeya.simpleaddons.tools;

import com.kashdeya.simpleaddons.SimpleAddons;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ToolsAxe extends ItemAxe {
	
	private final Item.ToolMaterial material;
	
	public ToolsAxe(Item.ToolMaterial material, ItemStack repairItem)
  {
    super(material);
    this.material = material;
    this.setCreativeTab(SimpleAddons.tabTools);
  }

	public String getToolMaterialName()
    {
        return this.toolMaterial.toString();
    }
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = this.toolMaterial.getRepairItemStack();
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }

}
