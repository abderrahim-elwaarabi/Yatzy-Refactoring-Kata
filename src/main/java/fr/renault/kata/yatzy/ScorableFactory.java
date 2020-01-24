package fr.renault.kata.yatzy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import fr.renault.kata.yatzy.roll.Scorable;

public class ScorableFactory {


	public static Scorable getScorable(final Categories category, final int... dices) {
		try {
			final Constructor<? extends Scorable> scorable = category.getValue().getConstructor(int[].class);
			return scorable.newInstance(dices);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw new IllegalArgumentException(e);
		}
	}

}
