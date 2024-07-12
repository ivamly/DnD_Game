package com.ivmaly.character.acts;

import java.util.EnumMap;
import java.util.Map;

public class ActManager {
    private final Map<ActType, Integer> availableActions;

    public ActManager() {
        availableActions = new EnumMap<>(ActType.class);
    }

    public Map<ActType, Integer> getAvailableActions() {
        return availableActions;
    }

    public void setAvailableAction(ActType actType, int value) {
        availableActions.put(actType, value);
    }

    public int getAvailableAction(ActType actType) {
        return availableActions.getOrDefault(actType, 0);
    }
}
