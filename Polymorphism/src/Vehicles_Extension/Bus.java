package Vehicles_Extension;

public class Bus extends Vehicle {

	protected Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
		super(fuelQuantity, fuelConsumption, tankCapacity);
	}

	public void drive(double distance, boolean isEmpty) {
		double fuel;
		if (isEmpty) {
			fuel = distance * this.fuelConsumption;

		} else {
			fuel = distance * (this.fuelConsumption + 1.4);

		}
		if (fuel <= this.fuelQuantity) {
			this.fuelQuantity -= fuel;
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
		return String.format("Bus: %.2f", this.fuelQuantity);

	}
}
