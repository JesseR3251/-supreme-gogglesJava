
public class Employee {
	
	// Instance Field
	String name;
	int idNumber;
	String department;
	String position;
	
	// Constructor
	public Employee() {
		name="none";
		idNumber = 0;
		department = "N/A";
		position = "N/A";
	}
	
	public Employee(String n, int id, String d, String p) {
		name = n;
		idNumber = id;
		department = d;
		position = p;
		
	}
	
	// Instance Methods
	public void showEmployee() {
		System.out.println("Name: " + name);
		System.out.println("ID # " + idNumber);
		System.out.println("Department: " + department);
		System.out.println("Position " + position);
		
	}
}
