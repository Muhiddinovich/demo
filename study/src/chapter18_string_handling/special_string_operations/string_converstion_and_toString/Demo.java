package chapter18_string_handling.special_string_operations.string_converstion_and_toString;

public class Demo {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(String.valueOf(i));

		Box box = new Box(10, 12, 14);

		String string = "Box box: " + box;
		System.out.println(box);
		System.out.println(string);

		/**
		 * As you can see, Box’s toString( ) method is automatically invoked when a Box
		 * object is used in a concatenation expression or in a call to println( ).
		 **/
	}

}
