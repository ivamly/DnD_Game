package com.ivmaly.items.currency;

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
}
