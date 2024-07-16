package com.ivmaly.items.armors.concrete.light;

import com.ivmaly.items.armors.ArmorType;
import com.ivmaly.items.armors.light.concrete.StuddedLeatherArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StuddedLeatherArmorTest {

    private StuddedLeatherArmor armor;

    @BeforeEach
    void setUp() {
        armor = new StuddedLeatherArmor();
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Studded Leather Armor", armor.getName());
        assertEquals(ArmorType.LIGHT_ARMOR, armor.getType());
        assertEquals(new Cost(45, Currency.GOLD), armor.getCost());
        assertEquals(12, armor.getBaseArmorClass());
        assertEquals(13.0, armor.getWeight());
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
}
