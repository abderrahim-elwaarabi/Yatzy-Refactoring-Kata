package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.FullHouse;

public class FullHouseTest {

	@Test
	public void testFullHouse() {
		ScoresTestData.scoresByCategory.get(Categories.FULL_HOUSE).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new FullHouse(CategoryScore.getDices()).getScore());
		});
	}
}
