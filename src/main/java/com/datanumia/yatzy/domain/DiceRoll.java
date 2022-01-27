package com.datanumia.yatzy.domain;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DiceRoll {
    protected int[] dices;

    private DiceRoll(int... dices) {
        this.dices = dices;
    }

    public IntStream getDices() {
        return Arrays.stream(dices);
    }

    public int length() {
        return dices.length;
    }
    public static DiceRoll of(int... dices) {
        return new DiceRoll(dices);
    }
}
