package chapter18_string_handling;

import java.util.Locale;
import java.util.stream.Stream;

public class AdditionalStringMethods {

	public static void main(String[] args) {
		String string = "Java";
		System.out.println(string.codePointAt(0));
		System.out.println(string.codePointBefore(1));
		System.out.println(string.codePointCount(0, 2));
		System.out.println(string.contains("va"));
		char[] ch = { 'J', 'a', 'v', 'a' };
		String string2 = new String(ch);

		System.out.println(string.contentEquals(string2));

		String name = "Fahriddin";
		int age = 20;

		String s = String.format("My name is %s and I am %d years old", name, age);
		System.out.println(s);

		double number = 12345.67;

		// US format
		String us = String.format(Locale.US, "Number: %, .2f", number);
		System.out.println(us); // Number: 12,345.67

		// Germany format
		String de = String.format(Locale.GERMANY, "Number: %, .2f", number);
		System.out.println(de); // Number: 12.345,67

		String template = "My name is %s and I am %d years old";
		String result = template.formatted("Fahriddin", 20);
		System.out.println(result);

		String text = "Hello\nWorld";
		System.out.println(text.indent(4));
		/*
		 * Output: Hello World
		 */

		System.out.println(text.indent(-2));
		/*
		 * Output: Hello World (no change because no leading spaces)
		 */

		System.out.println(string.isEmpty());

		String text1 = "Hello\nWorld\nJava";

		text1.lines().forEach(line -> System.out.println(line.toUpperCase()));

		String s1 = "12345";

		System.out.println(s1.matches("\\d+")); // true, only digits
		System.out.println(s1.matches("\\d{6}")); // false, not 6 digits

		String s2 = "A😀B"; // 😀 is 1 code point, 2 chars
		int i = 0;

		int newIndex = s2.offsetByCodePoints(i, 2);
		System.out.println(newIndex); // 3

	}

}
