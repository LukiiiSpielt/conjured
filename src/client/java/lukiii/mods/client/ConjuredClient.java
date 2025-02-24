package lukiii.mods.client;

import lukiii.mods.conjured.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ConjuredClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORRUPTED_SHARD_CLUSTER, RenderLayer.getCutout());

    }
}
