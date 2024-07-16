package com.ivmaly.items.armors.concrete.medium;

import com.ivmaly.items.armors.ArmorType;
import com.ivmaly.items.armors.medium.concrete.ChainShirtArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainShirtArmorTest {

    private ChainShirtArmor armor;

    @BeforeEach
    public void setUp() {
        armor = new ChainShirtArmor();
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Chain Shirt Armor", armor.getName());
        assertEquals(ArmorType.MEDIUM_ARMOR, armor.getType());
        assertEquals(new Cost(50, Currency.GOLD), armor.getCost());
        assertEquals(12, armor.getBaseArmorClass());
        assertEquals(20.0, armor.getWeight());
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
    public void testCalculateTotalArmorClass_PositiveModifierExceedsLimit() {
        int totalArmorClass = armor.calculateTotalArmorClass(4);
        assertEquals(14, totalArmorClass);
    }

    @Test
    public void testCalculateTotalArmorClass_NegativeModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(-1);
        assertEquals(11, totalArmorClass);
    }
}
