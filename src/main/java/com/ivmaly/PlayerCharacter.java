package com.ivmaly;

public class PlayerCharacter extends AbstractCharacter {

    public PlayerCharacter(String characterName) {
        super(characterName);
    }

    @Override
    public void setCharacteristic(Characteristics characteristic, int value) {
        if (value < 0 || value > 20) {
            throw new IllegalArgumentException("Invalid value " + value);
        }
        characteristics.put(characteristic, value);
    }
}
