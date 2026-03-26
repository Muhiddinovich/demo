package chapter18_string_handling.modifying_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrimAndStripDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("                hi               ".trim()); // for old code
		System.out.println("   hi this is test for stip()  ".strip()); // modern java, handles all whitespace

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter 'stop' to quit");
		System.out.println("Enter state: ");

		do {
			str = br.readLine();
			str = str.trim();

			switch (str) {
			case "Illinois" -> System.out.println("Capital is Springfield");
			case "Missouri" -> System.out.println("Capital is Jefferson City");
			case "California" -> System.out.println("Capital is Sacramento");
			case "Washington" -> System.out.println("Capital is Olympia");
			}
			;

		} while (!str.equalsIgnoreCase("stop"));

	}

}
