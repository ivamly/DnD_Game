package com.ivmaly.items.armor;

import com.ivmaly.items.currency.Cost;

public abstract class AbstractLightArmor extends AbstractArmor {

    public AbstractLightArmor(String name, Cost cost, int baseArmorClass, double weight) {
        super(name, ArmorType.LIGHT_ARMOR, cost, baseArmorClass, weight);
    }

    public int calculateTotalArmorClass(int abilityModifier) {
        return getBaseArmorClass() + abilityModifier;
    }
}
