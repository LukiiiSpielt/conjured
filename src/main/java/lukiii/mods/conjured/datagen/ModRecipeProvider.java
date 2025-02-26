package lukiii.mods.conjured.datagen;

import lukiii.mods.conjured.block.ModBlocks;
import lukiii.mods.conjured.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
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
    offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.SPIRIT_IRON_NUGGET, RecipeCategory.MISC, ModItems.SPIRIT_IRON_INGOT);
    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SPIRIT_IRON_LONGSWORD)
                .pattern(" I ")
                .pattern(" I ")
                .pattern("NSN")
                .input('I', ModItems.SPIRIT_IRON_INGOT)
                .input('S', Items.STICK)
                .input('N', ModItems.SPIRIT_IRON_NUGGET)
                .criterion(hasItem(ModItems.SPIRIT_IRON_INGOT), conditionsFromItem(ModItems.SPIRIT_IRON_INGOT))
                .offerTo(recipeExporter);


    }
}
