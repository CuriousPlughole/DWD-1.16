package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.common.entities.DalekEntity;
import com.prismmods.dwdimensions.common.entities.ElectricEelEntity;
import com.prismmods.dwdimensions.common.entities.HandmineEntity;
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
	
	public static final RegistryObject<EntityType<ElectricEelEntity>> ELECTRIC_EEL = ENTITIES.register("electric_eel",
			() -> EntityType.Builder.<ElectricEelEntity>create(ElectricEelEntity::new, EntityClassification.MONSTER)
					.size(1.0F, 0.3f).build(new ResourceLocation(DWDimensions.MOD_ID, "electric_eel").toString()));
	
	public static final RegistryObject<EntityType<HandmineEntity>> HANDMINE = ENTITIES.register("handmine",
			() -> EntityType.Builder.<HandmineEntity>create(HandmineEntity::new, EntityClassification.MONSTER)
					.size(0.3F, 0.3f).build(new ResourceLocation(DWDimensions.MOD_ID, "handmine").toString()));

}
