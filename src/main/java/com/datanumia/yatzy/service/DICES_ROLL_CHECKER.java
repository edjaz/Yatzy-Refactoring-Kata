package com.datanumia.yatzy.service;

import com.datanumia.yatzy.domain.DiceRoll;

import java.util.function.BiFunction;

public enum DICES_ROLL_CHECKER {
    CHANCE(YatzyService::chance),
    YATZY(YatzyService::yatzy),
    ONES(YatzyService::ones),
    TWOS(YatzyService::twos),
    THREES(YatzyService::threes),
    FOURS(YatzyService::fours),
    FIVES(YatzyService::fives),
    SIXES(YatzyService::sixes),
    PAIR(YatzyService::scorePair),
    TWO_PAIRS(YatzyService::twoPair),
    THREE_OF_A_KIND(YatzyService::threeOfAKind),
    FOUR_OF_A_KIND(YatzyService::fourOfAKind),
    SMALL_STRAIGHT(YatzyService::smallStraight),
    LARGE_STRAIGHT(YatzyService::largeStraight),
    FULL_HOUSE(YatzyService::fullHouse);

    public final BiFunction<YatzyService, DiceRoll, Integer> rule;

    DICES_ROLL_CHECKER(BiFunction<YatzyService, DiceRoll, Integer> rule) {
        this.rule = rule;
    }
}
