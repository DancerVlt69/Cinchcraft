package com.cinchtail.cinchcraft.item.custom;

import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class ModWoodenSlabItem extends ItemNameBlockItem {
    public ModWoodenSlabItem(Block block, Properties properties) {
        super(block, properties);
    }
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 100;
    }
}

