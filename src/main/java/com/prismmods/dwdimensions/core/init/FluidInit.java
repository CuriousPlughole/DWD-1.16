package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.common.blocks.FlowingRadioactiveWaterBlock;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {

	//Texture locations
	public static final ResourceLocation RADIOACTIVE_WATER_STILL_RL = new ResourceLocation(DWDimensions.MOD_ID,
			"blocks/radioactive_water_still");
	public static final ResourceLocation RADIOACTIVE_WATER_FLOWING_RL = new ResourceLocation(DWDimensions.MOD_ID,
			"blocks/radioactive_water_flowing");
	
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
			DWDimensions.MOD_ID);

	
	//Actual fluids
	public static final RegistryObject<FlowingFluid> RADIOACTIVE_WATER_FLUID = FLUIDS.register(
			"radioactive_water_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.RADIOACTIVE_WATER_PROPERTIES));
	public static final RegistryObject<FlowingFluid> RADIOACTIVE_WATER_FLOWING = FLUIDS.register(
			"radioactive_water_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.RADIOACTIVE_WATER_PROPERTIES));
	
	
	//Fluid properties
	public static final ForgeFlowingFluid.Properties RADIOACTIVE_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> RADIOACTIVE_WATER_FLUID.get(), () -> RADIOACTIVE_WATER_FLOWING.get(), FluidAttributes
					.builder(RADIOACTIVE_WATER_STILL_RL, RADIOACTIVE_WATER_FLOWING_RL).luminosity(5))
							.block(() -> FluidInit.RADIOACTIVE_WATER_BLOCK.get()).bucket(() -> ItemInit.RADIOACTIVE_WATER_BUCKET.get());

	//Blocks for the fluid
	public static final RegistryObject<FlowingFluidBlock> RADIOACTIVE_WATER_BLOCK = BlockInit.SKARO_BLOCKS
			.register("radioactive_water", () -> new FlowingRadioactiveWaterBlock(() -> FluidInit.RADIOACTIVE_WATER_FLUID.get(),
					Block.Properties.from(Blocks.WATER)));
	
	
	
	
}
