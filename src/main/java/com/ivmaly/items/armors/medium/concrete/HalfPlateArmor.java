package com.ivmaly.items.armors.medium.concrete;

import com.ivmaly.items.armors.HasStealthDisadvantage;
import com.ivmaly.items.armors.medium.AbstractMediumArmor;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;

public class HalfPlateArmor extends AbstractMediumArmor implements HasStealthDisadvantage {

    private static final String NAME = "Half Plate Armor";
    private static final Cost COST = new Cost(750, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 15;
    private static final double WEIGHT = 40;

    public HalfPlateArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }
}

