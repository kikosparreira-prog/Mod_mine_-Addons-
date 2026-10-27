package com.frisgui36.dmzcomborank;

public enum ComboRank {
    NONE("-", 0),
    D("D", 3),
    C("C", 8),
    B("B", 15),
    A("A", 25),
    S("S", 40),
    SS("SS", 60);

    private final String label;
    private final int threshold;

    ComboRank(String label, int threshold) {
        this.label = label;
        this.threshold = threshold;
    }

    public String label() {
        return label;
    }

    public static ComboRank forStreak(int streak) {
        ComboRank result = NONE;
        for (ComboRank rank : values()) {
            if (streak >= rank.threshold) {
                result = rank;
            }
        }
        return result;
    }

    /** Damage bonus as a fraction (0.10 = +10%), scaled linearly up to maxBonus at the top rank. */
    public double bonus(double maxBonus) {
        return maxBonus * this.ordinal() / (values().length - 1);
    }
}
