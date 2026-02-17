package chapter14_lambda_expressions.lambda_and_exceptions;

public class EmptyArrayException extends Exception {
	public EmptyArrayException() {
		super("Array Empty");
	}
}
