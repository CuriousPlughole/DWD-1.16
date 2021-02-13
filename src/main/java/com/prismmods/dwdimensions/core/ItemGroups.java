package com.prismmods.dwdimensions.core;


import com.prismmods.dwdimensions.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroups {
	
	 public static final ItemGroup TAB_GALLIFREY = new ItemGroup("gallifreytab") {
	        @Override
	        public ItemStack createIcon() {
	            return new ItemStack(ItemInit.GALLIFREY_ICON.get());
	        }
	    };

	    public static final ItemGroup TAB_SKARO = new ItemGroup("skarotab") {
	        @Override
	        public ItemStack createIcon() {
	            return new ItemStack(ItemInit.SKARO_ICON.get());
	        }
	    };

	    public static final ItemGroup TAB_DEVICES = new ItemGroup("devicestab") {
	        @Override
	        public ItemStack createIcon() {
	            return new ItemStack(ItemInit.DEVICES_ICON.get());
	        }
	    };

	    public static final ItemGroup TAB_TARDIS_BLOCKS = new ItemGroup("tardisblockstab") {
	        @Override
	        public ItemStack createIcon() {
	            return new ItemStack(ItemInit.TARDISBLOCKS_ICON.get());
	        }
	    };

	    public static final ItemGroup TAB_CRAFTING_MATERIALS = new ItemGroup("craftingmaterialstab") {
	        @Override
	        public ItemStack createIcon() {
	            return new ItemStack(ItemInit.CRAFTINGMATERIALS_ICON.get());
	        }
	    };

	    public static final ItemGroup TAB_UTILITY = new ItemGroup("utilitytab") {
	        @Override
	        public ItemStack createIcon() {
	            return new ItemStack(ItemInit.UTILITY_ICON.get());
	        }
	    };

	    public static final ItemGroup TAB_SPAWNEGGS = new ItemGroup("spawneggstab") {
	        @Override
	        public ItemStack createIcon() {
	            return new ItemStack(ItemInit.SPAWNEGGS_ICON.get());
	        }
	    };

}
