package lukiii.mods.conjured;

import lukiii.mods.conjured.block.ModBlocks;
import lukiii.mods.conjured.effect.ModEffects;
import lukiii.mods.conjured.entity.ModEntities;
import lukiii.mods.conjured.item.ModItemGroups;
import lukiii.mods.conjured.item.ModItems;
import lukiii.mods.conjured.potion.ModPotions;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.potion.Potions;


public class Conjured implements ModInitializer {
    public static final String MOD_ID = "conjured";


    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModEffects.registerEffects();
        ModPotions.registerPotions();
        ModEntities.registerModEntities();

        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(Potions.AWKWARD, ModItems.CORRUPTED_SHARD, ModPotions.SPECTRAL_SIGHT_POTION);

        });
    }

}

