package com.dragonminezaddons.techniques.init;

import com.dragonminezaddons.techniques.DragonMineZTechniques;
import com.dragonminezaddons.techniques.item.TechniqueScrollItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragonMineZTechniques.MOD_ID);

    public static final RegistryObject<Item> TECHNIQUE_SCROLL_FINAL_FLASH = ITEMS.register(
            "technique_scroll_final_flash",
            () -> new TechniqueScrollItem("final_flash", new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TECHNIQUE_SCROLL_SBC = ITEMS.register(
            "technique_scroll_sbc",
            () -> new TechniqueScrollItem("super_big_bang_cannon", new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TECHNIQUE_SCROLL_SPIRIT_BOMB = ITEMS.register(
            "technique_scroll_spirit_bomb",
            () -> new TechniqueScrollItem("spirit_bomb", new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TECHNIQUE_SCROLL_DESTRUCTO_DISC = ITEMS.register(
            "technique_scroll_destructo_disc",
            () -> new TechniqueScrollItem("destructo_disc", new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> KI_CONTROLLER = ITEMS.register(
            "ki_controller",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TRAINING_DUMMY_ITEM = ITEMS.register(
            "training_dummy",
            () -> new BlockItem(BlockInit.TRAINING_DUMMY.get(), new Item.Properties()));
}
