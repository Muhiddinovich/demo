package chapter17_added_features.records.getter_methods;

public record Employee(String name, int empId) {
	public Employee {
		name = name.trim();
		int i = name.indexOf(',');
		int j = name.lastIndexOf(',');
		if (i != j) {
			throw new IllegalArgumentException("Multiple Commas found.");
		}
		if (i < 1 | name.length() == i + 1) {
			throw new IllegalArgumentException("Required format: last, first");
		}

	}

	String lastName() {
		return name.substring(0, name.trim().indexOf(','));
	}
}
