package com.prismmods.dwdimensions.data;

import java.io.IOException;
import java.nio.file.Path;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.prismmods.dwdimensions.DWDimensions;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockItemModelGen implements IDataProvider {

	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
	private final DataGenerator generator;
	
	public BlockItemModelGen(DataGenerator gen) {
		this.generator = gen;
	}
	
	
	@Override
	public void act(DirectoryCache cache) throws IOException {
		
		final Path path = this.generator.getOutputFolder();
		
		for(Item item: ForgeRegistries.ITEMS) {
			if(item.getRegistryName().getNamespace().equals(DWDimensions.MOD_ID) && item instanceof BlockItem) {
				IDataProvider.save(GSON, cache, this.makeItemModel(item), getPath(path, item));
			}
		}	
	}
	
	public JsonObject makeItemModel(Item item) {
		
		ResourceLocation key = item.getRegistryName();
		JsonObject root = new JsonObject();
		
		root.add("parent", new JsonPrimitive(key.getNamespace() + ":block/" + key.getPath()));
		
		return root;
	}
	
	public static Path getPath(Path path, Item item) {
		ResourceLocation key = item.getRegistryName();
		return path.resolve("assets/" + key.getNamespace() + "/models/item/" + key.getPath() + ".json");
	}

	@Override
	public String getName() {
		return "DWD BlockItem Model generator";
	}
	
	

}
