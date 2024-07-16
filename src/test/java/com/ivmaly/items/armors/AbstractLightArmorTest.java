package com.ivmaly.items.armors;

import com.ivmaly.items.armors.light.AbstractLightArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractLightArmorTest {

    private AbstractLightArmor armor;

    @BeforeEach
    void setUp() {
        String name = "Test Armor";
        Cost cost = new Cost(10, Currency.GOLD);
        int baseArmorClass = 12;
        double weight = 15.0;
        armor = new TestLightArmor(name, cost, baseArmorClass, weight);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Test Armor", armor.getName());
        assertEquals(ArmorType.LIGHT_ARMOR, armor.getType());
        assertEquals(new Cost(10, Currency.GOLD), armor.getCost());
        assertEquals(12, armor.getBaseArmorClass());
        assertEquals(15.0, armor.getWeight());
    }

    @Test
    public void testCalculateTotalArmorClass_NoModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(0);
        assertEquals(12, totalArmorClass);
    }

    @Test
    public void testCalculateTotalArmorClass_PositiveModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(2);
        assertEquals(14, totalArmorClass);
    }

    @Test
    public void testCalculateTotalArmorClass_NegativeModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(-1);
        assertEquals(11, totalArmorClass);
    }

    private static class TestLightArmor extends AbstractLightArmor {
        public TestLightArmor(String name, Cost cost, int baseArmorClass, double weight) {
            super(name, cost, baseArmorClass, weight);
        }
    }
}
