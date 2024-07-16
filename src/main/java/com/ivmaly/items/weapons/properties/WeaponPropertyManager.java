package com.ivmaly.items.weapons.properties;

import java.util.EnumMap;
import java.util.Map;

public class WeaponPropertyManager {
    private final Map<WeaponProperty, Boolean> weaponProperties;

    public WeaponPropertyManager() {
        this.weaponProperties = new EnumMap<>(WeaponProperty.class);
    }

    public Map<WeaponProperty, Boolean> getWeaponProperties() {
        return weaponProperties;
    }

    public void addWeaponProperty(WeaponProperty weaponProperty) {
        weaponProperties.put(weaponProperty, true);
    }

    public void removeWeaponProperty(WeaponProperty weaponProperty) {
        weaponProperties.put(weaponProperty, false);
    }

    public boolean hasWeaponProperty(WeaponProperty weaponProperty) {
        return weaponProperties.getOrDefault(weaponProperty, false);
    }
}
