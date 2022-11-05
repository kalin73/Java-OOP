package Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
	protected double fuelQuantity;
	protected double fuelConsumption;
	protected final DecimalFormat df = new DecimalFormat("#.##");

	protected Vehicle(double fuelQuantity, double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
		this.fuelQuantity = fuelQuantity;
	}

	public double getFuelQuantity() {
		return fuelQuantity;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public abstract void drive(double distance);

	public abstract void refuel(double fuel);

}
