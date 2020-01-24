package fr.renault.kata.yatzy.roll.categories;

public class SmallStraight extends Straight {

    private static final int[] LARGE_STRAIGHT = { 1, 2, 3, 4, 5 };

    public SmallStraight(int... dices) {
        super(dices);
    }

    public int getScore() {
        return occurOnce(LARGE_STRAIGHT) ? 15 : 0;
    }
}
