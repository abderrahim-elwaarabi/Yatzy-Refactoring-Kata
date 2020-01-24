package fr.renault.kata.yatzy.roll.categories;

import fr.renault.kata.yatzy.roll.Roll;

public class Yatzy extends Roll {

    public Yatzy(int... dices) {
        super(dices);
    }

    public int getScore() {
        for (int i = 0; i <= NUMBER_OF_DICES; i++)
            if (getKindOccurences(i + 1) == NUMBER_OF_DICES)
                return 50;
        return 0;
    }
}
