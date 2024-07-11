package com.ivmaly.equipments.utils;

import com.ivmaly.equipments.Coin;

public class CoinCost {
    private final int amount;
    private final Coin coinType;

    public CoinCost(int amount, Coin coinType) {
        this.amount = amount;
        this.coinType = coinType;
    }

    public int getAmount() {
        return amount;
    }

    public Coin getCoinType() {
        return coinType;
    }

    @Override
    public String toString() {
        return amount + " " + coinType.getName();
    }
}
