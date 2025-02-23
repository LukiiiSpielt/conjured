package lukiii.mods.datagen;

import lukiii.mods.block.ModBlocks;
import lukiii.mods.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

    offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CORRUPTED_SHARD_BLOCK, ModItems.CORRUPTED_SHARD);
    ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CONJURATION_DUST, 4)
                .input(Items.AMETHYST_SHARD)
                .input(Items.BONE_MEAL)
                .input(Items.PHANTOM_MEMBRANE)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(recipeExporter);



    }
}
