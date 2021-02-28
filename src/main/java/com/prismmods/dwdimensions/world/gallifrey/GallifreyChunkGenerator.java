package com.prismmods.dwdimensions.world.gallifrey;

import java.util.Random;
import java.util.stream.IntStream;

import com.mojang.serialization.Codec;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryLookupCodec;
import net.minecraft.world.Blockreader;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.Heightmap.Type;
import net.minecraft.world.gen.INoiseGenerator;
import net.minecraft.world.gen.PerlinNoiseGenerator;
import net.minecraft.world.gen.WorldGenRegion;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;

/*
 * Credits to 50 for most of this!
 * https://gitlab.com/Spectre0987/TardisMod-1-14/-/blob/1.16.x/src/main/java/net/tardis/mod/world/dimensions/MoonChunkGenerator.java
 */

public class GallifreyChunkGenerator extends ChunkGenerator {

	public static final Codec<GallifreyChunkGenerator> codecProvider = RegistryLookupCodec
			.getLookUpCodec(Registry.BIOME_KEY)
			.xmap(GallifreyChunkGenerator::new, GallifreyChunkGenerator::getBiomeRegistry).codec();
	
	private final Registry<Biome> biomeRegistry;
	private final INoiseGenerator surfaceDepthNoise;
	protected final SharedSeedRandom random;
	protected final BlockState defaultBlock;
	protected final BlockState defaultFluid;

	public GallifreyChunkGenerator(MinecraftServer server) {
		this(server.func_244267_aX().getRegistry(Registry.BIOME_KEY));
	}
	
	public GallifreyChunkGenerator(Registry<Biome> biomes) {
		super(new SingleBiomeProvider(biomes.getOrThrow(Biomes.BADLANDS)), new DimensionStructuresSettings(false));
		
		this.random = new SharedSeedRandom(0);
		this.biomeRegistry = biomes;
		this.surfaceDepthNoise = new PerlinNoiseGenerator(this.random, IntStream.rangeClosed(-3, 0));
		this.defaultBlock = Blocks.STONE.getDefaultState();
		this.defaultFluid = Blocks.AIR.getDefaultState();	//change to woh'ah
	}
	
	@Override
	public int getGroundHeight() {
		return 128;
	}

	public final Registry<Biome> getBiomeRegistry() {
		return this.biomeRegistry;
	}

	@Override
	protected Codec<? extends ChunkGenerator> func_230347_a_() {
		return codecProvider;
	}

	@Override
	public ChunkGenerator func_230349_a_(long seedIn) {
		return this;
	}

	@Override
	public void generateSurface(WorldGenRegion region, IChunk chunk) {
		ChunkPos chunkPos = chunk.getPos();
		int i = chunkPos.x;
		int j = chunkPos.z;
		SharedSeedRandom seedrandom = new SharedSeedRandom();
		seedrandom.setBaseChunkSeed(i, j);
		ChunkPos chunkpos1 = chunk.getPos();
		int k = chunkpos1.getXStart();
		int l = chunkpos1.getZStart();
		double d0 = 0.0625D;
		BlockPos.Mutable mutable = new BlockPos.Mutable();
		for(int m = 0; m< 16; ++m) {
			for(int n=0; n<16; ++n) {
				int o = k + m;
				int p = l + n;
				int q = chunk.getTopBlockY(Heightmap.Type.WORLD_SURFACE_WG, m, n) + 1;
				double d1 = this.surfaceDepthNoise.noiseAt((double)o * d0, (double)p * d0, d0, (double)m * d0) * 15.0D;
				region.getBiome(mutable.setPos(k + m, q, l + n)).buildSurface(seedrandom, chunk, o, p, q, d1, this.defaultBlock, this.defaultFluid, this.getSeaLevel(), region.getSeed());
			}
		}
		
		this.makeBedrock(chunk, seedrandom);
	}

	protected void makeBedrock(IChunk chunk, Random random) {
		BlockPos.Mutable mutable = new BlockPos.Mutable();
		int xStart = chunk.getPos().getXStart();
		int zStart = chunk.getPos().getZStart();
		int floorHeight = 2;
		for(BlockPos pos: BlockPos.getAllInBoxMutable(xStart, 0, zStart, xStart+15, 0, zStart+15)) {
			for(int floorY = 0; floorY <= floorHeight + random.nextInt(2); ++floorY) {
				chunk.setBlockState(mutable.setPos(pos.getX(), floorY, pos.getZ()), Blocks.BEDROCK.getDefaultState(), false);
			}
		}
		
	}

	@Override
	public void func_230352_b_(IWorld iWorld, StructureManager structureManager, IChunk iChunk) {
		//Structure stuff
	}

	@Override
	public int getHeight(int x, int z, Type heightmapType) {
		// flat chunk generator counts the solid blockstates in its list
		// debug chunk generator returns 0
		// the "normal" chunk generator generates a height via noise
		// we can assume that this is what is used to define the "initial" heightmap
		return 0;
	}

	@Override
	public IBlockReader func_230348_a_(int x, int z) {
		// 0 - flat chunk generator returns a reader over its blockstate list
    	// 1 - debug chunk generator returns a reader over an empty array
    	// 2 - normal chunk generator returns a column whose contents are either default block, default fluid, or air
		BlockState[] state = new BlockState[0];
		return new Blockreader(state);
	}
}
