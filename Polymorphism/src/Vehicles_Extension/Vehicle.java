package Vehicles_Extension;

import java.text.DecimalFormat;

public abstract class Vehicle {
	protected double fuelQuantity;
	protected double fuelConsumption;
	protected double tankCapacity;
	protected final DecimalFormat df = new DecimalFormat("#.##");

	protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
		this.fuelConsumption = fuelConsumption;
		this.fuelQuantity = fuelQuantity;
		this.tankCapacity = tankCapacity;
	}

	public double getFuelQuantity() {
		return fuelQuantity;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public abstract void drive(double distance, boolean isEmpty);

	public abstract void refuel(double fuel);

}
