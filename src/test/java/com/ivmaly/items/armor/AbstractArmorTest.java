package com.ivmaly.items.armor;

import com.ivmaly.items.currency.Cost;
import com.ivmaly.items.currency.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractArmorTest {

    private AbstractArmor armor;

    @BeforeEach
    void setUp() {
        armor = new TestArmor();
    }

    @Test
    public void testGetName() {
        assertEquals("Test Armor", armor.getName());
    }

    @Test
    public void testGetType() {
        assertEquals(ArmorType.LIGHT_ARMOR, armor.getType());
    }

    @Test
    public void testGetCost() {
        assertEquals(new Cost(10, Currency.GOLD), armor.getCost());
    }

    @Test
    public void testGetBaseArmorClass() {
        assertEquals(12, armor.getBaseArmorClass());
    }

    @Test
    public void testGetWeight() {
        assertEquals(15.0, armor.getWeight());
    }

    @Test
    public void testSetCost() {
        Cost newCost = new Cost(20, Currency.GOLD);
        armor.setCost(newCost);
        assertEquals(newCost, armor.getCost());
    }

    private static class TestArmor extends AbstractArmor {
        public TestArmor() {
            super("Test Armor", ArmorType.LIGHT_ARMOR, new Cost(10, Currency.GOLD), 12, 15.0);
        }
    }
}
