package com.ivmaly.items.armors.concrete.light;

import com.ivmaly.items.armors.ArmorType;
import com.ivmaly.items.armors.light.concrete.PaddedArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaddedArmorTest {

    private PaddedArmor armor;

    @BeforeEach
    void setUp() {
        armor = new PaddedArmor();
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Padded Armor", armor.getName());
        assertEquals(ArmorType.LIGHT_ARMOR, armor.getType());
        assertEquals(new Cost(5, Currency.GOLD), armor.getCost());
        assertEquals(11, armor.getBaseArmorClass());
        assertEquals(8.0, armor.getWeight());
    }

    @Test
    public void testCalculateTotalArmorClass_NoModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(0);
        assertEquals(11, totalArmorClass);
    }

    @Test
    public void testCalculateTotalArmorClass_PositiveModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(2);
        assertEquals(13, totalArmorClass);
    }

    @Test
    public void testCalculateTotalArmorClass_NegativeModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(-1);
        assertEquals(10, totalArmorClass);
    }

    @Test
    public void testHasStealthDisadvantage() {
        assertTrue(armor.hasStealthDisadvantage());
    }
}
