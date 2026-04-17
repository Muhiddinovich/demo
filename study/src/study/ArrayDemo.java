package study;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] array = { 21, 22, 23, 24 };
		int[] hold = { 49, 48, 47, 46, 45, 44, 43, 42 };
		System.arraycopy(array, 2, hold, 1, 2);
		System.out.println(Arrays.toString(hold));

		hold = new int[90];
		System.out.println(hold.length);
		System.out.println(Arrays.toString(hold));

		for (int i : hold) {
			System.out.println(i);
		}

		int[] arrayInt = { 1, 2, 3, 4, 5, 6 };
		for (int element : arrayInt) {
			element *= element;
		}
		for (int valueInt : arrayInt) {
			System.out.println(valueInt);
		}
	}
}
