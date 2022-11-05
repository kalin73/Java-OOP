package Birthday_Celebrations;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Birthable> list = new ArrayList<>();
		String[] input = scanner.nextLine().split(" ");

		while (!input[0].equals("End")) {

			addToList(input, list);
			input = scanner.nextLine().split(" ");

		}
		String birthYear = scanner.nextLine();
		printResult(birthYear, list);

		scanner.close();
	}

	public static void addToList(String[] input, ArrayList<Birthable> list) {

		if (input[0].equals("Citizen")) {
			list.add(new Citizen(input[1], Integer.parseInt(input[2]), input[3], input[4]));

		} else if (input[0].equals("Pet")) {
			list.add(new Pet(input[1], input[2]));

		}
	}

	public static void printResult(String birthYear, ArrayList<Birthable> list) {
		list.stream()
		.filter(x -> x.getBirthDate().substring(x.getBirthDate().length() - 4, x.getBirthDate().length())
				.equals(birthYear))
		.forEach(x -> System.out.println(x.getBirthDate()));
	}
}
