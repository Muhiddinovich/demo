package chapter18_string_handling.string_buffer;

public class ReplaceDemo {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("This is a test");
		buffer.replace(5, 7, "was");
		System.out.println(buffer);
	}

}
