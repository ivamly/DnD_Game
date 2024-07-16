package com.ivmaly.characters.conditions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConditionManagerTest {
    private ConditionManager conditionManager;

    @BeforeEach
    public void setUp() {
        conditionManager = new ConditionManager();
    }

    @Test
    public void testAddCondition() {
        Condition condition = Condition.BLINDED;
        conditionManager.addCondition(condition);

        Map<Condition, Boolean> conditions = conditionManager.getConditions();
        assertTrue(conditions.containsKey(condition));
        assertTrue(conditions.get(condition));
    }

    @Test
    public void testRemoveCondition() {
        Condition condition = Condition.PARALYZED;
        conditionManager.addCondition(condition);

        assertTrue(conditionManager.hasCondition(condition));

        conditionManager.removeCondition(condition);

        assertFalse(conditionManager.hasCondition(condition));
    }

    @Test
    public void testHasCondition() {
        Condition condition = Condition.POISONED;
        assertFalse(conditionManager.hasCondition(condition));

        conditionManager.addCondition(condition);

        assertTrue(conditionManager.hasCondition(condition));
    }
}
