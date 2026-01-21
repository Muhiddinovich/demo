package chapter14_lambda_expressions.basics;

public class LambdaDemo2 {

	public static void main(String[] args) {
		NumericTest isEven;
		isEven=(n)->n%2==0;
		System.out.println(isEven.test(10));
		System.out.println(isEven.test(9));
		
		NumericTest isNonNegative = (n)->n>=0;
		System.out.println(isNonNegative.test(1));
		System.out.println(isNonNegative.test(-1));
		
	}

}
