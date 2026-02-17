package chapter14_lambda_expressions.lambda_and_variable_capture;

public class VarCapture {
	public static void main(String[] args) {
		int num=10;
		MyFunc myLambda=(n)->{
			int v=num+n;
			// num++  ILLEGAL
			return v;
		};
		System.out.println(myLambda.func(4));
//		num=20; // ILLEGAL
	}
}
