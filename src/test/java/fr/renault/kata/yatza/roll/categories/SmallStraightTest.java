package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.SmallStraight;

public class SmallStraightTest {

	@Test
	public void testLargeStraight() {
		ScoresTestData.scoresByCategory.get(Categories.SMALL_STRAIGHT).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new SmallStraight(CategoryScore.getDices()).getScore());
		});
	}
}
