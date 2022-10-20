package Point_in_Rectangle;

public class Rectangle {
	Point botLeft;
	Point topRight;

	public Rectangle(int botLeftX, int botLeftY, int topRightX, int topRightY) {

		this.botLeft = new Point(botLeftX, botLeftY);
		this.topRight = new Point(topRightX, topRightY);

	}

	public boolean check(Point check) {

		if (check.getX() >= botLeft.getX() && check.getX() <= topRight.getX()) {
			if (check.getY() >= botLeft.getY() && check.getY() <= topRight.getY()) {
				return true;
			}
		}
		return false;
	}
}
