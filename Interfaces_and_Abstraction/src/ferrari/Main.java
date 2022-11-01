package ferrari;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		Ferrari car = new Ferrari(name);
		System.out.println(car.toString());
		
		sc.close();

	}

}
