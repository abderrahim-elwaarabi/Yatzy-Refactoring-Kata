package fr.renault.kata.yatzy.roll.categories;

public class Twos extends FiveOfAKind {

    public Twos(int... dices) {
        super(dices);
    }

    public int getScore() {
        return fiveOfAKind(2);
    }
}
