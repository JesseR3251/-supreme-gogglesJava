
public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1;
		emp1 = new Employee();
		// AutoComplete: Sysout and CTRL + SPACE 
		Employee emp2 = new Employee("Carlos",1,"Computer Science","Professor");
		System.out.println("Emp1 name is " + emp1.getName());
		emp2.showEmployee();
		emp2.setID(100);
		emp2.showEmployee();
	}

}
