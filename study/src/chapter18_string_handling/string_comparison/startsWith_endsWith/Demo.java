package chapter18_string_handling.string_comparison.startsWith_endsWith;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Foobar".endsWith("bar"));
		System.out.println("Foobar".startsWith("Foo"));
		System.out.println("Foobar".startsWith("bar", 3));
	}

}
