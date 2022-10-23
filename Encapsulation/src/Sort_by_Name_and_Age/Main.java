package Sort_by_Name_and_Age;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<Person> people = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			String[] person = sc.nextLine().split(" ");
			String firstName = person[0];
			String lastName = person[1];
			int age = Integer.parseInt(person[2]);

			people.add(new Person(firstName, lastName, age));

		}
		people = people.stream()
				.sorted((f, s) -> f.getLastName().compareTo(s.getLastName()))
				.sorted((f, s) -> f.getFirstName().compareTo(s.getFirstName()))
				.collect(Collectors.toList());
		for (Person p : people) {
			System.out.println(p);
		}
		sc.close();
	}

}
