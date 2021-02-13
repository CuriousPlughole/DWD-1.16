package com.prismmods.dwdimensions.data;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.function.Function;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.prismmods.dwdimensions.DWDimensions;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.state.Property;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

/*
 * Source: https://github.com/WhoCraft/Regeneration/blob/1.16/src/main/java/me/swirtzly/regen/data/BlockstateGen.java
 * Thanks suff!
 */

public class BlockstateGen implements IDataProvider {

	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
	private final DataGenerator generator;
	private HashMap<Property<?>, Function<Block, JsonObject>> serializers = Maps.newHashMap();

	public BlockstateGen(DataGenerator generator) {
		this.generator = generator;

		this.serializers.put(BlockStateProperties.HORIZONTAL_FACING, block -> {
			ResourceLocation key = block.getRegistryName();

			JsonObject variants = new JsonObject();
			for (Direction dir : Direction.Plane.HORIZONTAL) {
				JsonObject dirObj = new JsonObject();

				dirObj.add("model", new JsonPrimitive(key.getNamespace() + ":block/" + key.getPath()));
				dirObj.add("y", new JsonPrimitive((int) getAngleFromFacing(dir)));

				variants.add("facing=" + dir.getName2(), dirObj);
			}
			return variants;
		});
	}

	public static float getAngleFromFacing(Direction dir) {
		if (dir == Direction.NORTH) {
			return 0.0f;
		} else if (dir == Direction.EAST) {
			return 90.0f;
		} else if (dir == Direction.SOUTH) {
			return 180.0f;
		} else {
			return 270.0f;
		}
	}

	public static Path getPath(Path path, Block block) {
		ResourceLocation key = block.getRegistryName();
		return path.resolve("assets/" + key.getNamespace() + "/blockstates/" + key.getPath() + ".json");
	}

	@Override
	public void act(DirectoryCache cache) throws IOException {

		final Path path = this.generator.getOutputFolder();

		for (Block block : ForgeRegistries.BLOCKS) {
			if (block.getRegistryName().getNamespace().equals(DWDimensions.MOD_ID)) {
				
				JsonObject root = this.createBlockState(block);
				IDataProvider.save(GSON, cache, root, getPath(path, block));
				
			}	
		}

	}

	public JsonObject createBlockState(Block block) {

		ResourceLocation key = block.getRegistryName();
		JsonObject root = new JsonObject();
		boolean hasSpecificSerializer = false;

		for (Property<?> prop : this.serializers.keySet()) {
			for (Property<?> otherProp : block.getStateContainer().getProperties()) {
				if (prop == otherProp) {

					root.add("variants", this.serializers.get(prop).apply(block));

					hasSpecificSerializer = true;
					break;
				}
			}
		}

		// Default state
		if (!hasSpecificSerializer) {
			JsonObject obj = new JsonObject();

			JsonObject blank = new JsonObject();
			blank.add("model", new JsonPrimitive(key.getNamespace() + ":block/" + key.getPath()));
			obj.add("", blank);

			root.add("variants", obj);
		}

		return root;
	}

	

	@Override
	public String getName() {
		return "DWD Blockstate generator";
	}

}
