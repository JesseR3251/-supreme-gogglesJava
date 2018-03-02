
public class ShiftSupervisor extends Employee {
	int salary;
	int annualProductionBonus;
	
	public ShiftSupervisor() {
		salary = 0;
		annualProductionBonus = 0;
	}
	
	public ShiftSupervisor(int id, String name, int hireYear, int salary, int annualProductionBonus) {
		super(id,name,hireYear);
		this.salary = salary;
		this.annualProductionBonus = annualProductionBonus;
	}
	
	public String toString() {
		/*
		return ("Id: "+this.getID()+"/ Name: "+this.getName()+"/ Year: "+this.getHYear()
		+" / numHours: "+numHours + " / payRate: "+payRate);
		*/
		return (super.toString()+" / salary: "+salary + " / bonus: "+ annualProductionBonus);
	}


}


//public ProductionWorker() {
//	numHours=0;
//	payRate=0;
//	System.out.println("This is default constructor" 
//	+ " for Production Worker");
//}
//
//public ProductionWorker(int id,String name,int hireYear, int numHours, double payRate) {
//	super(id,name,hireYear);
//	this.numHours=numHours;
//	this.payRate=payRate;
//	System.out.println("This is parametrized constructor"
//			+ " for ProductionWorker");