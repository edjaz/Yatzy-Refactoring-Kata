package com.datanumia.yatzy.domain.rule.straight;

import com.datanumia.yatzy.domain.DiceRoll;
import com.datanumia.yatzy.domain.rule.Rules;

import java.util.List;
import java.util.stream.Collectors;

abstract class Straight extends Rules {

    protected int pointForStraight(DiceRoll roll, List<Integer> straight, int point) {
        return roll.getDices().sorted().boxed().collect(Collectors.toList()).equals(straight) ? point : 0;
    }
}
