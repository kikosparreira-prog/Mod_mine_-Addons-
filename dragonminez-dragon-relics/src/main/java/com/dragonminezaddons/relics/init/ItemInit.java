package com.dragonminezaddons.relics.init;

import com.dragonminezaddons.relics.DragonMineZRelics;
import com.dragonminezaddons.relics.item.DragonStoneItem;
import com.dragonminezaddons.relics.item.EnhancedSenzuBeanItem;
import com.dragonminezaddons.relics.item.PotaraEarringItem;
import com.dragonminezaddons.relics.item.PowerPoleItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragonMineZRelics.MOD_ID);

    public static final RegistryObject<Item> POTARA_EARRING_LEFT = ITEMS.register(
            "potara_earring_left",
            () -> new PotaraEarringItem(PotaraEarringItem.Side.LEFT, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> POTARA_EARRING_RIGHT = ITEMS.register(
            "potara_earring_right",
            () -> new PotaraEarringItem(PotaraEarringItem.Side.RIGHT, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> POWER_POLE = ITEMS.register(
            "power_pole",
            () -> new PowerPoleItem(new Item.Properties().stacksTo(1).durability(1561)));

    public static final RegistryObject<Item> ENHANCED_SENZU_BEAN = ITEMS.register(
            "enhanced_senzu_bean",
            () -> new EnhancedSenzuBeanItem(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).alwaysEat().build())));

    public static final RegistryObject<Item> DRAGON_STONE = ITEMS.register(
            "dragon_stone",
            () -> new DragonStoneItem(new Item.Properties().stacksTo(7)));

    public static final RegistryObject<Item> TIME_CHAMBER_CORE_ITEM = ITEMS.register(
            "time_chamber_core",
            () -> new BlockItem(BlockInit.TIME_CHAMBER_CORE.get(), new Item.Properties()));
}
