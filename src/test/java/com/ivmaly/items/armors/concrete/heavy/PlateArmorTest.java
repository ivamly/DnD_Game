package com.ivmaly.items.armors.concrete.heavy;

import com.ivmaly.items.armors.ArmorType;
import com.ivmaly.items.armors.heavy.concrete.PlateArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlateArmorTest {

    private PlateArmor armor;

    @BeforeEach
    void setUp() {
        armor = new PlateArmor();
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Plate Armor", armor.getName());
        assertEquals(ArmorType.HEAVY_ARMOR, armor.getType());
        assertEquals(new Cost(1500, Currency.GOLD), armor.getCost());
        assertEquals(18, armor.getBaseArmorClass());
        assertEquals(65.0, armor.getWeight());
    }

    @Test
    public void testCalculateTotalArmorClass() {
        int totalArmorClass = armor.calculateTotalArmorClass();
        assertEquals(18, totalArmorClass);
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
