package net.bytem0use.github.inked.block.entity;

import net.bytem0use.github.inked.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CustomBlockEntity extends BlockEntity {

    public CustomBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.INKED_CHAIR_BE.get(), pPos, pBlockState);
    }
}
