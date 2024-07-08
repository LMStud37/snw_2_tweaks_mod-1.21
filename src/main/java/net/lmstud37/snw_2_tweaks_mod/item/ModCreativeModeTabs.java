package net.lmstud37.snw_2_tweaks_mod.item;

import net.lmstud37.snw_2_tweaks_mod.SnW_2_Tweaks_Mod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SnW_2_Tweaks_Mod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SnW_2_Tweaks_Tab = CREATIVE_MODE_TABS.register("snw_2_tweaks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRASS_FLIGHT_CORE.get()))
                    .title(Component.translatable("creativetab.snw_2_tweaks_tab"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        pOutput.accept(ModItems.ELYTRA_FRAGMENT.get());
                        pOutput.accept(ModItems.LEVITITE_ROTOR.get());
                        pOutput.accept(ModItems.COPPER_FLIGHT_CORE.get());
                        pOutput.accept(ModItems.ANDESITE_FLIGHT_CORE.get());
                        pOutput.accept(ModItems.BRASS_FLIGHT_CORE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
