package com.ivmaly.characters.conditions;

import java.util.EnumMap;
import java.util.Map;

public class ConditionManager {
    private final Map<Condition, Boolean> conditions;

    public ConditionManager() {
        this.conditions = new EnumMap<>(Condition.class);
    }

    public Map<Condition, Boolean> getConditions() {
        return conditions;
    }

    public void addCondition(Condition condition) {
        conditions.put(condition, true);
    }

    public void removeCondition(Condition condition) {
        conditions.put(condition, false);
    }

    public boolean hasCondition(Condition condition) {
        return conditions.getOrDefault(condition, false);
    }
}
