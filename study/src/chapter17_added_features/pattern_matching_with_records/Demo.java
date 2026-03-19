package chapter17_added_features.pattern_matching_with_records;

import chapter17_added_features.pattern_matching_with_records.Id.Type;

public class Demo {
	public static void printObject(Object obj) {
		if (obj instanceof Employee(String empName, Id empId)) {
			System.out.println(
					"Employee ID for " + empName + " is " + empId.idNum() + " and the type is " + empId.type());
		} else if (obj == null) {
			throw new IllegalArgumentException("Null not allowed");
		} else {
			System.out.println("Printing: " + obj.toString());
		}
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Fred", new Id(104, Type.FULL_TIME));
		printObject(employee);
	}
}
