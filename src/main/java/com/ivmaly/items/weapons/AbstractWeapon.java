package com.ivmaly.items.weapons;

import com.ivmaly.items.AbstractItem;
import com.ivmaly.items.currencies.Cost;
import com.ivmaly.items.weapons.properties.WeaponProperty;
import com.ivmaly.items.weapons.properties.WeaponPropertyManager;
import com.ivmaly.utils.Dice;

import java.util.Map;

public abstract class AbstractWeapon extends AbstractItem {
    private final WeaponProficiency proficiency;
    private final WeaponType type;
    private final WeaponDamageType damageType;
    private Dice damage;
    private final WeaponPropertyManager weaponPropertyManager;

    public AbstractWeapon(String name, Cost cost, double weight, WeaponProficiency proficiency,
                          WeaponType type, WeaponDamageType damageType, Dice damage) {
        super(name, cost, weight);
        this.proficiency = proficiency;
        this.type = type;
        this.damageType = damageType;
        this.damage = damage;
        this.weaponPropertyManager = new WeaponPropertyManager();
    }

    public WeaponProficiency getProficiency() {
        return proficiency;
    }

    public WeaponType getType() {
        return type;
    }

    public WeaponDamageType getDamageType() {
        return damageType;
    }

    public Dice getDamage() {
        return damage;
    }

    public void setDamage(Dice damage) {
        this.damage = damage;
    }

    public Map<WeaponProperty, Boolean> getWeaponProperties() {
        return weaponPropertyManager.getWeaponProperties();
    }

    public void addWeaponProperty(WeaponProperty property) {
        weaponPropertyManager.addWeaponProperty(property);
    }

    public boolean hasWeaponProperty(WeaponProperty property) {
        return weaponPropertyManager.hasWeaponProperty(property);
    }
}
