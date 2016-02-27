package com.kashdeya.simpleaddons.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class Blocklava extends Block{

	public Blocklava(Material material) {
        super(Material.redstoneLight);
        this.setHardness(0.5F);
        this.setLightLevel(1.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
	
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te)
    {
        player.addExhaustion(0.025F);
        
                worldIn.setBlockState(pos, Blocks.flowing_lava.getDefaultState());
        }
    
	
	public int quantityDropped(Random random)
    {
        return 0;
    }

    public int getMobilityFlag()
    {
        return 0;
    }

}
