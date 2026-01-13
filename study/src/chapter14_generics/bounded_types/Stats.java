package chapter14_generics.bounded_types;

public class Stats<T extends Number> {
	T[] numTs;

	public Stats(T[] o) {
		numTs = o;
	}

	double average() {
		double sum = 0.0;
		for (int i = 0; i < numTs.length; i++)
			sum += numTs[i].doubleValue();
		return sum / numTs.length;
	}
}
