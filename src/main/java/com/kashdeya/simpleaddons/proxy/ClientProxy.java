package com.kashdeya.simpleaddons.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;

public class ClientProxy extends CommonProxy{
	
	public void preInit(FMLPreInitializationEvent e) {
		SimpleAddonsBlocks.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
	
	@Override
	public void registerRenders(){
		SimpleAddonsBlocks.registerRenders();
	}

}
