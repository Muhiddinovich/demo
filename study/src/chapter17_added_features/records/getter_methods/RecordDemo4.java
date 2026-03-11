package chapter17_added_features.records.getter_methods;

public class RecordDemo4 {
	public static void main(String[] args) {
		Employee emp = new Employee("			   Jones, Robert", 1048);
		
		System.out.println(emp.name());
		System.out.println(emp.lastName());
	}
}
