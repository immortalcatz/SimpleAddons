package com.kashdeya.simpleaddons.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

import com.kashdeya.simpleaddons.init.SimpleAddonsBlocks;

public class FuelHandler implements IFuelHandler {

    public int getBurnTime(ItemStack fuel) {
        ItemStack itemStack = fuel;
        if (fuel.isItemEqual(new ItemStack(SimpleAddonsBlocks.charcoal_block))) { return ConfigHandler.CharcoalBlockBurnTime; }
        if (fuel.isItemEqual(new ItemStack(Items.paper))) { return ConfigHandler.PaperBurnTime; }
        if (fuel.isItemEqual(new ItemStack(Items.bowl))) { return ConfigHandler.BowlBurnTime; }
        if (fuel.isItemEqual(new ItemStack(Blocks.ladder))) { return ConfigHandler.LadderBurnTime; }
        if (fuel.isItemEqual(new ItemStack(Blocks.wooden_pressure_plate))) { return ConfigHandler.WoodenPressurePlateBurnTime; }
        if (fuel.isItemEqual(new ItemStack(Items.sign))) { return ConfigHandler.SignBurnTime; }
        else {
            return 0;
        }
    }
}
