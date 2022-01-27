package com.datanumia.yatzy.domain.rule;

import com.datanumia.yatzy.domain.DiceRoll;

public class Yatzy extends Rules implements YatzyGameRule {
    public static final int YATZY_SCORE = 50;
    public static final int ZERO_SCORE = 0;

    public static Integer playing(DiceRoll roll) {
        return new Yatzy().play(roll);
    }

    @Override
    public Integer play(DiceRoll roll) {
        return hasNDifferentDices(roll) ? YATZY_SCORE : ZERO_SCORE;
    }

    private boolean hasNDifferentDices(DiceRoll roll) {
        return this.groupingByDiceValue(roll).containsValue((long)roll.length());
    }
}
