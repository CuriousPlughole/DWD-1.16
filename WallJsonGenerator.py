import json

registry_name = "gallifrey_stone_wall"
parent_texture = "gallifrey_stone"
subfolder = "gallifrey/"

blockstate = {
  "multipart": [
    {
      "when": {
        "up": "true"
      },
      "apply": {
        "model": f"dwdimensions:block/{subfolder}{registry_name}_post"
      }
    },
    {
      "when": {
        "north": "low"
      },
      "apply": {
        "model": f"dwdimensions:block/{subfolder}{registry_name}_side",
        "uvlock": True
      }
    },
    {
      "when": {
        "east": "low"
      },
      "apply": {
        "model": f"dwdimensions:block/{subfolder}{registry_name}_side",
        "y": 90,
        "uvlock": True
      }
    },
    {
      "when": {
        "south": "low"
      },
      "apply": {
        "model": f"dwdimensions:block/{subfolder}{registry_name}_side",
        "y": 180,
        "uvlock": True
      }
    },
    {
      "when": {
        "west": "low"
      },
      "apply": {
        "model": f"dwdimensions:block/{subfolder}{registry_name}_side",
        "y": 270,
        "uvlock": True
      }
    },
    {
      "when": {
        "north": "tall"
      },
      "apply": {
        "model": f"dwdimensions:block/{subfolder}{registry_name}_side_tall",
        "uvlock": True
      }
    },
    {
      "when": {
        "east": "tall"
      },
      "apply": {
        "model": f"dwdimensions:block/{subfolder}{registry_name}_side_tall",
        "y": 90,
        "uvlock": True
      }
    },
    {
      "when": {
        "south": "tall"
      },
      "apply": {
        "model": f"dwdimensions:block/{subfolder}{registry_name}_side_tall",
        "y": 180,
        "uvlock": True
      }
    },
    {
      "when": {
        "west": "tall"
      },
      "apply": {
        "model": f"dwdimensions:block/{subfolder}{registry_name}_side_tall",
        "y": 270,
        "uvlock": True
      }
    }
  ]
}

block_model_side = {
    "parent": "block/template_wall_side",
    "textures": {
        "wall": f"dwdimensions:blocks/{subfolder}{parent_texture}"
    }
}

block_model_side_tall = {
    "parent": "block/template_wall_side_tall",
    "textures": {
        "wall": f"dwdimensions:blocks/{subfolder}{parent_texture}"
    }
}

block_model_post = {
    "parent": "block/template_wall_post",
    "textures": {
        "wall": f"dwdimensions:blocks/{subfolder}{parent_texture}"
    }
}
block_model_inventory = {
    "parent": "block/wall_inventory",
    "textures": {
        "wall": f"dwdimensions:blocks/{subfolder}{parent_texture}"
    }
}
item_model = {
    "parent": f"dwdimensions:block/{subfolder}{registry_name}_inventory"
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

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/models/block/"+subfolder+registry_name+"_side.json", "w") as f:
    json.dump(block_model_side, f, indent=4)
    f.close()

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/models/block/"+subfolder+registry_name+"_side_tall.json", "w") as f:
    json.dump(block_model_side_tall, f, indent=4)
    f.close()

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/models/block/"+subfolder+registry_name+"_post.json", "w") as f:
    json.dump(block_model_post, f, indent=4)
    f.close()

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/models/block/"+subfolder+registry_name+"_inventory.json", "w") as f:
    json.dump(block_model_inventory, f, indent=4)
    f.close()

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/models/item/"+registry_name+".json", "w") as f:
    json.dump(item_model, f, indent=4)
    f.close()

with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/data/dwdimensions/loot_tables/blocks/"+registry_name+".json", "w") as f:
    json.dump(loot_table, f, indent=4)
    f.close()

print(f".json files for {registry_name} generated!")
