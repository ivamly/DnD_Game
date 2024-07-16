package com.ivmaly.characters.advantagesdisadvantages;

import java.util.EnumMap;
import java.util.Map;

public class AdvantageDisadvantageManager {
    private final Map<AdvantageDisadvantage, Boolean> advantageDisadvantageEffects;

    public AdvantageDisadvantageManager() {
        this.advantageDisadvantageEffects = new EnumMap<>(AdvantageDisadvantage.class);
    }

    public Map<AdvantageDisadvantage, Boolean> getAdvantageDisadvantageEffects() {
        return advantageDisadvantageEffects;
    }

    public void setAdvantageDisadvantageEffect(AdvantageDisadvantage type, boolean value) {
        advantageDisadvantageEffects.put(type, value);
    }

    public boolean isAdvantageDisadvantageEffectActive(AdvantageDisadvantage type) {
        return advantageDisadvantageEffects.getOrDefault(type, false);
    }
}
