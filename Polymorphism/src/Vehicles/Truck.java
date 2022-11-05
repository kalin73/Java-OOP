package Vehicles;

public class Truck extends Vehicle {

	protected Truck(double fuelQuantity, double fuelConsumption) {
		super(fuelQuantity, fuelConsumption);

	}

	@Override
	public void drive(double distance) {

		double fuel = distance * (this.fuelConsumption + 1.6);

		if (fuel <= this.fuelQuantity) {
			this.fuelQuantity -= fuel;
			System.out.printf("%s travelled %s km%n", this.getClass().getSimpleName(), df.format(distance));

		} else {
			System.out.printf("%s needs refueling%n", this.getClass().getSimpleName());

		}

	}

	@Override
	public void refuel(double fuel) {
		this.fuelQuantity += fuel * 0.95;
	}

	@Override
	public String toString() {

		return String.format("Truck: %.2f", this.fuelQuantity);
	}
}
