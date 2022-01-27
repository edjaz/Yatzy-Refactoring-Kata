package com.datanumia.yatzy.domain.rule.pair;

import com.datanumia.yatzy.domain.rule.Rules;
import com.datanumia.yatzy.domain.rule.YatzyGameRule;
import com.datanumia.yatzy.domain.DiceRoll;

public class TwoPair extends Rules implements YatzyGameRule {
    public static Integer playing(DiceRoll roll) {
        return new TwoPair().play(roll);
    }

    @Override
    public Integer play(DiceRoll roll) {
        return computeGroupingby(roll, 2);
    }
}
