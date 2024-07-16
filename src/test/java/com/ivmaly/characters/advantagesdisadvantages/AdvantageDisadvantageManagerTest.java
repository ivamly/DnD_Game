package com.ivmaly.characters.advantagesdisadvantages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class AdvantageDisadvantageManagerTest {

    private AdvantageDisadvantageManager manager;

    @BeforeEach
    public void setUp() {
        manager = new AdvantageDisadvantageManager();
    }

    @Test
    public void testSetAndGetAdvantageDisadvantageEffect() {
        manager.setAdvantageDisadvantageEffect(AdvantageDisadvantage.ADVANTAGE, true);
        assertTrue(manager.isAdvantageDisadvantageEffectActive(AdvantageDisadvantage.ADVANTAGE));
    }

    @Test
    public void testGetDefaultAdvantageDisadvantageEffect() {
        assertFalse(manager.isAdvantageDisadvantageEffectActive(AdvantageDisadvantage.DISADVANTAGE));
    }

    @Test
    public void testGetAdvantageDisadvantageEffects() {
        manager.setAdvantageDisadvantageEffect(AdvantageDisadvantage.DISADVANTAGE, true);
        manager.setAdvantageDisadvantageEffect(AdvantageDisadvantage.ADVANTAGE, true);

        Map<AdvantageDisadvantage, Boolean> effects = manager.getAdvantageDisadvantageEffects();

        assertTrue(effects.get(AdvantageDisadvantage.ADVANTAGE));
        assertTrue(effects.get(AdvantageDisadvantage.DISADVANTAGE));
    }

    @Test
    public void testAdvantageDisadvantageEffectsInitialization() {
        Map<AdvantageDisadvantage, Boolean> effects = manager.getAdvantageDisadvantageEffects();

        for (AdvantageDisadvantage type : AdvantageDisadvantage.values()) {
            assertFalse(effects.getOrDefault(type, false));
        }
    }
}
