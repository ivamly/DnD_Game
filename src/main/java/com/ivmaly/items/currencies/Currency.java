package com.ivmaly.items.currencies;

public enum Currency {
    COPPER, SILVER, GOLD, PLATINUM;

    public int toCopper(int amount) {
        return switch (this) {
            case SILVER -> amount * 10;
            case GOLD -> amount * 100;
            case PLATINUM -> amount * 1000;
            default -> amount;
        };
    }

    public int fromCopper(int amount) {
        return switch (this) {
            case SILVER -> amount / 10;
            case GOLD -> amount / 100;
            case PLATINUM -> amount / 1000;
            default -> amount;
        };
    }
}
