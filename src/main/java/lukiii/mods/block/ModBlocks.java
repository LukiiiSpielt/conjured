package lukiii.mods.block;

import lukiii.mods.Conjured;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AmethystClusterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CORRUPTED_SHARD_CLUSTER = registerBlock("corrupted_shard_cluster",
            new AmethystClusterBlock(7.0F,3.0F,AbstractBlock.Settings.create()
                    .solid()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                    .strength(1F)
                    .luminance(state -> 5)
                    .requiresTool()
                    .pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block CORRUPTED_SHARD_BLOCK = registerBlock("corrupted_shard_block",
            new Block(AbstractBlock.Settings.create().strength(1.5f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));







    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Conjured.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Conjured.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks(){

    }
}
