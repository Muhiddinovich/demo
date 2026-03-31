package chapter18_string_handling.string_buffer;

public class SubstringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("This is a test");
		String string = buffer.substring(0, 5);
		System.out.println(string);
	}

}
