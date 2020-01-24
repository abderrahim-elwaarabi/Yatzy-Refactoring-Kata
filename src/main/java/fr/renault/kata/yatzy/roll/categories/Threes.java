package fr.renault.kata.yatzy.roll.categories;

public class Threes extends FiveOfAKind {

    public Threes(int... dices) {
        super(dices);
    }

    public int getScore() {
        return fiveOfAKind(3);
    }
}
