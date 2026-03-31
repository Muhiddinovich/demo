package chapter18_string_handling.string_buffer;

public class CharAtAndSetCharAt {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println("buffer: " + buffer);
		System.out.println("charAt(0)=" + buffer.charAt(0));

		buffer.setCharAt(0, 'Y');
		System.out.println(buffer);

	}

}
