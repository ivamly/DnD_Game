package com.ivmaly.items.armors.concrete.heavy;

import com.ivmaly.items.armors.ArmorType;
import com.ivmaly.items.armors.heavy.concrete.ChainMailArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChainMailArmorTest {

    private ChainMailArmor armor;

    @BeforeEach
    void setUp() {
        armor = new ChainMailArmor();
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Chain Mail Armor", armor.getName());
        assertEquals(ArmorType.HEAVY_ARMOR, armor.getType());
        assertEquals(new Cost(75, Currency.GOLD), armor.getCost());
        assertEquals(16, armor.getBaseArmorClass());
        assertEquals(55.0, armor.getWeight());
    }

    @Test
    public void testCalculateTotalArmorClass() {
        int totalArmorClass = armor.calculateTotalArmorClass();
        assertEquals(16, totalArmorClass);
    }

    @Test
    public void testHasStealthDisadvantage() {
        assertTrue(armor.hasStealthDisadvantage());
    }

    @Test
    public void testGetRequiredStrength() {
        assertEquals(13, armor.getRequiredStrength());
    }
}
