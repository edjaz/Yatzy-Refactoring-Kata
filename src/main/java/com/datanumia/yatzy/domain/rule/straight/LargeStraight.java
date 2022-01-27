package com.datanumia.yatzy.domain.rule.straight;

import com.datanumia.yatzy.domain.rule.YatzyGameRule;
import com.datanumia.yatzy.domain.DiceRoll;

import java.util.List;

public class LargeStraight extends Straight implements YatzyGameRule {
    private static final List<Integer> LARGE_STRAIGHT = List.of(2, 3, 4, 5, 6);
    private static final int LARGE_STRAIGHT_SCORE = 20;

    public static Integer playing(DiceRoll roll) {
        return new LargeStraight().play(roll);
    }

    @Override
    public Integer play(DiceRoll roll) {
        return pointForStraight(roll, LARGE_STRAIGHT, LARGE_STRAIGHT_SCORE);
    }
}
