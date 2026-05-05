package study.polymorphism;

public class Point1D {
	private double x;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double length() {
		return Math.abs(x);
	}
}
