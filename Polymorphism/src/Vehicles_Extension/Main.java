package Vehicles_Extension;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] line1 = sc.nextLine().split(" ");
		Vehicle car = new Car(Double.parseDouble(line1[1]), Double.parseDouble(line1[2]), Double.parseDouble(line1[3]));

		String[] line2 = sc.nextLine().split(" ");
		Vehicle truck = new Truck(Double.parseDouble(line2[1]), Double.parseDouble(line2[2]),
				Double.parseDouble(line2[3]));

		String[] line3 = sc.nextLine().split(" ");
		Vehicle bus = new Bus(Double.parseDouble(line3[1]), Double.parseDouble(line3[2]), Double.parseDouble(line3[3]));

		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String[] inp = sc.nextLine().split(" ");

			if (inp[0].equals("Refuel")) {

				refuel(car, truck, bus, inp);

			} else if (inp[0].contains("Drive")) {
				drive(car, truck, bus, inp);
			}

		}
		System.out.println(car.toString());
		System.out.println(truck.toString());
		System.out.println(bus.toString());
		sc.close();

	}

	public static void drive(Vehicle car, Vehicle truck, Vehicle bus, String[] inp) {

		if (inp[1].equals("Car")) {
			car.drive(Double.parseDouble(inp[2]), false);

		} else if (inp[1].equals("Truck")) {
			truck.drive(Double.parseDouble(inp[2]), false);

		} else if (inp[1].equals("Bus")) {
			if (inp[0].endsWith("Empty")) {

				bus.drive(Double.parseDouble(inp[2]), true);

			} else {
				bus.drive(Double.parseDouble(inp[2]), false);
			}

		}

	}

	public static void refuel(Vehicle car, Vehicle truck, Vehicle bus, String[] inp) {

		if (inp[1].equals("Car")) {
			car.refuel(Double.parseDouble(inp[2]));
		} else if (inp[1].equals("Truck")) {
			truck.refuel(Double.parseDouble(inp[2]));
		} else {
			bus.refuel(Double.parseDouble(inp[2]));
		}

	}
}
