package chapter14_lambda_expressions.basics;

public class LambdaDemo {
	public static void main(String[] args) {
		MyNumber myNumber;
		myNumber = () -> 123.45;
		System.out.println("Fixed value: " + myNumber.getValue());
		myNumber = () -> Math.random() * 100;

		System.out.println("Random value: " + myNumber.getValue());
		System.out.println("Another Random value: " + myNumber.getValue());
		
		

	}
}
