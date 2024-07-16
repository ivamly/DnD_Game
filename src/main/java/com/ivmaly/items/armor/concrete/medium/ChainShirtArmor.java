package com.ivmaly.items.armor.concrete.medium;

import com.ivmaly.items.armor.AbstractMediumArmor;
import com.ivmaly.items.currency.Cost;
import com.ivmaly.items.currency.Currency;

public class ChainShirtArmor extends AbstractMediumArmor {

    private static final String NAME = "Chain Shirt Armor";
    private static final Cost COST = new Cost(50, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 12;
    private static final double WEIGHT = 20;

    public ChainShirtArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }
}
