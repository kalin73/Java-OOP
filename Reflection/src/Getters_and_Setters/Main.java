package Getters_and_Setters;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Reflection reflection = new Reflection();
		List<Method> getters = new ArrayList<>();
		List<Method> setters = new ArrayList<>();
		Method[] methods = reflection.getClass().getDeclaredMethods();

		for (Method m : methods) {
			if (m.getName().startsWith("get")) {
				getters.add(m);

			} else if (m.getName().startsWith("set")) {
				setters.add(m);
			}
		}
		getters.sort((f, s) -> f.getName().compareTo(s.getName()));
		setters.sort((f, s) -> f.getName().compareTo(s.getName()));

		getters.forEach(x -> System.out.println(x.getName() + " will return class " + x.getReturnType().getName()));

		for (Method m : setters) {
			System.out.print(m.getName() + " and will set field of class ");

			for (Parameter p : m.getParameters()) {
				System.out.print(p.getType().getName());
			}
			System.out.println();
		}
	}
}
