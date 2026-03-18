package chapter17_added_features.switch_enhancements.pattern_matching;

public class PatternMatchinInSwitch {
	static void handeId(Object empObject) {
		switch (empObject) {
		case null -> System.out.println("Oops, the id was null!");
		case Integer i -> {
			switch (i) {
			case -1, 0 -> System.out.println("Reserved employee id");
			case Integer idInt when idInt < 0 -> System.out.println("A negative employee id: " + idInt);
			case Integer idInt -> System.out.println(" A positive employee id " + idInt);
			}
		}

		case String s -> System.out.println("A String id " + s);
		case EmpId eid -> System.out.println("An employee id: [" + eid.id() + "," + eid.name() + "]");
		case Employee e -> {
			switch (e) {
			case CSuitEmployee.CEO -> System.out.println("It's the boss");
			case CSuitEmployee.CFO -> System.out.println("There is the money");
			case RegularEmployee re -> System.out.println("Regular employee.");
			default -> System.out.println("An irregular employee");
			}
		}
		default -> System.out.println("Some other kind of id " + empObject.toString());
		}
		;
	}

	public static void main(String[] args) {
		Object hey=null;
		handeId(hey);
		int i=10;
		handeId(i);
	}
}
