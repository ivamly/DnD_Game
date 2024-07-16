package com.ivmaly.items.armors.medium;

import com.ivmaly.items.armors.AbstractArmor;
import com.ivmaly.items.armors.ArmorType;
import com.ivmaly.items.currencies.Cost;

public abstract class AbstractMediumArmor extends AbstractArmor {

    public AbstractMediumArmor(String name, Cost cost, int baseArmorClass, double weight) {
        super(name, ArmorType.MEDIUM_ARMOR, cost, baseArmorClass, weight);
    }

    public int calculateTotalArmorClass(int abilityModifier) {
        int modifiedArmorClass = getBaseArmorClass() + abilityModifier;
        return Math.min(modifiedArmorClass, getBaseArmorClass() + 2);
    }
}
