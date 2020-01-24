package fr.renault.kata.yatza.roll.categories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData;
import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.roll.categories.ThreeOfAKind;

public class ThreeOfAKindTest {

	@Test
	public void testThreeOfAKind() {
		ScoresTestData.scoresByCategory.get(Categories.THREE_OF_A_KIND).stream().forEach((final CategoryScore CategoryScore) -> {
			assertEquals(CategoryScore.getScore(), new ThreeOfAKind(CategoryScore.getDices()).getScore());
		});
	}
}
