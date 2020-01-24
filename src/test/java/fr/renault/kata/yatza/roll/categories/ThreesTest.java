package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.Threes;

public class ThreesTest {

	@Test
	public void testThrees() {
		ScoresTestData.scoresByCategory.get(Categories.THREES).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new Threes(CategoryScore.getDices()).getScore());
		});
	}
}
