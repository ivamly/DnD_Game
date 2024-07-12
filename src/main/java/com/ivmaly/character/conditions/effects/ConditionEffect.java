package com.ivmaly.character.conditions.effects;

import com.ivmaly.character.AbstractCharacter;

public interface ConditionEffect {
    void applyEffect(AbstractCharacter character);

    void removeEffect(AbstractCharacter character);
}
