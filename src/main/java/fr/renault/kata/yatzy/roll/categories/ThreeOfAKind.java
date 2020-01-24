package fr.renault.kata.yatzy.roll.categories;

public class ThreeOfAKind extends NumberOfAKind {

    public ThreeOfAKind(int... dices) {
        super(dices);
    }

    public int getScore() {
        return nOfAKind(3);
    }
}
