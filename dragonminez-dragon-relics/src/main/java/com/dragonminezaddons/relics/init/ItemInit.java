package com.dragonminezaddons.relics.init;

import com.dragonminezaddons.relics.DragonMineZRelics;
import com.dragonminezaddons.relics.item.EnhancedSenzuBeanItem;
import com.dragonminezaddons.relics.item.PotaraEarringItem;
import com.dragonminezaddons.relics.item.PowerPoleItem;
import com.dragonminezaddons.relics.item.DragonStoneItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(DragonMineZRelics.MOD_ID);

    public static final DeferredItem<PotaraEarringItem> POTARA_EARRING_LEFT =
            ITEMS.register("potara_earring_left",
                    () -> new PotaraEarringItem(PotaraEarringItem.Side.LEFT,
                            new Item.Properties().stacksTo(1)));

    public static final DeferredItem<PotaraEarringItem> POTARA_EARRING_RIGHT =
            ITEMS.register("potara_earring_right",
                    () -> new PotaraEarringItem(PotaraEarringItem.Side.RIGHT,
                            new Item.Properties().stacksTo(1)));

    public static final DeferredItem<PowerPoleItem> POWER_POLE =
            ITEMS.register("power_pole",
                    () -> new PowerPoleItem(new Item.Properties()
                            .stacksTo(1)
                            .durability(1561)));

    public static final DeferredItem<EnhancedSenzuBeanItem> ENHANCED_SENZU_BEAN =
            ITEMS.register("enhanced_senzu_bean",
                    () -> new EnhancedSenzuBeanItem(new Item.Properties()
                            .stacksTo(16)
                            .food(new net.minecraft.world.food.FoodProperties.Builder()
                                    .nutrition(20)
                                    .saturationModifier(20.0f)
                                    .alwaysEdible()
                                    .build())));

    public static final DeferredItem<DragonStoneItem> DRAGON_STONE =
            ITEMS.register("dragon_stone",
                    () -> new DragonStoneItem(new Item.Properties().stacksTo(7)));

    public static final DeferredItem<BlockItem> TIME_CHAMBER_CORE_ITEM =
            ITEMS.registerSimpleBlockItem(BlockInit.TIME_CHAMBER_CORE, new Item.Properties());
}
