package chapter14_generics.bounded_wildcards;

public class Coordinates<T extends TwoD> {
	T[] coordinates;

	public Coordinates(T[] o) {
		coordinates = o;
	}
}
