package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.Fours;

public class FoursTest {

	@Test
	public void testFours() {
		ScoresTestData.scoresByCategory.get(Categories.FOURS).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new Fours(CategoryScore.getDices()).getScore());
		});
	}
}
