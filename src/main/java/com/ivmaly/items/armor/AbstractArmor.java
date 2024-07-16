package com.ivmaly.items.armor;

import com.ivmaly.items.Item;
import com.ivmaly.items.currency.Cost;

public abstract class AbstractArmor implements Item {
    private final String name;
    private final ArmorType type;
    private Cost cost;
    private final int baseArmorClass;
    private final double weight;

    public AbstractArmor(String name, ArmorType type, Cost cost, int baseArmorClass, double weight) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.baseArmorClass = baseArmorClass;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    public ArmorType getType() {
        return type;
    }

    @Override
    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public int getBaseArmorClass() {
        return baseArmorClass;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
