package com.ivmaly.characters.skills;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SkillManagerTest {

    private SkillManager skillManager;

    @BeforeEach
    public void setUp() {
        skillManager = new SkillManager();
    }

    @Test
    public void testSetAndGetSkillLevel() {
        skillManager.setSkillLevel(Skill.ACROBATICS, 3);
        assertEquals(3, skillManager.getSkillLevel(Skill.ACROBATICS));
    }

    @Test
    public void testGetDefaultSkillLevel() {
        assertEquals(0, skillManager.getSkillLevel(Skill.STEALTH));
    }

    @Test
    public void testGetSkillLevels() {
        skillManager.setSkillLevel(Skill.PERCEPTION, 5);
        skillManager.setSkillLevel(Skill.ARCANA, 2);
        Map<Skill, Integer> skills = skillManager.getSkills();
        assertEquals(5, skills.get(Skill.PERCEPTION));
        assertEquals(2, skills.get(Skill.ARCANA));
    }
}
