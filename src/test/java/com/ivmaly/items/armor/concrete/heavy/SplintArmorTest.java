package com.ivmaly.items.armor.concrete.heavy;

import com.ivmaly.items.armor.ArmorType;
import com.ivmaly.items.currency.Cost;
import com.ivmaly.items.currency.Currency;
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
