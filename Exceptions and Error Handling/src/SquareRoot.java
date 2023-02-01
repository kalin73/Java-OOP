import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			double sqrt = sqrt(sc.nextLine());
			System.out.printf("%.2f%n", sqrt);

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid");
		} finally {
			System.out.println("Goodbye");
		}
		sc.close();
	}

	public static double sqrt(String str) {
		int number = Integer.parseInt(str);

		if (number < 0) {
			throw new IllegalArgumentException();
		}

		return Math.sqrt(number);

	}
}
