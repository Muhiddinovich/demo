package chapter18_string_handling.StringConstructors;

public class MakingString {
	public static void main(String[] args) {
		char[] chars = { 'a', 'b', 'c' };
		String s = new String(chars);
		System.out.println(s);

		char[] chars1 = { 'a', 'b', 'c', 'd', 'f', 'g' };

		String s1 = new String(chars1, 2, 3);
		System.out.println(s1);

		char[] chars2 = { 'J', 'a', 'v', 'a' };
		String s2 = new String(chars2);
		System.out.println(s2);

		String s3 = new String(s2);
		System.out.println(s3);

		byte[] ascii = { 66, 67, 68, 69, 70 };

		String s4 = new String(ascii);
		System.out.println(s4);

		String s5 = new String(ascii, 1, 3);
		System.out.println(s5);

	}

}
