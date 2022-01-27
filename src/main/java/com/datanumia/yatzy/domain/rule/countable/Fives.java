package com.datanumia.yatzy.domain.rule.countable;

import com.datanumia.yatzy.domain.rule.YatzyGameRule;
import com.datanumia.yatzy.domain.DiceRoll;

public class Fives extends Count implements YatzyGameRule {

    public static Integer playing(DiceRoll roll) {
        return new Fives().play(roll);
    }

    @Override
    public Integer play(DiceRoll roll) {
        return countByDiceValue(roll, 5);
    }
}
