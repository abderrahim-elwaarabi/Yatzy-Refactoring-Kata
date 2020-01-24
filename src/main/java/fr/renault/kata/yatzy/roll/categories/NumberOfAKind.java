package fr.renault.kata.yatzy.roll.categories;

import fr.renault.kata.yatzy.roll.Roll;

public abstract class NumberOfAKind extends Roll {

	public NumberOfAKind(final int... dices) {
		super(dices);
	}

	protected int nOfAKind(final int kind) {
		for (int i = 0; i <= NUMBER_OF_DICES; i++) {
			if (getKindOccurences(i + 1) >= kind) {
				return (i + 1) * kind;
			}
		}
		return 0;
	}
}
