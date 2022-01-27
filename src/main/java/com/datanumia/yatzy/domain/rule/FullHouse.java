package com.datanumia.yatzy.domain.rule;

import com.datanumia.yatzy.domain.DiceRoll;
import com.datanumia.yatzy.domain.rule.ofking.ThreeOfAKind;
import com.datanumia.yatzy.domain.rule.pair.TwoPair;

public class FullHouse extends Rules implements YatzyGameRule {

    public static Integer playing(DiceRoll roll) {
        return new FullHouse().play(roll);
    }

    @Override
    public Integer play(DiceRoll roll) {
        return has1PairAnd1ThreeOfKind(roll) ? new Chance().play(roll) : 0;
    }

    private boolean has1PairAnd1ThreeOfKind(DiceRoll roll) {
        return new TwoPair().play(roll) > 1 && new ThreeOfAKind().play(roll) > 1;
    }
}
