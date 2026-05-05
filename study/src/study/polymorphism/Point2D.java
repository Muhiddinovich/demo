package study.polymorphism;

public class Point2D extends Point1D {
	private double y;

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public double length() {
		return Math.hypot(super.getX(), y);
	}

}
