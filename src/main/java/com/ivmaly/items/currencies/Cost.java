package com.ivmaly.items.currencies;

public record Cost(int amount, Currency currency) {

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

}
