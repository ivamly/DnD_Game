package com.ivmaly.characters.abilities;

import java.util.EnumMap;
import java.util.Map;

public class AbilityManager {
    private final Map<Ability, Integer> abilityScores;

    public AbilityManager() {
        this.abilityScores = new EnumMap<>(Ability.class);
    }

    public Map<Ability, Integer> getAbilities() {
        return abilityScores;
    }

    public void setAbilityScore(Ability ability, int score) {
        abilityScores.put(ability, score);
    }

    public int getAbilityScore(Ability ability) {
        return abilityScores.getOrDefault(ability, 0);
    }

    public int getAbilityModifier(Ability ability) {
        return Math.floorDiv(getAbilityScore(ability) - 10, 2);
    }
}