package Salary_Increase;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Person person = new Person();
		List<Person> people = person.createList(sc, n);
		double bonus = Double.parseDouble(sc.nextLine());

		for (Person p : people) {
			p.increaseSalary(bonus);
			System.out.println(p);
		}
	}

}
