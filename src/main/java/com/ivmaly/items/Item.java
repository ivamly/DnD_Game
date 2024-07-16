package com.ivmaly.items;

import com.ivmaly.items.currencies.Cost;

public interface Item {
    String getName();

    Cost getCost();

    void setCost(Cost cost);

    double getWeight();
}
