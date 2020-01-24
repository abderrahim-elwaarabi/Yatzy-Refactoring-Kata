package fr.renault.kata.yatzy.roll.categories;

public class Sixes extends FiveOfAKind {

    public Sixes(int... dices) {
        super(dices);
    }

    public int getScore() {
        return fiveOfAKind(6);
    }
}
