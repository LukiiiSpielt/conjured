package lukiii.mods.item;

import lukiii.mods.Conjured;
import lukiii.mods.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CONJURED_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Conjured.MOD_ID, "conjured_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.CORRUPTED_SHARD))
                    .displayName(Text.translatable( "itemgroup.conjured.conjured_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CORRUPTED_SHARD);
                        entries.add(ModBlocks.CORRUPTED_SHARD_BLOCK);
                        entries.add(ModBlocks.CORRUPTED_SHARD_CLUSTER);
                        entries.add(ModItems.CONJURATION_DUST);
                    }).build());


    public static void registerItemGroups() {

    }
}

