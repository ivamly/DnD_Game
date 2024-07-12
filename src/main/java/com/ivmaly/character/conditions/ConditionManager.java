package com.ivmaly.character.conditions;

import com.ivmaly.character.AbstractCharacter;
import com.ivmaly.character.conditions.effects.ConditionEffect;

import java.util.HashMap;
import java.util.Map;

public class ConditionManager {
    private final Map<Condition, ConditionEffect> conditions;

    public ConditionManager() {
        this.conditions = new HashMap<>();
    }

    public Map<Condition, ConditionEffect> getConditions() {
        return conditions;
    }

    public void addCondition(Condition condition, ConditionEffect effect, AbstractCharacter character) {
        conditions.put(condition, effect);
        effect.applyEffect(character);
    }

    public void removeCondition(Condition condition, AbstractCharacter character) {
        ConditionEffect effect = conditions.remove(condition);
        effect.removeEffect(character);
    }

    public boolean hasCondition(Condition condition) {
        return conditions.containsKey(condition);
    }
}
