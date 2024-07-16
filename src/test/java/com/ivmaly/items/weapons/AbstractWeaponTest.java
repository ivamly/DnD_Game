package com.ivmaly.items.weapons;

import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
import com.ivmaly.items.weapons.properties.WeaponProperty;
import com.ivmaly.utils.Dice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractWeaponTest {
    private TestWeapon weapon;

    @BeforeEach
    public void setUp() {
        weapon = new TestWeapon();
    }

    @Test
    public void testGetProficiency() {
        assertEquals(WeaponProficiency.MARTIAL, weapon.getProficiency());
    }

    @Test
    public void testGetType() {
        assertEquals(WeaponType.MELEE, weapon.getType());
    }

    @Test
    public void testGetDamageType() {
        assertEquals(WeaponDamageType.SLASHING, weapon.getDamageType());
    }

    @Test
    public void testGetDamage() {
        assertEquals(Dice.D6, weapon.getDamage());
    }

    @Test
    public void testSetDamage() {
        Dice newDamage = Dice.D8;
        weapon.setDamage(newDamage);
        assertEquals(newDamage, weapon.getDamage());
    }

    @Test
    public void testAddWeaponProperty() {
        weapon.addWeaponProperty(WeaponProperty.FINESSE);
        assertTrue(weapon.hasWeaponProperty(WeaponProperty.FINESSE));
    }

    @Test
    public void testHasWeaponProperty() {
        assertFalse(weapon.hasWeaponProperty(WeaponProperty.FINESSE));
        weapon.addWeaponProperty(WeaponProperty.FINESSE);
        assertTrue(weapon.hasWeaponProperty(WeaponProperty.FINESSE));
    }

    @Test
    public void testGetWeaponProperties() {
        assertTrue(weapon.getWeaponProperties().isEmpty());
        weapon.addWeaponProperty(WeaponProperty.FINESSE);
        assertEquals(1, weapon.getWeaponProperties().size());
        assertTrue(weapon.getWeaponProperties().containsKey(WeaponProperty.FINESSE));
    }

    private static class TestWeapon extends AbstractWeapon {
        public TestWeapon() {
            super("Sword", new Cost(10, Currency.GOLD), 3.,
                    WeaponProficiency.MARTIAL, WeaponType.MELEE, WeaponDamageType.SLASHING, Dice.D6);
        }
    }
}
