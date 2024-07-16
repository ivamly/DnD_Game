package com.ivmaly.items.armor;

public interface HasStealthDisadvantage {
    default boolean hasStealthDisadvantage() {
        return true;
    }
}
