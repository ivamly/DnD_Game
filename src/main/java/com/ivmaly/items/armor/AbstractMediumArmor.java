package com.ivmaly.items.armor;

import com.ivmaly.items.currency.Cost;

public abstract class AbstractMediumArmor extends AbstractArmor {

    public AbstractMediumArmor(String name, Cost cost, int baseArmorClass, double weight) {
        super(name, ArmorType.MEDIUM_ARMOR, cost, baseArmorClass, weight);
    }

    public int calculateTotalArmorClass(int abilityModifier) {
        int modifiedArmorClass = getBaseArmorClass() + abilityModifier;
        return Math.min(modifiedArmorClass, getBaseArmorClass() + 2);
    }
}
