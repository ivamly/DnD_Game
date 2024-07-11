package com.ivmaly.equipments;

public enum Coin {
    COPPER("Copper", "cp", 1),
    SILVER("Silver", "sp", 10),
    ELECTRUM("Electrum", "ep", 50),
    GOLD("Gold", "gp", 100),
    PLATINUM("Platinum", "pp", 1000);

    private final String name;
    private final String abbreviation;
    private final int valueInCopper; // Value relative to copper

    Coin(String name, String abbreviation, int valueInCopper) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.valueInCopper = valueInCopper;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getValueInCopper() {
        return valueInCopper;
    }
}
