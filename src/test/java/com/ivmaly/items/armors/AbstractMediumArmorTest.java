package com.ivmaly.items.armors;

import com.ivmaly.items.armors.medium.AbstractMediumArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractMediumArmorTest {

    private AbstractMediumArmor armor;

    @BeforeEach
    void setUp() {
        String name = "Test Medium Armor";
        Cost cost = new Cost(20, Currency.GOLD);
        int baseArmorClass = 14;
        double weight = 18.0;
        armor = new TestMediumArmor(name, cost, baseArmorClass, weight);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Test Medium Armor", armor.getName());
        assertEquals(ArmorType.MEDIUM_ARMOR, armor.getType());
        assertEquals(new Cost(20, Currency.GOLD), armor.getCost());
        assertEquals(14, armor.getBaseArmorClass());
        assertEquals(18.0, armor.getWeight());
    }

    @Test
    public void testCalculateTotalArmorClass_NoModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(0);
        assertEquals(14, totalArmorClass);
    }

    @Test
    public void testCalculateTotalArmorClass_PositiveModifierWithinLimit() {
        int totalArmorClass = armor.calculateTotalArmorClass(2);
        assertEquals(16, totalArmorClass);
    }

    @Test
    public void testCalculateTotalArmorClass_PositiveModifierExceedsLimit() {
        int totalArmorClass = armor.calculateTotalArmorClass(4);
        assertEquals(16, totalArmorClass);
    }

    @Test
    public void testCalculateTotalArmorClass_NegativeModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(-1);
        assertEquals(13, totalArmorClass);
    }

    private static class TestMediumArmor extends AbstractMediumArmor {
        public TestMediumArmor(String name, Cost cost, int baseArmorClass, double weight) {
            super(name, cost, baseArmorClass, weight);
        }
    }
}
