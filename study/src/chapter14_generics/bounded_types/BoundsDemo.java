package chapter14_generics.bounded_types;

public class BoundsDemo {
	public static void main(String[] args) {
		Integer[] integers = { 1, 2, 3, 4, 5 };
		Stats<Integer> intStats = new Stats<Integer>(integers);
		System.out.println(intStats.average());

		Double[] doubles = { 1.2, 2.4, 5.6, 3.4 };
		Stats<Double> doubleStats = new Stats<Double>(doubles);
		System.out.println(doubleStats.average());
	}
}
