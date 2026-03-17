package chapter17_added_features.switch_enhancements.arrow_in_switch;

public class StatementSwitchWithArrow {
	public static void main(String[] args) {
		int up = 0;
		int down = 0;
		int left = 0;
		int right = 0;

		char direction = 'R';

		switch (direction) {
		case 'L' -> {
			System.out.println("Turning Left");
			left++;
		}
		case 'R' -> {
			System.out.println("Turning Right");
			right++;
		}
		case 'U' -> {
			System.out.println("Moving Up");
			up++;
		}
		case 'D' -> {
			System.out.println("Moving Down");
			down++;
		}
		
		
		}
		System.out.println(right);
	}
}
