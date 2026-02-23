package chapter14_lambda_expressions.constructor_reference.with_generics;

public class MyClass<T> {
	private T val;

	public MyClass(T v) {
		val = v;
	}

	public MyClass() {
		val = null;
	}

	public T getVal() {
		return val;
	}
}
