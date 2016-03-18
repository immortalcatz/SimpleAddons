package com.kashdeya.simpleaddons.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.kashdeya.simpleaddons.SimpleAddons;

public class Itembowl extends Item{
	
	public Itembowl() {
		super();
		super.setMaxStackSize(1);
		super.setContainerItem(this);
		this.setCreativeTab(SimpleAddons.tabItems);
		
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack)
	{
		return false;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
	{
		ItemStack stack = itemStack.copy();
		stack.stackSize = 1;

		return stack;
	}

}
