package com.kashdeya.simpleaddons.proxy;

import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;
import com.kashdeya.simpleaddons.init.SimpleAddonsDrinks;
import com.kashdeya.simpleaddons.init.SimpleAddonsFood;
import com.kashdeya.simpleaddons.init.SimpleAddonsItems;
import com.kashdeya.simpleaddons.init.SimpleAddonsTools;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders(){
		SimpleAddonsBlocks.registerRenders();
		SimpleAddonsItems.registerRenders();
		SimpleAddonsFood.registerRenders();
		SimpleAddonsDrinks.registerRenders();
		SimpleAddonsTools.registerRenders();
	}

}
