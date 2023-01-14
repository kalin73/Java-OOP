package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Field> fields = Arrays.asList(RichSoilLand.class.getDeclaredFields());
		String command = sc.nextLine();

		Consumer<Field> print = field -> System.out.println(Modifier.toString(field.getModifiers()) + " "
				+ field.getType().getSimpleName() + " " + field.getName());

		while (!"HARVEST".equals(command)) {

			switch (command) {
			case "private":
				fields.stream()
					  .filter(x -> Modifier.isPrivate(x.getModifiers()))
					  .forEach(print);
				break;

			case "protected":
				fields.stream()
				      .filter(x -> Modifier.isProtected(x.getModifiers()))
				      .forEach(print);
				break;

			case "public":
				fields.stream()
					  .filter(x -> Modifier.isPublic(x.getModifiers()))
					  .forEach(print);
				break;

			case "all":
				fields.stream()
					  .forEach(x -> System.out.println(
						Modifier.toString(x.getModifiers()) + " " + x.getType().getSimpleName() + " " + x.getName()));
				break;
			}
			command = sc.nextLine();
		}
		sc.close();
	}
}
