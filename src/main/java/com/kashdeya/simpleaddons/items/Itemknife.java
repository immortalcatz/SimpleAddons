package com.kashdeya.simpleaddons.items;

import com.kashdeya.simpleaddons.init.SimpleAddonsItems;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;

public class Itemknife extends Item{

	public Itemknife(String name, ToolMaterial knifematerial) {
		super();
		//super.setMaxDamage(durability);
		this.setFull3D();
		super.setNoRepair();
		super.setMaxStackSize(1);
		super.setContainerItem(this);
		//super.showDurabilityBar(new ItemStack(this));
		this.setCreativeTab(CreativeTabs.tabFood);
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack)
	{
		return false;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
	{
		ItemStack stack = itemStack.copy();

		//stack.setItemDamage(stack.getItemDamage() + 1);
		stack.stackSize = 1;

		return stack;
	}

}
