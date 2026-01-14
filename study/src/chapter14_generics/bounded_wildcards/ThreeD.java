package chapter14_generics.bounded_wildcards;

public class ThreeD extends TwoD{
	int z;

	public ThreeD(int a, int b, int c) {
		super(a, b);
		z=c;
	}
}
