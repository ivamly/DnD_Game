package com.ivmaly.character.conditions;

import com.ivmaly.character.AbstractCharacter;

public interface ConditionEffect {
    void applyEffect(AbstractCharacter character);

    void removeEffect(AbstractCharacter character);
}
