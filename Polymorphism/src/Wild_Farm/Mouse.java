package Wild_Farm;

public class Mouse extends Mammal {

	protected Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
		super(animalName, animalType, animalWeight, livingRegion);

	}

	@Override
	public void makeSound() {
		System.out.println("SQUEEEAAAK!");

	}

	@Override
	public Integer eat(Food food) {
		if (!food.getClass().getSimpleName().equals("Vegetable")) {
			System.out.println("Mice are not eating that type of food!");

		} else {

			foodEaten = food.getQuantity();
		}
		return foodEaten;
	}

}
