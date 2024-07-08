package net.lmstud37.snw_2_tweaks_mod.item;

import net.lmstud37.snw_2_tweaks_mod.SnW_2_Tweaks_Mod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SnW_2_Tweaks_Mod.MOD_ID);

    public static final RegistryObject<Item> ANDESITE_FLIGHT_CORE = ITEMS.register("andesite_flight_core",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRASS_FLIGHT_CORE = ITEMS.register("brass_flight_core",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_FLIGHT_CORE = ITEMS.register("copper_flight_core",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ELYTRA_FRAGMENT = ITEMS.register("elytra_fragment",
        ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEVITITE_ROTOR = ITEMS.register("levitite_rotor",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
