package com.ivmaly.items.currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyTest {

    @Test
    public void testToCopper() {
        assertEquals(10, Currency.SILVER.toCopper(1));
        assertEquals(100, Currency.GOLD.toCopper(1));
        assertEquals(1000, Currency.PLATINUM.toCopper(1));
        assertEquals(1, Currency.COPPER.toCopper(1));
    }

    @Test
    public void testFromCopper() {
        assertEquals(1, Currency.SILVER.fromCopper(10));
        assertEquals(1, Currency.GOLD.fromCopper(100));
        assertEquals(1, Currency.PLATINUM.fromCopper(1000));
        assertEquals(1, Currency.COPPER.fromCopper(1));
    }
}
