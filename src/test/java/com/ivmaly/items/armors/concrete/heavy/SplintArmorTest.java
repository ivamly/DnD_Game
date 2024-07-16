package com.ivmaly.items.armors.concrete.heavy;

import com.ivmaly.items.armors.ArmorType;
import com.ivmaly.items.armors.heavy.concrete.SplintArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SplintArmorTest {

    private SplintArmor armor;

    @BeforeEach
    void setUp() {
        armor = new SplintArmor();
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Splint Armor", armor.getName());
        assertEquals(ArmorType.HEAVY_ARMOR, armor.getType());
        assertEquals(new Cost(200, Currency.GOLD), armor.getCost());
        assertEquals(17, armor.getBaseArmorClass());
        assertEquals(60.0, armor.getWeight());
    }

    @Test
    public void testCalculateTotalArmorClass() {
        int totalArmorClass = armor.calculateTotalArmorClass();
        assertEquals(17, totalArmorClass);
    }

    @Test
    public void testHasStealthDisadvantage() {
        assertTrue(armor.hasStealthDisadvantage());
    }

    @Test
    public void testGetRequiredStrength() {
        assertEquals(15, armor.getRequiredStrength());
    }
}
