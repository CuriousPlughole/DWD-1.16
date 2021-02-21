package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.core.ItemGroups;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DWDimensions.MOD_ID);
	
    //Icons
	public static final RegistryObject<Item> GALLIFREY_ICON = ITEMS.register("icon_gallifrey", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKARO_ICON = ITEMS.register("icon_skaro", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MARS_ICON = ITEMS.register("icon_mars", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOON_ICON = ITEMS.register("icon_moon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEVICES_ICON = ITEMS.register("icon_devices", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TARDISBLOCKS_ICON = ITEMS.register("icon_tardisblocks", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRAFTINGMATERIALS_ICON = ITEMS.register("icon_craftingmaterials", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPAWNEGGS_ICON = ITEMS.register("icon_spawneggs", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UTILITY_ICON = ITEMS.register("icon_utility", () -> new Item(new Item.Properties()));

	public static final RegistryObject<Item> ZEITON_7 = ITEMS.register("zeiton_7", () -> new Item(new Item.Properties().group(ItemGroups.TAB_GALLIFREY)));

}
