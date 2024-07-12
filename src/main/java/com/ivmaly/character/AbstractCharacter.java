package com.ivmaly.character;

import com.ivmaly.character.abilities.Ability;
import com.ivmaly.character.abilities.AbilityManager;
import com.ivmaly.character.acts.ActManager;
import com.ivmaly.character.acts.ActType;
import com.ivmaly.character.advantagedisadvantage.AdvantageDisadvantage;
import com.ivmaly.character.advantagedisadvantage.AdvantageDisadvantageManager;
import com.ivmaly.character.conditions.Condition;
import com.ivmaly.character.conditions.ConditionManager;
import com.ivmaly.character.conditions.effects.ConditionEffect;
import com.ivmaly.character.skills.Skill;
import com.ivmaly.character.skills.SkillManager;

import java.util.Map;

public class AbstractCharacter {
    private final String name;
    private int speed;
    private final AbilityManager abilityManager;
    private final SkillManager skillManager;
    private final ConditionManager conditionManager;
    private final ActManager actManager;
    private final AdvantageDisadvantageManager advantageDisadvantageManager;

    public AbstractCharacter(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.abilityManager = new AbilityManager();
        this.skillManager = new SkillManager();
        this.conditionManager = new ConditionManager();
        this.actManager = new ActManager();
        this.advantageDisadvantageManager = new AdvantageDisadvantageManager();
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Map<Ability, Integer> getAbilities() {
        return abilityManager.getAbilities();
    }

    public void setAbilityScore(Ability ability, int score) {
        abilityManager.setAbilityScore(ability, score);
    }

    public int getAbilityScore(Ability ability) {
        return abilityManager.getAbilityScore(ability);
    }

    public int getAbilityModifier(Ability ability) {
        return abilityManager.getAbilityModifier(ability);
    }

    public Map<Skill, Integer> getSkills() {
        return skillManager.getSkills();
    }

    public void setSkillLevel(Skill skill, int level) {
        skillManager.setSkillLevel(skill, level);
    }

    public int getSkillLevel(Skill skill) {
        return skillManager.getSkillLevel(skill);
    }

    public Map<Condition, ConditionEffect> getConditions() {
        return conditionManager.getConditions();
    }

    public void addCondition(Condition condition, ConditionEffect effect) {
        conditionManager.addCondition(condition, effect, this);
    }

    public void removeCondition(Condition condition) {
        conditionManager.removeCondition(condition, this);
    }

    public boolean hasCondition(Condition condition) {
        return conditionManager.hasCondition(condition);
    }

    public Map<ActType, Integer> getActions() {
        return actManager.getAvailableActions();
    }

    public void setAction(ActType actType, int value) {
        actManager.setAvailableAction(actType, value);
    }

    public int getAction(ActType actType) {
        return actManager.getAvailableAction(actType);
    }

    public Map<AdvantageDisadvantage, Boolean> getAdvantageDisadvantages() {
        return advantageDisadvantageManager.getAdvantageDisadvantageEffects();
    }

    public void setAdvantageDisadvantageEffect(AdvantageDisadvantage effect, boolean value) {
        advantageDisadvantageManager.setAdvantageDisadvantageEffect(effect, value);
    }

    public boolean isAdvantageDisadvantageEffect(AdvantageDisadvantage effect) {
        return advantageDisadvantageManager.isAdvantageDisadvantageEffectActive(effect);
    }
}
