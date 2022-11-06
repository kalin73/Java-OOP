package Wild_Farm;

public class Tiger extends Felime {

	protected Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
		super(animalName, animalType, animalWeight, livingRegion);
	}

	@Override
	public void makeSound() {
		System.out.println("ROAAR!!!");

	}

	@Override
	public Integer eat(Food food) {
		if (!food.getClass().getSimpleName().equals("Meat")) {
			System.out.println(this.animalType + "s are not eating that type of food!");

		} else {

			foodEaten = food.getQuantity();
		}
		return foodEaten;
	}

}
