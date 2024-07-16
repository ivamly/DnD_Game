package com.ivmaly.items.armors.heavy;

import com.ivmaly.items.armors.AbstractArmor;
import com.ivmaly.items.armors.ArmorType;
import com.ivmaly.items.currencies.Cost;

public abstract class AbstractHeavyArmor extends AbstractArmor {

    public AbstractHeavyArmor(String name, Cost cost, int baseArmorClass, double weight) {
        super(name, ArmorType.HEAVY_ARMOR, cost, baseArmorClass, weight);
    }

    public int calculateTotalArmorClass() {
        return getBaseArmorClass();
    }
}