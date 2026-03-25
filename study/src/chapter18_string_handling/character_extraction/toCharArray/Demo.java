package chapter18_string_handling.character_extraction.toCharArray;

public class Demo {

	public static void main(String[] args) {
		String s = "Java";
		char[] ch = s.toCharArray();
		for (char e : ch) {
			System.out.println(e);
		}
	}

}
