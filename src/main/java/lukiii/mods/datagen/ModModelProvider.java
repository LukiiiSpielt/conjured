package lukiii.mods.datagen;

import lukiii.mods.block.ModBlocks;
import lukiii.mods.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CORRUPTED_SHARD_BLOCK);
        blockStateModelGenerator.registerAmethyst(ModBlocks.CORRUPTED_SHARD_CLUSTER);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CORRUPTED_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModBlocks.CORRUPTED_SHARD_CLUSTER.asItem(), Models.GENERATED);


    }
}
