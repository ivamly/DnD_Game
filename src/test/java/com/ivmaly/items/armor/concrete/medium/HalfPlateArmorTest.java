package com.ivmaly.items.armor.concrete.medium;

import com.ivmaly.items.armor.ArmorType;
import com.ivmaly.items.currency.Cost;
import com.ivmaly.items.currency.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HalfPlateArmorTest {

    private HalfPlateArmor armor;

    @BeforeEach
    public void setUp() {
        armor = new HalfPlateArmor();
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Half Plate Armor", armor.getName());
        assertEquals(ArmorType.MEDIUM_ARMOR, armor.getType());
        assertEquals(new Cost(750, Currency.GOLD), armor.getCost());
        assertEquals(15, armor.getBaseArmorClass());
        assertEquals(40.0, armor.getWeight());
    }

    @Test
    public void testCalculateTotalArmorClass_NoModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(0);
        assertEquals(15, totalArmorClass);
    }

    @Test
    public void testCalculateTotalArmorClass_PositiveModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(2);
        assertEquals(17, totalArmorClass);
    }

    @Test
    public void testCalculateTotalArmorClass_PositiveModifierExceedsLimit() {
        int totalArmorClass = armor.calculateTotalArmorClass(4);
        assertEquals(17, totalArmorClass);
    }

    @Test
    public void testCalculateTotalArmorClass_NegativeModifier() {
        int totalArmorClass = armor.calculateTotalArmorClass(-1);
        assertEquals(14, totalArmorClass);
    }

    @Test
    public void testHasStealthDisadvantage() {
        assertTrue(armor.hasStealthDisadvantage());
    }
}
