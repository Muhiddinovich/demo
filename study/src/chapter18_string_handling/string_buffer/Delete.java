package chapter18_string_handling.string_buffer;

public class Delete {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("This is a test");
		buffer.delete(4, 7);
		System.out.println(buffer);
		buffer.deleteCharAt(0);
		System.out.println(buffer);
	}

}
