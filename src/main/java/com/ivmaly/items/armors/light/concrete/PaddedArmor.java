package com.ivmaly.items.armors.light.concrete;

import com.ivmaly.items.armors.HasStealthDisadvantage;
import com.ivmaly.items.armors.light.AbstractLightArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;

public class PaddedArmor extends AbstractLightArmor implements HasStealthDisadvantage {

    private static final String NAME = "Padded Armor";
    private static final Cost COST = new Cost(5, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 11;
    private static final double WEIGHT = 8;

    public PaddedArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }
}
