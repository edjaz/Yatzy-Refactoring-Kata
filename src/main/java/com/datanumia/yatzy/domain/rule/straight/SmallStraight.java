package com.datanumia.yatzy.domain.rule.straight;

import com.datanumia.yatzy.domain.rule.YatzyGameRule;
import com.datanumia.yatzy.domain.DiceRoll;

import java.util.List;

public class SmallStraight extends Straight implements YatzyGameRule {
    private static final int SMALL_STRAIGHT_SCORE = 15;
    private static final List<Integer> SMALL_STRAIGHT = List.of(1, 2, 3, 4, 5);

    public static Integer playing(DiceRoll roll) {
        return new SmallStraight().play(roll);
    }
    @Override
    public Integer play(DiceRoll roll) {
        return pointForStraight(roll, SMALL_STRAIGHT, SMALL_STRAIGHT_SCORE);
    }
}
