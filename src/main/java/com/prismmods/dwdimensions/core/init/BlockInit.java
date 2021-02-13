package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.common.blocks.TardisBlock;
import com.prismmods.dwdimensions.common.blocks.generic.ModDeadBush;
import com.prismmods.dwdimensions.core.ItemGroups;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = DWDimensions.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			DWDimensions.MOD_ID);
	public static final DeferredRegister<Block> GALLIFREY_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			DWDimensions.MOD_ID);
	
	public static final RegistryObject<Block> TARDIS = BLOCKS.register("tardis", () -> new TardisBlock(Block.Properties.from(Blocks.OBSIDIAN).tickRandomly()));
	
    public static final RegistryObject<Block> GALLIFREY_DIRT = GALLIFREY_BLOCKS.register("gallifrey_dirt", () -> new Block(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.6F, 1.0F).harvestTool(ToolType.SHOVEL).sound(SoundType.GROUND)));
    public static final RegistryObject<Block> GALLIFREY_SAND = GALLIFREY_BLOCKS.register("gallifrey_sand", () -> new SandBlock(14406560, Block.Properties.from(Blocks.SAND)));
    public static final RegistryObject<Block> GALLIFREY_SHRUB = GALLIFREY_BLOCKS.register("gallifrey_shrub", () -> new ModDeadBush(Block.Properties.from(Blocks.DEAD_BUSH)));
    public static final RegistryObject<Block> GALLIFREY_BUSH = GALLIFREY_BLOCKS.register("gallifrey_bush", () -> new Block(Block.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> GALLIFREY_STONE = GALLIFREY_BLOCKS.register("gallifrey_stone", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.5F)));
    public static final RegistryObject<Block> GALLIFREY_STONE_STAIRS = GALLIFREY_BLOCKS.register("gallifrey_stone_stairs", () -> new StairsBlock(() -> BlockInit.GALLIFREY_STONE.get().getDefaultState(), Block.Properties.from(Blocks.STONE_STAIRS)));
    public static final RegistryObject<Block> GALLIFREY_STONE_WALL = GALLIFREY_BLOCKS.register("gallifrey_stone_wall", () -> new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)));
    public static final RegistryObject<Block> GALLIFREY_STONE_SLAB = GALLIFREY_BLOCKS.register("gallifrey_stone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_SLAB)));
    public static final RegistryObject<Block> AKATITE = GALLIFREY_BLOCKS.register("akatite", () -> new Block(Block.Properties.from(Blocks.ANDESITE)));
    
    public static final RegistryObject<Block> ZEITON_ORE = GALLIFREY_BLOCKS.register("zeiton_ore",
			() -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(2)));
    
	@SubscribeEvent
	public static void registerBlockItems(RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		GALLIFREY_BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().group(ItemGroups.TAB_GALLIFREY);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
		
		BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().group(ItemGroups.TAB_TARDIS_BLOCKS);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
		
	}

}
