package chapter18_string_handling.string_buffer;

public class InsertDemo {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("I Java");
		buffer.insert(2, "like ");
		System.out.println(buffer);
	}

}
