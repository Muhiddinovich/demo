package chapter18_string_handling;

public class ValueOfDemo {

	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 67 };
		System.out.println(String.valueOf(ch, 1, 3));
	}

}
