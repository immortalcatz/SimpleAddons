package com.kashdeya.simpleaddons.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.simpleaddons.worldgen.OreGen;

public class CommonProxy {
    
	public void registerRenders(){
		
	}
	
	public void registerWorldGenerators(){
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
	}

}
