package com.ivmaly.items.armors.light.concrete;

import com.ivmaly.items.armors.light.AbstractLightArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;

public class LeatherArmor extends AbstractLightArmor {

    private static final String NAME = "Leather Armor";
    private static final Cost COST = new Cost(10, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 11;
    private static final double WEIGHT = 10;

    public LeatherArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }
}
