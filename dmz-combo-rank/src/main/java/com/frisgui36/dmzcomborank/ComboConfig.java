package com.frisgui36.dmzcomborank;

import net.minecraftforge.common.ForgeConfigSpec;

public final class ComboConfig {

    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.IntValue TIMEOUT_TICKS = BUILDER
            .comment("Ticks without landing a hit before the combo expires (20 ticks = 1 second).")
            .defineInRange("timeoutTicks", 100, 20, 1200);

    public static final ForgeConfigSpec.DoubleValue MAX_DAMAGE_BONUS = BUILDER
            .comment("Damage bonus at the highest rank (0.25 = +25%). Lower ranks scale proportionally.")
            .defineInRange("maxDamageBonus", 0.25D, 0.0D, 2.0D);

    public static final ForgeConfigSpec.BooleanValue RESET_ON_DAMAGE = BUILDER
            .comment("If true, taking damage resets the combo.")
            .define("resetOnDamage", true);

    public static final ForgeConfigSpec.BooleanValue SHOW_ACTIONBAR = BUILDER
            .comment("If true, the combo counter is shown above the hotbar.")
            .define("showActionBar", true);

    public static final ForgeConfigSpec SPEC = BUILDER.build();

    private ComboConfig() {
    }
}
