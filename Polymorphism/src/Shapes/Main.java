package Shapes;

public class Main {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(5, 4);
		Shape circle = new Circle(5);

		double per = rectangle.calculatePerimeter();
		System.out.println(per);

		double areaC = circle.calculateArea();
		System.out.println(areaC);
	}

}
