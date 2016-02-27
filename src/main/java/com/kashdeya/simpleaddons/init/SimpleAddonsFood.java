package com.kashdeya.simpleaddons.init;

import com.kashdeya.simpleaddons.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SimpleAddonsFood extends ItemFood{
	
	public static Item bacon;
	public static Item cooked_bacon;
	public static Item monster_jerky;
	public static Item toast;

	public SimpleAddonsFood(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	}

	public static void init(){
		bacon = new SimpleAddonsFood(1, 0.1F, true).setUnlocalizedName("bacon");
		cooked_bacon = new SimpleAddonsFood(3, 0.3F, true).setUnlocalizedName("cooked_bacon");
		monster_jerky = new SimpleAddonsFood(4, 0.5F, true).setUnlocalizedName("monster_jerky");
		toast = new SimpleAddonsFood(7, 1.2F, true).setUnlocalizedName("toast");
		
	}
	
	public static void register(){
		GameRegistry.registerItem(bacon, bacon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_bacon, cooked_bacon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(monster_jerky, monster_jerky.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(toast, toast.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(bacon);
		registerRender(cooked_bacon);
		registerRender(monster_jerky);
		registerRender(toast);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
