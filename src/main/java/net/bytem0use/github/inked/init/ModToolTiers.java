package net.bytem0use.github.inked.init;

import net.bytem0use.github.inked.InkLegacy;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier INK = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_INKED_ITEM, () -> Ingredient.of(ModItems.INK_WELL.get())),
            ResourceLocation.fromNamespaceAndPath(InkLegacy.MOD_ID, "ink_well"), List.of(Tiers.NETHERITE), List.of());
}
