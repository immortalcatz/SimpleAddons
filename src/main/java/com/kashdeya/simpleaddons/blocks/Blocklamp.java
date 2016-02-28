package com.kashdeya.simpleaddons.blocks;

import com.kashdeya.simpleaddons.SimpleAddons;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class Blocklamp extends Block{

	public Blocklamp(Material materialIn) {
		super(materialIn);
		this.setHardness(0.5F);
		this.setLightLevel(1.0F);
		this.setLightOpacity(1);
		this.setStepSound(soundTypeGlass);
		this.setCreativeTab(SimpleAddons.items);
	}

}
