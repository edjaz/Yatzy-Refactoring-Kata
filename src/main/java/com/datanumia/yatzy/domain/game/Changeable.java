package com.datanumia.yatzy.domain.game;

import com.datanumia.yatzy.domain.DiceRoll;

public interface Changeable {
    Integer chance(DiceRoll diceRoll);
}
