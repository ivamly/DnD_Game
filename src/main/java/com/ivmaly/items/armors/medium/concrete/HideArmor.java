package com.ivmaly.items.armors.medium.concrete;

import com.ivmaly.items.armors.medium.AbstractMediumArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;

public class HideArmor extends AbstractMediumArmor {

    private static final String NAME = "Hide Armor";
    private static final Cost COST = new Cost(10, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 12;
    private static final double WEIGHT = 12;

    public HideArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }
}
