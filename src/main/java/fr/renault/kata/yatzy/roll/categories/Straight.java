package fr.renault.kata.yatzy.roll.categories;

import fr.renault.kata.yatzy.roll.Roll;

public abstract class Straight extends Roll {

	public Straight(final int... dices) {
		super(dices);
	}

	protected boolean occurOnce(final int[] values) {
		for (final int value : values) {
			if(!occursOnce(value)) {
				return false;
			}
		}
		return true;
	}

	private boolean occursOnce(final int value) {
		return getKindOccurences(value) == 1;
	}
}
