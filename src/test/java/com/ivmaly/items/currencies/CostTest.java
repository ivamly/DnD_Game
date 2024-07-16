package com.ivmaly.items.currencies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CostTest {

    @Test
    public void testToCopper() {
        Cost costInSilver = new Cost(1, Currency.SILVER);
        assertEquals(10, costInSilver.toCopper());

        Cost costInGold = new Cost(1, Currency.GOLD);
        assertEquals(100, costInGold.toCopper());

        Cost costInPlatinum = new Cost(1, Currency.PLATINUM);
        assertEquals(1000, costInPlatinum.toCopper());

        Cost costInCopper = new Cost(1, Currency.COPPER);
        assertEquals(1, costInCopper.toCopper());
    }

    @Test
    public void testFromCopper() {
        Cost costFromCopperToSilver = Cost.fromCopper(10, Currency.SILVER);
        assertEquals(1, costFromCopperToSilver.amount());
        assertEquals(Currency.SILVER, costFromCopperToSilver.currency());

        Cost costFromCopperToGold = Cost.fromCopper(100, Currency.GOLD);
        assertEquals(1, costFromCopperToGold.amount());
        assertEquals(Currency.GOLD, costFromCopperToGold.currency());

        Cost costFromCopperToPlatinum = Cost.fromCopper(1000, Currency.PLATINUM);
        assertEquals(1, costFromCopperToPlatinum.amount());
        assertEquals(Currency.PLATINUM, costFromCopperToPlatinum.currency());

        Cost costFromCopperToCopper = Cost.fromCopper(1, Currency.COPPER);
        assertEquals(1, costFromCopperToCopper.amount());
        assertEquals(Currency.COPPER, costFromCopperToCopper.currency());
    }

    @Test
    public void testToString() {
        Cost cost = new Cost(1, Currency.GOLD);
        assertEquals("1 GOLD", cost.toString());
    }
}
