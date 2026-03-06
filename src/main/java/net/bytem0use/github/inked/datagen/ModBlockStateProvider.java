package net.bytem0use.github.inked.datagen;

import net.bytem0use.github.inked.InkLegacy;
import net.bytem0use.github.inked.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, InkLegacy.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlockWithItem(ModBlocks.INKED_CHAIR.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/chair")));

        simpleBlockWithItem(ModBlocks.BENDY_CUTOUT.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/bendy_cutout")));

        simpleBlockWithItem(ModBlocks.BENDY_PLUSH.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/bendy_plush")));

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
