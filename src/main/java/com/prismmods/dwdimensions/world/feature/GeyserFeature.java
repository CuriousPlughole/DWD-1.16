package com.prismmods.dwdimensions.world.feature;

import java.util.Random;

import com.mojang.serialization.Codec;
import com.prismmods.dwdimensions.core.init.BlockInit;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap.Type;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ProbabilityConfig;

public class GeyserFeature extends Feature<ProbabilityConfig> {

	public GeyserFeature(Codec<ProbabilityConfig> codec) {
		super(codec);
	}

	@Override
	public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos,
			ProbabilityConfig config) {

		int low = 3;
		int high = 7;
		int radius = rand.nextInt(high - low) + low;
		// radius between low (inclusive) and high (exclusive)

		pos = reader.getHeight(Type.WORLD_SURFACE_WG, pos).up(radius / 5);

		for (int x = pos.getX() - radius; x <= pos.getX() + radius; x++) {
			for (int z = pos.getZ() - radius; z <= pos.getZ() + radius; z++) {
				for (int y = pos.getY() - radius; y <= pos.getY() + radius; y++) {

					int xDist = (x - pos.getX());
					int yDist = (y - pos.getY());
					int zDist = (z - pos.getZ());
					int squareDistance = (xDist * xDist) + (yDist * yDist) + (zDist * zDist);
					// System.out.println(squareDistance);

					if (squareDistance < (radius * radius)) {
						BlockPos blockpos = new BlockPos(x, y, z);
						if (reader.getBlockState(blockpos).getMaterial().isLiquid()) {
							return false;
						} else {
							reader.setBlockState(blockpos, Blocks.AIR.getDefaultState(), 2);
						}
					}

					if (squareDistance == (radius * radius)) {
						for (int i = 0; i < 3; i++) {
							BlockPos blockpos;
							switch (rand.nextInt(3)) {
							case (0):
								blockpos = new BlockPos(x + rand.nextInt(2), y, z + rand.nextInt(2));
							case (1):
								blockpos = new BlockPos(x - rand.nextInt(2), y, z + rand.nextInt(2));
							case (2):
								blockpos = new BlockPos(x + rand.nextInt(2), y, z - rand.nextInt(2));
							case (3):
								blockpos = new BlockPos(x - rand.nextInt(2), y, z - rand.nextInt(2));
							default:
								blockpos = new BlockPos(x + rand.nextInt(2), y, z + rand.nextInt(2));
							}

							// To reduce the number of mid-air spawns. Will still get some due to cave
							// carvers etc
							if (y < reader.getHeight(Type.WORLD_SURFACE_WG, pos).getY()) {
								if (reader.getBlockState(blockpos.down()) != Blocks.AIR.getDefaultState()
										&& (reader.getBlockState(blockpos.east()) != Blocks.AIR.getDefaultState()
												|| reader.getBlockState(blockpos.west()) != Blocks.AIR.getDefaultState()
												|| reader.getBlockState(blockpos.north()) != Blocks.AIR
														.getDefaultState()
												|| reader.getBlockState(blockpos.south()) != Blocks.AIR
														.getDefaultState())) {

									if (rand.nextBoolean()) {
										reader.setBlockState(blockpos,
												BlockInit.SKARO_SULPHUR_ORE.get().getDefaultState(), 2);
									} else {
										reader.setBlockState(blockpos, BlockInit.MERCURY_GEYSER.get().getDefaultState(),
												1);
									}
								}
							}
						}
					}
				}
			}
		}

		return true;
	}

}
