package com.ivmaly.items.armor.concrete.medium;

import com.ivmaly.items.armor.AbstractMediumArmor;
import com.ivmaly.items.armor.HasStealthDisadvantage;
import com.ivmaly.items.currency.Cost;
import com.ivmaly.items.currency.Currency;

public class HalfPlateArmor extends AbstractMediumArmor implements HasStealthDisadvantage {

    private static final String NAME = "Half Plate Armor";
    private static final Cost COST = new Cost(750, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 15;
    private static final double WEIGHT = 40;

    public HalfPlateArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }
}

