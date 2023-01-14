package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Constructor<BlackBoxInt> constructor = BlackBoxInt.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		BlackBoxInt b = constructor.newInstance();

		Field field = b.getClass().getDeclaredField("innerValue");
		field.setAccessible(true);

		String[] input = sc.nextLine().split("_");

		while (!"END".equals(input[0])) {
			String methodName = input[0];
			int value = Integer.parseInt(input[1]);

			Method method = b.getClass().getDeclaredMethod(methodName, int.class);

			method.setAccessible(true);
			method.invoke(b, value);
			System.out.println(field.get(b));

			input = sc.nextLine().split("_");
		}
		sc.close();
	}
}
