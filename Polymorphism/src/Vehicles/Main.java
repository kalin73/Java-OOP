package Vehicles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] line1 = sc.nextLine().split(" ");
		Vehicle car = new Car(Double.parseDouble(line1[1]), Double.parseDouble(line1[2]));

		String[] line2 = sc.nextLine().split(" ");
		Vehicle truck = new Truck(Double.parseDouble(line2[1]), Double.parseDouble(line2[2]));

		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String[] inp = sc.nextLine().split(" ");

			if (inp[0].equals("Drive")) {
				drive(car, truck, inp);
			} else {
				refuel(car, truck, inp);
			}

		}
		System.out.println(car.toString());
		System.out.println(truck.toString());
		sc.close();

	}

	public static void drive(Vehicle car, Vehicle truck, String[] inp) {

		if (inp[1].equals("Car")) {
			car.drive(Double.parseDouble(inp[2]));
		} else {
			truck.drive(Double.parseDouble(inp[2]));
		}

	}

	public static void refuel(Vehicle car, Vehicle truck, String[] inp) {

		if (inp[1].equals("Car")) {
			car.refuel(Double.parseDouble(inp[2]));
		} else {
			truck.refuel(Double.parseDouble(inp[2]));
		}

	}

}
