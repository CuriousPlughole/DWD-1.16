import json

registry_name = "gallifrey_stone_slab"
parent_texture = "gallifrey_stone"
subfolder = "gallifrey/"

blockstate = {
    "variants": {
        "type=bottom": { "model": f"dwdimensions:block/{subfolder}{registry_name}" },
        "type=top": { "model": f"dwdimensions:block/{subfolder}{registry_name}_top" },
        "type=double": { "model": f"dwdimensions:block/{subfolder}{parent_texture}" }
    }
}

block_model = {
    "parent": "block/slab",
    "textures": {
        "bottom": f"dwdimensions:blocks/{subfolder}{parent_texture}",
        "top": f"dwdimensions:blocks/{subfolder}{parent_texture}",
        "side": f"dwdimensions:blocks/{subfolder}{parent_texture}"
    }
}

block_model_top = {
    "parent": "block/slab_top",
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

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/models/block/"+subfolder+registry_name+"_top.json", "w") as f:
    json.dump(block_model_top, f, indent=4)
    f.close()

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/models/item/"+registry_name+".json", "w") as f:
    json.dump(item_model, f, indent=4)
    f.close()

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/data/dwdimensions/loot_tables/blocks/"+registry_name+".json", "w") as f:
    json.dump(loot_table, f, indent=4)
    f.close()

print(f".json files for {registry_name} generated!")