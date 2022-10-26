package Pizza_Calories;

public class Dough {
	private String flourType;
	private String bakingTechnique;
	private double weight;

	public Dough(String flourType, String bakingTechnique, double weight) {
		setFlourType(flourType);
		setBakingTechnique(bakingTechnique);
		setWeight(weight);
	}

	private void setFlourType(String flourType) {
		if (!flourType.equalsIgnoreCase("White") && !flourType.equalsIgnoreCase("Wholegrain")) {
			throw new IllegalArgumentException("Invalid type of dough.");
		}
		this.flourType = flourType;
	}

	private void setBakingTechnique(String bakingTechnique) {
		if (!bakingTechnique.equalsIgnoreCase("Crispy") && !bakingTechnique.equalsIgnoreCase("Chewy")
				&& !bakingTechnique.equalsIgnoreCase("Homemade")) {
			throw new IllegalArgumentException("Invalid type of dough.");
		}
		this.bakingTechnique = bakingTechnique;
	}

	private void setWeight(double weight) {
		if (weight < 1 || weight > 200) {
			throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
		}
		this.weight = weight;
	}

	public double calculateCalories() {
		double flourCalories = FlourTypes.valueOf(flourType.toUpperCase()).calories;
		double bakingTechniqueCalories = BakingTechniques.valueOf(bakingTechnique.toUpperCase()).calories;
		double calories = weight * 2 * flourCalories * bakingTechniqueCalories;
		return calories;

	}

}
