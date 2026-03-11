package chapter17_added_features.records.constructors;

public record Employee1(String name, int empId) {
	//Explicit declaration of canonical constructor 
	public Employee1(String name, int empId) {
		this.name = name.trim();
		this.empId = empId;
	}
}
