package fr.renault.kata.yatza;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.renault.kata.yatzy.Categories;

public class ScoresTestData {

	public static final Map<Categories, List<CategoryScore>> scoresByCategory = new HashMap<>();

	static {
		scoresByCategory.put(Categories.CHANCE,
				Arrays.asList(new CategoryScore(14, 1, 1, 3, 3, 6), new CategoryScore(21, 4, 5, 5, 6, 1)));
		scoresByCategory.put(Categories.YATZY,
				Arrays.asList(new CategoryScore(50, 1, 1, 1, 1, 1), new CategoryScore(0, 1, 1, 1, 2, 1)));
		scoresByCategory.put(Categories.ONES, Arrays.asList(new CategoryScore(2, 1, 1, 3, 3, 6),
				new CategoryScore(1, 4, 5, 5, 6, 1), new CategoryScore(0, 4, 5, 5, 6, 3)));
		scoresByCategory.put(Categories.TWOS, Arrays.asList(new CategoryScore(4, 1, 2, 2, 3, 6),
				new CategoryScore(10, 2, 2, 2, 2, 2), new CategoryScore(0, 3, 3, 3, 3, 1)));
		scoresByCategory.put(Categories.THREES, Arrays.asList(new CategoryScore(6, 1, 1, 3, 3, 6),
				new CategoryScore(0, 4, 5, 5, 6, 1), new CategoryScore(12, 3, 3, 3, 6, 3)));
		scoresByCategory.put(Categories.FOURS, Arrays.asList(new CategoryScore(0, 1, 1, 3, 3, 6),
				new CategoryScore(4, 4, 5, 5, 6, 1), new CategoryScore(16, 4, 5, 4, 4, 4)));
		scoresByCategory.put(Categories.FIVES, Arrays.asList(new CategoryScore(0, 1, 1, 3, 3, 6),
				new CategoryScore(10, 4, 5, 5, 6, 1), new CategoryScore(20, 5, 5, 5, 6, 5)));
		scoresByCategory.put(Categories.SIXES, Arrays.asList(new CategoryScore(6, 1, 1, 3, 3, 6),
				new CategoryScore(0, 4, 5, 5, 3, 1), new CategoryScore(30, 6, 6, 6, 6, 6)));
		scoresByCategory.put(Categories.PAIR, Arrays.asList(new CategoryScore(6, 1, 1, 3, 3, 6),
				new CategoryScore(10, 4, 4, 5, 5, 5), new CategoryScore(0, 1, 2, 3, 4, 5)));
		scoresByCategory.put(Categories.TWO_PAIRS, Arrays.asList(new CategoryScore(8, 1, 1, 3, 3, 6),
				new CategoryScore(0, 4, 5, 5, 6, 1), new CategoryScore(22, 6, 5, 5, 6, 6)));
		scoresByCategory.put(Categories.THREE_OF_A_KIND, Arrays.asList(new CategoryScore(0, 1, 1, 3, 3, 6),
				new CategoryScore(15, 4, 5, 5, 6, 5), new CategoryScore(18, 6, 6, 6, 6, 6)));
		scoresByCategory.put(Categories.FOUR_OF_A_KIND, Arrays.asList(new CategoryScore(0, 1, 1, 3, 3, 3),
				new CategoryScore(20, 5, 5, 5, 6, 5), new CategoryScore(24, 6, 6, 6, 6, 6)));
		scoresByCategory.put(Categories.SMALL_STRAIGHT,
				Arrays.asList(new CategoryScore(15, 1, 4, 5, 3, 2), new CategoryScore(0, 1, 2, 3, 4, 4)));
		scoresByCategory.put(Categories.LARGE_STRAIGHT, Arrays.asList(new CategoryScore(20, 6, 3, 2, 4, 5),
				new CategoryScore(0, 1, 2, 3, 4, 5), new CategoryScore(0, 5, 2, 3, 4, 5)));
		scoresByCategory.put(Categories.FULL_HOUSE, Arrays.asList(new CategoryScore(11, 1, 1, 3, 3, 3),
				new CategoryScore(0, 4, 5, 5, 4, 1), new CategoryScore(0, 5, 5, 5, 5, 5)));
	}

	public static class CategoryScore {
		private final int score;
		private final int[] dices;

		public CategoryScore(final int score, final int... dices) {
			this.score = score;
			this.dices = dices;
		}

		public int getScore() {
			return score;
		}

		public int[] getDices() {
			return dices;
		}
	}
}
