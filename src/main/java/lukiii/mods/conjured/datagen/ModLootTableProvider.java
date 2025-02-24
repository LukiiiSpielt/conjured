package lukiii.mods.conjured.datagen;

import lukiii.mods.conjured.block.ModBlocks;
import lukiii.mods.conjured.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CORRUPTED_SHARD_BLOCK);
        addDrop(ModBlocks.CORRUPTED_SHARD_CLUSTER, oreDrops(ModBlocks.CORRUPTED_SHARD_CLUSTER, ModItems.CORRUPTED_SHARD));
    }
}
