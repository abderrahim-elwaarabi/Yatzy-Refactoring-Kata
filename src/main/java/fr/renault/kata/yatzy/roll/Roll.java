package fr.renault.kata.yatzy.roll;

public abstract class Roll implements Scorable {

	protected static final int NUMBER_OF_DICES = 5;

	private final int[] dices;

	protected Roll(final int... dices) {
		if (dices.length != 5) {
			throw new RollException(String.format("The roll must be played with %d dices.", NUMBER_OF_DICES));
		}
		this.dices = dices;
	}

	protected int getKindOccurences(final int kind) {
		int totalOccurences = 0;
		for (final int value : dices) {
			if (value == kind) {
				totalOccurences++;
			}
		}
		return totalOccurences;
	}
}
