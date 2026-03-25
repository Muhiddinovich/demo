package chapter18_string_handling.character_extraction.getBytes;

public class Demo {
	public static void main(String[] args) {
		String s = "Java";
		byte[] b = s.getBytes();
		for (byte e : b) {
			System.out.println(e);
		}
	}
}
