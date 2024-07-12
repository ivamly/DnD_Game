package com.ivmaly.character;

import com.ivmaly.character.abilities.Ability;
import com.ivmaly.character.abilities.AbilityManager;
import com.ivmaly.character.conditions.Condition;
import com.ivmaly.character.conditions.ConditionEffect;
import com.ivmaly.character.conditions.ConditionManager;
import com.ivmaly.character.skills.Skill;
import com.ivmaly.character.skills.SkillManager;

import java.util.Map;

public class AbstractCharacter {
    private final AbilityManager abilityManager;
    private final SkillManager skillManager;
    private final ConditionManager conditionManager;

    public AbstractCharacter() {
        this.abilityManager = new AbilityManager();
        this.skillManager = new SkillManager();
        this.conditionManager = new ConditionManager();
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
}
