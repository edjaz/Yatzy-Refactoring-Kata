import com.datanumia.yatzy.domain.DiceRoll;
import com.datanumia.yatzy.service.YatzyService;
import org.junit.*;
import com.datanumia.yatzy.service.DICES_ROLL_CHECKER;

import static org.junit.Assert.*;

public class YatzyContainerTest {
     final YatzyService yatzyService = new YatzyService();

    @Test
    public void chance_scores_sum_of_all_dice() {
        assertEquals(Integer.valueOf(15), DICES_ROLL_CHECKER.CHANCE.rule.apply(yatzyService, DiceRoll.of(2,3,4,5,1)));
        assertEquals(Integer.valueOf(16), DICES_ROLL_CHECKER.CHANCE.rule.apply(yatzyService, DiceRoll.of(3,3,4,5,1)));
    }

    @Test public void yatzy_scores_50() {
        assertEquals(Integer.valueOf(50), DICES_ROLL_CHECKER.YATZY.rule.apply(yatzyService, DiceRoll.of(4,4,4,4,4)));
        assertEquals(Integer.valueOf(50), DICES_ROLL_CHECKER.YATZY.rule.apply(yatzyService, DiceRoll.of(6,6,6,6,6)));
        assertEquals(Integer.valueOf(0), DICES_ROLL_CHECKER.YATZY.rule.apply(yatzyService, DiceRoll.of(6,6,6,6,3)));
    }

    @Test public void test_1s() {
        assertEquals(Integer.valueOf(1), DICES_ROLL_CHECKER.ONES.rule.apply(yatzyService, DiceRoll.of(1,2,3,4,5)));
        assertEquals(Integer.valueOf(2), DICES_ROLL_CHECKER.ONES.rule.apply(yatzyService, DiceRoll.of(1,2,1,4,5)));
        assertEquals(Integer.valueOf(0), DICES_ROLL_CHECKER.ONES.rule.apply(yatzyService, DiceRoll.of(6,2,2,4,5)));
        assertEquals(Integer.valueOf(4), DICES_ROLL_CHECKER.ONES.rule.apply(yatzyService, DiceRoll.of(1,2,1,1,1)));
    }

    @Test
    public void test_2s() {
        assertEquals(Integer.valueOf(4), DICES_ROLL_CHECKER.TWOS.rule.apply(yatzyService, DiceRoll.of(1,2,3,2,6)));
        assertEquals(Integer.valueOf(10), DICES_ROLL_CHECKER.TWOS.rule.apply(yatzyService, DiceRoll.of(2,2,2,2,2)));
    }

    @Test
    public void test_threes() {
        assertEquals(Integer.valueOf(6), DICES_ROLL_CHECKER.THREES.rule.apply(yatzyService, DiceRoll.of(1,2,3,2,3)));
        assertEquals(Integer.valueOf(12), DICES_ROLL_CHECKER.THREES.rule.apply(yatzyService, DiceRoll.of(2,3,3,3,3)));
    }

    @Test
    public void fours_test() {
        assertEquals(Integer.valueOf(12), DICES_ROLL_CHECKER.FOURS.rule.apply(yatzyService, DiceRoll.of(4,4,4,5,5)));
        assertEquals(Integer.valueOf(8), DICES_ROLL_CHECKER.FOURS.rule.apply(yatzyService, DiceRoll.of(4,4,5,5,5)));
        assertEquals(Integer.valueOf(4), DICES_ROLL_CHECKER.FOURS.rule.apply(yatzyService, DiceRoll.of(4,5,5,5,5)));
    }

    @Test
    public void fives() {
        assertEquals(Integer.valueOf(10), DICES_ROLL_CHECKER.FIVES.rule.apply(yatzyService, DiceRoll.of(4,4,4,5,5)));
        assertEquals(Integer.valueOf(15), DICES_ROLL_CHECKER.FIVES.rule.apply(yatzyService, DiceRoll.of(4,4,5,5,5)));
        assertEquals(Integer.valueOf(20), DICES_ROLL_CHECKER.FIVES.rule.apply(yatzyService, DiceRoll.of(4,5,5,5,5)));
    }

    @Test
    public void sixes_test() {
        assertEquals(Integer.valueOf(0), DICES_ROLL_CHECKER.SIXES.rule.apply(yatzyService, DiceRoll.of(4,4,4,5,5)));
        assertEquals(Integer.valueOf(6), DICES_ROLL_CHECKER.SIXES.rule.apply(yatzyService, DiceRoll.of(4,4,6,5,5)));
        assertEquals(Integer.valueOf(18), DICES_ROLL_CHECKER.SIXES.rule.apply(yatzyService, DiceRoll.of(6,5,6,6,5)));
    }

    @Test
    public void one_pair() {
        assertEquals(Integer.valueOf(6), DICES_ROLL_CHECKER.PAIR.rule.apply(yatzyService, DiceRoll.of(3,4,3,5,6)));
        assertEquals(Integer.valueOf(10), DICES_ROLL_CHECKER.PAIR.rule.apply(yatzyService, DiceRoll.of(5,3,3,3,5)));
        assertEquals(Integer.valueOf(12), DICES_ROLL_CHECKER.PAIR.rule.apply(yatzyService, DiceRoll.of(5,3,6,6,5)));
    }

    @Test
    public void two_Pair() {
        assertEquals(Integer.valueOf(16), DICES_ROLL_CHECKER.TWO_PAIRS.rule.apply(yatzyService, DiceRoll.of(3,3,5,4,5)));
        assertEquals(Integer.valueOf(16), DICES_ROLL_CHECKER.TWO_PAIRS.rule.apply(yatzyService, DiceRoll.of(3,3,5,5,5)));
    }

    @Test
    public void three_of_a_kind() {
        assertEquals(Integer.valueOf(9), DICES_ROLL_CHECKER.THREE_OF_A_KIND.rule.apply(yatzyService, DiceRoll.of(3,3,3,4,5)));
        assertEquals(Integer.valueOf(15), DICES_ROLL_CHECKER.THREE_OF_A_KIND.rule.apply(yatzyService, DiceRoll.of(5,3,5,4,5)));
        assertEquals(Integer.valueOf(9), DICES_ROLL_CHECKER.THREE_OF_A_KIND.rule.apply(yatzyService, DiceRoll.of(3,3,3,3,5)));
        assertEquals(Integer.valueOf(9), DICES_ROLL_CHECKER.THREE_OF_A_KIND.rule.apply(yatzyService, DiceRoll.of(3,3,3,3,3)));
    }

    @Test
    public void four_of_a_knd() {
        assertEquals(Integer.valueOf(12), DICES_ROLL_CHECKER.FOUR_OF_A_KIND.rule.apply(yatzyService, DiceRoll.of(3,3,3,3,5)));
        assertEquals(Integer.valueOf(20), DICES_ROLL_CHECKER.FOUR_OF_A_KIND.rule.apply(yatzyService, DiceRoll.of(5,5,5,4,5)));
    }

    @Test
    public void smallStraight() {
        assertEquals(Integer.valueOf(15), DICES_ROLL_CHECKER.SMALL_STRAIGHT.rule.apply(yatzyService, DiceRoll.of(1,2,3,4,5)));
        assertEquals(Integer.valueOf(15), DICES_ROLL_CHECKER.SMALL_STRAIGHT.rule.apply(yatzyService, DiceRoll.of(2,3,4,5,1)));
        assertEquals(Integer.valueOf(0), DICES_ROLL_CHECKER.SMALL_STRAIGHT.rule.apply(yatzyService, DiceRoll.of(1,2,2,4,5)));
    }

    @Test
    public void largeStraight() {
        assertEquals(Integer.valueOf(20), DICES_ROLL_CHECKER.LARGE_STRAIGHT.rule.apply(yatzyService, DiceRoll.of(6,2,3,4,5)));
        assertEquals(Integer.valueOf(20), DICES_ROLL_CHECKER.LARGE_STRAIGHT.rule.apply(yatzyService, DiceRoll.of(2,3,4,5,6)));
        assertEquals(Integer.valueOf(0), DICES_ROLL_CHECKER.LARGE_STRAIGHT.rule.apply(yatzyService, DiceRoll.of(1,2,2,4,5)));
    }

    @Test
    public void fullHouse() {
        assertEquals(Integer.valueOf(18), DICES_ROLL_CHECKER.FULL_HOUSE.rule.apply(yatzyService, DiceRoll.of(6,2,2,2,6)));
        assertEquals(Integer.valueOf(0), DICES_ROLL_CHECKER.FULL_HOUSE.rule.apply(yatzyService, DiceRoll.of(2,3,4,5,6)));
    }
}
