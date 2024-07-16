package com.ivmaly.items.armor.concrete.heavy;

import com.ivmaly.items.armor.ArmorType;
import com.ivmaly.items.currency.Cost;
import com.ivmaly.items.currency.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RingMailArmorTest {

    private RingMailArmor armor;

    @BeforeEach
    void setUp() {
        armor = new RingMailArmor();
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Ring Mail Armor", armor.getName());
        assertEquals(ArmorType.HEAVY_ARMOR, armor.getType());
        assertEquals(new Cost(30, Currency.GOLD), armor.getCost());
        assertEquals(14, armor.getBaseArmorClass());
        assertEquals(40.0, armor.getWeight());
    }

    @Test
    public void testCalculateTotalArmorClass() {
        int totalArmorClass = armor.calculateTotalArmorClass();
        assertEquals(14, totalArmorClass);
    }

    @Test
    public void testHasStealthDisadvantage() {
        assertTrue(armor.hasStealthDisadvantage());
    }
}
