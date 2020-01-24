package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.Yatzy;

public class YatzyTest {

	@Test
	public void testYatzy() {
		ScoresTestData.scoresByCategory.get(Categories.YATZY).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new Yatzy(CategoryScore.getDices()).getScore());
		});
	}
}
