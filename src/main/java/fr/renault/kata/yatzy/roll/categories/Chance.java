package fr.renault.kata.yatzy.roll.categories;

import fr.renault.kata.yatzy.roll.Roll;

public class Chance extends Roll {

    public Chance(int... dices) {
        super(dices);
    }

    public int getScore() {
        int total = 0;
        for (int i = 0; i <= NUMBER_OF_DICES; i++)
            total += (i + 1) * getKindOccurences(i + 1);
        return total;
    }
}
