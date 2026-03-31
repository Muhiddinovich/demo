package chapter18_string_handling.string_buffer;

public class SetLengthDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.setLength(3);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.setLength(150);
		System.out.println(sb);
		System.out.println(sb.capacity());

	}

}
