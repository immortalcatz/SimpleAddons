package com.kashdeya.simpleaddons.items;

import java.util.List;

import com.kashdeya.simpleaddons.SimpleAddons;
import com.kashdeya.simpleaddons.init.SimpleAddonsItems;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Itemknife extends Item{

	public Itemknife(String name, int durability, ToolMaterial knifematerial) {
		super();
		super.setMaxDamage(durability);
		this.setFull3D();
		super.setNoRepair();
		super.setMaxStackSize(1);
		super.setContainerItem(this);
		super.showDurabilityBar(new ItemStack(this));
		this.setCreativeTab(SimpleAddons.items);
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack)
	{
		return false;
	}
	
	@SideOnly(Side.CLIENT)
    public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems)
    {
        subItems.add(new ItemStack(itemIn, 1, 0));
    }
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
	{
		ItemStack stack = itemStack.copy();

		stack.setItemDamage(stack.getItemDamage() + 1);
		stack.stackSize = 1;

		return stack;
	}

}
