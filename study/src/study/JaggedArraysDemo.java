package study;

import java.util.Arrays;

public class JaggedArraysDemo {

	public static void main(String[] args) {
		int[][] arr = new int[4][];
		arr[0] = new int[5];
		arr[1] = new int[4];
		arr[2] = new int[3];
		arr[3] = new int[2];

		for (int[] row : arr) {
			for (int element : row) {
				System.out.print(" " + element);
			}
			System.out.println();
		}

		System.out.println("-----------------------------------");

		int[] numbers = { 1, 3, 5, 7, 9 };
		int[][] array = new int[3][];
		array[0] = numbers;
		array[2] = new int[] { 2, 4, 6, 8 };

		for (int[] row : array) {
			if (row != null) {
				for (int element : row) {
					System.out.print(" " + element);
				}
				System.out.println();
			} else {
				System.out.println(row);
			}
		}
	}

}
