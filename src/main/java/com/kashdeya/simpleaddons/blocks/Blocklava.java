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
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.google.common.collect.Maps;
import com.kashdeya.simpleaddons.SimpleAddons;

public class Blocklava extends Block{
	
	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 15);
	private final Map<Block, Integer> encouragements = Maps.<Block, Integer>newIdentityHashMap();
    private final Map<Block, Integer> flammabilities = Maps.<Block, Integer>newIdentityHashMap();

	public Blocklava(Material material) {
        super(Material.redstoneLight);
        this.setHardness(0.5F);
        this.setLightLevel(1.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(SimpleAddons.items);
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
        float f = 0.125F;
        return new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)((float)(pos.getY() + 1) - f), (double)(pos.getZ() + 1));
    }
	
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 2.0F);
    }
	
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.motionX *= 0.8D;
        entityIn.motionZ *= 0.8D;
        entityIn.setFire(3);
    }
	
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (this.isFullBlock())
        {
        	double d0 = (double)pos.getX();
            double d1 = (double)pos.getY();
            double d2 = (double)pos.getZ();
            
            if (rand.nextInt(75) == 0)
            {
                double d3 = d0 + (double)rand.nextFloat();
                double d5 = d1;
                double d7 = d2 + (double)rand.nextFloat();
                double d8 = d0 + (double)rand.nextFloat();
                double d4 = d1 + this.maxY;
                double d6 = d2 + (double)rand.nextFloat();
                worldIn.spawnParticle(EnumParticleTypes.LAVA, d8, d4, d6, 0.0D, 0.0D, 0.0D, new int[0]);
                worldIn.playSound(d8, d4, d6, "liquid.lavapop", 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
                worldIn.spawnParticle(EnumParticleTypes.DRIP_LAVA, d3, d5, d7, 0.0D, 0.0D, 0.0D, new int[0]);
            }
            
            if (rand.nextInt(200) == 0)
            {
                worldIn.playSound(d0, d1, d2, "liquid.lava", 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
            }
        }
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
