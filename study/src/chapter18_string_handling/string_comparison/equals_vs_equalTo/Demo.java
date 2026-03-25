package chapter18_string_handling.string_comparison.equals_vs_equalTo;

public class Demo {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String(s1);

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
	}

}
