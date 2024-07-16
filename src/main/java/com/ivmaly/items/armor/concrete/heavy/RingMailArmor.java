package com.ivmaly.items.armor.concrete.heavy;

import com.ivmaly.items.armor.AbstractHeavyArmor;
import com.ivmaly.items.armor.HasStealthDisadvantage;
import com.ivmaly.items.currency.Cost;
import com.ivmaly.items.currency.Currency;

public class RingMailArmor extends AbstractHeavyArmor implements HasStealthDisadvantage {

    private static final String NAME = "Ring Mail Armor";
    private static final Cost COST = new Cost(30, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 14;
    private static final double WEIGHT = 40;

    public RingMailArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }
}