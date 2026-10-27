package com.dragonminezaddons.spiritpower.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SpiritOrbItem extends Item {
    public SpiritOrbItem(Properties props) { super(props); }

    @Override
    public boolean isFoil(ItemStack stack) { return true; }
}
