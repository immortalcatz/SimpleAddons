package com.kashdeya.simpleaddons.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;

public class FuelHandler implements IFuelHandler {

    public int getBurnTime(ItemStack fuel) {
        ItemStack itemStack = fuel;
        if (fuel.isItemEqual(new ItemStack(SimpleAddonsBlocks.charcoal_block))) { return ConfigHandler.CharcoalBlockBurnTime; }
        else {
            return 0;
        }


    }
}
