package Food_Shortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Buyer> map = new HashMap<>();

		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String[] input = sc.nextLine().split(" ");
			addToMap(input, map);

		}

		String input = sc.nextLine();

		while (!input.equals("End")) {

			buyFood(input, map);
			input = sc.nextLine();
		}
		printResult(input, map);
		sc.close();
	}

	public static void addToMap(String[] input, Map<String, Buyer> map) {

		if (input.length == 4) {
			map.put(input[0], new Citizen(input[0], Integer.parseInt(input[1]), input[2], input[3]));

		} else if (input.length == 3) {
			map.put(input[0], new Rebel(input[0], Integer.parseInt(input[1]), input[2]));

		}
	}

	public static void buyFood(String name, Map<String, Buyer> map) {
		if (map.containsKey(name)) {
			map.get(name).buyFood();
		}
	}

	public static void printResult(String birthYear, Map<String, Buyer> map) {
		int total = 0;
		for (String s : map.keySet()) {

			total += map.get(s).getFood();

		}
		System.out.println(total);
	}
}
