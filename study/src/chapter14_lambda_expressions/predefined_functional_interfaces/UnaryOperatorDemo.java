package chapter14_lambda_expressions.predefined_functional_interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		UnaryOperator<Integer> square = x -> x * x;
		System.out.println(square.apply(5)); // 25
	}
}
