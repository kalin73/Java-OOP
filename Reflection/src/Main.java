import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<Reflection> reflection = Reflection.class;
		System.out.println(reflection);

		System.out.println(reflection.getSuperclass());

		for (Class<?> anInterface : reflection.getInterfaces()) {
			System.out.println(anInterface);
		}

		Reflection reflectionObject = reflection.getDeclaredConstructor().newInstance();
		System.out.println(reflectionObject);
	}

}
