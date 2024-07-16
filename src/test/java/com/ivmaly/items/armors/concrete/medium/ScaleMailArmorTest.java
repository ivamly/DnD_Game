package com.ivmaly.items.armors.concrete.medium;

import com.ivmaly.items.armors.ArmorType;
import com.ivmaly.items.armors.medium.concrete.ScaleMailArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScaleMailArmorTest {

    private ScaleMailArmor armor;

    @BeforeEach
    public void setUp() {
        armor = new ScaleMailArmor();
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Scale Mail Armor", armor.getName());
        assertEquals(ArmorType.MEDIUM_ARMOR, armor.getType());
        assertEquals(new Cost(50, Currency.GOLD), armor.getCost());
        assertEquals(14, armor.getBaseArmorClass());
        assertEquals(45.0, armor.getWeight());
    }

    @Test
    public void testCalculateTotalArmorClass_NoModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(0);
        assertEquals(14, totalArmorClass);
    }

    @Test
    public void testCalculateTotalArmorClass_PositiveModifier() {
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
}
