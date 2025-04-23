package net.sohpandaa.geometracoins.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sohpandaa.geometracoins.GeometraCoins;
import net.sohpandaa.geometracoins.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GeometraCoins.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.COIN1.get());
        basicItem(ModItems.COIN4.get());
        basicItem(ModItems.COIN16.get());
        basicItem(ModItems.COIN64.get());
        basicItem(ModItems.COIN256.get());
        basicItem(ModItems.COPPER_COIN.get());
        basicItem(ModItems.IRON_COIN.get());
        basicItem(ModItems.GOLD_COIN.get());
        basicItem(ModItems.DIAMOND_COIN.get());
        basicItem(ModItems.EMERALD_COIN.get());
        basicItem(ModItems.NETHERITE_COIN.get());

    }
}
