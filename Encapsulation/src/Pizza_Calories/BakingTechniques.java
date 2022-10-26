package Pizza_Calories;

public enum BakingTechniques {
	CRISPY(0.9), CHEWY(1.1), HOMEMADE(1.0);

	final double calories;

	BakingTechniques(double calories) {
		this.calories = calories;
	}
}
