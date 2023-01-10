import java.lang.reflect.InvocationTargetException;

public class Main {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class reflection = Reflection.class;
		System.out.println(reflection);

		Class superclass = reflection.getSuperclass();
		System.out.println(superclass);

		Class[] interfaces = reflection.getInterfaces();

		for (Class anInterface : interfaces) {
			System.out.println(anInterface);
		}

		Object reflectionObject = reflection.getDeclaredConstructor().newInstance();
		System.out.println(reflectionObject);
	}

}
