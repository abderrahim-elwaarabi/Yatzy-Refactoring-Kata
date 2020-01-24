package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.Ones;

public class OnesTest {

	@Test
	public void testOnes() {
		ScoresTestData.scoresByCategory.get(Categories.ONES).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new Ones(CategoryScore.getDices()).getScore());
		});
	}
}
