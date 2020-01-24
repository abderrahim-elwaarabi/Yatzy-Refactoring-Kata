package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.OnePair;

public class OnePairTest {

	@Test
	public void testOnePair() {
		ScoresTestData.scoresByCategory.get(Categories.PAIR).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new OnePair(CategoryScore.getDices()).getScore());
		});
	}
}
