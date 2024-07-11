package com.ivmaly.characters;

import com.ivmaly.characters.utils.*;
import com.ivmaly.utils.Dice;

import java.util.EnumMap;
import java.util.EnumSet;

public abstract class AbstractCharacter implements Character {
    private final String name;
    private final Size size;
    private final Alignment alignment;
    private int armorClass;
    private int hitPoints;
    private int proficiencyBonus;
    private boolean hasAdvantage;
    private boolean hasDisadvantage;
    private EnumMap<Ability, Integer> abilities;
    private EnumMap<Ability, Integer> abilitiesToSavingThrows;
    private EnumMap<Skill, Integer> skills;
    private EnumSet<Condition> conditions;
    private EnumSet<Language> languages;

    public AbstractCharacter(String name, Size size, Alignment alignment,
                             int armorClass, int hitPoints, int proficiencyBonus) {
        this.name = name;
        this.size = size;
        this.alignment = alignment;
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.proficiencyBonus = proficiencyBonus;
        this.hasAdvantage = false;
        this.hasDisadvantage = false;
    }


    @Override
    public int getModifiers(Ability ability) {
        return Math.floorDiv(abilities.get(ability) - 10, 2);
    }

    @Override
    public int abilityCheck(Ability ability) {
        return rollWithAdvantageOrDisadvantage() + getModifiers(ability);
    }

    @Override
    public int skillCheck(Skill skill) {
        return skills.get(skill);
    }

    @Override
    public int abilityAndSkillCheck(Ability ability, Skill skill) {
        return rollWithAdvantageOrDisadvantage() + getModifiers(ability) + skillCheck(skill);
    }

    private int rollWithAdvantageOrDisadvantage() {
        if (hasAdvantage && hasDisadvantage) {
            return Dice.D20.roll();
        } else if (hasAdvantage) {
            return Math.max(Dice.D20.roll(), Dice.D20.roll());
        } else if (hasDisadvantage) {
            return Math.min(Dice.D20.roll(), Dice.D20.roll());
        }
        return Dice.D20.roll();
    }
}
