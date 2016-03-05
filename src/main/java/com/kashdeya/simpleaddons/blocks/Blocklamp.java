package com.kashdeya.simpleaddons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.kashdeya.simpleaddons.SimpleAddons;

public class Blocklamp extends Block{

	public Blocklamp(Material materialIn) {
		super(materialIn);
		this.setHardness(0.5F);
		this.setLightLevel(1.0F);
		this.setLightOpacity(1);
		this.setStepSound(soundTypeGlass);
		this.setCreativeTab(SimpleAddons.tabBlock);
	}

}
