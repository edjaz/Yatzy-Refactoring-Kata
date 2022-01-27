package com.datanumia.yatzy.service;

import com.datanumia.yatzy.domain.DiceRoll;
import com.datanumia.yatzy.domain.YatzyGame;
import com.datanumia.yatzy.domain.rule.Chance;
import com.datanumia.yatzy.domain.rule.FullHouse;
import com.datanumia.yatzy.domain.rule.Yatzy;
import com.datanumia.yatzy.domain.rule.countable.*;
import com.datanumia.yatzy.domain.rule.pair.ScorePair;
import com.datanumia.yatzy.domain.rule.straight.LargeStraight;
import com.datanumia.yatzy.domain.rule.ofking.FourOfAKind;
import com.datanumia.yatzy.domain.rule.ofking.ThreeOfAKind;
import com.datanumia.yatzy.domain.rule.pair.TwoPair;
import com.datanumia.yatzy.domain.rule.straight.SmallStraight;

public class YatzyService implements YatzyGame {

    @Override
    public Integer chance(DiceRoll diceRoll) {
        return Chance.playing(diceRoll);
    }

    @Override
    public Integer yatzy(DiceRoll diceRoll) {
        return Yatzy.playing(diceRoll);
    }

    @Override
    public Integer ones(DiceRoll diceRoll) {
        return Ones.playing(diceRoll);
    }

    @Override
    public Integer twos(DiceRoll diceRoll) {
        return Twos.playing(diceRoll);
    }

    @Override
    public Integer threes(DiceRoll diceRoll) {
        return Threes.playing(diceRoll);
    }

    @Override
    public Integer fours(DiceRoll diceRoll) {
        return Fours.playing(diceRoll);
    }

    @Override
    public Integer fives(DiceRoll diceRoll) {
        return Fives.playing(diceRoll);
    }

    @Override
    public Integer sixes(DiceRoll diceRoll) {
        return Sixes.playing(diceRoll);
    }

    @Override
    public Integer scorePair(DiceRoll diceRoll) {
        return ScorePair.playing(diceRoll);
    }

    @Override
    public Integer twoPair(DiceRoll diceRoll) {
        return TwoPair.playing(diceRoll);
    }

    @Override
    public Integer threeOfAKind(DiceRoll diceRoll) {
        return ThreeOfAKind.playing(diceRoll);
    }

    @Override
    public Integer fourOfAKind(DiceRoll diceRoll) {
        return FourOfAKind.playing(diceRoll);
    }

    @Override
    public Integer smallStraight(DiceRoll diceRoll) {
        return SmallStraight.playing(diceRoll);
    }

    @Override
    public Integer largeStraight(DiceRoll diceRoll) {
        return LargeStraight.playing(diceRoll);
    }

    @Override
    public Integer fullHouse(DiceRoll diceRoll) {
        return FullHouse.playing(diceRoll);
    }
}
