package com.ivmaly.character.acts;

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
        actManager.setAvailableAction(ActType.MAIN, 30);
        assertEquals(30, actManager.getAvailableAction(ActType.MAIN));
    }

    @Test
    public void testGetDefaultAvailableAction() {
        assertEquals(0, actManager.getAvailableAction(ActType.BONUS));
    }

    @Test
    public void testGetAvailableActions() {
        actManager.setAvailableAction(ActType.BONUS, 2);
        actManager.setAvailableAction(ActType.REACTION, 1);

        Map<ActType, Integer> availableActions = actManager.getAvailableActions();

        assertEquals(2, availableActions.get(ActType.BONUS));
        assertEquals(1, availableActions.get(ActType.REACTION));
    }
}
