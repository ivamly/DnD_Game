package com.ivmaly.items.armors;

import com.ivmaly.items.armors.heavy.AbstractHeavyArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractHeavyArmorTest {

    private AbstractHeavyArmor armor;

    @BeforeEach
    void setUp() {
        String name = "Test Heavy Armor";
        Cost cost = new Cost(50, Currency.GOLD);
        int baseArmorClass = 18;
        double weight = 25.0;
        armor = new TestHeavyArmor(name, cost, baseArmorClass, weight);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Test Heavy Armor", armor.getName());
        assertEquals(ArmorType.HEAVY_ARMOR, armor.getType());
        assertEquals(new Cost(50, Currency.GOLD), armor.getCost());
        assertEquals(18, armor.getBaseArmorClass());
        assertEquals(25.0, armor.getWeight());
    }

    @Test
    public void testCalculateTotalArmorClass() {
        int totalArmorClass = armor.calculateTotalArmorClass();
        assertEquals(18, totalArmorClass);
    }

    private static class TestHeavyArmor extends AbstractHeavyArmor {
        public TestHeavyArmor(String name, Cost cost, int baseArmorClass, double weight) {
            super(name, cost, baseArmorClass, weight);
        }
    }
}
