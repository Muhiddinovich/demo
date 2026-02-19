package chapter14_lambda_expressions.method_reference.to_instance_method;

public class MethodRefDemo {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		String outStr;

		MyStringOps stringOps = new MyStringOps();

		outStr = stringOp(stringOps::strReverse, inStr);
		System.out.println(inStr);
		System.out.println(outStr);
	}
}
