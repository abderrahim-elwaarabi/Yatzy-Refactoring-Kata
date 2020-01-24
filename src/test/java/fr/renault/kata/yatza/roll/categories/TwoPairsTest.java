package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.TwoPairs;

public class TwoPairsTest {

	@Test
	public void testTwoPairs() {
		ScoresTestData.scoresByCategory.get(Categories.TWO_PAIRS).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new TwoPairs(CategoryScore.getDices()).getScore());
		});
	}
}
