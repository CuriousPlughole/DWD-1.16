import json

registry_name = "gallifrey_stone_stairs"
parent_texture = "gallifrey_stone"
subfolder = "gallifrey/"

blockstate = {
    "variants": {
        "facing=east,half=bottom,shape=straight":  { "model": f"dwdimensions:block/{subfolder}{registry_name}" },
        "facing=west,half=bottom,shape=straight":  { "model": f"dwdimensions:block/{subfolder}{registry_name}", "y": 180, "uvlock": True },
        "facing=south,half=bottom,shape=straight": { "model": f"dwdimensions:block/{subfolder}{registry_name}", "y": 90, "uvlock": True },
        "facing=north,half=bottom,shape=straight": { "model": f"dwdimensions:block/{subfolder}{registry_name}", "y": 270, "uvlock": True },
        "facing=east,half=bottom,shape=outer_right":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer" },
        "facing=west,half=bottom,shape=outer_right":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "y": 180, "uvlock": True },
        "facing=south,half=bottom,shape=outer_right": { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "y": 90, "uvlock": True },
        "facing=north,half=bottom,shape=outer_right": { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "y": 270, "uvlock": True },
        "facing=east,half=bottom,shape=outer_left":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "y": 270, "uvlock": True },
        "facing=west,half=bottom,shape=outer_left":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "y": 90, "uvlock": True },
        "facing=south,half=bottom,shape=outer_left": { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer" },
        "facing=north,half=bottom,shape=outer_left": { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "y": 180, "uvlock": True },
        "facing=east,half=bottom,shape=inner_right":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner" },
        "facing=west,half=bottom,shape=inner_right":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "y": 180, "uvlock": True },
        "facing=south,half=bottom,shape=inner_right": { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "y": 90, "uvlock": True },
        "facing=north,half=bottom,shape=inner_right": { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "y": 270, "uvlock": True },
        "facing=east,half=bottom,shape=inner_left":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "y": 270, "uvlock": True },
        "facing=west,half=bottom,shape=inner_left":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "y": 90, "uvlock": True },
        "facing=south,half=bottom,shape=inner_left": { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner" },
        "facing=north,half=bottom,shape=inner_left": { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "y": 180, "uvlock": True },
        "facing=east,half=top,shape=straight":  { "model": f"dwdimensions:block/{subfolder}{registry_name}", "x": 180, "uvlock": True },
        "facing=west,half=top,shape=straight":  { "model": f"dwdimensions:block/{subfolder}{registry_name}", "x": 180, "y": 180, "uvlock": True },
        "facing=south,half=top,shape=straight": { "model": f"dwdimensions:block/{subfolder}{registry_name}", "x": 180, "y": 90, "uvlock": True },
        "facing=north,half=top,shape=straight": { "model": f"dwdimensions:block/{subfolder}{registry_name}", "x": 180, "y": 270, "uvlock": True },
        "facing=east,half=top,shape=outer_right":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "x": 180, "y": 90, "uvlock": True },
        "facing=west,half=top,shape=outer_right":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "x": 180, "y": 270, "uvlock": True },
        "facing=south,half=top,shape=outer_right": { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "x": 180, "y": 180, "uvlock": True },
        "facing=north,half=top,shape=outer_right": { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "x": 180, "uvlock": True },
        "facing=east,half=top,shape=outer_left":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "x": 180, "uvlock": True },
        "facing=west,half=top,shape=outer_left":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "x": 180, "y": 180, "uvlock": True },
        "facing=south,half=top,shape=outer_left": { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "x": 180, "y": 90, "uvlock": True },
        "facing=north,half=top,shape=outer_left": { "model": f"dwdimensions:block/{subfolder}{registry_name}_outer", "x": 180, "y": 270, "uvlock": True },
        "facing=east,half=top,shape=inner_right":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "x": 180, "y": 90, "uvlock": True },
        "facing=west,half=top,shape=inner_right":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "x": 180, "y": 270, "uvlock": True },
        "facing=south,half=top,shape=inner_right": { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "x": 180, "y": 180, "uvlock": True },
        "facing=north,half=top,shape=inner_right": { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "x": 180, "uvlock": True },
        "facing=east,half=top,shape=inner_left":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "x": 180, "uvlock": True },
        "facing=west,half=top,shape=inner_left":  { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "x": 180, "y": 180, "uvlock": True },
        "facing=south,half=top,shape=inner_left": { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "x": 180, "y": 90, "uvlock": True },
        "facing=north,half=top,shape=inner_left": { "model": f"dwdimensions:block/{subfolder}{registry_name}_inner", "x": 180, "y": 270, "uvlock": True }
    }
}

block_model = {
    "parent": "block/stairs",
    "textures": {
        "bottom": f"dwdimensions:blocks/{subfolder}{parent_texture}",
        "top": f"dwdimensions:blocks/{subfolder}{parent_texture}",
        "side": f"dwdimensions:blocks/{subfolder}{parent_texture}"
    }
}
block_model_inner = {
    "parent": "block/inner_stairs",
    "textures": {
        "bottom": f"dwdimensions:blocks/{subfolder}{parent_texture}",
        "top": f"dwdimensions:blocks/{subfolder}{parent_texture}",
        "side": f"dwdimensions:blocks/{subfolder}{parent_texture}"
    }
}
block_model_outer = {
    "parent": "block/outer_stairs",
    "textures": {
        "bottom": f"dwdimensions:blocks/{subfolder}{parent_texture}",
        "top": f"dwdimensions:blocks/{subfolder}{parent_texture}",
        "side": f"dwdimensions:blocks/{subfolder}{parent_texture}"
    }
}
item_model = {
    "parent": f"dwdimensions:block/{subfolder}{registry_name}"
}

loot_table = {
  "type": "minecraft:block",
  "pools": [
    {
      "rolls": 1,
      "entries": [
        {
          "type": "minecraft:item",
          "name": f"dwdimensions:{registry_name}"
        }
      ],
      "conditions": [
        {
          "condition": "minecraft:survives_explosion"
        }
      ]
    }
  ]
}

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/blockstates/"+registry_name+".json", "w") as f:
    json.dump(blockstate, f, indent=4)
    f.close()

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/models/block/"+subfolder+registry_name+".json", "w") as f:
    json.dump(block_model, f, indent=4)
    f.close()

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/models/block/"+subfolder+registry_name+"_outer.json", "w") as f:
    json.dump(block_model_outer, f, indent=4)
    f.close()

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/models/block/"+subfolder+registry_name+"_inner.json", "w") as f:
    json.dump(block_model_inner, f, indent=4)
    f.close()

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/models/item/"+registry_name+".json", "w") as f:
    json.dump(item_model, f, indent=4)
    f.close()

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/data/dwdimensions/loot_tables/blocks/"+registry_name+".json", "w") as f:
    json.dump(loot_table, f, indent=4)
    f.close()
print(f".json files for {registry_name} generated!")