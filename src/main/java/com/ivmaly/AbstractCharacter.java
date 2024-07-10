package com.ivmaly;

import java.util.EnumMap;
import java.util.Map;

public abstract class AbstractCharacter {

    private String name;
    protected final Map<Characteristics, Integer> characteristics;

    public AbstractCharacter(String name) {
        this.name = name;
        this.characteristics = new EnumMap<>(Characteristics.class);

        for (Characteristics characteristic : Characteristics.values()) {
            characteristics.put(characteristic, 10);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Characteristics, Integer> getCharacteristics() {
        return characteristics;
    }

    public int getCharacteristic(Characteristics characteristic) {
        return characteristics.get(characteristic);
    }

    public abstract void setCharacteristic(Characteristics characteristic, int value);

    public int getModifier(Characteristics characteristic) {
        int value = characteristics.get(characteristic);
        return (value - 10) / 2;
    }
}
