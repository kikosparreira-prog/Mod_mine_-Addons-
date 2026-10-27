package com.frisgui36.dmzcomborank;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/** Server-side combo state. Only accessed from the server thread. */
public final class ComboTracker {

    private static final Map<UUID, State> STATES = new HashMap<>();

    private static final class State {
        int streak;
        long lastHitTick;
    }

    private ComboTracker() {
    }

    private static boolean isExpired(State state, long now) {
        return now - state.lastHitTick > ComboConfig.TIMEOUT_TICKS.get();
    }

    /** Current streak, or 0 if there is none or it already expired. */
    public static int currentStreak(UUID id, long now) {
        State state = STATES.get(id);
        if (state == null || state.streak <= 0 || isExpired(state, now)) {
            return 0;
        }
        return state.streak;
    }

    /** Registers a landed hit and returns the new streak. */
    public static int registerHit(UUID id, long now) {
        State state = STATES.computeIfAbsent(id, key -> new State());
        if (state.streak > 0 && isExpired(state, now)) {
            state.streak = 0;
        }
        state.streak++;
        state.lastHitTick = now;
        return state.streak;
    }

    /** Clears the streak. Returns true if there was an active streak. */
    public static boolean reset(UUID id) {
        State state = STATES.get(id);
        if (state == null || state.streak <= 0) {
            return false;
        }
        state.streak = 0;
        return true;
    }

    /** Clears the streak if it timed out. Returns true if it just expired. */
    public static boolean expire(UUID id, long now) {
        State state = STATES.get(id);
        if (state == null || state.streak <= 0 || !isExpired(state, now)) {
            return false;
        }
        state.streak = 0;
        return true;
    }

    public static void remove(UUID id) {
        STATES.remove(id);
    }
}
