package net.bytem0use.github.inked.init;

import net.bytem0use.github.inked.InkLegacy;
import net.bytem0use.github.inked.block.BendyCutoutBlock;
import net.bytem0use.github.inked.block.InkedChairBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, InkLegacy.MOD_ID);

    public static final RegistryObject<Block> INKED_CHAIR = registerBlock("inked_chair",
            () -> new InkedChairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()));

    public static final RegistryObject<Block> BENDY_CUTOUT = registerBlock("bendy_cutout",
            () -> new BendyCutoutBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
