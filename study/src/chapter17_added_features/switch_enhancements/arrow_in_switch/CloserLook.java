package chapter17_added_features.switch_enhancements.arrow_in_switch;

public class CloserLook {
	public static void main(String[] args) {
		boolean stopNow;
		int eventCode = 6010;
		int priorityLevel = switch (eventCode) {
		case 1000, 1205, 8900 -> {
			stopNow = false;
			System.out.println("Alert");
			yield 1;
		}
		case 2000, 6010, 9128 -> {
			stopNow = true;
			System.out.println("Warning");
			yield 2;
		}
		case 1002, 7023, 9300 -> {
			stopNow = false;
			System.out.println("Danger");
			yield 3;
		}
		default -> {
			stopNow = false;
			System.out.println("Normal");
			yield 0;
		}
		};
		System.out.println("Priority level of event code " + eventCode + " is " + priorityLevel);
		if (stopNow)
			System.out.println("Stop required");
	}

}
