package chapter14_lambda_expressions.basics;

public class LambdaDemo3 {

	public static void main(String[] args) {
		NumericTest2 isFactor = (int n, int d) -> n % d == 0;
		System.out.println(isFactor.test(10, 2));
		System.out.println(isFactor.test(10, 3));
	}

}
