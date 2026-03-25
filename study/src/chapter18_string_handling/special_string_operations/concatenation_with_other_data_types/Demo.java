package chapter18_string_handling.special_string_operations.concatenation_with_other_data_types;

public class Demo {

	public static void main(String[] args) {
		int age = 9;
		System.out.println("He is " + age + " years old.");

		String s = "four: " + 2 + 2;
		System.out.println(s);

		String s1 = "four: " + (2 + 2);
		System.out.println(s1);

		String s2 = 2 + 2 + "=four";
		System.out.println(s2);
	}

}
