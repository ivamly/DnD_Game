package com.ivmaly.character.conditions.effects;

import com.ivmaly.character.AbstractCharacter;
import com.ivmaly.character.acts.ActType;

public class incapacitatedEffect implements ConditionEffect {

    @Override
    public void applyEffect(AbstractCharacter character) {
        character.setAction(ActType.MAIN, 0);
        character.setAction(ActType.BONUS, 0);
        character.setAction(ActType.REACTION, 0);
    }

    @Override
    public void removeEffect(AbstractCharacter character) {
        // РЕАЛИЗОВАТЬ ВОЗВРАТ
    }
}
