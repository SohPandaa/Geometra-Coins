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

        List<ItemLike> IRON_COIN_SMELTABLES = List.of(ModItems.IRON_COIN);
        List<ItemLike> GOLD_COIN_SMELTABLES = List.of(ModItems.GOLD_COIN);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_COIN.get())
                        .pattern("xx")
                        .pattern("xx")
                        .define('x', ModItems.COPPER_COIN)
                        .unlockedBy("has_copper_coin",has(ModItems.COPPER_COIN)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_COIN.get())
                .pattern("xx")
                .pattern("xx")
                .define('x', ModItems.IRON_COIN)
                .unlockedBy("has_iron_coin",has(ModItems.IRON_COIN)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_COIN.get())
                .pattern("xx")
                .pattern("xx")
                .define('x', ModItems.GOLD_COIN)
                .unlockedBy("has_gold_coin",has(ModItems.GOLD_COIN)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_COIN.get())
                .pattern("xx")
                .pattern("xx")
                .define('x', ModItems.DIAMOND_COIN)
                .unlockedBy("has_diamond_coin",has(ModItems.DIAMOND_COIN)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHERITE_COIN.get())
                .pattern("xx")
                .pattern("xx")
                .define('x', ModItems.EMERALD_COIN)
                .unlockedBy("has_emerald_coin",has(ModItems.EMERALD_COIN)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COPPER_COIN.get(), 4)
                .requires(ModItems.IRON_COIN)
                .unlockedBy("has_iron_coin", has(ModItems.IRON_COIN)).save(recipeOutput, "iron_coin_to_copper_coin");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IRON_COIN.get(), 4)
                .requires(ModItems.GOLD_COIN)
                .unlockedBy("has_gold_coin", has(ModItems.GOLD_COIN)).save(recipeOutput, "gold_coin_to_iron_coin");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GOLD_COIN.get(), 4)
                .requires(ModItems.DIAMOND_COIN)
                .unlockedBy("has_diamond_coin", has(ModItems.DIAMOND_COIN)).save(recipeOutput, "diamond_coin_to_gold_coin");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_COIN.get(), 4)
                .requires(ModItems.EMERALD_COIN)
                .unlockedBy("has_emerald_coin", has(ModItems.EMERALD_COIN)).save(recipeOutput, "emerald_coin_to_diamond_coin");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EMERALD_COIN.get(), 4)
                .requires(ModItems.NETHERITE_COIN)
                .unlockedBy("has_netherite_coin", has(ModItems.NETHERITE_COIN)).save(recipeOutput, "netherite_coin_to_emerald_coin");



        oreBlasting(recipeOutput, IRON_COIN_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET, 0.25f,200,"coin");
        oreBlasting(recipeOutput, GOLD_COIN_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.25f,200,"coin");



    }


}


