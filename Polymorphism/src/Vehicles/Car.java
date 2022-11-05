package Vehicles;

public class Car extends Vehicle {

	protected Car(double fuelQuantity, double fuelConsumption) {
		super(fuelQuantity, fuelConsumption);

	}

	@Override
	public void drive(double distance) {

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
		this.fuelQuantity += fuel;
	}

	@Override
	public String toString() {

		return String.format("Car: %.2f", this.fuelQuantity);
	}
}
