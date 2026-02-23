package chapter14_lambda_expressions.constructor_reference.basic;

public class MyClass {
	private int val;

	public MyClass(int v) {
		val = v;
	}

	public MyClass() {
		val = 0;
	}

	public int getVal() {
		return val;
	}
}
