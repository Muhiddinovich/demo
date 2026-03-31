package chapter18_string_handling.string_buffer;

public class AppendDemo {

	public static void main(String[] args) {
		String string;
		int a = 42;
		StringBuffer buffer = new StringBuffer(50);
		string = buffer.append("a= ").append(a).append("!").toString();
		System.out.println(string);
	}

}
