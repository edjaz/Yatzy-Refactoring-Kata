package com.datanumia.yatzy.domain.rule.ofking;

import com.datanumia.yatzy.domain.rule.Rules;
import com.datanumia.yatzy.domain.rule.YatzyGameRule;
import com.datanumia.yatzy.domain.DiceRoll;

public class ThreeOfAKind extends Rules implements YatzyGameRule {
    public static Integer playing(DiceRoll roll) {
        return new ThreeOfAKind().play(roll);
    }

    @Override
    public Integer play(DiceRoll roll) {
        return computeGroupingby(roll, 3);
    }
}
