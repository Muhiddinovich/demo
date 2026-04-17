package study;

import java.util.Arrays;
import java.util.Iterator;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		int[][] multiplicationTable = new int[5][];
		System.out.println(multiplicationTable.length);
		System.out.println(Arrays.toString(multiplicationTable));

		for (int i = 0; i < multiplicationTable.length; i++) {
			multiplicationTable[i] = new int[5];
		}

		for (int i = 0; i < multiplicationTable.length; i++) {
			for (int j = 0; j < multiplicationTable[i].length; j++) {
				System.out.print(" " + multiplicationTable[i][j]);
			}
			System.out.println();
		}

		System.out.println("--------------------------------------");
		int[][] array2D = { { 1, 2, 3, 4, 5 }, { 5, 4, 3, 2, 1 }, { 0, 2, 0, 4, 0 } };

		int sum = 0;

		for (int[] is : array2D) {
			for (int is2 : is) {
				sum += is2;
			}
		}

		for (int[] row : array2D) {
			for (int element : row) {
				System.out.print(" " + element);
			}
			System.out.println();
		}
		System.out.println("Sum=" + sum);
	}

}
