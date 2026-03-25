package chapter18_string_handling.character_extraction.getChars;

public class Demo {
	public static void main(String[] args) {
		String string = "This is a demo of the getChars method.";
		int start = 10;
		int end = 14;

		char[] buf = new char[10];
		string.getChars(start, end, buf, 1);
		//void getChars(int sourceStart, int sourceEnd, char[] target, int targetStart)
		
		System.out.println(buf);
		
		for(char ch: buf) {
			System.out.println("__"+ch);
		}
	}
}
