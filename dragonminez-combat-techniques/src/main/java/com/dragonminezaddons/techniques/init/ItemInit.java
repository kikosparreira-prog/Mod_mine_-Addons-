package com.dragonminezaddons.techniques.init;

import com.dragonminezaddons.techniques.DragonMineZTechniques;
import com.dragonminezaddons.techniques.item.TechniqueScrollItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(DragonMineZTechniques.MOD_ID);

    public static final DeferredItem<TechniqueScrollItem> SCROLL_FINAL_FLASH =
            ITEMS.register("technique_scroll_final_flash",
                    () -> new TechniqueScrollItem("final_flash", new Item.Properties().stacksTo(1)));

    public static final DeferredItem<TechniqueScrollItem> SCROLL_SPECIAL_BEAM_CANNON =
            ITEMS.register("technique_scroll_sbc",
                    () -> new TechniqueScrollItem("special_beam_cannon", new Item.Properties().stacksTo(1)));

    public static final DeferredItem<TechniqueScrollItem> SCROLL_SPIRIT_BOMB =
            ITEMS.register("technique_scroll_spirit_bomb",
                    () -> new TechniqueScrollItem("spirit_bomb", new Item.Properties().stacksTo(1)));

    public static final DeferredItem<TechniqueScrollItem> SCROLL_DESTRUCTO_DISC =
            ITEMS.register("technique_scroll_destructo_disc",
                    () -> new TechniqueScrollItem("destructo_disc", new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> KI_CONTROLLER =
            ITEMS.registerSimpleItem("ki_controller", new Item.Properties().stacksTo(1));

    public static final DeferredItem<BlockItem> TRAINING_DUMMY_ITEM =
            ITEMS.registerSimpleBlockItem(BlockInit.TRAINING_DUMMY, new Item.Properties());
}
