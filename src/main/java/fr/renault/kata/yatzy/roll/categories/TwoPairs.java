package fr.renault.kata.yatzy.roll.categories;

public class TwoPairs extends Pair {

	public TwoPairs(final int... dices) {
		super(dices);
	}

	public int getScore() {
		return super.getScore(2);
	}
}
