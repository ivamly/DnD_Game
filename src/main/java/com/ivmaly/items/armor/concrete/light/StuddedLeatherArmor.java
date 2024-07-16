package com.ivmaly.items.armor.concrete.light;

import com.ivmaly.items.armor.AbstractLightArmor;
import com.ivmaly.items.currency.Cost;
import com.ivmaly.items.currency.Currency;

public class StuddedLeatherArmor extends AbstractLightArmor {

    private static final String NAME = "Studded Leather Armor";
    private static final Cost COST = new Cost(45, Currency.GOLD);
    private static final int BASE_ARMOR_CLASS = 12;
    private static final double WEIGHT = 13;

    public StuddedLeatherArmor() {
        super(NAME, COST, BASE_ARMOR_CLASS, WEIGHT);
    }
}
