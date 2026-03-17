package chapter17_added_features.switch_enhancements.arrow_in_switch;

public class ArrowInSwitch {

	public static void main(String[] args) {
		int eventCode = 6010;
		int priorityLevel = switch (eventCode) {
		case 1000, 1205, 8900 -> 1;
		case 2000, 6010, 9128 -> 2;
		case 1002, 7023, 9300 -> 3;
		default -> 0;
		};
		System.out.println("Priority level of event code " + eventCode + " is " + priorityLevel);
	}

}
