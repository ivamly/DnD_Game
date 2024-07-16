package com.ivmaly.items.armors.medium.concrete;

import com.ivmaly.items.armors.HasStealthDisadvantage;
import com.ivmaly.items.armors.medium.AbstractMediumArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;

public class ScaleMailArmor extends AbstractMediumArmor implements HasStealthDisadvantage {

    private static final String NAME = "Scale Mail Armor";
    private static final Cost COST = new Cost(50, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 14;
    private static final double WEIGHT = 45;

    public ScaleMailArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }
}
