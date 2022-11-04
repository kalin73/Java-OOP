package Shapes;

public class Circle extends Shape {
	private double radius;

	public final double getRadius() {
		return radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculatePerimeter() {
		return radius * 2 * Math.PI;
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
