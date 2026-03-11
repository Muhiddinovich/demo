package chapter17_added_features.records.non_canonical_constructors;

public record Employee2(String name, int empId) {

	public Employee2 {
		name = name.trim();
		int i=name.indexOf(',');
		int j=name.lastIndexOf(',');
		if (i!=j) {
			throw new IllegalArgumentException("Multiple Commas found.");
		}
		if (i<1 | name.length() == i+1) {
			throw new IllegalArgumentException("Required format: last, first");
		}
	}
}
