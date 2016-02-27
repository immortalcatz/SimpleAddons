package com.kashdeya.simpleaddons.proxy;

import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders(){
		SimpleAddonsBlocks.registerRenders();
	}

}
