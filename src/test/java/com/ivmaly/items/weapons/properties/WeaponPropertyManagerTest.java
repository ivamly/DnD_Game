package com.ivmaly.items.weapons.properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeaponPropertyManagerTest {
    private WeaponPropertyManager manager;

    @BeforeEach
    public void setUp() {
        manager = new WeaponPropertyManager();
    }

    @Test
    public void testAddAndHasWeaponProperty() {
        manager.addWeaponProperty(WeaponProperty.FINESSE);
        assertTrue(manager.hasWeaponProperty(WeaponProperty.FINESSE));
    }

    @Test
    public void testRemoveWeaponProperty() {
        manager.addWeaponProperty(WeaponProperty.HEAVY);
        assertTrue(manager.hasWeaponProperty(WeaponProperty.HEAVY));
        manager.removeWeaponProperty(WeaponProperty.HEAVY);
        assertFalse(manager.hasWeaponProperty(WeaponProperty.HEAVY));
    }

    @Test
    public void testHasWeaponPropertyDefaultFalse() {
        assertFalse(manager.hasWeaponProperty(WeaponProperty.RANGE));
    }
}
