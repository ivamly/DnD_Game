package com.ivmaly.items.armors.medium.concrete;

import com.ivmaly.items.armors.medium.AbstractMediumArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;

public class BreastplateArmor extends AbstractMediumArmor {

    private static final String NAME = "Breastplate Armor";
    private static final Cost COST = new Cost(400, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 14;
    private static final double WEIGHT = 20;

    public BreastplateArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }
}
