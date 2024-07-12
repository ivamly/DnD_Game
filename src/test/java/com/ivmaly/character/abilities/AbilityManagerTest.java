package com.ivmaly.character.abilities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbilityManagerTest {

    private AbilityManager abilityManager;

    @BeforeEach
    public void setUp() {
        abilityManager = new AbilityManager();
    }

    @Test
    public void testSetAndGetAbilityScore() {
        abilityManager.setAbilityScore(Ability.STRENGTH, 16);
        assertEquals(16, abilityManager.getAbilityScore(Ability.STRENGTH));
    }

    @Test
    public void testGetDefaultAbilityScore() {
        assertEquals(0, abilityManager.getAbilityScore(Ability.DEXTERITY));
    }

    @Test
    public void testGetAbilityModifier() {
        abilityManager.setAbilityScore(Ability.CONSTITUTION, 15);
        assertEquals(2, abilityManager.getAbilityModifier(Ability.CONSTITUTION));
    }

    @Test
    public void testGetAbilities() {
        abilityManager.setAbilityScore(Ability.INTELLIGENCE, 12);
        abilityManager.setAbilityScore(Ability.WISDOM, 10);
        Map<Ability, Integer> abilities = abilityManager.getAbilities();
        assertEquals(12, abilities.get(Ability.INTELLIGENCE));
        assertEquals(10, abilities.get(Ability.WISDOM));
    }
}
