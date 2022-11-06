package Wild_Farm;

public class Cat extends Felime {

	private String breed;

	protected Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
		super(animalName, animalType, animalWeight, livingRegion);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	@Override
	public void makeSound() {
		System.out.println("Meowwww");
	}

	@Override
	public Integer eat(Food food) {
		foodEaten = food.getQuantity();
		return foodEaten;
	}

	@Override
	public String toString() {
		return String.format("Cat[%s, %s, %s, %s, %d]", this.animalName, this.breed, df.format(this.animalWeight),
				this.livingRegion, this.foodEaten);
	}
}
