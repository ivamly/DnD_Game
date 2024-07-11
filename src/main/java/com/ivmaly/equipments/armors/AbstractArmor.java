package com.ivmaly.equipments.armors;

import com.ivmaly.equipments.Equipable;
import com.ivmaly.equipments.Item;
import com.ivmaly.equipments.utils.CoinCost;

public abstract class AbstractArmor implements Item, Equipable {
    private final String name;
    private final ArmorCategory category;
    private final int armorClass;
    private final int needableStrength;
    private final boolean hasStealthDisadvantage;
    private CoinCost cost;
    private final double weight;

    public AbstractArmor(String name, ArmorCategory category,
                         int armorClass, int needableStrength, boolean hasStealthDisadvantage,
                         CoinCost cost, double weight) {
        this.name = name;
        this.category = category;
        this.armorClass = armorClass;
        this.needableStrength = needableStrength;
        this.hasStealthDisadvantage = hasStealthDisadvantage;
        this.cost = cost;
        this.weight = weight;
    }
}
