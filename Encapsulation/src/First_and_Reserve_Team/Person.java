package First_and_Reserve_Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private double salary;

	public Person(String firstName, String lastName, int age, double salary) {

		this.firstName = firstName;

		this.lastName = lastName;

		this.age = age;

		this.salary = salary;

	}

	public Person() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName.length() < 3) {
			throw new IllegalArgumentException("First name cannot be less than 3 symbols");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName.length() < 3) {
			throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
		}
		this.lastName = lastName;
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("Age cannot be zero or negative integer");
		}
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary < 460.0) {
			throw new IllegalArgumentException("Salary cannot be less than 460 leva");
		}
		this.salary = salary;
	}

	@Override
	public String toString() {
		return getFirstName() + " " + getLastName() + " gets " + getSalary() + " leva";
	}

	public void increaseSalary(double bonus) {
		if (this.getAge() < 30) {
			bonus = bonus / 2;
			this.salary = salary + (salary * bonus / 100);
		} else {
			this.salary = salary + (salary * bonus / 100);
		}

	}

	public static List<Person> createList(Scanner sc, int n) {
		List<Person> people = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String[] input = sc.nextLine().split(" ");
			String firstName = input[0];
			String lastName = input[1];
			int age = Integer.parseInt(input[2]);
			double salary = Double.parseDouble(input[3]);

			boolean valid = validate(firstName, lastName, age, salary);

			if (valid) {
				people.add(new Person(firstName, lastName, age, salary));
			}
		}
		return people;
	}

	public static boolean validate(String firstName, String lastName, int age, double salary) {
		boolean valid = true;
		if (firstName.length() < 3) {
			valid = false;
		} else if (lastName.length() < 3) {

			valid = false;
		} else if (age <= 0) {

			valid = false;
		} else if (salary < 460.0) {

			valid = false;
		}
		return valid;
	}
}
