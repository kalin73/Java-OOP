package Vehicles_Extension;

public class Car extends Vehicle {

	protected Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
		super(fuelQuantity, fuelConsumption, tankCapacity);

	}

	@Override
	public void drive(double distance, boolean isEmpty) {

		double fuel = distance * (fuelConsumption + 0.9);

		if (fuel <= fuelQuantity) {
			fuelQuantity -= fuel;
			System.out.printf("%s travelled %s km%n", this.getClass().getSimpleName(), df.format(distance));

		} else {
			System.out.printf("%s needs refueling%n", this.getClass().getSimpleName());

		}

	}

	@Override
	public void refuel(double fuel) {
		if (fuel < 1) {
			System.out.println("Fuel must be a positive number");

		} else {
			double totalFuel = fuelQuantity + fuel;
			if (totalFuel > tankCapacity) {
				System.out.println("Cannot fit fuel in tank");

			} else {

				this.fuelQuantity = totalFuel;
			}
		}
	}

	@Override
	public String toString() {

		return String.format("Car: %.2f", this.fuelQuantity);
	}
}
