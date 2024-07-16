package com.ivmaly.items.armors.heavy.concrete;

import com.ivmaly.items.armors.HasStealthDisadvantage;
import com.ivmaly.items.armors.RequiredStrength;
import com.ivmaly.items.armors.heavy.AbstractHeavyArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;

public class SplintArmor extends AbstractHeavyArmor implements HasStealthDisadvantage, RequiredStrength {

    private static final String NAME = "Splint Armor";
    private static final Cost COST = new Cost(200, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 17;
    private static final double WEIGHT = 60;

    public SplintArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }

    @Override
    public int getRequiredStrength() {
        return 15;
    }
}