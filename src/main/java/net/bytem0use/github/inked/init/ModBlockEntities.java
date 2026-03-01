package net.bytem0use.github.inked.init;

import net.bytem0use.github.inked.InkLegacy;
import net.bytem0use.github.inked.block.entity.CustomBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, InkLegacy.MOD_ID);

    public static final RegistryObject<BlockEntityType<CustomBlockEntity>> INKED_CHAIR_BE =
            BLOCK_ENTITIES.register("inked_chair_be", () ->
                    BlockEntityType.Builder.of(CustomBlockEntity::new,
                            ModBlocks.INKED_CHAIR.get()).build(null));

    public static final RegistryObject<BlockEntityType<CustomBlockEntity>> BENDY_CUTOUT_BE =
            BLOCK_ENTITIES.register("bendy_cutout_be", () ->
                    BlockEntityType.Builder.of(CustomBlockEntity::new,
                            ModBlocks.BENDY_CUTOUT.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
