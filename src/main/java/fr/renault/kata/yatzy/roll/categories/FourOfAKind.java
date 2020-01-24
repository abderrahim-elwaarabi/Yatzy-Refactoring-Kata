package fr.renault.kata.yatzy.roll.categories;

public class FourOfAKind extends NumberOfAKind {

    public FourOfAKind(int... dices) {
        super(dices);
    }

    public int getScore() {
        return nOfAKind(4);
    }
}
