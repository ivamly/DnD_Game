package com.ivmaly.items;

import com.ivmaly.items.currency.Cost;

public interface Item {
    String getName();

    Cost getCost();

    void setCost(Cost cost);

    double getWeight();
}
