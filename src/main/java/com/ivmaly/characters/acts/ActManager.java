package com.ivmaly.characters.acts;

import java.util.EnumMap;
import java.util.Map;

public class ActManager {
    private final Map<Act, Integer> availableActions;

    public ActManager() {
        availableActions = new EnumMap<>(Act.class);
    }

    public Map<Act, Integer> getAvailableActions() {
        return availableActions;
    }

    public void setAvailableAction(Act act, int value) {
        availableActions.put(act, value);
    }

    public int getAvailableAction(Act act) {
        return availableActions.getOrDefault(act, 0);
    }
}
