package com.ivmaly.items.armors.heavy.concrete;

import com.ivmaly.items.armors.HasStealthDisadvantage;
import com.ivmaly.items.armors.heavy.AbstractHeavyArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;

public class RingMailArmor extends AbstractHeavyArmor implements HasStealthDisadvantage {

    private static final String NAME = "Ring Mail Armor";
    private static final Cost COST = new Cost(30, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 14;
    private static final double WEIGHT = 40;

    public RingMailArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }
}