package creational.prototypePattern;

public class Point2D {
	private int x;
	private int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	private Point2D(Point2D other) {
		this(other.x, other.y);
	}

	public Point2D clone() {
		return new Point2D(this);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
