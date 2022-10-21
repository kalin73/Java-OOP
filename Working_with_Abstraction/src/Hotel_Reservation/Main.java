package Hotel_Reservation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");

		PriceCalculator calc = new PriceCalculator();

		calc.calculate(input);
		sc.close();

	}

}
