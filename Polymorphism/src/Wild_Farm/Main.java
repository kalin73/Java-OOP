package Wild_Farm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Food food = null;
		Animal animal = null;
		String[] input = sc.nextLine().split(" ");
		ArrayList<Animal> animals = new ArrayList<>();
		int counter = 0;

		while (!input[0].equals("End")) {
			counter++;
			try {
				if (counter % 2 == 0) {
					food = eatFood(input, food);
					animal.makeSound();
					animal.eat(food);
					animals.add(animal);
				} else {
					animal = createAnimal(input);

				}

			} catch (Exception e) {

			}
			input = sc.nextLine().split(" ");
		}
		animals.forEach(x -> {
			System.out.println(x);
		});
		sc.close();
	}

	public static Food eatFood(String[] input, Food food) {
		String typeFood = input[0];
		Integer quantity = Integer.parseInt(input[1]);

		if (typeFood.equals("Meat")) {
			food = new Meat(quantity);
		} else if (typeFood.equals("Vegetable")) {
			food = new Vegetable(quantity);
		}
		return food;
	}

	public static Animal createAnimal(String[] input) {
		String animalType = input[0];
		String animalName = input[1];
		Double animalWeight = Double.parseDouble(input[2]);
		String animalLivingRegiong = input[3];
		Animal animal = null;

		switch (animalType) {
		case "Cat":
			String catBreed = input[4];
			animal = new Cat(animalName, animalType, animalWeight, animalLivingRegiong, catBreed);
			break;

		case "Tiger":
			animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegiong);
			break;

		case "Mouse":
			animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegiong);
			break;

		case "Zebra":
			animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegiong);
			break;
		}

		return animal;
	}
}
