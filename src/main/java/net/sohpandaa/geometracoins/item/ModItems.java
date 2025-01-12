package net.sohpandaa.geometracoins.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sohpandaa.geometracoins.GeometraCoins;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GeometraCoins.MOD_ID);

    public static final DeferredItem<Item> COIN1 = ITEMS.register("coin1",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN5 = ITEMS.register("coin5",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN10 = ITEMS.register("coin10",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN20 = ITEMS.register("coin20",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN50 = ITEMS.register("coin50",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN100 = ITEMS.register("coin100",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
