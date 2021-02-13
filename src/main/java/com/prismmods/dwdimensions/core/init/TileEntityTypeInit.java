package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.common.tileentities.TardisTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeInit {
	
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, DWDimensions.MOD_ID);

	 public static final RegistryObject<TileEntityType<TardisTileEntity>> TARDIS = TILE_ENTITY_TYPES.register("tardis", () -> TileEntityType.Builder.create(TardisTileEntity::new, BlockInit.TARDIS.get()).build(null));
	
}
