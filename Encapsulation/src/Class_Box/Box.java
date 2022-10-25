package Class_Box;

public class Box {
	private double length;
	private double width;
	private double height;

	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;

	}

	public void setLength(double length) {

		if (length <= 0) {
			throw new IllegalArgumentException("Length cannot be zero or negative.");
		}
		this.length = length;

	}

	public void setWidth(double width) {

		if (width <= 0) {
			throw new IllegalArgumentException("Width cannot be zero or negative.");
		}
		this.width = width;

	}

	public void setHeight(double height) {

		if (height <= 0) {
			throw new IllegalArgumentException("Height cannot be zero or negative.");
		}
		this.height = height;

	}

	public double calculateSurfaceArea() {
		double area = 2.0 * length * width + 2.0 * length * height + 2.0 * width * height;
		return area;
	}

	public double calculateLateralSurfaceArea() {
		double area = 2.0 * length * height + 2.0 * width * height;
		return area;
	}

	public double calculateVolume() {
		double area = length * width * height;
		return area;
	}
}
