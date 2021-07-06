package com.prismmods.dwdimensions.core.init;

import com.prismmods.dwdimensions.DWDimensions;
import com.prismmods.dwdimensions.common.blocks.HandmineTrapBlock;
import com.prismmods.dwdimensions.common.blocks.MercuryGeyserBlock;
import com.prismmods.dwdimensions.common.blocks.MercuryVapourBlock;
import com.prismmods.dwdimensions.common.blocks.TardisBlock;
import com.prismmods.dwdimensions.common.blocks.VargaPlantBushBlock;
import com.prismmods.dwdimensions.common.blocks.generic.ModDeadBush;
import com.prismmods.dwdimensions.common.blocks.generic.ModLeavesBlock;
import com.prismmods.dwdimensions.common.blocks.generic.ModLogBlock;
import com.prismmods.dwdimensions.common.blocks.generic.ModPetrifiedPlant;
import com.prismmods.dwdimensions.common.blocks.generic.ModSaplingBlock;
import com.prismmods.dwdimensions.common.blocks.generic.QuicksandBlock;
import com.prismmods.dwdimensions.core.ItemGroups;
import com.prismmods.dwdimensions.world.feature.tree.PetrifiedTree;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
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
	public static final DeferredRegister<Block> SKARO_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
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
    
    
    /**
     * SKARO BLOCKS
     **/
    
    //Generic rocks/sediment etc
    public static final RegistryObject<Block> SKARO_STONE = SKARO_BLOCKS.register("skaro_stone",  () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.5F)));
    public static final RegistryObject<Block> SKARO_COBBLESTONE = SKARO_BLOCKS.register("skaro_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.5F, 7.0F)));
    public static final RegistryObject<Block> SKARO_DIRT = SKARO_BLOCKS.register("skaro_dirt", () -> new Block(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.6F, 1.0F).harvestTool(ToolType.SHOVEL).sound(SoundType.GROUND)));
    public static final RegistryObject<Block> SKARO_GRAVEL = SKARO_BLOCKS.register("skaro_gravel", () -> new SandBlock(14406560, Block.Properties.from(Blocks.GRAVEL)));
    public static final RegistryObject<Block> SKARO_CLAY = SKARO_BLOCKS.register("skaro_clay", () -> new Block(Block.Properties.from(Blocks.CLAY)));
    public static final RegistryObject<Block> SKARO_GRASS_BLOCK = SKARO_BLOCKS.register("skaro_grass_block", () -> new Block(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.6F, 1.0F).harvestTool(ToolType.SHOVEL).sound(SoundType.GROUND)));
    //Crafted blocks
    public static final RegistryObject<Block> SKARO_STONE_STAIRS = SKARO_BLOCKS.register("skaro_stone_stairs", () -> new StairsBlock(() -> BlockInit.SKARO_STONE.get().getDefaultState(), Block.Properties.from(Blocks.STONE_STAIRS)));
    public static final RegistryObject<Block> SKARO_STONE_WALL = SKARO_BLOCKS.register("skaro_stone_wall", () -> new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)));
    public static final RegistryObject<Block> SKARO_STONE_SLAB = SKARO_BLOCKS.register("skaro_stone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)));
    public static final RegistryObject<Block> SKARO_COBBLESTONE_STAIRS = SKARO_BLOCKS.register("skaro_cobblestone_stairs", () -> new StairsBlock(() -> BlockInit.SKARO_COBBLESTONE.get().getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE_STAIRS)));
    public static final RegistryObject<Block> SKARO_COBBLESTONE_WALL = SKARO_BLOCKS.register("skaro_cobblestone_wall", () -> new WallBlock(Block.Properties.from(Blocks.COBBLESTONE_WALL)));
    public static final RegistryObject<Block> SKARO_COBBLESTONE_SLAB = SKARO_BLOCKS.register("skaro_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.COBBLESTONE_SLAB)));
    public static final RegistryObject<Block> SKARO_STONE_BRICKS = SKARO_BLOCKS.register("skaro_stone_bricks", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.5F)));
    public static final RegistryObject<Block> SKARO_CRACKED_STONE_BRICKS = SKARO_BLOCKS.register("skaro_cracked_stone_bricks", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.5F)));
    public static final RegistryObject<Block> SKARO_MOSSY_STONE_BRICKS = SKARO_BLOCKS.register("skaro_mossy_stone_bricks", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.5F)));
    public static final RegistryObject<Block> SKARO_CHISELED_STONE_BRICKS = SKARO_BLOCKS.register("skaro_chiseled_stone_bricks", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.5F)));
    public static final RegistryObject<Block> SKARO_STONE_BRICK_STAIRS = SKARO_BLOCKS.register("skaro_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.SKARO_STONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> SKARO_STONE_BRICK_WALL = SKARO_BLOCKS.register("skaro_stone_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> SKARO_STONE_BRICK_SLAB = SKARO_BLOCKS.register("skaro_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> SKARO_BRICKS = SKARO_BLOCKS.register("skaro_bricks", () -> new Block(Block.Properties.from(Blocks.BRICKS)));
    public static final RegistryObject<Block> SKARO_BRICK_STAIRS = SKARO_BLOCKS.register("skaro_brick_stairs", () -> new StairsBlock(() -> BlockInit.SKARO_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.BRICK_STAIRS)));
    public static final RegistryObject<Block> SKARO_BRICK_WALL = SKARO_BLOCKS.register("skaro_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)));
    public static final RegistryObject<Block> SKARO_BRICK_SLAB = SKARO_BLOCKS.register("skaro_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.BRICK_SLAB)));
    public static final RegistryObject<Block> SKARO_MOSSY_STONE_BRICK_STAIRS = SKARO_BLOCKS.register("skaro_mossy_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.SKARO_MOSSY_STONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.BRICK_STAIRS)));
    public static final RegistryObject<Block> SKARO_MOSSY_STONE_BRICK_WALL = SKARO_BLOCKS.register("skaro_mossy_stone_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)));
    public static final RegistryObject<Block> SKARO_MOSSY_STONE_BRICK_SLAB = SKARO_BLOCKS.register("skaro_mossy_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.BRICK_SLAB)));
    //Ores or materials
    public static final RegistryObject<Block> SKARO_DALEKANIUM_ORE = SKARO_BLOCKS.register("skaro_dalekanium_ore", () -> new Block(Block.Properties.from(Blocks.OBSIDIAN)));
    public static final RegistryObject<Block> SKARO_URANIUM_ORE = SKARO_BLOCKS.register("skaro_uranium_ore", () -> new Block(Block.Properties.from(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> SKARO_SULPHUR_ORE = SKARO_BLOCKS.register("skaro_sulphur_ore", () -> new Block(Block.Properties.from(Blocks.IRON_ORE)));
    //Vegetation
    public static final RegistryObject<Block> SKARO_SHRUB = SKARO_BLOCKS.register("skaro_shrub", () -> new ModDeadBush(Block.Properties.from(Blocks.DEAD_BUSH)));
    public static final RegistryObject<Block> SKARO_PETRIFIED_SHRUB = SKARO_BLOCKS.register("skaro_petrified_shrub", () -> new ModDeadBush(Block.Properties.from(Blocks.DEAD_BUSH)));
    public static final RegistryObject<Block> VARGA_PLANT = SKARO_BLOCKS.register("varga_plant", () -> new VargaPlantBushBlock(Block.Properties.create(Material.PLANTS).tickRandomly().doesNotBlockMovement().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> PETRIFIED_FLOWER_1 = SKARO_BLOCKS.register("petrified_flower_1", () -> new ModPetrifiedPlant(Block.Properties.from(Blocks.DEAD_BUSH).setLightLevel((state) -> {return 5;})));
    public static final RegistryObject<Block> PETRIFIED_FLOWER_2 = SKARO_BLOCKS.register("petrified_flower_2", () -> new ModPetrifiedPlant(Block.Properties.from(Blocks.DEAD_BUSH).setLightLevel((state) -> {return 5;})));
    public static final RegistryObject<Block> SKARO_SHRUB_2 = SKARO_BLOCKS.register("skaro_shrub_2", () -> new ModDeadBush(Block.Properties.from(Blocks.DEAD_BUSH)));
    public static final RegistryObject<Block> PETRIFIED_FUNGUS = SKARO_BLOCKS.register("petrified_fungus", () -> new ModPetrifiedPlant(Block.Properties.from(Blocks.DEAD_BUSH).setLightLevel((state) -> {return 5;})));
    public static final RegistryObject<Block> SKARO_TALL_GRASS = SKARO_BLOCKS.register("skaro_tall_grass", () -> new ModDeadBush(Block.Properties.from(Blocks.DEAD_BUSH)));
    public static final RegistryObject<Block> SKARO_BUSH = SKARO_BLOCKS.register("skaro_bush", () -> new Block(Block.Properties.from(Blocks.OAK_LEAVES)));
    //Trees
    public static final RegistryObject<Block> PETRIFIED_LOG = SKARO_BLOCKS.register("petrified_log", () -> new ModLogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_PETRIFIED_LOG = SKARO_BLOCKS.register("stripped_petrified_log", () -> new ModLogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> PETRIFIED_LEAVES = SKARO_BLOCKS.register("petrified_leaves", () -> new ModLeavesBlock(Block.Properties.from((Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> PETRIFIED_SAPLING = SKARO_BLOCKS.register("petrified_sapling", () -> new ModSaplingBlock(new PetrifiedTree(), Block.Properties.from(Blocks.OAK_SAPLING)));
    //Special Blocks
    public static final RegistryObject<Block> MERCURY_GEYSER = SKARO_BLOCKS.register("mercury_geyser", () -> new MercuryGeyserBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.5f).tickRandomly()));
    public static final RegistryObject<Block> MERCURY_VAPOUR = SKARO_BLOCKS.register("mercury_vapour", () -> new MercuryVapourBlock(Block.Properties.create(Material.BUBBLE_COLUMN).doesNotBlockMovement().noDrops()));
    public static final RegistryObject<Block> HANDMINE_TRAP = SKARO_BLOCKS.register("handmine_trap", () -> new HandmineTrapBlock(Block.Properties.from(Blocks.DIRT)));
    public static final RegistryObject<Block> SKARO_QUICKSAND = SKARO_BLOCKS.register("skaro_quicksand", () -> new QuicksandBlock(Block.Properties.from(Blocks.SAND).doesNotBlockMovement()));
    
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
		
		SKARO_BLOCKS.getEntries().stream().filter(block -> !(block.get() instanceof FlowingFluidBlock)).map(RegistryObject::get).forEach(block -> {
			if(block != MERCURY_VAPOUR.get()) {
				final Item.Properties properties = new Item.Properties().group(ItemGroups.TAB_SKARO);
				final BlockItem blockItem = new BlockItem(block, properties);
				blockItem.setRegistryName(block.getRegistryName());
				registry.register(blockItem);
			}
		});
		
	}

}
