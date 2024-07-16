package com.ivmaly.characters.acts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActManagerTest {

    private ActManager actManager;

    @BeforeEach
    public void setUp() {
        actManager = new ActManager();
    }

    @Test
    public void testSetAndGetAvailableAction() {
        actManager.setAvailableAction(Act.MAIN, 30);
        assertEquals(30, actManager.getAvailableAction(Act.MAIN));
    }

    @Test
    public void testGetDefaultAvailableAction() {
        assertEquals(0, actManager.getAvailableAction(Act.BONUS));
    }

    @Test
    public void testGetAvailableActions() {
        actManager.setAvailableAction(Act.BONUS, 2);
        actManager.setAvailableAction(Act.REACTION, 1);

        Map<Act, Integer> availableActions = actManager.getAvailableActions();

        assertEquals(2, availableActions.get(Act.BONUS));
        assertEquals(1, availableActions.get(Act.REACTION));
    }
}
