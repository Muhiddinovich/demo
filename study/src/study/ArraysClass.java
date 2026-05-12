package study;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		int[] array = { 9, 8, 7, 6, 5 };
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(Arrays.copyOf(array, 2)));

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr3 = { 1, 2, 5, 5, 5, 5, 5, 8, 9 };
		System.out.println(arr1 == arr2);
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));

		int intArr[] = { 55, 57, 61, 66, 18, 19, 27, 38, 10, 55, 15, 39, 51, 18, 83, 95 };

		Arrays.sort(intArr);

		System.out.println(Arrays.binarySearch(intArr, 1195));

		Arrays.fill(intArr, -100);
		System.out.println(Arrays.toString(intArr));

		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, {} };
		System.out.println(Arrays.deepToString(array1));

		int[][] array2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
		int[][] anotherArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
		System.out.println(Arrays.equals(array2, anotherArray));
		System.out.println(Arrays.deepEquals(array2, anotherArray));
	}

}
