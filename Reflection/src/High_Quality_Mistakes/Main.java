package High_Quality_Mistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Reflection reflection = new Reflection();
		List<Field> nonPrivateFields = new ArrayList<>();
		List<Method> nonPrivateSetters = new ArrayList<>();
		List<Method> nonPublicGetters = new ArrayList<>();

		Field[] fields = reflection.getClass().getDeclaredFields();
		Method[] methods = reflection.getClass().getDeclaredMethods();

		addFields(fields, nonPrivateFields);
		addNonPrivate(methods, nonPrivateSetters);
		addNonPublic(methods, nonPublicGetters);

		nonPrivateFields.sort((f, s) -> f.getName().compareTo(s.getName()));
		nonPublicGetters.sort((f, s) -> f.getName().compareTo(s.getName()));
		nonPrivateSetters.sort((f, s) -> f.getName().compareTo(s.getName()));

		nonPrivateFields.forEach(x -> System.out.println(x.getName() + " must be private!"));
		nonPublicGetters.forEach(x -> System.out.println(x.getName() + " have to be public!"));
		nonPrivateSetters.forEach(x -> System.out.println(x.getName() + " have to be private!"));

	}

	private static void addFields(Field[] arr, List<Field> list) {

		for (Field f : arr) {
			int modifier = f.getModifiers();

			if (!Modifier.isPrivate(modifier)) {
				list.add(f);
			}

		}

	}

	private static void addNonPrivate(Method[] arr, List<Method> list) {

		for (Method f : arr) {
			int modifier = f.getModifiers();
			if (!Modifier.isPrivate(modifier) && f.getName().startsWith("set")) {
				list.add(f);
			}

		}

	}

	private static void addNonPublic(Method[] arr, List<Method> list) {

		for (Method f : arr) {
			int modifier = f.getModifiers();
			if (!Modifier.isPublic(modifier) && f.getName().startsWith("get")) {
				list.add(f);
			}

		}

	}

}
