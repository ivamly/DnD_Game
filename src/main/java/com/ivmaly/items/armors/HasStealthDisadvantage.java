package com.ivmaly.items.armors;

public interface HasStealthDisadvantage {
    default boolean hasStealthDisadvantage() {
        return true;
    }
}
