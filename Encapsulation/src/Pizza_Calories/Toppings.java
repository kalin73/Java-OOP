package Pizza_Calories;

public enum Toppings {
	MEAT(1.2), VEGGIES(0.8), CHEESE(1.1), SAUSE(0.9);

	final double calories;

	Toppings(double calories) {
		this.calories = calories;
	}
}
