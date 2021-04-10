package com.prismmods.dwdimensions;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.prismmods.dwdimensions.client.util.DalekModelGetter;
import com.prismmods.dwdimensions.common.entities.DalekEntity;
import com.prismmods.dwdimensions.common.entities.ElectricEelEntity;
import com.prismmods.dwdimensions.common.entities.HandmineEntity;
import com.prismmods.dwdimensions.common.entities.TimeLordEntity;
import com.prismmods.dwdimensions.core.init.BiomeInit;
import com.prismmods.dwdimensions.core.init.BlockInit;
import com.prismmods.dwdimensions.core.init.DimensionInit;
import com.prismmods.dwdimensions.core.init.EffectsInit;
import com.prismmods.dwdimensions.core.init.EntityTypeInit;
import com.prismmods.dwdimensions.core.init.FluidInit;
import com.prismmods.dwdimensions.core.init.ItemInit;
import com.prismmods.dwdimensions.core.init.SoundInit;
import com.prismmods.dwdimensions.core.init.TileEntityTypeInit;
import com.prismmods.dwdimensions.world.ModSurfaceBuilders;

import net.minecraft.block.Block;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("dwdimensions")
@Mod.EventBusSubscriber(modid = DWDimensions.MOD_ID, bus = Bus.MOD)
public class DWDimensions {

	public static final String MOD_ID = "dwdimensions";
	public static final Logger LOGGER = LogManager.getLogger();

	public static ArrayList<Block> dirt_valid_ground = new ArrayList<Block>();
	public static ArrayList<Block> sand_valid_ground = new ArrayList<Block>();

	public DWDimensions() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		// bus.addListener(this::gatherData);

		SoundInit.SOUNDS.register(bus);
		ItemInit.ITEMS.register(bus);
		FluidInit.FLUIDS.register(bus);
		BlockInit.BLOCKS.register(bus);
		BlockInit.GALLIFREY_BLOCKS.register(bus);
		BlockInit.SKARO_BLOCKS.register(bus);
		TileEntityTypeInit.TILE_ENTITY_TYPES.register(bus);
		EntityTypeInit.ENTITIES.register(bus);
		EffectsInit.EFFECTS.register(bus);

		ModSurfaceBuilders.SURFACE_BUILDERS.register(bus);
		BiomeInit.BIOMES.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {

		//Ground for dirt or sand type blocks to allow things to grow on them
		dirt_valid_ground.add(BlockInit.GALLIFREY_DIRT.get());
		dirt_valid_ground.add(BlockInit.SKARO_DIRT.get());
		dirt_valid_ground.add(BlockInit.SKARO_GRASS_BLOCK.get());
		sand_valid_ground.add(BlockInit.GALLIFREY_SAND.get());
		sand_valid_ground.add(BlockInit.SKARO_GRAVEL.get());

		DalekModelGetter.setupLists();
		GlobalEntityTypeAttributes.put(EntityTypeInit.DALEK.get(), DalekEntity.createAttributes().create());
		GlobalEntityTypeAttributes.put(EntityTypeInit.TIMELORD.get(), TimeLordEntity.createAttributes().create());
		GlobalEntityTypeAttributes.put(EntityTypeInit.ELECTRIC_EEL.get(),
				ElectricEelEntity.createAttributes().create());
		GlobalEntityTypeAttributes.put(EntityTypeInit.HANDMINE.get(), HandmineEntity.createAttributes().create());

		event.enqueueWork(() -> {
			DimensionInit.registerNoiseSettings();
			DimensionInit.registerChunkGenerators();
			BiomeInit.registerBiomeKeys();
		});

	}

	/*
	 * public void gatherData(GatherDataEvent event) { DataGenerator generator =
	 * event.getGenerator(); generator.addProvider(new EngLangGen(generator));
	 * generator.addProvider(new BlockstateGen(generator));
	 * generator.addProvider(new BlockItemModelGen(generator)); }
	 */

}
