package com.ivmaly.items.armor.concrete.medium;

import com.ivmaly.items.armor.AbstractMediumArmor;
import com.ivmaly.items.armor.HasStealthDisadvantage;
import com.ivmaly.items.currency.Cost;
import com.ivmaly.items.currency.Currency;

public class ScaleMailArmor extends AbstractMediumArmor implements HasStealthDisadvantage {

    private static final String NAME = "Scale Mail Armor";
    private static final Cost COST = new Cost(50, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 14;
    private static final double WEIGHT = 45;

    public ScaleMailArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }
}
