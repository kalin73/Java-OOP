package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		List<Animal> animals = new ArrayList<>();

		while (!input[0].equals("Beast!")) {
			String className = input[0];
			Animal animal = null;
			try {
				switch (className) {

				case "Cat":
					input = sc.nextLine().split(" ");
					animal = new Cat(input[0], Integer.parseInt(input[1]), input[2]);
					animals.add(animal);
					break;

				case "Dog":
					input = sc.nextLine().split(" ");
					animal = new Dog(input[0], Integer.parseInt(input[1]), input[2]);
					animals.add(animal);
					break;

				case "Frog":
					input = sc.nextLine().split(" ");
					animal = new Frog(input[0], Integer.parseInt(input[1]), input[2]);
					animals.add(animal);
					break;

				case "Kitten":
					input = sc.nextLine().split(" ");
					animal = new Kitten(input[0], Integer.parseInt(input[1]));
					animals.add(animal);
					break;

				case "Tomcat":
					input = sc.nextLine().split(" ");
					animal = new Tomcat(input[0], Integer.parseInt(input[1]));
					animals.add(animal);
					break;

				default:
					throw new RuntimeException("Invalid input!");
				}

			} catch (Exception e) {
				System.out.println("Invalid input!");
			}
			input = sc.nextLine().split(" ");
		}
		sc.close();
		animals.forEach(x -> System.out.println(x.toString()));
	}

}
