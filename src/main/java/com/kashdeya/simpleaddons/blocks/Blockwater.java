package com.kashdeya.simpleaddons.blocks;

import java.util.Map;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import com.google.common.collect.Maps;
import com.kashdeya.simpleaddons.SimpleAddons;

public class Blockwater extends Block{
	
	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 15);
	private final Map<Block, Integer> encouragements = Maps.<Block, Integer>newIdentityHashMap();

	public Blockwater(Material material) {
        super(Material.redstoneLight);
        this.setHardness(0.5F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(SimpleAddons.items);
    }
	
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te)
    {
        player.addExhaustion(0.025F);
        
                worldIn.setBlockState(pos, Blocks.flowing_water.getDefaultState());
        }
    
	
	public int quantityDropped(Random random)
    {
        return 0;
    }
	
	public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
    {
        float f = 0.125F;
        return new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)((float)(pos.getY() + 1) - f), (double)(pos.getZ() + 1));
    }
	
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 1.0F);
    }
	
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.motionX *= 0.8D;
        entityIn.motionZ *= 0.8D;
    }

    public int getMobilityFlag()
    {
        return 0;
    }
    
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }

}
