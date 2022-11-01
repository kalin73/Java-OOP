package Border_Control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Identifiable> ids = new ArrayList<>();

		String[] input = sc.nextLine().split(" ");

		while (!input[0].equals("End")) {
			addId(input, ids);
			input = sc.nextLine().split(" ");
		}

		String fakeId = sc.nextLine();
		filterFakeIds(fakeId, ids);
		
		sc.close();
	}

	public static void addId(String[] input, List<Identifiable> ids) {
		if (input.length == 2) {
			ids.add(new Robot(input[0], input[1]));

		} else {
			ids.add(new Citizen(input[0], Integer.parseInt(input[1]), input[2]));

		}
	}

	public static void filterFakeIds(String fakeId, List<Identifiable> ids) {
		ids.stream().filter(x -> x.getId().substring(x.getId().length() - 3, x.getId().length()).equals(fakeId))
				.forEach(x -> System.out.println(x.getId()));
	}
}
