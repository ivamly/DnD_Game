package com.ivmaly.items;

import com.ivmaly.items.currencies.Cost;

public abstract class AbstractItem implements Item {
    private final String name;
    private Cost cost;
    private final double weight;

    public AbstractItem(String name, Cost cost, double weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Cost getCost() {
        return cost;
    }

    @Override
    public void setCost(Cost cost) {
        this.cost = cost;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
