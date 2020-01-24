package fr.renault.kata.yatzy;

import fr.renault.kata.yatzy.roll.Scorable;
import fr.renault.kata.yatzy.roll.categories.Chance;
import fr.renault.kata.yatzy.roll.categories.Fives;
import fr.renault.kata.yatzy.roll.categories.FourOfAKind;
import fr.renault.kata.yatzy.roll.categories.Fours;
import fr.renault.kata.yatzy.roll.categories.FullHouse;
import fr.renault.kata.yatzy.roll.categories.LargeStraight;
import fr.renault.kata.yatzy.roll.categories.OnePair;
import fr.renault.kata.yatzy.roll.categories.Ones;
import fr.renault.kata.yatzy.roll.categories.Sixes;
import fr.renault.kata.yatzy.roll.categories.SmallStraight;
import fr.renault.kata.yatzy.roll.categories.ThreeOfAKind;
import fr.renault.kata.yatzy.roll.categories.Threes;
import fr.renault.kata.yatzy.roll.categories.TwoPairs;
import fr.renault.kata.yatzy.roll.categories.Twos;
import fr.renault.kata.yatzy.roll.categories.Yatzy;

public enum Categories {
	CHANCE(Chance.class),
	YATZY(Yatzy.class),
	ONES(Ones.class),
	TWOS(Twos.class),
	THREES(Threes.class),
	FOURS(Fours.class),
	FIVES(Fives.class),
	SIXES(Sixes.class),
	PAIR(OnePair.class),
	TWO_PAIRS(TwoPairs.class),
	THREE_OF_A_KIND(ThreeOfAKind.class),
	FOUR_OF_A_KIND(FourOfAKind.class),
	SMALL_STRAIGHT(SmallStraight.class),
	LARGE_STRAIGHT(LargeStraight.class),
	FULL_HOUSE(FullHouse.class);

	private Class<? extends Scorable> value;

	private Categories(final Class<? extends Scorable> value) {
		this.value = value;
	}


	public Class<? extends Scorable> getValue(){
		return value;
	}
}
