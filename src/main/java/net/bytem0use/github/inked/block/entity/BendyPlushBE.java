package net.bytem0use.github.inked.block.entity;

import net.bytem0use.github.inked.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BendyPlushBE extends BlockEntity {

    public BendyPlushBE(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.BENDY_PLUSH_BE.get(), pPos, pBlockState);
    }
}
