package fr.renault.kata.yatzy.roll.categories;

public class OnePair extends Pair {

	public OnePair(final int... dices) {
		super(dices);
	}

	public int getScore() {
		return super.getScore(1);
	}
}
