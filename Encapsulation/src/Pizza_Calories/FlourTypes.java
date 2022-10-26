package Pizza_Calories;

public enum FlourTypes {
	WHITE(1.5), WHOLEGRAIN(1.0);

	final double calories;

	FlourTypes(double calories) {
		this.calories = calories;
	}
}
