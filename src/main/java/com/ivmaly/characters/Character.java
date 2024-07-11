package com.ivmaly.characters;

import com.ivmaly.characters.utils.Ability;
import com.ivmaly.characters.utils.Skill;

public interface Character {
    int getModifiers(Ability ability);

    int abilityCheck(Ability ability);

    int skillCheck(Skill skill);

    int abilityAndSkillCheck(Ability ability, Skill skill);
}
