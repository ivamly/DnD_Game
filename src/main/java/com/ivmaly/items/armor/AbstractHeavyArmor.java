package com.ivmaly.items.armor;

import com.ivmaly.items.currency.Cost;

public abstract class AbstractHeavyArmor extends AbstractArmor {

    public AbstractHeavyArmor(String name, Cost cost, int baseArmorClass, double weight) {
        super(name, ArmorType.HEAVY_ARMOR, cost, baseArmorClass, weight);
    }

    public int calculateTotalArmorClass() {
        return getBaseArmorClass();
    }
}