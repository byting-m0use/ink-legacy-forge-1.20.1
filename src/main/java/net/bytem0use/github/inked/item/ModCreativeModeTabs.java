package net.bytem0use.github.inked.item;

import net.bytem0use.github.inked.InkLegacy;
import net.bytem0use.github.inked.init.ModBlocks;
import net.bytem0use.github.inked.init.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InkLegacy.MOD_ID);

    public static final RegistryObject<CreativeModeTab> INKED_ITEMS = CREATIVE_MODE_TABS.register("inked_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GENT_PIPE.get()))
                    .title(Component.translatable("creativetab.inked_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GENT_PIPE.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> INKED_BLOCKS = CREATIVE_MODE_TABS.register("inked_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.INKED_CHAIR.get()))
                    .title(Component.translatable("creativetab.inked_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.INKED_CHAIR.get());
                        pOutput.accept(ModBlocks.BENDY_CUTOUT.get());
                        pOutput.accept(ModBlocks.BENDY_PLUSH.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
