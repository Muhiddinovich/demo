package chapter17_added_features.switch_enhancements.arrow_in_switch;

public class Vowels {
	public static void main(String[] args) {
		boolean yIsVowel = true;
		char ch = 'a';
		boolean isVowel = switch (ch) {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
		case 'y', 'Y' -> yIsVowel;
		default -> false;
		};
		if (isVowel) {
			System.out.println(ch+" is a vowel");
		}
	}
}
