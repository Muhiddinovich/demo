package chapter14_lambda_expressions.method_reference.to_static_method;

public class MethodRefDemo {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		String outStr;

		outStr = stringOp(MyStringOps::strReverse, inStr);
		System.out.println(inStr);
		System.out.println(outStr);
	}
}
