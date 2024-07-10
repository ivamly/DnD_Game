package com.ivmaly;

public class D20 extends AbstractDice {

    public D20() {
        super(20);
    }

    @Override
    public int roll() {
        return random.nextInt(sides) + 1;
    }
}
