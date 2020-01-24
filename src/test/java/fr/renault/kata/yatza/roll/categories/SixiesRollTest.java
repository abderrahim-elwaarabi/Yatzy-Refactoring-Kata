package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.Sixes;

public class SixiesRollTest {

	@Test
	public void testSixes() {
		ScoresTestData.scoresByCategory.get(Categories.SIXES).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new Sixes(CategoryScore.getDices()).getScore());
		});
	}
}
