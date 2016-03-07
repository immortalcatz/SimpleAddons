package com.kashdeya.simpleaddons.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import com.kashdeya.simpleaddons.SimpleAddons;

public class ToolsPickaxe extends ItemPickaxe {
	
	private final Item.ToolMaterial material;
	
	public ToolsPickaxe(Item.ToolMaterial material, ItemStack repairItem)
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
