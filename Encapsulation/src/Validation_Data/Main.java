package Validation_Data;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<Person> people = Person.createList(sc, n);

		int bonus = Integer.parseInt(sc.nextLine());

		for (Person p : people) {
			p.increaseSalary(bonus);
			System.out.println(p);

		}
	}

}
