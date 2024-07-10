package com.ivmaly;

import java.util.Random;

public abstract class AbstractDice {
    protected int sides;
    protected Random random;

    public AbstractDice(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public abstract int roll();
}
