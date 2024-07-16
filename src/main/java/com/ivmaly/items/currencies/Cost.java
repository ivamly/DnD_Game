package com.ivmaly.items.currencies;

import java.util.Objects;

public class Cost {
    private final int amount;
    private final Currency currency;

    public Cost(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int toCopper() {
        return currency.toCopper(amount);
    }

    public static Cost fromCopper(int copperAmount, Currency targetCurrency) {
        int amountInTargetCurrency = targetCurrency.fromCopper(copperAmount);
        return new Cost(amountInTargetCurrency, targetCurrency);
    }

    @Override
    public String toString() {
        return amount + " " + currency.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cost cost = (Cost) o;
        return amount == cost.amount && currency == cost.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
}
