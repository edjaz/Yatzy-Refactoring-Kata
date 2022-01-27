package com.datanumia.yatzy.domain.rule.pair;

import com.datanumia.yatzy.domain.rule.Rules;
import com.datanumia.yatzy.domain.rule.YatzyGameRule;
import com.datanumia.yatzy.domain.DiceRoll;

public class ScorePair extends Rules implements YatzyGameRule {
    public static Integer playing(DiceRoll roll) {
        return new ScorePair().play(roll);
    }

    @Override
    public Integer play(DiceRoll roll) {
        return (int) scoreGreaterThan(roll, 2L).max().orElse(0);
    }
}
