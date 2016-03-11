package com.kashdeya.simpleaddons.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.kashdeya.simpleaddons.SimpleAddons;
import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;

public class Blockgrowth extends Block{
	
	private boolean ignoreSimilarity;

	public Blockgrowth(){
		
    super(Material.ground);
    this.setTickRandomly(true);
    this.setHardness(2.0F);
    this.setLightLevel(1.0F);
	this.setLightOpacity(1);
	this.setStepSound(soundTypeStone);
	this.setCreativeTab(SimpleAddons.tabBlock);
  }
	
    public boolean isFullCube()
    {
        return false;
    }
	
	public void growCropsNearby(World world, BlockPos pos, IBlockState state) {        
        int xO = pos.getX();
        int yO = pos.getY();
        int zO = pos.getZ();

        for (int xD = -5; xD <= 5; xD++) {
            for (int yD = -1; yD <= 5; yD++) {
                for (int zD = -5; zD <= 5; zD++) {
                    int x = xO + xD;
                    int y = yO + yD;
                    int z = zO + zD;

                    double distance = Math.sqrt(Math.pow(x-xO, 2) + Math.pow(y - yO,2) + Math.pow(z - zO,2));
                    distance -= 0;
                    distance = Math.min(1D, distance);
                    double distanceCoefficient = 1D - (distance / 5);

                    IBlockState cropState = world.getBlockState(new BlockPos(x, y, z));
                    Block cropBlock = cropState.getBlock();

                    if (cropBlock instanceof IPlantable || cropBlock instanceof IGrowable) {
                        if (!(cropBlock instanceof Blockgrowth)) {
                            world.scheduleBlockUpdate(new BlockPos(x, y, z), cropBlock, (int) (distanceCoefficient * (float) 100 * 4F), 1);
                            cropBlock.updateTick(world, new BlockPos(x, y, z), cropState, world.rand);
                        }
                    }
                }
            }
        }
        world.scheduleBlockUpdate(pos, state.getBlock(), 100 * 4, 1);
    }
	
	@Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random par5Random) {

        this.growCropsNearby(world, pos, state);
    }
	
	public int quantityDropped(Random random)
    {
        return 1;
    }
	
	public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }

	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
		super.randomDisplayTick(worldIn, pos, state, rand);
		Material material = worldIn.getBlockState(pos.down()).getBlock().getMaterial();

        for (int i = -4; i <= 4; ++i)
        {
            for (int j = -4; j <= 4; ++j)
            {
                if (i > -4 && i < 4 && j == -1)
                {
                    j = 4;
                }
                
                if (rand.nextInt(16) == 0)
                {
                    for (int k = 0; k <= 2; ++k)
                    {
                        BlockPos blockpos = pos.add(i, k, j);
                        worldIn.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, (double)pos.getX() + 0.5D, (double)pos.getY() + 2.0D, (double)pos.getZ() + 0.5D, (double)((float)i + rand.nextFloat()) - 0.5D, (double)((float)k - rand.nextFloat() - 0.5F), (double)((float)j + rand.nextFloat()) - 0.5D, new int[0]);
                        worldIn.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, pos.getX() + 0.5D + rand.nextGaussian() / 4, (double)pos.getY() + 1.0D, pos.getZ() + 0.5D + rand.nextGaussian() / 4, 0.0D, 0.9D, 0.5D);
                    }
                }
            }
        }
    }
}
