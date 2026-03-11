package chapter17_added_features.records.non_canonical_constructors;

public class RecordDemo3 {
	public static void main(String[] args) {
		Employee[] empList = new Employee[4];

		empList[0] = new Employee("    Doe, John", 1047);
		empList[1] = new Employee("     Jones, Robert", 1048);
		empList[2] = new Employee("Smith, Rachel", 1049);
		empList[3] = new Employee("     Martin, Dave      "); // check here how non canonical constructor is used

		for (Employee e : empList)
			System.out.println("The employee ID for " + e.name() + " is " + e.empId());
	}
}
