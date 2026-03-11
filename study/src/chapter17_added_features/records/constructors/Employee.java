package chapter17_added_features.records.constructors;

public record Employee(String name, int empId) {
	public Employee {
		name=name.trim();
	}
}
