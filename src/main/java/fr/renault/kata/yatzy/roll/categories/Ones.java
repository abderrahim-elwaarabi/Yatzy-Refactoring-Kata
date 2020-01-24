package fr.renault.kata.yatzy.roll.categories;

public class Ones extends FiveOfAKind {

    public Ones(int... dices) {
        super(dices);
    }

    public int getScore() {
        return fiveOfAKind(1);
    }
}
