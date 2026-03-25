
package chapter18_string_handling.special_string_operations.string_converstion_and_toString;

public class Box {

	double width;
	double height;
	double depth;

	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "Dimensions are: " + width + " by " + height + " by " + depth + " . ";
	}

}
