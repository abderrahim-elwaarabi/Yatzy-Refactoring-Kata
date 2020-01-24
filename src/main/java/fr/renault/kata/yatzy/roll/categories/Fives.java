package fr.renault.kata.yatzy.roll.categories;

public class Fives extends FiveOfAKind {

    public Fives(int... dices) {
        super(dices);
    }

    public int getScore() {
        return fiveOfAKind(5);
    }
}
