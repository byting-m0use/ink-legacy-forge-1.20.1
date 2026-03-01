package net.bytem0use.github.inked.init;

import net.bytem0use.github.inked.InkLegacy;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InkLegacy.MOD_ID);

    public static final RegistryObject<Item> INK_WELL = ITEMS.register("ink_well",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> GENT_PIPE = ITEMS.register("gent_pipe",
            () -> new Item(new Item.Properties().stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
