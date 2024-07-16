package com.ivmaly.items.armors.light;

import com.ivmaly.items.armors.AbstractArmor;
import com.ivmaly.items.armors.ArmorType;
import com.ivmaly.items.currencies.Cost;

public abstract class AbstractLightArmor extends AbstractArmor {

    public AbstractLightArmor(String name, Cost cost, int baseArmorClass, double weight) {
        super(name, ArmorType.LIGHT_ARMOR, cost, baseArmorClass, weight);
    }

    public int calculateTotalArmorClass(int abilityModifier) {
        return getBaseArmorClass() + abilityModifier;
    }
}
