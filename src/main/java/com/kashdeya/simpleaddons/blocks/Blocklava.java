package com.kashdeya.simpleaddons.blocks;

import java.util.Map;
import java.util.Random;

import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Blocklava extends Block{
	
	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 15);
	private final Map<Block, Integer> encouragements = Maps.<Block, Integer>newIdentityHashMap();
    private final Map<Block, Integer> flammabilities = Maps.<Block, Integer>newIdentityHashMap();

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
	
	public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
    {
        float f = 0.75F;
        return new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)((float)(pos.getY() + 1) - f), (double)(pos.getZ() + 1));
    }
	
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.motionX *= 0.2D;
        entityIn.motionZ *= 0.2D;
        entityIn.setFire(3);
    }
	
	protected void triggerMixEffects(World worldIn, BlockPos pos)
    {
        double d0 = (double)pos.getX();
        double d1 = (double)pos.getY();
        double d2 = (double)pos.getZ();
        worldIn.playSoundEffect(d0 + 0.5D, d1 + 0.5D, d2 + 0.5D, "random.fizz", 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

        for (int i = 0; i < 8; ++i)
        {
            worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0 + Math.random(), d1 + 1.2D, d2 + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
        }
    }

    public int getMobilityFlag()
    {
        return 0;
    }

}
