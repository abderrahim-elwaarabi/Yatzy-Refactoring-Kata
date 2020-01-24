package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.Twos;

public class TwosTest {

	@Test
	public void testTwos() {
		ScoresTestData.scoresByCategory.get(Categories.TWOS).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new Twos(CategoryScore.getDices()).getScore());
		});
	}
}
