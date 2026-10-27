package com.dragonminezaddons.sayanarmor.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;

public class SaiyanArmorItem extends ArmorItem {

    public static final ArmorMaterial SAIYAN_ARMOR = new ArmorMaterial() {
        private final int[] PROTECTION = {3, 6, 7, 3};
        public int getDurabilityForType(Type t) { return new int[]{13,15,16,11}[t.ordinal()] * 30; }
        public int getDefenseForType(Type t) { return PROTECTION[t.ordinal()]; }
        public int getEnchantmentValue() { return 12; }
        public SoundEvent getEquipSound() { return SoundEvents.ARMOR_EQUIP_NETHERITE; }
        public Ingredient getRepairIngredient() { return Ingredient.of(Items.IRON_INGOT); }
        public String getName() { return "dmz_saiyan_armor:saiyan"; }
        public float getToughness() { return 2.0f; }
        public float getKnockbackResistance() { return 0.1f; }
    };

    public static final ArmorMaterial FRIEZA_ARMOR = new ArmorMaterial() {
        private final int[] PROTECTION = {4, 7, 8, 4};
        public int getDurabilityForType(Type t) { return new int[]{13,15,16,11}[t.ordinal()] * 33; }
        public int getDefenseForType(Type t) { return PROTECTION[t.ordinal()]; }
        public int getEnchantmentValue() { return 14; }
        public SoundEvent getEquipSound() { return SoundEvents.ARMOR_EQUIP_NETHERITE; }
        public Ingredient getRepairIngredient() { return Ingredient.of(Items.DIAMOND); }
        public String getName() { return "dmz_saiyan_armor:frieza"; }
        public float getToughness() { return 3.0f; }
        public float getKnockbackResistance() { return 0.15f; }
    };

    public SaiyanArmorItem(ArmorMaterial material, Type type, Properties props) {
        super(material, type, props);
    }

    @Override
    public boolean isFoil(net.minecraft.world.item.ItemStack stack) { return true; }
}
