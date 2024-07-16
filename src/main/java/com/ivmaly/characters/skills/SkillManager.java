package com.ivmaly.characters.skills;

import java.util.EnumMap;
import java.util.Map;

public class SkillManager {
    private final Map<Skill, Integer> skillScores;

    public SkillManager() {
        this.skillScores = new EnumMap<>(Skill.class);
    }

    public Map<Skill, Integer> getSkills() {
        return skillScores;
    }

    public void setSkillLevel(Skill skill, int level) {
        skillScores.put(skill, level);
    }

    public int getSkillLevel(Skill skill) {
        return skillScores.getOrDefault(skill, 0);
    }
}
