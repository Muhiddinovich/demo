package chapter14_generics.generic_interface;

public class GenericInterfaceDemo {
	public static void main(String[] args) {
		Integer[] inums = { 3, 6, 2, 8, 6 };
		Character[] chs = { 'b', 'r', 'p', 'w' };

		MyClass<Integer> intOb = new MyClass<Integer>(inums);
		System.out.println("Min: " + intOb.min());
		System.out.println("Max: " + intOb.max());

		MyClass<Character> charOb = new MyClass<Character>(chs);
		System.out.println("Min char: " + charOb.min());
		System.out.println("Max char: " + charOb.max());
	}
}
