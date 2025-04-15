package net.sohpandaa.geometracoins.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.sohpandaa.geometracoins.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }
    @Override
    protected void buildRecipes(RecipeOutput recipeOutput){

        List<ItemLike> COIN_SMELTABLES = List.of(ModItems.COIN4);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN4.get())
                .pattern("XX")
                .pattern("XX")
                .define('X', ModItems.COIN1)
                .unlockedBy("has_coin_1", has(ModItems.COIN1)).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN16.get())
                .pattern("XX")
                .pattern("XX")
                .define('X', ModItems.COIN4)
                .unlockedBy("has_coin_4", has(ModItems.COIN4)).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN64.get())
                .pattern("XX")
                .pattern("XX")
                .define('X', ModItems.COIN16)
                .unlockedBy("has_coin_16", has(ModItems.COIN16)).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN256.get())
                .pattern("XX")
                .pattern("XX")
                .define('X', ModItems.COIN64)
                .unlockedBy("has_coin_64", has(ModItems.COIN64)).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN1024.get())
                .pattern("XX")
                .pattern("XX")
                .define('X', ModItems.COIN256)
                .unlockedBy("has_coin_256", has(ModItems.COIN256)).save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN1.get(), 4)
                .requires(ModItems.COIN4)
                .unlockedBy("has_coin_4", has(ModItems.COIN4)).save(recipeOutput, "coin4_to_coin1");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN4.get(), 4)
                .requires(ModItems.COIN16)
                .unlockedBy("has_coin_16", has(ModItems.COIN4)).save(recipeOutput, "coin16_to_coin4");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN16.get(), 4)
                .requires(ModItems.COIN64)
                .unlockedBy("has_coin_64", has(ModItems.COIN64)).save(recipeOutput, "coin64_to_coin16");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN64.get(), 4)
                .requires(ModItems.COIN256)
                .unlockedBy("has_coin_256", has(ModItems.COIN256)).save(recipeOutput, "coin256_to_coin64");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN256.get(), 4)
                .requires(ModItems.COIN1024)
                .unlockedBy("has_coin_1024", has(ModItems.COIN1024)).save(recipeOutput, "coin1024_to_coin256");


        oreBlasting(recipeOutput, COIN_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET, 0.25f,200,"coin");



    }


}


