
public class Employee {
	
	// Instance Field
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
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
		System.out.println("Position: " + position);
		
	}
	// Accessor
	public String getName() {
		return name;
	}
	
	public int getID() {
		return idNumber;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getPosition() {

		return position;
	}

	// Mutators
	public void setName(String n) {
		name = n;
	}

	public void setID(int id) {
		idNumber = id;
	}
	
}

