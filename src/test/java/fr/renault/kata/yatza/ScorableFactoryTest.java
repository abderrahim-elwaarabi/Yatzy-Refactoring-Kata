package fr.renault.kata.yatza;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.renault.kata.yatza.ScoresTestData.CategoryScore;
import fr.renault.kata.yatzy.Categories;
import fr.renault.kata.yatzy.ScorableFactory;

public class ScorableFactoryTest {

	@Test
	public void testFacory() {
		ScoresTestData.scoresByCategory.keySet().forEach((final Categories category) -> {
			ScoresTestData.scoresByCategory.get(category).forEach((final CategoryScore categoryScore) -> {
				assertEquals(categoryScore.getScore(), ScorableFactory.getScorable(category, categoryScore.getDices()).getScore());
			});
		});
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFactoryException() {
		ScorableFactory.getScorable(Categories.CHANCE, 1,2,3,4);
	}
}
