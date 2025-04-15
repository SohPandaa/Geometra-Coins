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
    public static final DeferredItem<Item> COIN4 = ITEMS.register("coin4",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN16 = ITEMS.register("coin16",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN64 = ITEMS.register("coin64",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN256 = ITEMS.register("coin256",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN1024 = ITEMS.register("coin1024",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
