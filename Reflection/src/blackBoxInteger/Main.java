package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BlackBoxInt b = instanciateBlackBox();
		String[] input = sc.nextLine().split("_");

		while (!"END".equals(input[0])) {
			String methodName = input[0];
			int value = Integer.parseInt(input[1]);

			Method method = b.getClass().getDeclaredMethod(methodName, int.class);

			method.setAccessible(true);
			method.invoke(b, value);
			getResult(b);
			input = sc.nextLine().split("_");
		}
		sc.close();

	}

	private static void getResult(BlackBoxInt reflection) throws Exception {
		Field[] fields = reflection.getClass().getDeclaredFields();

		for (Field f : fields) {
			if (f.getName().equals("innerValue")) {
				f.setAccessible(true);

				System.out.println(f.getInt(reflection));
			}
		}
	}

	@SuppressWarnings("rawtypes")
	private static BlackBoxInt instanciateBlackBox() throws Exception {
		Class reflection = BlackBoxInt.class;
		Constructor[] constrs = reflection.getDeclaredConstructors();
		int counter = 1;

		for (Constructor c : constrs) {
			if (counter == 2) {
				c.setAccessible(true);
				return (BlackBoxInt) c.newInstance();
			}
			counter++;
		}
		return null;
	}
}
