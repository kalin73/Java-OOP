package Wild_Farm;

import java.text.DecimalFormat;

public abstract class Animal {
	protected String animalName;
	protected String animalType;
	protected Double animalWeight;
	protected Integer foodEaten;
	protected final DecimalFormat df = new DecimalFormat("#.##");

	protected Animal(String animalName, String animalType, Double animalWeight) {
		this.animalName = animalName;
		this.animalType = animalType;
		this.animalWeight = animalWeight;
		foodEaten = 0;
	}

	public abstract void makeSound();

	public abstract Integer eat(Food food);
}
