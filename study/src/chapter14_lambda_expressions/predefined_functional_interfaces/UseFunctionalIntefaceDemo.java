package chapter14_lambda_expressions.predefined_functional_interfaces;

import java.util.function.Function;

public class UseFunctionalIntefaceDemo {
	public static void main(String[] args) {
		Function<Integer, Integer> factorial = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}

			return result;
		};
		
		System.out.println(factorial.apply(10));
	}
}
