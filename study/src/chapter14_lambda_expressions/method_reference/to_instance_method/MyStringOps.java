package chapter14_lambda_expressions.method_reference.to_instance_method;

public class MyStringOps {
	String strReverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--)
			result += str.charAt(i);
		return result;
	}
}
