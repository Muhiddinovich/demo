package chapter14_generics.generic_method;

public class GenMethMethod {

	static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) { //Notice that type parameters comes before return type
		for (int i = 0; i < y.length; i++) {
			if (x.equals(y[i]))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Integer[] nums = { 1, 2, 3, 4, 5 };
		if (isIn(2, nums))
			System.out.println("2 is in nums");

		if (!isIn(7, nums))
			System.out.println("7 is not in nums");

		String[] strings = { "one", "two", "three", "four", "five" };
		if(isIn("five", strings))
			System.out.println("five is in strings");
		
	}

}
