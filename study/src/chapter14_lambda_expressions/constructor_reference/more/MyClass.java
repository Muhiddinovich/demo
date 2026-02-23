package chapter14_lambda_expressions.constructor_reference.more;

public class MyClass<T> {
	private T val;

	public MyClass(T v) {
		val = v;
	}

	public T getVal() {
		return val;
	}

}
