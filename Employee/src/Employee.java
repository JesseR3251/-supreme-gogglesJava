
public class Employee {
	// Fields
	protected int id;
	protected String name;
	protected int hireYear;
	
	// Constructor
	public Employee(int id,String name,int hireYear) {
		this.id=id;
		this.name=name;
		this.hireYear=hireYear;
		System.out.println("Creating Employee "
				+ "with parametrized constructor");
				
		
	}
	public Employee() {
		id=0;
		name="None";
		hireYear=0;
		System.out.println("Creating Employee "
				+ "with default constructor");
	}
	// Accessors
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getHYear() {
		return hireYear;
	}
    // Mutators
	public void setID(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setHYear(int hireYear) {
		this.hireYear=hireYear;
	}
	
	public String toString() {
		return("Id: "+id+"/ Name: "+name+"/ Year: "+hireYear);
	}
	
}
