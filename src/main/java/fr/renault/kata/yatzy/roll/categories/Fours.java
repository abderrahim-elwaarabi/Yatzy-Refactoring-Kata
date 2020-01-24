package fr.renault.kata.yatzy.roll.categories;

public class Fours extends FiveOfAKind {

    public Fours(int... dices) {
        super(dices);
    }

    public int getScore() {
        return fiveOfAKind(4);
    }
}
