package net.sohpandaa.geometracoins.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sohpandaa.geometracoins.GeometraCoins;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GeometraCoins.MOD_ID);

    public static final Supplier<CreativeModeTab> GEOMETRA_COINS_TAB = CREATIVE_MODE_TAB.register("geometra_coins_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOLD_COIN.get()))
                    .title(Component.translatable("creativetab.geometracoins.geometra_coins"))
                    .displayItems(
                            (itemDisplayParameters, output) -> {
                                output.accept(ModItems.COIN1);
                                output.accept(ModItems.COIN4);
                                output.accept(ModItems.COIN16);
                                output.accept(ModItems.COIN64);
                                output.accept(ModItems.COIN256);
                                output.accept(ModItems.COPPER_COIN);
                                output.accept(ModItems.IRON_COIN);
                                output.accept(ModItems.GOLD_COIN);
                                output.accept(ModItems.DIAMOND_COIN);
                                output.accept(ModItems.EMERALD_COIN);
                                output.accept(ModItems.NETHERITE_COIN);


                            }
                    )


                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);

    }

}
