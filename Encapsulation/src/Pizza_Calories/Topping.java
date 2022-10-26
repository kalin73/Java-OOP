package Pizza_Calories;

public class Topping {
	private String toppingType;
	private double weight;

	public Topping(String toppingType, double weight) {
		setToppingType(toppingType);
		setWeight(weight);
	}

	private void setToppingType(String toppingType) {
		if (!toppingType.equalsIgnoreCase("Meat") && !toppingType.equalsIgnoreCase("Veggies")
				&& !toppingType.equalsIgnoreCase("Cheese") && !toppingType.equalsIgnoreCase("Sauce")) {
			throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
		}
		this.toppingType = toppingType;
	}

	private void setWeight(double weight) {
		if (weight < 1 || weight > 50) {
			throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
		}
		this.weight = weight;
	}

	public double calculateCalories() {
		double toppingCalories = Toppings.valueOf(toppingType.toUpperCase()).calories;
		return weight * 2 * toppingCalories;

	}

}
