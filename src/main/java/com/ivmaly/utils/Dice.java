package com.ivmaly.utils;

import java.util.Random;

public enum Dice {
    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D12(12),
    D20(20),
    D100(100);

    private final int sides;
    private static final Random RANDOM = new Random();

    Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return RANDOM.nextInt(sides) + 1;
    }
}
