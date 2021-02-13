import json

blocks_to_add = ["gallifrey_stone", "gallifrey_stone_stairs", "gallifrey_stone_wall", "gallifrey_stone_slab"]
subfolder= "gallifrey/" #eg "gallifrey/" Dont forget the / at the end!!!

for registry_name in blocks_to_add:
    blockstate = {
    	"variants": {
    		"": {"model": f"dwdimensions:block/{subfolder}{registry_name}"}
    	}
    }

    block_model = {
        "parent": "block/cube_all",
        "textures": {
            "all": f"dwdimensions:blocks/{subfolder}{registry_name}"
        }
    }

    item_model = {
    	"parent": f"dwdimensions:block/{subfolder}{registry_name}"
    }

    loot_table = {
      "type": "minecraft:block",
      "pools": [
        {
          "rolls": 1.0,
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

    with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/assets/dwdimensions/models/item/"+registry_name+".json", "w") as f:
        json.dump(item_model, f, indent=4)
        f.close()

    with open("D:/Coding/Java/Minecraft Modding/DWD 1.16/src/main/resources/data/dwdimensions/loot_tables/blocks/"+registry_name+".json", "w") as f:
        json.dump(loot_table, f, indent=4)
        f.close()

    print(f".json files for {registry_name} generated!")
