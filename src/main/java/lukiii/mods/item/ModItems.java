package lukiii.mods.item;

import lukiii.mods.Conjured;
import lukiii.mods.item.custom.ConjurationDustItem;
import net.minecraft.item.Item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CORRUPTED_SHARD = registerItem("corrupted_shard", new Item(new Item.Settings()));
    public  static final Item CONJURATION_DUST = registerItem("conjuration_dust", new ConjurationDustItem(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Conjured.MOD_ID, name), item);
    }

    public static void registerModItems() {


    }

}
