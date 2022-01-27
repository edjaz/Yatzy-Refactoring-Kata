package com.datanumia.yatzy.domain.rule;

import com.datanumia.yatzy.domain.DiceRoll;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.LongStream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public abstract class Rules {
    private static final Collector<Integer, ?, Map<Integer, Long>> COUNTING = groupingBy(identity(), counting());

    protected Map<Integer, Long> groupingByDiceValue(DiceRoll roll) {
        return roll.getDices().boxed().collect(COUNTING);
    }

    protected int computeGroupingby(DiceRoll roll, int diceValue) {
        return (int) scoreGreaterThan(roll, diceValue).sum();
    }

    protected LongStream scoreGreaterThan(DiceRoll roll, long diceValue) {
        return groupingByDiceValue(roll).entrySet().stream()
            .filter(v -> v.getValue() >= diceValue)
            .mapToLong(value -> value.getKey() * diceValue);
    }

}
