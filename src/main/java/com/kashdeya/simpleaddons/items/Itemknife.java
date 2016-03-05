package com.kashdeya.simpleaddons.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.kashdeya.simpleaddons.SimpleAddons;

public class Itemknife extends ItemPickaxe{
	
	private float attackDamage;

	public Itemknife(String name, int durability, ToolMaterial material) {
		super(material);
		super.setMaxDamage(durability);
		this.setFull3D();
		super.setMaxStackSize(1);
		super.setContainerItem(this);
		super.showDurabilityBar(new ItemStack(this));
		this.setCreativeTab(SimpleAddons.tabItems);
		this.attackDamage = 2.0F;
		
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
