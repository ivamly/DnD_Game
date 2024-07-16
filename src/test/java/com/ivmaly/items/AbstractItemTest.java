package com.ivmaly.items;

import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.currencies.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractItemTest {
    private AbstractItem item;

    @BeforeEach
    public void setUp() {
        item = new TestItem("Test Item", new Cost(100, Currency.GOLD), 5.0);
    }

    @Test
    public void testGetName() {
        assertEquals("Test Item", item.getName());
    }

    @Test
    public void testGetCost() {
        Cost expectedCost = new Cost(100, Currency.GOLD);
        assertEquals(expectedCost, item.getCost());
    }

    @Test
    public void testSetCost() {
        Cost newCost = new Cost(150, Currency.GOLD);
        item.setCost(newCost);
        assertEquals(newCost, item.getCost());
    }

    @Test
    public void testGetWeight() {
        assertEquals(5.0, item.getWeight());
    }

    private static class TestItem extends AbstractItem {
        public TestItem(String name, Cost cost, double weight) {
            super(name, cost, weight);
        }
    }
}
