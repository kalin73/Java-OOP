package Define_an_Interface_Person;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Class[] citizenInterfaces = Citizen.class.getInterfaces();
		Scanner scanner = new Scanner(System.in);
		if (Arrays.asList(citizenInterfaces).contains(Person.class)) {
			Method[] fields = Person.class.getDeclaredMethods();
			String name = scanner.nextLine();
			int age = Integer.parseInt(scanner.nextLine());
			Person person = new Citizen(name, age);
			System.out.println(fields.length);
			System.out.println(person.getName());
			System.out.println(person.getAge());
		}
		scanner.close();
	}

}
