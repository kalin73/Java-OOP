package creational.prototypePattern;

public class Main {

	public static void main(String[] args) {
		Point2D point = new Point2D(5, 7);

		Point2D clonePoint = point.clone();

		System.out.println(point.getX());
		System.out.println(clonePoint.getX());

	}

}
