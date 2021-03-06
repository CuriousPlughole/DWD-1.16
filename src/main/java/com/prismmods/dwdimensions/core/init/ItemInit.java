package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.core.ItemGroups;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			DWDimensions.MOD_ID);

	// Icons
	public static final RegistryObject<Item> GALLIFREY_ICON = ITEMS.register("icon_gallifrey",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> SKARO_ICON = ITEMS.register("icon_skaro",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> MARS_ICON = ITEMS.register("icon_mars",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> MOON_ICON = ITEMS.register("icon_moon",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> DEVICES_ICON = ITEMS.register("icon_devices",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> TARDISBLOCKS_ICON = ITEMS.register("icon_tardisblocks",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> CRAFTINGMATERIALS_ICON = ITEMS.register("icon_craftingmaterials",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> SPAWNEGGS_ICON = ITEMS.register("icon_spawneggs",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> UTILITY_ICON = ITEMS.register("icon_utility",
			() -> new Item(new Item.Properties()));

	public static final RegistryObject<Item> ZEITON_7 = ITEMS.register("zeiton_7",
			() -> new Item(new Item.Properties().group(ItemGroups.TAB_GALLIFREY)));

	public static final RegistryObject<Item> VARGA_BERRIES = ITEMS.register("varga_berries",
			() -> new BlockNamedItem(BlockInit.VARGA_PLANT.get(), (new Item.Properties().food(new Food.Builder()
					.hunger(1).saturation(0.5f).effect(new EffectInstance(Effects.POISON, 600, 2), 1.0f).build()))));
	
	public static final RegistryObject<BucketItem> RADIOACTIVE_WATER_BUCKET = ITEMS.register("radioactive_water_bucket", () -> new BucketItem(() -> FluidInit.RADIOACTIVE_WATER_FLUID.get(), new Item.Properties().group(ItemGroups.TAB_UTILITY).maxStackSize(1))); 

}
