package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.Chance;

public class ChanceTest {

	@Test
	public void testChance() {
		ScoresTestData.scoresByCategory.get(Categories.CHANCE).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new Chance(CategoryScore.getDices()).getScore());
		});
	}
}
