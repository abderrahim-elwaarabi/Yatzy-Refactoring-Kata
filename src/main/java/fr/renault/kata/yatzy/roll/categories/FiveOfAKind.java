package fr.renault.kata.yatzy.roll.categories;

import fr.renault.kata.yatzy.roll.Roll;

public abstract class FiveOfAKind extends Roll {

	public FiveOfAKind(final int... dices) {
		super(dices);
	}

	protected int fiveOfAKind(final int kind) {
		return getKindOccurences(kind) * kind;
	}
}
