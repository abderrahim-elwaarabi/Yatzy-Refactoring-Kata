package fr.renault.kata.yatzy.roll.categories;

import fr.renault.kata.yatzy.roll.Roll;

public abstract class Pair extends Roll {

	public Pair(final int... dices) {
		super(dices);
	}

	protected int getScore(final int expectedNumberOfPairs) {
		int pairsFound = 0;
		int score = 0;
		for (int i = 0; i <= NUMBER_OF_DICES; i++) {
			if (getKindOccurences(6 - i) >= 2) {
				pairsFound++;
				score += (6 - i);
				if(pairsFound >= expectedNumberOfPairs) {
					break;
				}
			}
		}
		if (pairsFound >= expectedNumberOfPairs) {
			return score * 2;
		} else {
			return 0;
		}
	}
}
