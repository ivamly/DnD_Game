package com.ivmaly.items.armors;

import com.ivmaly.items.AbstractItem;
import com.ivmaly.items.currencies.Cost;

public abstract class AbstractArmor extends AbstractItem {
    private final ArmorType type;
    private final int baseArmorClass;

    public AbstractArmor(String name, ArmorType type, Cost cost, int baseArmorClass, double weight) {
        super(name, cost, weight);
        this.type = type;
        this.baseArmorClass = baseArmorClass;
    }

    public ArmorType getType() {
        return type;
    }

    public int getBaseArmorClass() {
        return baseArmorClass;
    }
}
