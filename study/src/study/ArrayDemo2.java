package study;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		String[] strings = { "Java", "Oracle", "<epam>" };
//		for (int i = 0; i < strings.length; i++) {
//			strings[i] += 11;
//		}

		for (String string : strings) {
			string += 11;
		}

		System.out.println(Arrays.toString(strings));

		StringBuilder[] builders = new StringBuilder[3];
		builders[0] = new StringBuilder("Java");
		builders[1] = new StringBuilder("Oracle");
		builders[2] = new StringBuilder("<epam>");

		for (StringBuilder stringBuilder : builders) {
			stringBuilder.append(11);
		}
		System.out.println(Arrays.toString(builders));
	}

}
