package Animal_Farm;

public class Chicken {
	private String name;
	private int age;

	private void setName(String name) {
		if (name == null || name.equals("") || name.equals(" ")) {
			throw new IllegalArgumentException("Name cannot be empty.");
		}
		this.name = name;
	}

	private void setAge(int age) {
		if (age < 0 || age > 15) {
			throw new IllegalArgumentException("Age should be between 0 and 15.");
		}
		this.age = age;
	}

	public Chicken(String name, int age) {
		setName(name);
		setAge(age);
	}

	public double productPerDay() {
		return calculateProductPerDay();
	}

	private double calculateProductPerDay() {
		if (this.age >= 0 && this.age <= 5) {
			return 2.0;
		} else if (this.age >= 6 && this.age <= 11) {
			return 1.0;
		} else {
			return 0.75;
		}

	}

	@Override
	public String toString() {

		return String.format("Chicken %s (age %d) can poduce %.2f eggs per day.", name, age, productPerDay());
	}
}
