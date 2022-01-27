package com.datanumia.yatzy.domain.rule;

import com.datanumia.yatzy.domain.DiceRoll;

public class Chance implements YatzyGameRule {
    public static Integer playing(DiceRoll roll) {
        return new Chance().play(roll);
    }

    @Override
    public Integer play(DiceRoll roll) {
        return roll.getDices().sum();
    }

}
