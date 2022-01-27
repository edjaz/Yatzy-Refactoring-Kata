package com.datanumia.yatzy.domain.rule;

import com.datanumia.yatzy.domain.DiceRoll;

public interface YatzyGameRule {
    Integer play(DiceRoll roll);
}
