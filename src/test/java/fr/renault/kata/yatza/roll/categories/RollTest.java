package fr.renault.kata.yatza.roll.categories;

import org.junit.Test;

import fr.renault.kata.yatzy.roll.RollException;
import fr.renault.kata.yatzy.roll.categories.Yatzy;

public class RollTest {

	@Test(expected = RollException.class)
	public void testRollException() {
		new Yatzy();
	}
}
