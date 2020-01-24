package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.LargeStraight;

public class LargeStraightTest {

	@Test
	public void testSmallStraight() {
		ScoresTestData.scoresByCategory.get(Categories.LARGE_STRAIGHT).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new LargeStraight(CategoryScore.getDices()).getScore());
		});
	}
}
