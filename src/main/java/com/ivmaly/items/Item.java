package com.ivmaly.items;

import com.ivmaly.items.currency.Cost;

public interface Item {
    String getName();

    Cost getCost();

    double getWeight();
}
