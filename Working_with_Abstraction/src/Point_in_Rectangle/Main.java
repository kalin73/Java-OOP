package Point_in_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] coordinates = Arrays.stream(sc.nextLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
		Rectangle rectangle = new Rectangle(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			Point check = new Point(x, y);

			System.out.println(rectangle.check(check));

		}
		sc.close();
	}

}
