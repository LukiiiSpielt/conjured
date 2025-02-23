package lukiii.mods.item.custom;

import lukiii.mods.block.ModBlocks;
import net.minecraft.block.AmethystClusterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class ConjurationDustItem extends Item {
    public static final Map<Block, Block> DUST_MAP =
            Map.of(
                    Blocks.AMETHYST_BLOCK, ModBlocks.CORRUPTED_SHARD_BLOCK,
                    Blocks.AMETHYST_CLUSTER, ModBlocks.CORRUPTED_SHARD_CLUSTER

            );

    public ConjurationDustItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        var pos = context.getBlockPos();
        var oldState = world.getBlockState(pos);
        Block clickedBlock = oldState.getBlock();

        if(DUST_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                Block newBlock = DUST_MAP.get(clickedBlock);
                var newState = newBlock.getDefaultState();


                if (oldState.contains(AmethystClusterBlock.FACING)) {
                    newState = newState.with(AmethystClusterBlock.FACING, oldState.get(AmethystClusterBlock.FACING));
                }

                world.setBlockState(pos, newState);
                context.getStack().decrement(1);

                world.playSound(null, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS, 3.0f, 1.0f);
            }
        }

        return ActionResult.SUCCESS;
    }}
