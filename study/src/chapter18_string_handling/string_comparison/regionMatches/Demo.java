package chapter18_string_handling.string_comparison.regionMatches;

public class Demo {

	public static void main(String[] args) {
		String string = "Hello World";
		String string2 = "hello";
		System.out.println(string2.regionMatches(true, 0, string, 0, 5));
	}

}
