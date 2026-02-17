package chapter14_lambda_expressions.passing_lambda_as_arguments;

public class LambdaAsArgumentsDemo {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		String outStr;

		System.out.println("Here is the input string: " + inStr);

		outStr = stringOp((str) -> str.toUpperCase(), inStr);
		System.out.println("The string in uppercase: " + outStr);

		outStr = stringOp((str) -> {
			String resultString = "";
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ')
					resultString += str.charAt(i);
			}
			return resultString;
		}, inStr);
		System.out.println("The String with spaces removed: " + outStr);

		StringFunc reverse = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};

		System.out.println("String reversed: " + stringOp(reverse, inStr));
	}
}
