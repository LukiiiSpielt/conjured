package lukiii.mods.conjured.item;

import lukiii.mods.conjured.Conjured;
import lukiii.mods.conjured.entity.ModEntities;
import lukiii.mods.conjured.item.custom.ConjurationDustItem;
import net.minecraft.item.Item;

import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CORRUPTED_SHARD = registerItem("corrupted_shard", new Item(new Item.Settings()));
    public  static final Item CONJURATION_DUST = registerItem("conjuration_dust", new ConjurationDustItem(new Item.Settings()));
    public static final Item GHOST_SPAWN_EGG = registerItem("ghost_spawn_egg", new SpawnEggItem(
            ModEntities.GHOST, 11075584,5915296, new Item.Settings()
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Conjured.MOD_ID, name), item);
    }

    public static void registerModItems() {


    }

}
