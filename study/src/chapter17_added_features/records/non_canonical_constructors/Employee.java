package chapter17_added_features.records.non_canonical_constructors;

public record Employee(String name, int empId) {
	static int pendingId=-1;
	
	public Employee{
		name=name.trim();
	}
	
	public Employee(String name) {
		this(name, pendingId);
	}
}
