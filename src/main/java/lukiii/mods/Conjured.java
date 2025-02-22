package lukiii.mods;

import lukiii.mods.block.ModBlocks;
import lukiii.mods.item.ModItems;
import net.fabricmc.api.ModInitializer;


public class Conjured implements ModInitializer {
    public static final String MOD_ID = "conjured";


    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }

}

