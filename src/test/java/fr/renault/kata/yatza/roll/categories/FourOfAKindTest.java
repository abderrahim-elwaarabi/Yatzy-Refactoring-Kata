package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.FourOfAKind;

public class FourOfAKindTest {

	@Test
	public void testFourOfAKind() {
		ScoresTestData.scoresByCategory.get(Categories.FOUR_OF_A_KIND).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new FourOfAKind(CategoryScore.getDices()).getScore());
		});
	}
}
