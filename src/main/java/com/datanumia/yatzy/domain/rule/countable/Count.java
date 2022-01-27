package com.datanumia.yatzy.domain.rule.countable;

import com.datanumia.yatzy.domain.DiceRoll;
import com.datanumia.yatzy.domain.rule.Rules;

public abstract class Count extends Rules {
    protected int countByDiceValue(DiceRoll roll, int v) {
        return (int) roll.getDices().filter(value -> value == v).count() * v;
    }
}
