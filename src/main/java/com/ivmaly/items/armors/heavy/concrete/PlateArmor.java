package com.ivmaly.items.armors.heavy.concrete;

import com.ivmaly.items.armors.HasStealthDisadvantage;
import com.ivmaly.items.armors.RequiredStrength;
import com.ivmaly.items.armors.heavy.AbstractHeavyArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;

public class PlateArmor extends AbstractHeavyArmor implements HasStealthDisadvantage, RequiredStrength {

    private static final String NAME = "Plate Armor";
    private static final Cost COST = new Cost(1500, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 18;
    private static final double WEIGHT = 65;

    public PlateArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }

    @Override
    public int getRequiredStrength() {
        return 15;
    }
}
