package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.common.entities.DalekEntity;
import com.prismmods.dwdimensions.common.entities.TimeLordEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {

	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			DWDimensions.MOD_ID);

	public static final RegistryObject<EntityType<DalekEntity>> DALEK = ENTITIES.register("dalek",
			() -> EntityType.Builder.<DalekEntity>create(DalekEntity::new, EntityClassification.MONSTER)
					.size(0.7F, 1.8F).build(new ResourceLocation(DWDimensions.MOD_ID, "dalek").toString()));
	
	public static final RegistryObject<EntityType<TimeLordEntity>> TIMELORD = ENTITIES.register("timelord",
			() -> EntityType.Builder.<TimeLordEntity>create(TimeLordEntity::new, EntityClassification.MONSTER)
					.size(0.7F, 1.8f).build(new ResourceLocation(DWDimensions.MOD_ID, "timelord").toString()));
	

}
