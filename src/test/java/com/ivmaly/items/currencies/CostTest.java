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
        assertEquals(1, costFromCopperToSilver.getAmount());
        assertEquals(Currency.SILVER, costFromCopperToSilver.getCurrency());

        Cost costFromCopperToGold = Cost.fromCopper(100, Currency.GOLD);
        assertEquals(1, costFromCopperToGold.getAmount());
        assertEquals(Currency.GOLD, costFromCopperToGold.getCurrency());

        Cost costFromCopperToPlatinum = Cost.fromCopper(1000, Currency.PLATINUM);
        assertEquals(1, costFromCopperToPlatinum.getAmount());
        assertEquals(Currency.PLATINUM, costFromCopperToPlatinum.getCurrency());

        Cost costFromCopperToCopper = Cost.fromCopper(1, Currency.COPPER);
        assertEquals(1, costFromCopperToCopper.getAmount());
        assertEquals(Currency.COPPER, costFromCopperToCopper.getCurrency());
    }

    @Test
    public void testToString() {
        Cost cost = new Cost(1, Currency.GOLD);
        assertEquals("1 GOLD", cost.toString());
    }
}
