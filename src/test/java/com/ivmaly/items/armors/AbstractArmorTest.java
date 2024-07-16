package com.ivmaly.items.armors;

import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
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
    public void testGetType() {
        assertEquals(ArmorType.LIGHT_ARMOR, armor.getType());
    }

    @Test
    public void testGetBaseArmorClass() {
        assertEquals(12, armor.getBaseArmorClass());
    }

    private static class TestArmor extends AbstractArmor {
        public TestArmor() {
            super("Test Armor", ArmorType.LIGHT_ARMOR,
                    new Cost(10, Currency.GOLD), 12, 15.0);
        }
    }
}
