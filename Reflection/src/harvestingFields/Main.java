package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RichSoilLand reflection = new RichSoilLand();

		Field[] fields = reflection.getClass().getDeclaredFields();
		String command = sc.nextLine();

		while (!"HARVEST".equals(command)) {

			switch (command) {
			case "private":
				printPrivate(fields);
				break;

			case "protected":
				printProtected(fields);
				break;

			case "public":
				printPublic(fields);
				break;

			case "all":
				printAll(fields);
				break;
			}
			command = sc.nextLine();
		}
		sc.close();
	}

	private static void printPrivate(Field[] fields) {
		for (Field f : fields) {
			int modifier = f.getModifiers();
			if (Modifier.isPrivate(modifier)) {
				System.out.println(Modifier.toString(modifier) + " " + f.getType().getSimpleName() + " " + f.getName());
			}
		}
	}

	private static void printProtected(Field[] fields) {
		for (Field f : fields) {
			int modifier = f.getModifiers();
			if (Modifier.isProtected(modifier)) {
				System.out.println(Modifier.toString(modifier) + " " + f.getType().getSimpleName() + " " + f.getName());
			}
		}
	}

	private static void printPublic(Field[] fields) {
		for (Field f : fields) {
			int modifier = f.getModifiers();
			if (Modifier.isPublic(modifier)) {
				System.out.println(Modifier.toString(modifier) + " " + f.getType().getSimpleName() + " " + f.getName());
			}
		}
	}

	private static void printAll(Field[] fields) {
		for (Field f : fields) {
			int modifier = f.getModifiers();
			System.out.println(Modifier.toString(modifier) + " " + f.getType().getSimpleName() + " " + f.getName());
		}
	}
}
