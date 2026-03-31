package chapter18_string_handling.string_buffer;

public class GetCharsDemo {

	public static void main(String[] args) {
		char[] ch = new char[10];
		StringBuffer stringBuffer = new StringBuffer("Hello1");
		stringBuffer.getChars(1, 4, ch, 2);
		for (char e : ch) {
			System.out.println("-" + e);

		}
	}

}
